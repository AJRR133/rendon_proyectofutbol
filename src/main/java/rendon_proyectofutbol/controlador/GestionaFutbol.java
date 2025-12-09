package rendon_proyectofutbol.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mongodb.client.MongoDatabase;

import rendon_proyectofutbol.Config.MongoDBConexion;
import rendon_proyectofutbol.modelo.Direccion;
import rendon_proyectofutbol.modelo.Equipo;
import rendon_proyectofutbol.modelo.Liga;
import rendon_proyectofutbol.modelo.Ligas_favoritas;
import rendon_proyectofutbol.modelo.Usuario;
import rendon_proyectofutbol.servicio.UsuarioService;
import rendon_proyectofutbol.Repo.UsuarioRepositorio;

public class GestionaFutbol {

    private static final Logger logger = LogManager.getLogger(GestionaFutbol.class);

    public static void main(String[] args) {
        MongoDBConexion conexion = new MongoDBConexion();
        MongoDatabase db = conexion.getDb();

        UsuarioRepositorio repo = new UsuarioRepositorio(db);
        UsuarioService service = new UsuarioService(repo);

        Direccion dir1 = new Direccion("Calle aguila 33", "Sevilla", "España", 28001);
        Ligas_favoritas liga1 = new Ligas_favoritas(Liga.LALIGA, Equipo.SEVILLA);
        Ligas_favoritas liga2 = new Ligas_favoritas(Liga.PREMIER_LEAGUE, Equipo.ARSENAL);
        Usuario usuario1 = new Usuario(14, "Juan", "juan@mail.com", true, 2.5, dir1, Arrays.asList(liga1, liga2));

        Direccion dir2 = new Direccion("Avenida juanillo  22", "Sevilla", "España", 01010);
        Ligas_favoritas liga3 = new Ligas_favoritas(Liga.SERIE_A, Equipo.JUVENTUS);
        Usuario usuario2 = new Usuario(24, "Maria", "maria@mail.com", false, 1.5, dir2, Arrays.asList(liga3));

        service.guardarUsuario(usuario1);
        service.guardarUsuario(usuario2);

        logger.info("Todos los usuarios");
        for (Usuario u : repo.getUsuarios()) {
            logger.info(u);
        }

        logger.info("Usuarios mas 2 hora");
        List<Usuario> filtradosTiempo = service.filtrarPorTiempoMayorAD(2);
        for (Usuario u : filtradosTiempo) {
            logger.info(u);
        }

        logger.info("reciben notis");
        List<Usuario> filtradosNotif = service.filtrarPorNotificaciones(true);
        for (Usuario u : filtradosNotif) {
            logger.info(u);
        }

        logger.info("ordenados descendentementte");
        List<Usuario> ordenNombre = service.ordenarPorNombreDesc();
        for (Usuario u : ordenNombre) {
            logger.info(u);
        }

        logger.info("ordenados ascendentemente");
        List<Usuario> ordenTiempo = service.ordenarPorTiempoAsc();
        for (Usuario u : ordenTiempo) {
            logger.info(u);
        }

        Ligas_favoritas nuevaLiga = new Ligas_favoritas(Liga.BUNDESLIGA, Equipo.BAYERN_MUNICH);
        service.agregarLigaFavorita(1, nuevaLiga); 
        
        service.eliminarLigaPorEquipo(1, "Real Madrid"); 

        service.actualizarTiempoMaximo(2, 3.0); 

        logger.info("despues de ser modificados");
        for (Usuario u : repo.getUsuarios()) {
            logger.info(u);
        }
    }
}
