package app.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.RestaurantDAO;
import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Address;
import app.model.Restaurant;
import app.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RestaurantDAO restaurantDAO;

	@Override
	public Set<RestaurantDTO> listRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RestaurantDTO getRestaurant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(Long id, String name, String description, String phone, String category,
			String country, String state, String city, String street, Integer altitude, String departament) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRestaurant(String name, String description, String phone, String category, String country,
			String state, String city, String street, Integer altitude, String departament) {
		// TODO Auto-generated method stub
		
		Restaurant restaurant = new Restaurant(name, description, phone, category);
		
		Address address = new Address(country, state, city, street, altitude, departament);
		
		restaurant.setAdress(address);
		
		restaurantDAO.createRestaurant(restaurant);
		
	}

	@Override
	public Set<MenuDTO> listMenues(Long idRestaurant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuDTO getMenu(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMenu(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<DishDTO> listDishes(Long idMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DishDTO getDish(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDish(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDish(Long id, String name, String description, Integer photo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDish(Long id, String name, String description, Integer photo) {
		// TODO Auto-generated method stub
		
	}

}