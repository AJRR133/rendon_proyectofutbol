package rendon_proyectofutbol.Repo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import rendon_proyectofutbol.modelo.Direccion;
import rendon_proyectofutbol.modelo.Ligas_favoritas;
import rendon_proyectofutbol.modelo.Usuario;

public class UsuarioRepositorio {

	private static final String NOMBRE_COLECCION ="hoteles";
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
		u.setId(doc.getInteger("id", 0));
		u.setNombre(doc.getString("nombre"));
		u.setCorreo_electronico(doc.getString("correo_electronico"));
		u.setRecibir_notificaciones(doc.getBoolean("recibir_notificaciones"));
		u.setTiempo_maximo_uso_diario(doc.getDouble("tiempo_maximo_uso_diario"));
		Document docDir = doc.get("direccion", Document.class);
		    if (docDir != null) {
		        Direccion d = new Direccion();
		        d.setCalle(docDir.getString("calle"));
		        d.setCiudad(docDir.getString("ciudad"));
		        d.setCodigo_postal(docDir.getInteger("codigo_postal"));
		        d.setPais(docDir.getString("pais"));
		        
		        u.setDireccion(d);
		    }
		List<Ligas_favoritas> ligas_favoritas = doc.getList("Ligas_favoritas", Ligas_favoritas.class);
		u.setLigas_favoritas(ligas_favoritas !=null? ligas_favoritas : new ArrayList<>());
		return u;
		
	}
	
	public void save(Usuario u) {
		Document doc2 = new Document()
				.append("calle",u.getDireccion().getCalle())
				.append("ciudad", u.getDireccion().getCiudad())
				.append("codigo_postal", u.getDireccion().getCodigo_postal())
				.append("pais", u.getDireccion().getPais());
		
	}
	
	
	public List<Usuario> read(){
		
		
		return usuarios;
		
	}
}
