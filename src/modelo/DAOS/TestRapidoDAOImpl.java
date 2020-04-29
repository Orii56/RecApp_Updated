package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Testrapido;

public class TestRapidoDAOImpl implements TestRapidoDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public TestRapidoDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public List<Testrapido> findAll() {
		
		query = em.createNamedQuery("Testrapido.findAll");

		return query.getResultList();
	}

	@Override
	public List<Testrapido> findByTipoEneg(int tipoEneg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Testrapido> findByID(int tipoID) {
		// TODO Auto-generated method stub
		return null;
	}

}
