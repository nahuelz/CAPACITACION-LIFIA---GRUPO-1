package app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;

@Service
@Transactional
public interface RestaurantService {
	
	//RESTAURANT
	List<RestaurantDTO> listRestaurants();
	RestaurantDTO getRestaurant(Long id);
	void deleteRestaurant(Long id);
	void updateRestaurant(RestaurantDTO restaurantDTO);
	void createRestaurant(String name, String description, String phone, String category, String imagen, String country, String state, String city, String street, Integer altitude, String departament);
	
	//MENU
	List<MenuDTO> listMenues(Long idRestaurant);
	MenuDTO getMenu(Long idMenu);
	void deleteMenu(Long id);
	void updateMenu(Long idRestaurant, String name, String description, String photo);
	void addMenu(Long idRestaurant, String name, String description, String photo);
	
	//DISH
	List<DishDTO> listDishes(Long idMenu);
	DishDTO getDish(Long id);
	void deleteDish(Long id);
	void updateDish(Long id, String name, String description, String photo);
	void addDish(Long id, String name, String description, String photo);
	
	
	
	
	
	
	

}
