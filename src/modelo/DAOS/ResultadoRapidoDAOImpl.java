package modelo.DAOS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Resultadorapido;
import modelo.beans.Usuario;

public class ResultadoRapidoDAOImpl implements ResultadoRapidoDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public ResultadoRapidoDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public Resultadorapido findByCombinacion(String letras) {
		
		System.out.println("dentro de la SQL " + letras);

		sql = "select r from Resultadorapido r where r.combinacion = :letras";

		try {
			query = em.createQuery(sql);
			query.setParameter("letras", letras);
			return (Resultadorapido) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
