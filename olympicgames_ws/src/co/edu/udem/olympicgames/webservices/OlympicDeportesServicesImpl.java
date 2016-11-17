package co.edu.udem.olympicgames.webservices;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import co.edu.udem.olympicgames.jpa.dao.DeportesDAO;
import co.edu.udem.olympicgames.jpa.dao.DeportesDAOImpl;
import co.edu.udem.olympicgames.model.DeportesDTO;

public class OlympicDeportesServicesImpl implements OlympicDeportesServicesInterface {

	@Override
	public List<DeportesDTO> getDeportesHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<DeportesDTO> deportesDTOList = new ArrayList<DeportesDTO>();
		DeportesDAO deportesDAO = (DeportesDAO) context.getBean(DeportesDAOImpl.class);
		deportesDTOList = deportesDAO.findDeportes();
		return deportesDTOList;
	}

}