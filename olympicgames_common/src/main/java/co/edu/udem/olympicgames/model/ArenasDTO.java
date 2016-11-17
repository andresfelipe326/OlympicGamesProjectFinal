package co.edu.udem.olympicgames.model;

import java.io.Serializable;

public class ArenasDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4644620979668865891L;
	
	private String nomarena;
	private String fechainaugura;
	private String ciudadarena;
	private String imagearena;
	
	public ArenasDTO(String nomarena, String fechainaugura, String ciudadarena, String imagearena) {
		this.nomarena = nomarena;
		this.fechainaugura = fechainaugura;
		this.ciudadarena = ciudadarena;
		this.imagearena = imagearena;
	}
	
	public String getNomarena() {
		return nomarena;
	}
	public void setNomarena(String nomarena) {
		this.nomarena = nomarena;
	}
	public String getFechainaugura() {
		return fechainaugura;
	}
	public void setFechainaugura(String fechainaugura) {
		this.fechainaugura = fechainaugura;
	}
	public String getCiudadarena() {
		return ciudadarena;
	}
	public void setCiudadarena(String ciudadarena) {
		this.ciudadarena = ciudadarena;
	}
	public String getImagearena() {
		return imagearena;
	}
	public void setImagearena(String imagearena) {
		this.imagearena = imagearena;
	}
	

}
