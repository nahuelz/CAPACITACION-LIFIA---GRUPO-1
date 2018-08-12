package app.dto;

import app.model.Restaurant;

public class RestaurantDTO {
	
	private Long id;
	private String name;
	
	public RestaurantDTO() {
		
	}
	
	public RestaurantDTO(String name) {
		this.setName(name);
	}
	
	public RestaurantDTO(Restaurant restaurant) {
		this.setName(restaurant.getName());
		this.setId(restaurant.getId());
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
	

}
