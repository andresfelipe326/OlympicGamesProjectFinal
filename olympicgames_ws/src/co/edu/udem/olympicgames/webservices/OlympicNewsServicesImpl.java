package co.edu.udem.olympicgames.webservices;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.edu.udem.olympicgames.model.NewsDTO;
import co.edu.udem.olympicgames.jpa.dao.NewsDAO;
import co.edu.udem.olympicgames.jpa.dao.NewsDAOImpl;


public class OlympicNewsServicesImpl implements OlympicNewsServicesInterface {

	/*@Override
	public List<NewsDTO> getNewsHome() {
		
		
		/*NewsDTO newsDTO = new NewsDTO();
		newsDTO.setTitle("La coronación de la 'birreina' olímpica");
		newsDTO.setDescription("Al levantarse el casco y quitarse las gafas que le cubrían el rostro fueron evidentes los ojos encharcados. Alzó su índice derecho y empezó a cantar y a saltar al ritmo de los cantos que bajaban de las tribunas, “¡Colombia, Colombia, Colombia!”, se repetía una y otra vez.");
		newsDTO.setImage("resources/images/marianap1.jpg");
		newsDTO.setNewsUrl("http://www.eltiempo.com/deportes/ciclismo/mariana-pajon-medalla-de-oro-olimpicos-rio-2016/16677942");
		newsDTOList.add(newsDTO);
		NewsDTO newsDTO2 = new NewsDTO();
		newsDTO2.setTitle("República de Phelps");
		newsDTO2.setDescription("No hay pruebas que expresen mejor la trayectoria de Phelps en los Juegos que los 200m mariposa y los 200m estilos. Los 200 estilos son, como el decatlón, el test de la excelencia acuática. Los 200 mariposa, la carrera que más ácido láctico produce en los participantes, la más dura en términos fisiológicos. Fueron las dos pruebas individuales que Phelps ganó en Rio. Su reino");
		newsDTO2.setImage("resources/images/phelps1.jpg");
		newsDTO2.setNewsUrl("http://deportes.elpais.com/deportes/2016/08/21/actualidad/1471786925_367747.html");
		newsDTOList.add(newsDTO2);
		NewsDTO newsDTO3 = new NewsDTO();
		newsDTO3.setTitle("La samba olímpica de Usain Bolt con fondo amargo");
		newsDTO3.setDescription("Atacado de timidez, víctima de un brote agudo de agorafobia Usain Bolt, la estrella que será de la segunda semana de los Juegos, llevaba encerrado varios días en su habitación de la Villa Olímpica. “No quiero ver a nadie”, decía a sus compañeros jamaicanos. “Estoy harto de que todo el mundo quiera hacerse selfies conmigo. Qué pesados”.");
		newsDTO3.setImage("resources/images/bolt1.jpg");
		newsDTO3.setNewsUrl("http://deportes.elpais.com/deportes/2016/08/09/actualidad/1470717497_699984.html");
		newsDTOList.add(newsDTO3);
		
		return newsDTOList;
	}*/

	@Override
	public List<NewsDTO> getNewsHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<NewsDTO> newsDTOList = new ArrayList<NewsDTO>();
		NewsDAO newsDAO = (NewsDAO) context.getBean(NewsDAOImpl.class);
		newsDTOList = newsDAO.findNews();
		return newsDTOList;
	}

}
