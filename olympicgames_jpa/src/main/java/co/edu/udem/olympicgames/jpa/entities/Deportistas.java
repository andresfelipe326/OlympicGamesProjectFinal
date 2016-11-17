package co.edu.udem.olympicgames.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deportistas")
public class Deportistas {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddeportista")
	private int iddeportista;
	
	@Column(name="nomdeportista")
	private String nomdeportista;
	
	@Column(name="edad")
	private String edad;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="deporte")
	private String deporte;
	
	@Column(name="imagedeportista")
	private String imagedeportista;

	public int getIddeportista() {
		return iddeportista;
	}

	public void setIddeportista(int iddeportista) {
		this.iddeportista = iddeportista;
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
