package app.model;

import java.util.Collection;

public class Restaurant {

	private Integer id;
	private String name;
	private String description;
	private String phone;
	private String category;
	private Adress adress;
	private Location location;
	private Rank rank;
	private Collection<Dish> dishes;
	private Collection<Menu> menues;
	private Collection<Comment> comments;
	private Collection<Manager> managers;

	public Restaurant () {
		
	}
	public Collection<Manager> getManagers() {
		return managers;
	}

	public void addManager(Manager aManager) {
		managers.add(aManager);
	}

	public void deleteManager(Manager aManager) {
		managers.remove(aManager);
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment aComment) {
		comments.add(aComment);
	}

	public void addMenu(Menu aMenu) {
		menues.add(aMenu);
	}

	public Collection<Menu> getMenues() {
		return menues;
	}

	public void deleteMenu(Menu aMenu) {
		menues.remove(aMenu);
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

	public void addDish(Dish aDish) {
		dishes.add(aDish);
	}

	public Collection<Dish> getDishes() {
		return dishes;
	}

	public void deleteDish(Dish aDish) {
		dishes.remove(aDish);
	}

	public Restaurant(String name) {
		this.setName(name);
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
