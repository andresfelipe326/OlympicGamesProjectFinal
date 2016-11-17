package co.edu.udem.olympicgames.model;

import java.io.Serializable;

public class DeportistasDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2180740611146608823L;
	private String nomdeportista;
	private String edad;
	private String pais;
	private String deporte;
	private String imagedeportista;
	
	public DeportistasDTO(String nomdeportista, String edad, String pais, String deporte, String imagedeportista) {
		this.nomdeportista = nomdeportista;
		this.edad = edad;
		this.pais = pais;
		this.deporte = deporte;
		this.imagedeportista = imagedeportista;
	}
	
	public String getNomdeportista() {
		return nomdeportista;
	}
	public void setNomdeportista(String nomdeportista) {
		this.nomdeportista = nomdeportista;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public String getImagedeportista() {
		return imagedeportista;
	}
	public void setImagedeportista(String imagedeportista) {
		this.imagedeportista = imagedeportista;
	}

}
