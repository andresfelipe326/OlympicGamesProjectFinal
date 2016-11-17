package co.edu.udem.olympicgames.webservices;
import java.util.List;

import co.edu.udem.olympicgames.model.NewsDTO;

public interface OlympicNewsServicesInterface {
	
	/**
	 * Get all news for my homepage
	 * @return
	 */
	
	public List<NewsDTO> getNewsHome();

}