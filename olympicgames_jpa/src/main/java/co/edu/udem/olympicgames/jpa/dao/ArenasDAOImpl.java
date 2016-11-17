package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.jpa.dao.ArenasDAO;


@Repository
public class ArenasDAOImpl implements ArenasDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	public ArenasDTO findArenas(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<ArenasDTO> findArenas() {
		Query query = em.createQuery("SELECT NEW co.edu.udem.olympicgames.model.ArenasDTO(n.nomarena, n.fechainaugura, n.ciudadarena, n.imagearena) FROM Arenas n");
		return query.getResultList();		 
	}
}