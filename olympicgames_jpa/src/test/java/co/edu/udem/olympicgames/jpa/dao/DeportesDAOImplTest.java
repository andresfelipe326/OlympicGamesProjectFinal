package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.Deportes;
import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.DeportesDTO;


public class DeportesDAOImplTest {

	@Test
	public void testFindArenas() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<DeportesDTO> deportesList = new ArrayList<DeportesDTO>();

		DeportesDAO deportesDAO = (DeportesDAO) context.getBean(DeportesDAOImpl.class);
		deportesList = deportesDAO.findDeportes();
				
		for (DeportesDTO deportes : deportesList) {
			System.out.println("nomdeporte: " + deportes.getNomdeporte());
		}
		
	}

}
