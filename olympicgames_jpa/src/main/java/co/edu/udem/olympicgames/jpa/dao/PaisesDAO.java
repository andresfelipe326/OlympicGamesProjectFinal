package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;



import co.edu.udem.olympicgames.model.PaisesDTO;

public interface PaisesDAO {
	
public PaisesDTO findPaises(int id);
	
	public List<PaisesDTO> findPaises();

}
