package co.edu.udem.olympicgames.jpa.dao;

import java.util.List;

import co.edu.udem.olympicgames.model.ArenasDTO;



public interface ArenasDAO {
	
public ArenasDTO findArenas(int id);
	
	public List<ArenasDTO> findArenas();

}
