package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;


import co.edu.udem.olympicgames.model.DeportesDTO;

public interface DeportesDAO {
	
	public DeportesDTO findDeportes(int id);

	public List<DeportesDTO> findDeportes();

}
