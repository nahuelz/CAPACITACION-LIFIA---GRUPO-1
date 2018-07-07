package app.services;

import java.util.List;

import app.dto.RestaurantDTO;

public interface RestaurantServiceBI {
	
	List<RestaurantDTO> getRestaurants();
	RestaurantDTO getRestaurant(Integer id);
}