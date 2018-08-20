package app.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.RestaurantDAO;
import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Address;
import app.model.Menu;
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
		return restaurantDAO.getRestaurant(id);
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(Long id, String name, String description, String phone, String category,
			String country, String state, String city, String street, Integer altitude, String departament) {
		/*
		 * getRestaurant retorna algo de tipo RestaurantDTO, por lo tanto, no puedo hacer getRestaurant para actualizarlo en el service
		 * solucion: envio los parametros al dao, obtengo el restaurant lo actualizo y hago update. esta bien?¡?¡?¡
		 */
		
		restaurantDAO.updateRestaurant(id, name, description, phone, category, country, state, city, street, altitude, departament);
		
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

	@Override
	public void createMenu(Long idRestaurant, String name, String description, Integer photo) {
		// TODO Auto-generated method stub
		Menu menu = new Menu (name, description, photo);
		
		restaurantDAO.createMenu(menu, idRestaurant);
		
	}

	@Override
	public MenuDTO detailMenu(Long idMenu) {
		// TODO Auto-generated method stub
		
		return restaurantDAO.detailMenu(idMenu);
		
	}

	@Override
	public void updateMenu(Long idMenu, String name, String description, Integer photo) {
		// TODO Auto-generated method stub
		
		restaurantDAO.updateMenu(idMenu, name, description, photo);
		
		
	}

}
