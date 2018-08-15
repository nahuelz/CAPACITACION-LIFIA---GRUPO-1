package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.dto.RestaurantDTO;
import app.model.Restaurant;

@Repository
public interface RestaurantDAO {

	public void createRestaurant(Restaurant restaurant);
	public RestaurantDTO getRestaurant(Long id);
	public List<RestaurantDTO> listRestaurants();
	public void updateRestaurant(Restaurant restaurant);
	public void deleteRestaurant(Long id);
}
