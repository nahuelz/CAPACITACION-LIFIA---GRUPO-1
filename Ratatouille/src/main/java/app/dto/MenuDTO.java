package app.dto;

import java.util.HashSet;
import java.util.Set;

import app.model.Dish;
import app.model.Menu;

public class MenuDTO {
	
	private Long id;
	private String name;
	private String description;
	private String photo;
	private Set<Dish> dishes = new HashSet<>();
	
	public MenuDTO(Long id, String name, String description, String photo) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setPhoto(photo);
	}
	
	public MenuDTO(Menu menu) {
		this.setId(menu.getId());
		this.setName(menu.getName());
		this.setDescription(menu.getDescription());
		this.setPhoto(menu.getPhoto());;
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
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}

}
