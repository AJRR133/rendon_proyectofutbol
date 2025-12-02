package rendon_proyectofutbol.modelo;

import java.util.Objects;

public class Direccion {
	private String calle, ciudad, pais;
	private int codigo_postal;
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(calle, ciudad, codigo_postal, pais);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(ciudad, other.ciudad)
				&& codigo_postal == other.codigo_postal && Objects.equals(pais, other.pais);
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", pais=" + pais + ", codigo_postal="
				+ codigo_postal + "]";
	}
	public Direccion(String calle, String ciudad, String pais, int codigo_postal) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
		this.codigo_postal = codigo_postal;
	}
	
	
	
	
	
}
