package modelo.DAOS;

import java.util.List;

import modelo.beans.Testrapido;

public interface TestRapidoDAO {

	public List<Testrapido> findAll();

	public List<Testrapido> findByTipoEneg(int tipoEneg);

	public List<Testrapido> findByID(int tipoID);

}
