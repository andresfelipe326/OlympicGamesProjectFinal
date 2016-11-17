package co.edu.udem.olympicgames.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.dao.ArenasDAO;
import co.edu.udem.olympicgames.jpa.dao.ArenasDAOImpl;
import co.edu.udem.olympicgames.model.ArenasDTO;



public class OlympicArenasServicesImpl implements OlympicArenasServicesInterface {


	
	@Override
	public List<ArenasDTO> getArenasHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<ArenasDTO> arenasDTOList = new ArrayList<ArenasDTO>();
		ArenasDAO arenasDAO = (ArenasDAO) context.getBean(ArenasDAOImpl.class);
		arenasDTOList = arenasDAO.findArenas();
		return arenasDTOList;
	}

}
