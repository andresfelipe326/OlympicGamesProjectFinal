package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import co.edu.udem.olympicgames.model.PaisesDTO;

@Repository
public class PaisesDAOImpl implements PaisesDAO{
	@PersistenceContext
	private EntityManager em = null;
	
	public PaisesDTO findPaises(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<PaisesDTO> findPaises() {
		Query query = em.createQuery("SELECT NEW co.edu.udem.olympicgames.model.PaisesDTO(n.nombrepais, n.continentepais, n.imagebandera) FROM Paises n");
		return query.getResultList();		 
	}

}
