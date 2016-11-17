package co.edu.udem.olympicgames.webservices;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.dao.PaisesDAO;
import co.edu.udem.olympicgames.jpa.dao.PaisesDAOImpl;

import co.edu.udem.olympicgames.model.PaisesDTO;

public class OlympicPaisesServicesImpl implements OlympicPaisesServicesInterface {

	@Override
	public List<PaisesDTO> getPaisesHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<PaisesDTO> paisesDTOList = new ArrayList<PaisesDTO>();
		PaisesDAO paisesDAO = (PaisesDAO) context.getBean(PaisesDAOImpl.class);
		paisesDTOList = paisesDAO.findPaises();
		return paisesDTOList;
	}

}