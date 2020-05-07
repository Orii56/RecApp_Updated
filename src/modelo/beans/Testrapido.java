package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the testrapido database table.
 * 
 */
@Entity
@NamedQuery(name="Testrapido.findAll", query="SELECT t FROM Testrapido t")
public class Testrapido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RAPIDO")
	private int idRapido;

	private int grupo;

	@Column(name="LETRA_GRUPO")
	private String letraGrupo;

	@Column(name="TXT_GRUPO")
	private String txtGrupo;

	public Testrapido() {
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

	public Testrapido(int idRapido, int grupo, String letraGrupo, String txtGrupo) {
		super();
		this.idRapido = idRapido;
		this.grupo = grupo;
		this.letraGrupo = letraGrupo;
		this.txtGrupo = txtGrupo;
	}

	
	
}