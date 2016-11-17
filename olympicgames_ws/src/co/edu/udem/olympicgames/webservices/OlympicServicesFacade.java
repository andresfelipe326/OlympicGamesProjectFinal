package co.edu.udem.olympicgames.webservices;


import java.util.List;


import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.DeportesDTO;
import co.edu.udem.olympicgames.model.DeportistasDTO;
import co.edu.udem.olympicgames.model.NewsDTO;
import co.edu.udem.olympicgames.model.PaisesDTO;


public class OlympicServicesFacade {
	
public static OlympicServicesFacade olympicServicesFacade = null;
	
	private OlympicServicesFacade() {
	}
	
	public static OlympicServicesFacade getInstance() {
		if (olympicServicesFacade == null) {
			olympicServicesFacade = new OlympicServicesFacade();
		}
		return olympicServicesFacade;
	}

	public List<NewsDTO> getNewsHome() {
		OlympicNewsServicesInterface olympicServicesInterface = new OlympicNewsServicesImpl();
		return olympicServicesInterface.getNewsHome();
	}
	
	public List<ArenasDTO> getArenasHome() {
		OlympicArenasServicesInterface olympicServicesInterface = new OlympicArenasServicesImpl();
		return olympicServicesInterface.getArenasHome();
	}
	
	public List<DeportesDTO> getDeportesHome() {
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
	}
}

