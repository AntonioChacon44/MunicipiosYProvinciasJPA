package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Provincia;

public class ProvinciaController {
	
	/**
	 * 
	 */
	public static List<Provincia> findByNombre () {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("municipiosyprovincias");

		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("SELECT * FROM provincia;", Provincia.class);
		List<Provincia> lista = (List<Provincia>) q.getResultList();
		
		em.close();
		
		return lista;
	}
	
}
