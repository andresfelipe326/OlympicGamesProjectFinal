package co.edu.udem.olympicgames.webservices;


import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.DeportesDTO;
import co.edu.udem.olympicgames.model.DeportistasDTO;
import co.edu.udem.olympicgames.model.NewsDTO;
import co.edu.udem.olympicgames.model.PaisesDTO;

@Path("/json/servicesfacade")
public class OlympicServicesFacadeWS {
	
public static OlympicServicesFacade olympicServicesFacade = null;
	
	@GET
	@Path("/getnewshome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<NewsDTO> getNewsHomeWS() {
		OlympicServicesFacade olympicservicesFacade = OlympicServicesFacade.getInstance();
		return olympicservicesFacade.getNewsHome();
	}
	
	@GET
	@Path("/getarenashome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ArenasDTO> getArenasHomeWS() {
		OlympicServicesFacade olympicservicesFacade = OlympicServicesFacade.getInstance();
		return olympicservicesFacade.getArenasHome();
	}
	
	@GET
	@Path("/getdeporteshome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeportesDTO> getDeportesHomeWS() {
		OlympicServicesFacade olympicservicesFacade = OlympicServicesFacade.getInstance();
		return olympicservicesFacade.getDeportesHome();
	}
	
	@GET
	@Path("/getdeportistashome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeportistasDTO> getDeportistasHomeWS() {
		OlympicServicesFacade olympicservicesFacade = OlympicServicesFacade.getInstance();
		return olympicservicesFacade.getDeportistasHome();
	}
	
	@GET
	@Path("/getdpaiseshome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PaisesDTO> getPaisesHomeWS() {
		OlympicServicesFacade olympicservicesFacade = OlympicServicesFacade.getInstance();
		return olympicservicesFacade.getPaisesHome();
	}
	
	
	/*public List<DeportesDTO> getDeportesHome() {
		OlympicDeportesServicesInterface olympicServicesInterface = new OlympicDeportesServicesImpl();
		return olympicServicesInterface.getDeportesHome();
	}
	
	public List<DeportistasDTO> getDeportistasHome() {
		OlympicDeportistasServicesInterface olympicServicesInterface = new OlympicDeportistasServicesImpl();
		return olympicServicesInterface.getDeportistasHome();
	}
	
	public List<PaisesDTO> getPaisesHome() {
		OlympicPaisesServicesInterface olympicServicesInterface = new OlympicPaisesServicesImpl();
		return olympicServicesInterface.getPaisesHome();
	}*/
	

}