package co.edu.udem.olympicgames.model;

import java.io.Serializable;

public class PaisesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3365253135886343314L;
	public String getNombrepais() {
		return nombrepais;
	}
	public void setNombrepais(String nombrepais) {
		this.nombrepais = nombrepais;
	}
	public String getContinentepais() {
		return continentepais;
	}
	public void setContinentepais(String continentepais) {
		this.continentepais = continentepais;
	}
	public String getImagebandera() {
		return imagebandera;
	}
	public void setImagebandera(String imagebandera) {
		this.imagebandera = imagebandera;
	}
	private String nombrepais;
	private String continentepais;
	private String imagebandera;
	
	public PaisesDTO(String nombrepais, String continentepais, String imagebandera) {
		this.nombrepais = nombrepais;
		this.continentepais = continentepais;
		this.imagebandera = imagebandera;
	}
	
	
}
