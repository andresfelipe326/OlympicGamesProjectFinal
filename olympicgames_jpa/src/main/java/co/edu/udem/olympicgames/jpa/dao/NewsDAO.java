package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.model.NewsDTO;


public interface NewsDAO {
	
	public NewsDTO findNews(int id);
	
	public List<NewsDTO> findNews();

}
