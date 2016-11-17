package co.edu.udem.olympicgames.webservices;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.edu.udem.olympicgames.jpa.dao.DeportistasDAO;
import co.edu.udem.olympicgames.jpa.dao.DeportistasDAOImpl;
import co.edu.udem.olympicgames.model.DeportistasDTO;

public class OlympicDeportistasServicesImpl implements OlympicDeportistasServicesInterface {

	@Override
	public List<DeportistasDTO> getDeportistasHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<DeportistasDTO> deportistasDTOList = new ArrayList<DeportistasDTO>();
		DeportistasDAO deportistasDAO = (DeportistasDAO) context.getBean(DeportistasDAOImpl.class);
		deportistasDTOList = deportistasDAO.findDeportistas();
		return deportistasDTOList;
	}

}
