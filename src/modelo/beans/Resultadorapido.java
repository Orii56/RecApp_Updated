package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the RESULTADORAPIDO database table.
 * 
 */
@Entity
@NamedQuery(name = "Resultadorapido.findAll", query = "SELECT r FROM Resultadorapido r")
public class Resultadorapido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RESULTADORAPIDO")
	private int idResultadorapido;

	private String combinacion;

	private String eneatiporapido;

	@Column(name = "ID_ENEATIPO")
	private int idEneatipo;

	private String palabraclave;

	public Resultadorapido() {
	}

	public Resultadorapido(int idResultadorapido, String combinacion, String eneatiporapido, int idEneatipo,
			String palabraclave) {
		super();
		this.idResultadorapido = idResultadorapido;
		this.combinacion = combinacion;
		this.eneatiporapido = eneatiporapido;
		this.idEneatipo = idEneatipo;
		this.palabraclave = palabraclave;
	}

	public int getIdResultadorapido() {
		return this.idResultadorapido;
	}

	public void setIdResultadorapido(int idResultadorapido) {
		this.idResultadorapido = idResultadorapido;
	}

	public String getCombinacion() {
		return this.combinacion;
	}

	public void setCombinacion(String combinacion) {
		this.combinacion = combinacion;
	}

	public String getEneatiporapido() {
		return this.eneatiporapido;
	}

	public void setEneatiporapido(String eneatiporapido) {
		this.eneatiporapido = eneatiporapido;
	}

	public int getIdEneatipo() {
		return this.idEneatipo;
	}

	public void setIdEneatipo(int idEneatipo) {
		this.idEneatipo = idEneatipo;
	}

	public String getPalabraclave() {
		return this.palabraclave;
	}

	public void setPalabraclave(String palabraclave) {
		this.palabraclave = palabraclave;
	}

	@Override
	public String toString() {
		return "Resultadorapido [idResultadorapido=" + idResultadorapido + ", combinacion=" + combinacion
				+ ", eneatiporapido=" + eneatiporapido + ", idEneatipo=" + idEneatipo + ", palabraclave=" + palabraclave
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((combinacion == null) ? 0 : combinacion.hashCode());
		result = prime * result + ((eneatiporapido == null) ? 0 : eneatiporapido.hashCode());
		result = prime * result + idEneatipo;
		result = prime * result + idResultadorapido;
		result = prime * result + ((palabraclave == null) ? 0 : palabraclave.hashCode());
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
		Resultadorapido other = (Resultadorapido) obj;
		if (combinacion == null) {
			if (other.combinacion != null)
				return false;
		} else if (!combinacion.equals(other.combinacion))
			return false;
		if (eneatiporapido == null) {
			if (other.eneatiporapido != null)
				return false;
		} else if (!eneatiporapido.equals(other.eneatiporapido))
			return false;
		if (idEneatipo != other.idEneatipo)
			return false;
		if (idResultadorapido != other.idResultadorapido)
			return false;
		if (palabraclave == null) {
			if (other.palabraclave != null)
				return false;
		} else if (!palabraclave.equals(other.palabraclave))
			return false;
		return true;
	}

}