package app.dto;

import app.model.Address;
import app.model.Restaurant;

public class RestaurantDTO {
	
	private Long id;
	private String name;
	private String description;
	private String phone;
	private String category;
	private Address address;

	public RestaurantDTO() {
		
	}
	
	public RestaurantDTO(String name) {
		this.setName(name);
	}
	
	public RestaurantDTO(Restaurant restaurant) {
		this.setName(restaurant.getName());
		this.setId(restaurant.getId());
		this.setDescription(restaurant.getDescription());
		this.setPhone(restaurant.getPhone());
		this.setCategory(restaurant.getCategory());
		this.setAddress(restaurant.getAdress());
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	

}
