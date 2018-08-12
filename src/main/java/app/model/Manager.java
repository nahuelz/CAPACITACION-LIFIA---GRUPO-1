package app.model;

import java.util.Collection;

public class Manager extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Collection<Restaurant> restaurants;

	public void addRestaurants(Restaurant aRestaurant) {
		restaurants.add(aRestaurant);
	}

	public Collection<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void delteRestaurants(Restaurant aRestaurant) {
		restaurants.remove(aRestaurant);
	}

}
