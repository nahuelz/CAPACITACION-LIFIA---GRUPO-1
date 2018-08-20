package app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.HibernateUtil;
import app.dao.RestaurantDAO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Address;
import app.model.Menu;
import app.model.Restaurant;

@Repository
public class RestaurantDAOImpl implements RestaurantDAO {
	
	@Autowired
	private HibernateUtil util;
	
	@Override
	public void createRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		util.create(restaurant);
		
	}

	@Override
	public RestaurantDTO getRestaurant(Long id) {
		// TODO Auto-generated method stub
		RestaurantDTO restaurantDTO = new RestaurantDTO(util.get(Restaurant.class, id));
		return restaurantDTO;
	}

	@Override
	public List<RestaurantDTO> listRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(Long idRestaurant, String name, String description, String phone, String category,
			String country, String state, String city, String street, Integer altitude, String departament) {
		// TODO Auto-generated method stub
		
		Restaurant restaurant = util.get(Restaurant.class, idRestaurant);
		restaurant.setName(name);
		restaurant.setDescription(description);
		restaurant.setPhone(phone);
		restaurant.setCategory(category);
		
		Address address = restaurant.getAdress();
		address.setCountry(country);
		address.setState(state);
		address.setCity(city);
		address.setStreet(street);
		address.setAltitude(altitude);
		address.setDepartament(departament);
		
		util.update(restaurant);
		
	}
	
	@Override
	public void createMenu(Menu menu, Long idRestaurant) {
		// TODO Auto-generated method stub
		Restaurant restaurant = util.get(Restaurant.class, idRestaurant);
		restaurant.addMenu(menu);
		util.update(restaurant);
		
	}

	@Override
	public MenuDTO detailMenu(Long idMenu) {
		// TODO Auto-generated method stub
		MenuDTO menuDTO = new MenuDTO(util.get(Menu.class, idMenu));
		return menuDTO;
	}

	@Override
	public void updateMenu(Long idMenu, String name, String description, Integer photo) {
		// TODO Auto-generated method stub
		
		Menu menu = util.get(Menu.class, idMenu);
		menu.setName(name);
		menu.setDescription(description);
		menu.setPhoto(photo);
		util.update(menu);
		
	}

}
