package co.edu.udem.olympicgames.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.edu.udem.olympicgames.service.OlympicServicesFacade;
import co.edu.udem.olympicgames.model.ArenasDTO;
import co.edu.udem.olympicgames.model.DeportesDTO;
import co.edu.udem.olympicgames.model.DeportistasDTO;
import co.edu.udem.olympicgames.model.NewsDTO;
import co.edu.udem.olympicgames.model.PaisesDTO;

public class OlympicServicesFacade {

	public static OlympicServicesFacade olympicServicesFacade = null;


	public static OlympicServicesFacade getInstance() {
		if (olympicServicesFacade == null) {
			olympicServicesFacade = new OlympicServicesFacade();
		}
		return olympicServicesFacade;
	}

	public List<NewsDTO> getNewsHomeWS() {

		List<NewsDTO>listNews = new ArrayList<NewsDTO>();
		
		try{
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/olympicgames_ws/json/servicesfacade/getnewshome");

			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());

			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			
			for (int i = 0; i < ar.size(); i++) {
				listNews.add((builder.create()).fromJson(ar.get(i).toString(), NewsDTO.class));

			}
			System.out.println(outString);
		}catch(Exception e){e.printStackTrace();
		}
		return listNews;
	}
	
	/* Arenas */ 
	
	public List<ArenasDTO> getArenasHomeWS() {

		List<ArenasDTO>listArenas = new ArrayList<ArenasDTO>();
		
		try{
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/olympicgames_ws/json/servicesfacade/getarenashome");

			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());

			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			
			for (int i = 0; i < ar.size(); i++) {
				listArenas.add((builder.create()).fromJson(ar.get(i).toString(), ArenasDTO.class));

			}
			System.out.println(outString);
		}catch(Exception e){e.printStackTrace();
		}
		return listArenas;
	}
	
	public List<DeportesDTO> getDeportesHomeWS() {

		List<DeportesDTO>listDeportes = new ArrayList<DeportesDTO>();
		
		try{
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/olympicgames_ws/json/servicesfacade/getdeporteshome");

			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());

			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			
			for (int i = 0; i < ar.size(); i++) {
				listDeportes.add((builder.create()).fromJson(ar.get(i).toString(), DeportesDTO.class));

			}
			System.out.println(outString);
		}catch(Exception e){e.printStackTrace();
		}
		return listDeportes;
	}
	
	public List<DeportistasDTO> getDeportistasHomeWS() {

		List<DeportistasDTO>listDeportistas = new ArrayList<DeportistasDTO>();
		
		try{
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/olympicgames_ws/json/servicesfacade/getdeportistashome");

			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());

			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			
			for (int i = 0; i < ar.size(); i++) {
				listDeportistas.add((builder.create()).fromJson(ar.get(i).toString(), DeportistasDTO.class));

			}
			System.out.println(outString);
		}catch(Exception e){e.printStackTrace();
		}
		return listDeportistas;
	}
	
	public List<PaisesDTO> getPaisesHomeWS() {

		List<PaisesDTO>listPaises = new ArrayList<PaisesDTO>();
		
		try{
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8081/olympicgames_ws/json/servicesfacade/getpaiseshome");

			GsonBuilder builder = new GsonBuilder();
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed error code: " + response.getStatus());

			}
			String outString = response.getEntity(String.class);
			JsonArray ar = new JsonParser().parse(outString).getAsJsonArray();
			
			for (int i = 0; i < ar.size(); i++) {
				listPaises.add((builder.create()).fromJson(ar.get(i).toString(), PaisesDTO.class));

			}
			System.out.println(outString);
		}catch(Exception e){e.printStackTrace();
		}
		return listPaises;
	}
	
	
	/*
	 * public List<ArenasDTO> getArenasHome() {
	 * 
	 * 
	 * 
	 * OlympicArenasServicesInterface olympicServicesInterface = new
	 * OlympicArenasServicesImpl(); return
	 * olympicServicesInterface.getArenasHome(); }
	 * 
	 * public List<DeportesDTO> getDeportesHome() {
	 * OlympicDeportesServicesInterface olympicServicesInterface = new
	 * OlympicDeportesServicesImpl(); return
	 * olympicServicesInterface.getDeportesHome(); }
	 * 
	 * public List<DeportistasDTO> getDeportistasHome() {
	 * OlympicDeportistasServicesInterface olympicServicesInterface = new
	 * OlympicDeportistasServicesImpl(); return
	 * olympicServicesInterface.getDeportistasHome(); }
	 * 
	 * public List<PaisesDTO> getPaisesHome() { OlympicPaisesServicesInterface
	 * olympicServicesInterface = new OlympicPaisesServicesImpl(); return
	 * olympicServicesInterface.getPaisesHome(); }
	 */
}
