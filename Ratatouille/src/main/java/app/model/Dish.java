package app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import app.dto.DishDTO;

@Entity
public class Dish implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Long id;
	private String name;
	private String description;
	private String photo;

	public Dish(String name, String description, String photo) {
		this.setName(name);
		this.setDescription(description);
		this.setPhoto(photo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void update(DishDTO dishDTO) {
		this.setName(dishDTO.getName());
		this.setDescription(dishDTO.getDescription());
		this.setPhoto(dishDTO.getPhoto());
		
	}

}
