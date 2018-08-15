package app.services;

import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;

@Service
@Transactional
public interface RestaurantService {
	
	Set<RestaurantDTO> listRestaurants();
	RestaurantDTO getRestaurant(Long id);
	void deleteRestaurant(Long id);
	void updateRestaurant(Long id, String name, String description, String phone, String category, String country, String state, String city, String street, Integer altitude, String departament);
	void createRestaurant(String name, String description, String phone, String category, String country, String state, String city, String street, Integer altitude, String departament);
	
	
	Set<MenuDTO> listMenues(Long idRestaurant);
	MenuDTO getMenu(Long id);
	void deleteMenu(Long id);
	void updateMenu();
	void createMenu();
	
	Set<DishDTO> listDishes(Long idMenu);
	DishDTO getDish(Long id);
	void deleteDish(Long id);
	void updateDish(Long id, String name, String description, Integer photo);
	void createDish(Long id, String name, String description, Integer photo);
	
	
	
	
	

}
