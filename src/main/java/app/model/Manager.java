package app.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Restaurant> restaurants = new HashSet<>();

	public Manager() {
		
	}
	
	public void addRestaurant(Restaurant aRestaurant) {
		restaurants.add(aRestaurant);
	}

	public Collection<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void deleteRestaurant(Restaurant aRestaurant) {
		restaurants.remove(aRestaurant);
	}

}
