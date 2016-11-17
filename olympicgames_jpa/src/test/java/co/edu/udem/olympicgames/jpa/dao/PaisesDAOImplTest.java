package co.edu.udem.olympicgames.jpa.dao;



import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.edu.udem.olympicgames.jpa.entities.Paises;
import co.edu.udem.olympicgames.model.PaisesDTO;

public class PaisesDAOImplTest {

	@Test
	public void testFindPaises() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<PaisesDTO> paisesList = new ArrayList<PaisesDTO>();
		
		PaisesDAO paisesDAO = context.getBean(PaisesDAOImpl.class);
		paisesList = paisesDAO.findPaises();
		
		for (PaisesDTO paises : paisesList){
			
			System.out.println("Nombre de pais: " + paises.getNombrepais());
			
		}
		
	}


}
