package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import co.edu.udem.olympicgames.model.DeportesDTO;



@Repository
public class DeportesDAOImpl implements DeportesDAO {
	
	@PersistenceContext
	private EntityManager em = null;
	
	public DeportesDTO findDeportes(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<DeportesDTO> findDeportes() {
		Query query = em.createQuery("SELECT NEW co.edu.udem.olympicgames.model.DeportesDTO(n.nomdeporte, n.fechacreacion, n.imagedeportes, n.deportesurl, n.arenadeporte) FROM Deportes n");
		return query.getResultList();		 
	}

}
