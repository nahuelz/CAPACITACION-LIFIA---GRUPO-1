package app.model;

import java.util.Collection;

public class Menu {

	private Integer id;
	private String name;
	private String description;
	private Collection<String> caracterists;
	private Integer photo;
	private Collection<Dish> dishes;

	public void addDish(Dish aDish) {
		dishes.add(aDish);
	}

	public Collection<Dish> getDishes() {
		return dishes;
	}

	public void deleteDish(Dish aDish) {
		dishes.remove(aDish);
	}

	public void addCaracterist(String aString) {
		caracterists.add(aString);
	}

	public Collection<String> getCaracterists() {
		return caracterists;
	}

	public void deleteCaracterist(String aString) {
		caracterists.remove(aString);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}
