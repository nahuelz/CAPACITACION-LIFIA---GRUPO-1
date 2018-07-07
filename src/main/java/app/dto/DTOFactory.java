package app.dto;

import java.util.ArrayList;
import java.util.List;


import app.model.Restaurant;

public class DTOFactory {
	
	public List<RestaurantDTO> getRestaurants(List<Restaurant> restaurants) {
		List <RestaurantDTO> restaurantsDTO = new ArrayList<RestaurantDTO>();
			for(Restaurant r: restaurants){
				RestaurantDTO restaurantDTO = new RestaurantDTO(r);
				restaurantsDTO.add(restaurantDTO);
			}
		return restaurantsDTO;
	}

	public RestaurantDTO getRestaurant(Restaurant restaurant) {
		RestaurantDTO restaurantDTO = new RestaurantDTO();
		if (restaurant != null){
			restaurantDTO = new RestaurantDTO(restaurant);
		}
		return restaurantDTO;
	}

}
