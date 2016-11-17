package co.edu.udem.olympicgames.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.DeportesDTO;
import co.edu.udem.olympicgames.model.DeportistasDTO;
import co.edu.udem.olympicgames.model.NewsDTO;
import co.edu.udem.olympicgames.model.PaisesDTO;
import co.edu.udem.olympicgames.service.OlympicServicesFacade;


@Controller
public class OlympicController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexstart() {
		return new ModelAndView("index");
	}
	
	@Controller
	public class NewsController {

		@RequestMapping(value = "/news", method = RequestMethod.GET)
		public ModelAndView news() {
			OlympicServicesFacade olympicServiceFacade = new OlympicServicesFacade();
			List<NewsDTO> newsDTO = olympicServiceFacade.getNewsHomeWS();
			//NewsServiceInterface newsServiceInterface = new NewsServiceImpl();
			//List<NewsDTO> newsDTO = newsServiceInterface.getNews();
			return new ModelAndView("news", "command", newsDTO);
		}

	}
	
	@Controller
	public class ArenasController {

		@RequestMapping(value = "/arenas", method = RequestMethod.GET)
		public ModelAndView arenas(){
			OlympicServicesFacade olympicServicesFacade = new OlympicServicesFacade();
			List<ArenasDTO>arenasDTO = olympicServicesFacade.getArenasHomeWS();
			return new ModelAndView("arenas","command", arenasDTO);
		}
	}
	
	@Controller
	public class DeportesController {

		@RequestMapping(value = "/deportes", method = RequestMethod.GET)
		public ModelAndView arenas(){
			OlympicServicesFacade olympicServicesFacade = new OlympicServicesFacade();
			List<DeportesDTO>deportesDTO = olympicServicesFacade.getDeportesHomeWS();
			return new ModelAndView("deportes","command", deportesDTO);
		}
	}
	
	@Controller
	public class DeportistasController {

		@RequestMapping(value = "/deportistas", method = RequestMethod.GET)
		public ModelAndView arenas(){
			OlympicServicesFacade olympicServicesFacade = new OlympicServicesFacade();
			List<DeportistasDTO>deportistasDTO = olympicServicesFacade.getDeportistasHomeWS();
			return new ModelAndView("deportistas","command", deportistasDTO);
		}
	}
	
	@Controller
	public class PaisesController {

		@RequestMapping(value = "/paises", method = RequestMethod.GET)
		public ModelAndView arenas(){
			OlympicServicesFacade olympicServiceFacade = new OlympicServicesFacade();
			List<PaisesDTO> paisesDTO = olympicServiceFacade.getPaisesHomeWS();
			return new ModelAndView("paises","command", paisesDTO);
		}
	}
	
	
	/*  Arenas Controller 
	
	@RequestMapping(value = "/arenas", method = RequestMethod.GET)
	public ModelAndView arenasStart() {
		List<ArenasDTO> arenasDTO = arenasDtoPopulator();
		return new ModelAndView("arenas", "command", arenasDTO);
	}
	
	private List<ArenasDTO> arenasDtoPopulator() {
		
		
		List<ArenasDTO> arenasDTOList = new ArrayList<ArenasDTO>();

		ArenasDTO arenasDTO = new ArenasDTO();
		arenasDTO.setNomarena("Morumbi stadium");
		arenasDTO.setCiudadarena("sao paulo");
		arenasDTO.setFechainaugura("1986");
		arenasDTO.setImagearena("resources/images/olimpicos1.jpg");
		arenasDTOList.add(arenasDTO);
		
		ArenasDTO arenasDTO2 = new ArenasDTO();
		arenasDTO2.setNomarena("Arena Corinthians");
		arenasDTO2.setCiudadarena("sao paulo");
		arenasDTO2.setFechainaugura("1983");
		arenasDTO2.setImagearena("resources/images/olimpicos3.jpg");
		arenasDTOList.add(arenasDTO2);
		
		
		return arenasDTOList;		
	}

	
	
	  Deportes Controller 
	
	@RequestMapping(value = "/deportes", method = RequestMethod.GET)
	public ModelAndView deportesStart() {
		List<DeportesDTO> deportesDTO = deportesDtoPopulator();
		return new ModelAndView("deportes", "command", deportesDTO);
	}
	
	private List<DeportesDTO> deportesDtoPopulator() {
		
		
		List<DeportesDTO> deportesDTOList = new ArrayList<DeportesDTO>();

		DeportesDTO deportesDTO = new DeportesDTO();
		deportesDTO.setNomdeporte("Futbol");
		deportesDTO.setFechacreacion("21/08/1895");
		deportesDTO.setImagedeporte("resources/images/olimpicos1.jpg");
		deportesDTO.setArenadeporte("cancha de futbol");
		deportesDTO.setDeportesUrl("https://es.wikipedia.org/wiki/F%C3%BAtbol");
		deportesDTOList.add(deportesDTO);
		
		DeportesDTO deportesDTO2 = new DeportesDTO();
		deportesDTO2.setNomdeporte("Lanzamiento de Jabalina");
		deportesDTO2.setFechacreacion("21/08/1895");
		deportesDTO2.setImagedeporte("resources/images/olimpicos1.jpg");
		deportesDTO2.setArenadeporte("Campo de atletismo");
		deportesDTO2.setDeportesUrl("https://es.wikipedia.org/wiki/F%C3%BAtbol");
		deportesDTOList.add(deportesDTO2);
		
		
		return deportesDTOList;		
	}

	
	  Deportistas Controller 
	
	@RequestMapping(value = "/deportistas", method = RequestMethod.GET)
	public ModelAndView deportistasStart() {
		List<DeportistasDTO> deportistasDTO = deportistasDtoPopulator();
		return new ModelAndView("deportistas", "command", deportistasDTO);
	}
	
	private List<DeportistasDTO> deportistasDtoPopulator() {
		
		
		List<DeportistasDTO> deportistasDTOList = new ArrayList<DeportistasDTO>();

		DeportistasDTO deportistasDTO = new DeportistasDTO();
		deportistasDTO.setNomdeportista("Mariana Pajon");
		deportistasDTO.setEdad("25");
		deportistasDTO.setDeporte("BMX");
		deportistasDTO.setPais("Colombia");
		deportistasDTO.setImagedeportista("resources/images/olimpicos2.jpg");
		deportistasDTOList.add(deportistasDTO);
		
		DeportistasDTO deportistasDTO2 = new DeportistasDTO();
		deportistasDTO2.setNomdeportista("Chris Froome");
		deportistasDTO2.setEdad("32");
		deportistasDTO2.setDeporte("Ciclismo");
		deportistasDTO2.setPais("Inglaterra");
		deportistasDTO2.setImagedeportista("resources/images/olimpicos3.jpg");
		deportistasDTOList.add(deportistasDTO2);
		
		
		return deportistasDTOList;		
	}
	
	  Paises Controller 
	
	@RequestMapping(value = "/paises", method = RequestMethod.GET)
	public ModelAndView paisesStart() {
		List<PaisesDTO> paisesDTO = paisesDtoPopulator();
		return new ModelAndView("paises", "command", paisesDTO);
	}
	
	private List<PaisesDTO> paisesDtoPopulator() {

		List<PaisesDTO> paisesDTOList = new ArrayList<PaisesDTO>();

		PaisesDTO paisesDTO = new PaisesDTO();
		paisesDTO.setNombrepais("Brasil");
		paisesDTO.setContinentepais("Suramerica");
		paisesDTO.setImagebandera("resources/images/olimpicos1.jpg");
		paisesDTOList.add(paisesDTO);
		
		
		PaisesDTO paisesDTO2 = new PaisesDTO();
		paisesDTO2.setNombrepais("Italia");
		paisesDTO2.setContinentepais("Europa");
		paisesDTO2.setImagebandera("resources/images/olimpicos2.jpg");
		paisesDTOList.add(paisesDTO2);
		
		PaisesDTO paisesDTO3 = new PaisesDTO();
		paisesDTO2.setNombrepais("Camerun");
		paisesDTO2.setContinentepais("Africa");
		paisesDTO2.setImagebandera("resources/images/olimpicos3.jpg");
		paisesDTOList.add(paisesDTO3);
		
		return paisesDTOList;		
	}*/
	
	
