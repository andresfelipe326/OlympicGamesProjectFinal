package co.edu.udem.olympicgames.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arenas")
public class Arenas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idarena")
	private int idarena;

	@Column(name = "nomarena")
	private String nomarena;
	
	@Column(name = "fechainaugura")
	private String fechainaugura;
	
	@Column(name = "ciudadarena")
	private String ciudadarena;
	
	@Column(name = "imagearena")
	private String imagearena;

	public int getIdarena() {
		return idarena;
	}

	public void setIdarena(int idarena) {
		this.idarena = idarena;
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
