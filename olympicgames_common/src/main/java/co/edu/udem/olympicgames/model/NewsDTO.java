package co.edu.udem.olympicgames.model;

import java.io.Serializable;

/**
 * @author Andres Obando
 *
 */
public class NewsDTO implements Serializable{
	
	private static final long serialVersionUID = -4564096157285308665L;
	private String title;
	private String description;
	private String image;
	private String newsUrl;
	
	public NewsDTO(String title, String descripction, String image, String newsUrl) {
		this.title = title;
		this.description = descripction;
		this.image = image;
		this.newsUrl = newsUrl;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getNewsUrl() {
		return newsUrl;
	}
	public void setNewsUrl(String newsUrl) {
		this.newsUrl = newsUrl;
	}
	
	
	
}
