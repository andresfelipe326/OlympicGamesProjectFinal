package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.edu.udem.olympicgames.model.NewsDTO;



@Repository
public class NewsDAOImpl implements NewsDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	public NewsDTO findNews(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<NewsDTO> findNews() {
		Query query = em.createQuery("SELECT NEW co.edu.udem.olympicgames.model.NewsDTO(n.title, n.description, n.image, n.newsUrl) FROM News n");
		return query.getResultList();		 
	}
}