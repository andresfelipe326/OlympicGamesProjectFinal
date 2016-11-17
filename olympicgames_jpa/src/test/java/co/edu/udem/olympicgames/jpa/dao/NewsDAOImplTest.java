package co.edu.udem.olympicgames.jpa.dao;



import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.udem.olympicgames.model.NewsDTO;


public class NewsDAOImplTest {

	

	@Test
	public void testFindNews() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<NewsDTO> newsList = new ArrayList<NewsDTO>();

		NewsDAO newsDAO = (NewsDAO) context.getBean(NewsDAOImpl.class);
		newsList = newsDAO.findNews();
		for (NewsDTO news : newsList) {
			System.out.println("title: " + news.getTitle());
		}
	
	}

}
