package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ANUNCIO database table.
 * 
 */
@Entity
@NamedQuery(name = "Anuncio.findAll", query = "SELECT a FROM Anuncio a")
public class Anuncio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANUN_AUX")
	private int idAnunAux;

	private String cargo;

	private String detalle;

	private int eneagrama;

	private String keyword;

	private String requerimientos;

	private String salario;

	@Column(name = "TIPO_JORNADA")
	private String tipoJornada;

	private String ubicacion;

	public Anuncio() {
	}

	public Anuncio(int idAnunAux, String cargo, String detalle, int eneagrama, String keyword, String requerimientos,
			String salario, String tipoJornada, String ubicacion) {
		super();
		this.idAnunAux = idAnunAux;
		this.cargo = cargo;
		this.detalle = detalle;
		this.eneagrama = eneagrama;
		this.keyword = keyword;
		this.requerimientos = requerimientos;
		this.salario = salario;
		this.tipoJornada = tipoJornada;
		this.ubicacion = ubicacion;
	}

	public int getIdAnunAux() {
		return this.idAnunAux;
	}

	public void setIdAnunAux(int idAnunAux) {
		this.idAnunAux = idAnunAux;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(int eneagrama) {
		this.eneagrama = eneagrama;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getRequerimientos() {
		return this.requerimientos;
	}

	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getTipoJornada() {
		return this.tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Anuncio [idAnunAux=" + idAnunAux + ", cargo=" + cargo + ", detalle=" + detalle + ", eneagrama="
				+ eneagrama + ", keyword=" + keyword + ", requerimientos=" + requerimientos + ", salario=" + salario
				+ ", tipoJornada=" + tipoJornada + ", ubicacion=" + ubicacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((detalle == null) ? 0 : detalle.hashCode());
		result = prime * result + eneagrama;
		result = prime * result + idAnunAux;
		result = prime * result + ((keyword == null) ? 0 : keyword.hashCode());
		result = prime * result + ((requerimientos == null) ? 0 : requerimientos.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		result = prime * result + ((tipoJornada == null) ? 0 : tipoJornada.hashCode());
		result = prime * result + ((ubicacion == null) ? 0 : ubicacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anuncio other = (Anuncio) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (detalle == null) {
			if (other.detalle != null)
				return false;
		} else if (!detalle.equals(other.detalle))
			return false;
		if (eneagrama != other.eneagrama)
			return false;
		if (idAnunAux != other.idAnunAux)
			return false;
		if (keyword == null) {
			if (other.keyword != null)
				return false;
		} else if (!keyword.equals(other.keyword))
			return false;
		if (requerimientos == null) {
			if (other.requerimientos != null)
				return false;
		} else if (!requerimientos.equals(other.requerimientos))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		if (tipoJornada == null) {
			if (other.tipoJornada != null)
				return false;
		} else if (!tipoJornada.equals(other.tipoJornada))
			return false;
		if (ubicacion == null) {
			if (other.ubicacion != null)
				return false;
		} else if (!ubicacion.equals(other.ubicacion))
			return false;
		return true;
	}

}