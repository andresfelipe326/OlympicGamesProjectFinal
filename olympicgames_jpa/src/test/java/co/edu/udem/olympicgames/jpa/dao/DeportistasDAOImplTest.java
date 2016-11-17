package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.Deportistas;
import co.edu.udem.olympicgames.model.DeportistasDTO;

public class DeportistasDAOImplTest {

	@Test
	public void testFindDeportistas() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<DeportistasDTO> deportistasList = new ArrayList<DeportistasDTO>();
		
		DeportistasDAO deportistasDAO = context.getBean(DeportistasDAOImpl.class);
		deportistasList = deportistasDAO.findDeportistas();
		
		for (DeportistasDTO deportistas : deportistasList){
			
			System.out.println("Nombre Deportistas: " + deportistas.getNomdeportista());
			
		}
		
	}

}
