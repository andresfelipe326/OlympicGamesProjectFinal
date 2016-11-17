package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import co.edu.udem.olympicgames.model.DeportistasDTO;

@Repository
public class DeportistasDAOImpl implements DeportistasDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	public DeportistasDTO findDeportistas(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<DeportistasDTO> findDeportistas() {
		Query query = em.createQuery("SELECT NEW co.edu.udem.olympicgames.model.DeportistasDTO(n.nomdeportista, n.edad, n.pais, n.deporte, n.imagedeportista) FROM Deportistas n");
		return query.getResultList();		 
	}
}