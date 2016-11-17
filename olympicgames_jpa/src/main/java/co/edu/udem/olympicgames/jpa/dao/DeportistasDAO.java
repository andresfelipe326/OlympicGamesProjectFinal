package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;


import co.edu.udem.olympicgames.model.DeportistasDTO;



public interface DeportistasDAO {
	
	public DeportistasDTO findDeportistas(int id);
	
	public List<DeportistasDTO> findDeportistas();

}