// Comentarios controllers services
	
	
	
	/*  Noticias Controller 
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView newsStart() {
		OlympicServicesFacade olympicServiceInterface = OlympicServicesFacade.getInstance();
		List<NewsDTO> newsDTO = olympicServiceInterface.getNewsHome();
		return new ModelAndView("news", "command", newsDTO);
	}
	
  Arenas Controller 
	
	@RequestMapping(value = "/arenas", method = RequestMethod.GET)
	public ModelAndView arenasStart() {
		OlympicServicesFacade olympicServiceInterface = OlympicServicesFacade.getInstance();
		List<ArenasDTO> arenasDTO = olympicServiceInterface.getArenasHome();
		return new ModelAndView("arenas", "command", arenasDTO);
	}
	
  Deportes Controller 
	
	@RequestMapping(value = "/deportes", method = RequestMethod.GET)
	public ModelAndView deportesStart() {
		OlympicServicesFacade olympicServiceInterface = OlympicServicesFacade.getInstance();
		List<DeportesDTO> deportesDTO = olympicServiceInterface.getDeportesHome();
		return new ModelAndView("deportes", "command", deportesDTO);
	}
	
  Deportistas Controller 
	
	@RequestMapping(value = "/deportistas", method = RequestMethod.GET)
	public ModelAndView deportistasStart() {
		OlympicServicesFacade olympicServiceInterface = OlympicServicesFacade.getInstance();
		List<DeportistasDTO> deportistasDTO = olympicServiceInterface.getDeportistasHome();
		return new ModelAndView("deportistas", "command", deportistasDTO);
	}
	
  Paises Controller 
	
	@RequestMapping(value = "/paises", method = RequestMethod.GET)
	public ModelAndView paisesStart() {
		OlympicServicesFacade olympicServiceInterface = OlympicServicesFacade.getInstance();
		List<PaisesDTO> paisesDTO = olympicServiceInterface.getPaisesHome();
		return new ModelAndView("paises", "command", paisesDTO);
	}*/
	
}