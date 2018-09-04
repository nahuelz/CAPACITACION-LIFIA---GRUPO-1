package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Dish;
import app.model.Menu;
import app.model.Restaurant;

@Repository
public interface RestaurantDAO {

	// RESTAURANT
	public void createRestaurant(Restaurant restaurant);
	public RestaurantDTO getRestaurant(Long id);
	public List<RestaurantDTO> listRestaurants();
	public void deleteRestaurant(Long id);
	public void updateRestaurant(RestaurantDTO restaurantDTO);
	
	//MENU
	public void addMenu(Menu menu, Long idRestaurant);
	public MenuDTO getMenu(Long idMenu);
	public void updateMenu(MenuDTO menuDTO);
	public List<MenuDTO> listMenues(Long idRestaurant);
	
	//DISH
	public void addDish(Dish dish, Long idMenu);
	public DishDTO getDish(Long idDish);
	public void updateDish (DishDTO dishDTO);	
	List<DishDTO> listDishes(Long idMenu);
	
	
}
