package co.edu.udem.olympicgames.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paises")
public class Paises {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpaises")
	private int idpaises;

	@Column(name = "nombrepais")
	private String nombrepais;

	@Column(name = "continentepais")
	private String continentepais;

	@Column(name = "imagebandera")
	private String imagebandera;

	public int getIdpaises() {
		return idpaises;
	}

	public void setIdpaises(int idpaises) {
		this.idpaises = idpaises;
	}

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
	
	

}
