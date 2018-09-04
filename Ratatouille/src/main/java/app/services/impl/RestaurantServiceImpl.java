package app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.RestaurantDAO;
import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Address;
import app.model.Dish;
import app.model.Menu;
import app.model.Restaurant;
import app.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RestaurantDAO restaurantDAO;

	@Override
	public List<RestaurantDTO> listRestaurants() {
		return restaurantDAO.listRestaurants();
	}

	@Override
	public RestaurantDTO getRestaurant(Long id) {
		return restaurantDAO.getRestaurant(id);
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRestaurant(String name, String description, String phone, String category, String imagen, String country,
			String state, String city, String street, Integer altitude, String departament) {
		
		Restaurant restaurant = new Restaurant(name, description, phone, category, imagen);
		Address address = new Address(country, state, city, street, altitude, departament);		
		restaurant.setAdress(address);		
		restaurantDAO.createRestaurant(restaurant);
		
	}

	@Override
	public List<MenuDTO> listMenues(Long idRestaurant) {

		return restaurantDAO.listMenues(idRestaurant);
	}

	@Override
	public void deleteMenu(Long id) {}

	@Override
	public List<DishDTO> listDishes(Long idMenu) {
		return restaurantDAO.listDishes(idMenu);
	}

	@Override
	public DishDTO getDish(Long id) {
		return restaurantDAO.getDish(id);
	}

	@Override
	public void deleteDish(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDish(Long id, String name, String description, String photo) {}

	@Override
	public void addDish(Long id, String name, String description, String photo) {
		Dish dish = new Dish(name, description, photo);
		restaurantDAO.addDish(dish, id);
		
	}

	@Override
	public void addMenu(Long idRestaurant, String name, String description, String photo) {
		Menu menu = new Menu (name, description, photo);		
		restaurantDAO.addMenu(menu, idRestaurant);		
	}

	@Override
	public MenuDTO getMenu(Long idMenu) {
		return restaurantDAO.getMenu(idMenu);
		
	}

	@Override
	public void updateMenu(Long idMenu, String name, String description, String photo) {
		MenuDTO menuDTO = new MenuDTO(idMenu, name, description, photo);
		restaurantDAO.updateMenu(menuDTO);		
	}

	@Override
	public void updateRestaurant(RestaurantDTO restaurantDTO) {		
		restaurantDAO.updateRestaurant(restaurantDTO);		
	}

}
