package rendon_proyectofutbol.Repo;

import java.util.ArrayList;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

import rendon_proyectofutbol.modelo.Direccion;
import rendon_proyectofutbol.modelo.Equipo;
import rendon_proyectofutbol.modelo.Liga;
import rendon_proyectofutbol.modelo.Ligas_favoritas;
import rendon_proyectofutbol.modelo.Usuario;

public class UsuarioRepositorio {

    private static final Logger logger = LogManager.getLogger(UsuarioRepositorio.class);

	private static final String NOMBRE_COLECCION ="registrousuarios";
	private final MongoCollection<Document> coleccion;
	private List<Usuario> usuarios;
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public UsuarioRepositorio(MongoDatabase db) {
		super();
		this.coleccion = db.getCollection(NOMBRE_COLECCION);
		this.usuarios = this.read();
	}
	
	private Usuario fromUsuarioDocument2Java(Document doc) {
	    Usuario u = new Usuario();
	    u.setId(doc.getInteger("id"));
	    u.setNombre(doc.getString("nombre"));
	    u.setCorreo_electronico(doc.getString("correo_electronico"));
	    u.setRecibir_notificaciones(doc.getBoolean("recibir_notificaciones"));
	    u.setTiempo_maximo_uso_diario(doc.getDouble("tiempo_maximo_uso_diario"));

	    Document docDir = doc.get("direccion", Document.class);
	    if (docDir != null) {
	        Direccion d = new Direccion(
	            docDir.getString("calle"),
	            docDir.getString("ciudad"),
	            docDir.getString("pais"),
	            docDir.getInteger("codigo_postal")
	        );
	        u.setDireccion(d);
	    }

	    List<Document> listaDocs = (List<Document>) doc.get("ligas_favoritas");
	    List<Ligas_favoritas> listaLigas = new ArrayList<>();
	    if (listaDocs != null) {
	        for (Document d : listaDocs) {
	            Liga liga = Liga.valueOf(d.getString("liga")); 
	            Equipo equipo = Equipo.valueOf(d.getString("equipo_favorito"));
	            listaLigas.add(new Ligas_favoritas(liga, equipo));
	        }
	    }
	    u.setLigas_favoritas(listaLigas);

	    return u;
	}

	
	private Document fromUsuario2Document(Usuario u) {
	    Document docDireccion = new Document()
	            .append("calle", u.getDireccion().getCalle())
	            .append("ciudad", u.getDireccion().getCiudad())
	            .append("codigo_postal", u.getDireccion().getCodigo_postal())
	            .append("pais", u.getDireccion().getPais());

	    List<Document> listaLigas = new ArrayList<>();
	    for (Ligas_favoritas l : u.getLigas_favoritas()) {
	        Document docLiga = new Document()
	                .append("liga", l.getLiga().name())      
	                .append("equipo_favorito", l.getEquipo_favorito().name()); 
	        listaLigas.add(docLiga);
	    }

	    return new Document()
	            .append("id", u.getId())
	            .append("nombre", u.getNombre())
	            .append("correo_electronico", u.getCorreo_electronico())
	            .append("recibir_notificaciones", u.isRecibir_notificaciones())
	            .append("tiempo_maximo_uso_diario", u.getTiempo_maximo_uso_diario())
	            .append("direccion", docDireccion)
	            .append("ligas_favoritas", listaLigas);
	}


	
	public void save(Usuario u) {
	    Document doc = fromUsuario2Document(u);
	    coleccion.insertOne(doc);
	}

	
	
	public List<Usuario> read() {
	    List<Usuario> usuarios = new ArrayList<>();
	    FindIterable<Document> documentos = coleccion.find();

	    for (Document doc : documentos) {
	        Usuario u = fromUsuarioDocument2Java(doc);
	        usuarios.add(u);
	    }

	    return usuarios;
	}
		
	
	public void update(Usuario u) {
		    Document actualizar = new Document("id", u.getId());
		    Document docActualizado = fromUsuario2Document(u);

		    coleccion.replaceOne(actualizar, docActualizado);
		}

	public void delete(int id) {
		  Document borrar = new Document("id", id);
		  coleccion.deleteOne(borrar);
	}
	
	public List<Usuario> findByNombre(String nombre) {
	    List<Usuario> resultado = new ArrayList<>();
	    FindIterable<Document> docs = coleccion.find(new Document("nombre", nombre));
	    for (Document doc : docs) {
	        resultado.add(fromUsuarioDocument2Java(doc));
	    }
	    return resultado;
	}

	public List<Usuario> findByNotificaciones(boolean recibir) {
	    List<Usuario> resultado = new ArrayList<>();
	    FindIterable<Document> docs = coleccion.find(new Document("recibir_notificaciones", recibir));
	    for (Document doc : docs) {
	        resultado.add(fromUsuarioDocument2Java(doc));
	    }
	    return resultado;
	}


	public List<Usuario> findAllSortedByNombreAsc() {
	    List<Usuario> resultado = new ArrayList<>();
	    FindIterable<Document> docs = coleccion.find().sort(new Document("nombre", 1));
	    for (Document doc : docs) {
	        resultado.add(fromUsuarioDocument2Java(doc));
	    }
	    return resultado;
	}

	public List<Usuario> findAllSortedByTiempoDesc() {
	    List<Usuario> resultado = new ArrayList<>();
	    FindIterable<Document> docs = coleccion.find().sort(new Document("tiempo_maximo_uso_diario", -1));
	    for (Document doc : docs) {
	        resultado.add(fromUsuarioDocument2Java(doc));
	    }
	    return resultado;
}

	  
    public void agregarLigaFavorita(int idUsuario, Ligas_favoritas liga) {
        Document docLiga = new Document()
                .append("liga", liga.getLiga())
                .append("equipo_favorito", liga.getEquipo_favorito());

        UpdateResult resultado = coleccion.updateOne(
                new Document("id", idUsuario),
                Updates.push("ligas_favoritas", docLiga)
        );

        if (resultado.getModifiedCount() > 0) {
            logger.debug("Se ha agregado la liga  '{}' a usuario {}", liga.getLiga(), idUsuario);
        } else {
            logger.debug("No se pudo agregar al usuario {}. Posible que no exista.", idUsuario);
        }
    }

    public void eliminarLigaPorEquipo(int idUsuario, String equipo) {
        UpdateResult resultado = coleccion.updateOne(
                new Document("id", idUsuario),
                Updates.pull("ligas_favoritas", new Document("equipo_favorito", equipo))
        );

        if (resultado.getModifiedCount() > 0) {
            logger.debug("Se ha eliminado liga del equipo '{}' para el usuario {}", equipo, idUsuario);
        } else {
            logger.debug("No se elimino liga. Quizá no existe para el usuario {}", idUsuario);
        }
    }

    public void actualizarTiempoMaximo(int idUsuario, double nuevoTiempo) {
        UpdateResult resultado = coleccion.updateOne(
                new Document("id", idUsuario),
                Updates.set("tiempo_maximo_uso_diario", nuevoTiempo)
        );

        if (resultado.getModifiedCount() > 0) {
            logger.debug("Se actualizo el tiempo máximo  a {} para el usuario {}", nuevoTiempo, idUsuario);
        } else {
            logger.debug("No se actualizo. Posible que el usuario {} no exista.", idUsuario);
        }
    }
}

