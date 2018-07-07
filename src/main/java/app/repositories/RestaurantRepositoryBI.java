package app.repositories;

import java.util.List;

import app.model.Restaurant;

public interface RestaurantRepositoryBI extends BaseRepositoryBI {
	
	Restaurant getRestaurant(Integer id);
	List<Restaurant> getRestaurants();

}
