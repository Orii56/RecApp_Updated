package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resultadorapido database table.
 * 
 */
@Entity
@NamedQuery(name="Resultadorapido.findAll", query="SELECT r FROM Resultadorapido r")
public class Resultadorapido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RESULTADORAPIDO")
	private int idResultadorapido;

	private String combinacion;

	private String eneatiporapido;

	@Column(name="ID_ENEATIPO")
	private int idEneatipo;

	private String palabraclave;

	public Resultadorapido() {
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

}