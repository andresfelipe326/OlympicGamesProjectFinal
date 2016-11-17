package co.edu.udem.olympicgames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.jpa.entities.Arenas;
import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.NewsDTO;


public class ArenasDAOImplTest {

	@Test
	public void testFindArenas() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<ArenasDTO> arenasList = new ArrayList<ArenasDTO>();

		ArenasDAO arenasDAO = (ArenasDAO) context.getBean(ArenasDAOImpl.class);
		arenasList = arenasDAO.findArenas();
				
		for (ArenasDTO arenas : arenasList) {
			System.out.println("nomarena: " + arenas.getNomarena());
		}
		
	}

}
