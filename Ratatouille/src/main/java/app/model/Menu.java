package app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Menu implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Long id;
	private String name;
	private String description;
	private Integer photo;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Dish> dishes = new HashSet<>();

	public Menu () {
		
	}
	
	public Menu(String name, String description, Integer photo) {
		this.setName(name);
		this.setDescription(description);
		this.setPhoto(photo);
	}

	public void addDish(Dish aDish) {
		dishes.add(aDish);
	}

	public Set<Dish> getDishes() {
		return dishes;
	}

	public void removeDish(Dish aDish) {
		dishes.remove(aDish);
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

}
