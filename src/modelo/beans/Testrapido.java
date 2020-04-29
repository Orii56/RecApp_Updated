package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the TESTRAPIDO database table.
 * 
 */
@Entity
@NamedQuery(name = "Testrapido.findAll", query = "SELECT t FROM Testrapido t")
public class Testrapido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RAPIDO")
	private int idRapido;

	private int grupo;

	@Column(name = "LETRA_GRUPO")
	private String letraGrupo;

	@Column(name = "TXT_GRUPO")
	private String txtGrupo;

	public Testrapido() {
	}

	public Testrapido(int idRapido, int grupo, String letraGrupo, String txtGrupo) {
		super();
		this.idRapido = idRapido;
		this.grupo = grupo;
		this.letraGrupo = letraGrupo;
		this.txtGrupo = txtGrupo;
	}

	public int getIdRapido() {
		return this.idRapido;
	}

	public void setIdRapido(int idRapido) {
		this.idRapido = idRapido;
	}

	public int getGrupo() {
		return this.grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String getLetraGrupo() {
		return this.letraGrupo;
	}

	public void setLetraGrupo(String letraGrupo) {
		this.letraGrupo = letraGrupo;
	}

	public String getTxtGrupo() {
		return this.txtGrupo;
	}

	public void setTxtGrupo(String txtGrupo) {
		this.txtGrupo = txtGrupo;
	}

	@Override
	public String toString() {
		return "Testrapido [idRapido=" + idRapido + ", grupo=" + grupo + ", letraGrupo=" + letraGrupo + ", txtGrupo="
				+ txtGrupo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grupo;
		result = prime * result + idRapido;
		result = prime * result + ((letraGrupo == null) ? 0 : letraGrupo.hashCode());
		result = prime * result + ((txtGrupo == null) ? 0 : txtGrupo.hashCode());
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
		Testrapido other = (Testrapido) obj;
		if (grupo != other.grupo)
			return false;
		if (idRapido != other.idRapido)
			return false;
		if (letraGrupo == null) {
			if (other.letraGrupo != null)
				return false;
		} else if (!letraGrupo.equals(other.letraGrupo))
			return false;
		if (txtGrupo == null) {
			if (other.txtGrupo != null)
				return false;
		} else if (!txtGrupo.equals(other.txtGrupo))
			return false;
		return true;
	}

}