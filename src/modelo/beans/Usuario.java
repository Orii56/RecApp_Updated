package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private int idUsuario;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;

	private String nombre;

	private String password;

	@Column(name="RESULTADO_RAPIDO")
	private String resultadoRapido;

	@Column(name="RESULTADO_TEST")
	private int resultadoTest;

	@Column(name="TIPO_ENEAGRAMA")
	private String tipoEneagrama;

	@Column(name="TIPO_RAPIDO")
	private String tipoRapido;

	//uni-directional many-to-one association to Eneagrama
	@ManyToOne
	@JoinColumn(name="ID_ENE")
	private Eneagrama eneagrama;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResultadoRapido() {
		return this.resultadoRapido;
	}

	public void setResultadoRapido(String resultadoRapido) {
		this.resultadoRapido = resultadoRapido;
	}

	public int getResultadoTest() {
		return this.resultadoTest;
	}

	public void setResultadoTest(int resultadoTest) {
		this.resultadoTest = resultadoTest;
	}

	public String getTipoEneagrama() {
		return this.tipoEneagrama;
	}

	public void setTipoEneagrama(String tipoEneagrama) {
		this.tipoEneagrama = tipoEneagrama;
	}

	public String getTipoRapido() {
		return this.tipoRapido;
	}

	public void setTipoRapido(String tipoRapido) {
		this.tipoRapido = tipoRapido;
	}

	public Eneagrama getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(Eneagrama eneagrama) {
		this.eneagrama = eneagrama;
	}

	public Usuario(int idUsuario, String email, Date fechaAlta, String nombre, String password, String resultadoRapido,
			int resultadoTest, String tipoEneagrama, String tipoRapido, Eneagrama eneagrama) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.nombre = nombre;
		this.password = password;
		this.resultadoRapido = resultadoRapido;
		this.resultadoTest = resultadoTest;
		this.tipoEneagrama = tipoEneagrama;
		this.tipoRapido = tipoRapido;
		this.eneagrama = eneagrama;
	}

}