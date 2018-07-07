package app.services.impl;

import java.util.List;

import app.dto.RestaurantDTO;
import app.services.RestaurantServiceBI;

public class RestaurantServiceImpl extends BaseServiceImpl implements RestaurantServiceBI
{

	@Override
	public List<RestaurantDTO> getRestaurants() {
		return this.dtoFactory.getRestaurants(restaurantRepository.getRestaurants());
	}

	@Override
	public RestaurantDTO getRestaurant(Integer id) {
		return this.dtoFactory.getRestaurant(restaurantRepository.getRestaurant(id));
	}
}
