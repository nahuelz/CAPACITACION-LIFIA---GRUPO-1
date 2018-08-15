package app.dto;

import java.util.HashSet;
import java.util.Set;

import app.model.Dish;
import app.model.Menu;

public class MenuDTO {
	
	private Long id;
	private String name;
	private String description;
	private Integer photo;
	private Set<Dish> dishes = new HashSet<>();
	
	public MenuDTO() {
		
	}
	
	public MenuDTO(Menu menu) {
		this.setId(menu.getId());
		this.setName(menu.getName());
		this.setDescription(menu.getDescription());
		this.setPhoto(menu.getPhoto());
		this.setDishes(menu.getDishes());
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
	public Integer getPhoto() {
		return photo;
	}
	public void setPhoto(Integer photo) {
		this.photo = photo;
	}
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}

}
