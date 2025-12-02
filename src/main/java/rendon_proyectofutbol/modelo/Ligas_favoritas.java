package rendon_proyectofutbol.modelo;

import java.util.Objects;

public class Ligas_favoritas {
	private Liga liga;
	private Equipo equipo_favorito;
	public Liga getLiga() {
		return liga;
	}
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	public Equipo getEquipo_favorito() {
		return equipo_favorito;
	}
	public void setEquipo_favorito(Equipo equipo_favorito) {
		this.equipo_favorito = equipo_favorito;
	}
	@Override
	public int hashCode() {
		return Objects.hash(equipo_favorito, liga);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ligas_favoritas other = (Ligas_favoritas) obj;
		return equipo_favorito == other.equipo_favorito && liga == other.liga;
	}
	@Override
	public String toString() {
		return "Ligas_favoritas [liga=" + liga + ", equipo_favorito=" + equipo_favorito + "]";
	}
	public Ligas_favoritas(Liga liga, Equipo equipo_favorito) {
		super();
		this.liga = liga;
		this.equipo_favorito = equipo_favorito;
	}

	
}
