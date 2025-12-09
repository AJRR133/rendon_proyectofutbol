package rendon_proyectofutbol.modelo;

import java.util.List;
import java.util.Objects;

public class Usuario {
	private int id;
	private String nombre,correo_electronico;
	private boolean recibir_notificaciones;
	private double tiempo_maximo_uso_diario;
	private Direccion direccion;
	private List<Ligas_favoritas> ligas_favoritas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public boolean isRecibir_notificaciones() {
		return recibir_notificaciones;
	}
	public void setRecibir_notificaciones(boolean recibir_notificaciones) {
		this.recibir_notificaciones = recibir_notificaciones;
	}
	public double getTiempo_maximo_uso_diario() {
		return tiempo_maximo_uso_diario;
	}
	public void setTiempo_maximo_uso_diario(double tiempo_maximo_uso_diario) {
		this.tiempo_maximo_uso_diario = tiempo_maximo_uso_diario;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Ligas_favoritas> getLigas_favoritas() {
		return ligas_favoritas;
	}
	public void setLigas_favoritas(List<Ligas_favoritas> ligas_favoritas) {
		this.ligas_favoritas = ligas_favoritas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo_electronico=" + correo_electronico
				+ ", recibir_notificaciones=" + recibir_notificaciones + ", tiempo_maximo_uso_diario="
				+ tiempo_maximo_uso_diario + ", direccion=" + direccion + ", ligas_favoritas=" + ligas_favoritas + "]";
	}
	public Usuario(int id, String nombre, String correo_electronico, boolean recibir_notificaciones,
			double tiempo_maximo_uso_diario, Direccion direccion, List<Ligas_favoritas> ligas_favoritas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo_electronico = correo_electronico;
		this.recibir_notificaciones = recibir_notificaciones;
		this.tiempo_maximo_uso_diario = tiempo_maximo_uso_diario;
		this.direccion = direccion;
		this.ligas_favoritas = ligas_favoritas;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
