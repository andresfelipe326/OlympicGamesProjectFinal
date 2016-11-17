package co.edu.udem.olympicgames.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OlympicServicesFacadeTest {
	
	OlympicServicesFacade facade = OlympicServicesFacade.getInstance();


	@Test
	public void testGetNewsHomeWS() {
		facade.getNewsHomeWS();
	}

	@Test
	public void testGetArenasHomeWS() {
		facade.getArenasHomeWS();
	}

	@Test
	public void testGetDeportesHomeWS() {
		facade.getDeportesHomeWS();
	}

	@Test
	public void testGetDeportistasHomeWS() {
		facade.getDeportistasHomeWS();
	}

	@Test
	public void testGetPaisesHomeWS() {
		facade.getPaisesHomeWS();
	}

}
