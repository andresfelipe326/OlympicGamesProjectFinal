package co.edu.udem.olympicgames.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	
	@Entity
	@Table(name="deportes")
	public class Deportes {
			

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddeportes")
	private int id;
	
	@Column(name="nomdeporte")
	private String nomdeporte;
	
	@Column(name="fechacreacion")
	private String fechacreacion;
	
	@Column(name="imagedeportes")
	private String imagedeportes;
	
	@Column(name="deportesurl")
	private String deportesurl;
	
	@Column(name="arenadeporte")
	private String arenadeporte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomdeporte() {
		return nomdeporte;
	}

	public void setNomdeporte(String nomdeporte) {
		this.nomdeporte = nomdeporte;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getImagedeportes() {
		return imagedeportes;
	}

	public void setImagedeportes(String imagedeportes) {
		this.imagedeportes = imagedeportes;
	}

	public String getDeportesurl() {
		return deportesurl;
	}

	public void setDeportesurl(String deportesurl) {
		this.deportesurl = deportesurl;
	}

	public String getArenadeporte() {
		return arenadeporte;
	}

	public void setArenadeporte(String arenadeporte) {
		this.arenadeporte = arenadeporte;
	}
	
	

	

}
