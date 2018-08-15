package app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Restaurant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Long id;
	private String name;
	private String description;
	private String phone;
	private String category;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "address_id")
    private Address address;
	
	@ManyToMany(mappedBy = "restaurants")
	private Set<Manager> managers = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Menu> menues = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Comment> comments = new HashSet<>();
	
	
	//private Location location;
	//private Rank rank;
	
	public Restaurant () {
		
	}
	
	public Restaurant (String name, String description, String phone, String category) {
		this.setName(name);
		this.setDescription(description);
		this.setPhone(phone);
		this.setCategory(category);		
	}
	

	public Set<Manager> getManagers() {
		return managers;
	}

	public void addManager(Manager aManager) {
		managers.add(aManager);
	}

	public void deleteManager(Manager aManager) {
		managers.remove(aManager);
	}
	
	public void deleteComment(Comment aComment) {
		comments.remove(aComment);
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment aComment) {
		comments.add(aComment);
	}

	public void addMenu(Menu aMenu) {
		menues.add(aMenu);
	}

	public Set<Menu> getMenues() {
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

	/*
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
	*/

	public Restaurant(String name) {
		this.setName(name);
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

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

}
