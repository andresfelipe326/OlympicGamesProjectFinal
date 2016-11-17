package co.edu.udem.olympicgames.model;

import java.io.Serializable;

public class DeportesDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2631810445223472679L;
	private String nomdeporte;
	private String fechacreacion;
	private String imagedeportes;
	private String deportesUrl;
	private String arenadeporte;
	
	public DeportesDTO(String nomdeporte, String fechacreacion, String imagedeportes, String deportesUrl, String arenadeporte ) {
		this.nomdeporte = nomdeporte;
		this.fechacreacion = fechacreacion;
		this.imagedeportes = imagedeportes;
		this.deportesUrl = arenadeporte;
		this.arenadeporte = arenadeporte;
	}
	
	public String getArenadeporte() {
		return arenadeporte;
	}
	public void setArenadeporte(String arenadeporte) {
		this.arenadeporte = arenadeporte;
	}
	public String getDeportesUrl() {
		return deportesUrl;
	}
	public void setDeportesUrl(String deportesUrl) {
		this.deportesUrl = deportesUrl;
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
	/*public String getImagedeporte() {
		return imagedeporte;
	}
	public void setImagedeporte(String imagedeporte) {
		this.imagedeporte = imagedeporte;
	}*/

	public String getImagedeportes() {
		return imagedeportes;
	}

	public void setImagedeportes(String imagedeportes) {
		this.imagedeportes = imagedeportes;
	}


}
