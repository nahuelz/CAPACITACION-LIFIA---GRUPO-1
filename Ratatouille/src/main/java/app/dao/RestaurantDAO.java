package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Menu;
import app.model.Restaurant;

@Repository
public interface RestaurantDAO {

	public void createRestaurant(Restaurant restaurant);
	public RestaurantDTO getRestaurant(Long id);
	public List<RestaurantDTO> listRestaurants();
	public void deleteRestaurant(Long id);
	public void updateRestaurant(Long id, String name, String description, String phone, String category,
			String country, String state, String city, String street, Integer altitude, String departament);
	
	public void createMenu(Menu menu, Long idRestaurant);
	public MenuDTO detailMenu(Long idMenu);
	public void updateMenu(Long idMenu, String name, String description, Integer photo);
	
}
