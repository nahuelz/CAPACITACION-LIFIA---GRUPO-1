package app.model;

import java.util.Collection;

public class Dish {

	private Integer idDish;
	private String name;
	private String description;
	private Integer photo;
	private Collection<String> caracterists;

	public void addCaracterist(String aString) {
		caracterists.add(aString);
	}

	public Collection<String> getCaracterists() {
		return caracterists;
	}

	public void deleteCaracterist(String aString) {
		caracterists.remove(aString);
	}

	public Integer getIdDish() {
		return idDish;
	}

	public void setIdDish(Integer idDish) {
		this.idDish = idDish;
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
