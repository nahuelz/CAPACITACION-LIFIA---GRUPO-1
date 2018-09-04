package app.dto;

import app.model.Dish;

public class DishDTO {
	
	private Long id;
	private String name;
	private String description;
	private String photo;
	
	public DishDTO() {
		
	}
	
	public DishDTO(Dish dish) {
		this.setId(dish.getId());
		this.setName(dish.getName());
		this.setDescription(dish.getDescription());
		this.setPhoto(dish.getPhoto());
		
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

}
