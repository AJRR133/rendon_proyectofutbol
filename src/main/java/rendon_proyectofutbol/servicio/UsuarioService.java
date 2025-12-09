package rendon_proyectofutbol.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import rendon_proyectofutbol.Repo.UsuarioRepositorio;
import rendon_proyectofutbol.modelo.Ligas_favoritas;
import rendon_proyectofutbol.modelo.Usuario;

public class UsuarioService {

    private UsuarioRepositorio repo;

    public UsuarioService(UsuarioRepositorio repo) {
        this.repo = repo;
    }

    public void guardarUsuario(Usuario u) {
        repo.save(u);
    }

    public void actualizarUsuario(Usuario u) {
        repo.update(u);
    }

    public void borrarUsuario(int id) {
        repo.delete(id);
    }

    public List<Usuario> obtenerTodos() {
        return repo.getUsuarios();
    }


    public List<Usuario> filtrarPorTiempoMayorAD(double tiempo) {
        List<Usuario> resultado = new ArrayList<>();
        for (Usuario u : repo.getUsuarios()) {
            if (u.getTiempo_maximo_uso_diario() > tiempo) {
                resultado.add(u);
            }
        }
        return resultado;
    }

    public List<Usuario> filtrarPorNotificaciones(boolean recibir) {
        List<Usuario> resultado = new ArrayList<>();
        for (Usuario u : repo.getUsuarios()) {
            if (u.isRecibir_notificaciones() == recibir) {
                resultado.add(u);
            }
        }
        return resultado;
    }


    public List<Usuario> ordenarPorNombreDesc() {
        List<Usuario> lista = new ArrayList<>(repo.getUsuarios());
        Collections.sort(lista, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u2.getNombre().compareTo(u1.getNombre());
            }
        });
        return lista;
    }

    public List<Usuario> ordenarPorTiempoAsc() {
        List<Usuario> lista = new ArrayList<>(repo.getUsuarios());
        Collections.sort(lista, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return Double.compare(u1.getTiempo_maximo_uso_diario(), u2.getTiempo_maximo_uso_diario());
            }
        });
        return lista;
    }


    public void agregarLigaFavorita(int idUsuario, Ligas_favoritas liga) {
        repo.agregarLigaFavorita(idUsuario, liga);
    }

    public void eliminarLigaPorEquipo(int idUsuario, String equipo) {
        repo.eliminarLigaPorEquipo(idUsuario, equipo);
    }

    public void actualizarTiempoMaximo(int idUsuario, double nuevoTiempo) {
        repo.actualizarTiempoMaximo(idUsuario, nuevoTiempo);
    }
}
