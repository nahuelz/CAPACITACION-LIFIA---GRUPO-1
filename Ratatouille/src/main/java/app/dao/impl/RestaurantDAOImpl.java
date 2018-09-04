package app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.HibernateUtil;
import app.dao.RestaurantDAO;
import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.model.Dish;
import app.model.Menu;
import app.model.Restaurant;

@Repository
public class RestaurantDAOImpl implements RestaurantDAO {
	
	@Autowired
	private HibernateUtil util;
	
	@Override
	public void createRestaurant(Restaurant restaurant) {
		util.create(restaurant);
		
	}

	@Override
	public RestaurantDTO getRestaurant(Long id) {
		RestaurantDTO restaurantDTO = new RestaurantDTO(util.get(Restaurant.class, id));
		return restaurantDTO;
	}

	@Override
	public List<RestaurantDTO> listRestaurants() {
		List<Restaurant> restaurants = util.getAll(Restaurant.class);
		List<RestaurantDTO> restaurantsDTO = new ArrayList<>();
		for (Restaurant r : restaurants) {
			restaurantsDTO.add(new RestaurantDTO(r));
		}
		return restaurantsDTO;
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(RestaurantDTO restaurantDTO) {
		Restaurant restaurant = util.get(Restaurant.class, restaurantDTO.getId());
		restaurant.update(restaurantDTO);		
		util.update(restaurant);
	}
	
	@Override
	public void addMenu(Menu menu, Long idRestaurant) {
		Restaurant restaurant = util.get(Restaurant.class, idRestaurant);
		restaurant.addMenu(menu);
		util.update(restaurant);
		
	}

	@Override
	public MenuDTO getMenu(Long idMenu) {
		Menu menu = util.get(Menu.class, idMenu);		
		MenuDTO menuDTO = new MenuDTO(menu);
		return menuDTO;
	}

	@Override
	public void updateMenu(MenuDTO menuDTO) {
		Menu menu = util.get(Menu.class, menuDTO.getId());
		menu.update(menuDTO);
		util.update(menu);
		
	}

	@Override
	public List<MenuDTO> listMenues(Long idRestaurant) {
		Restaurant restaurant = util.get(Restaurant.class, idRestaurant);
		List<MenuDTO> menuDTO = new ArrayList<>();
		for (Menu m : restaurant.getMenues()) {
			menuDTO.add(new MenuDTO(m));			
		}
		return menuDTO;
	}
	
	@Override
	public List<DishDTO> listDishes(Long idMenu) {
		Menu menu = util.get(Menu.class, idMenu);
		List<DishDTO> dishDTO = new ArrayList<>();
		for (Dish d : menu.getDishes()) {
			dishDTO.add(new DishDTO(d));			
		}
		return dishDTO;
	}

	@Override
	public void addDish(Dish dish, Long idMenu) {
		Menu menu = util.get(Menu.class, idMenu);
		menu.addDish(dish);
		util.update(menu);
		
	}

	@Override
	public DishDTO getDish(Long idDish) {
		return(util.get(DishDTO.class, idDish));				
	}

	@Override
	public void updateDish(DishDTO dishDTO) {
		Dish dish = util.get(Dish.class, dishDTO.getId());
		dish.update(dishDTO);
		util.update(dish);
		
	}

}
