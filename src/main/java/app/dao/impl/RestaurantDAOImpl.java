package app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.HibernateUtil;
import app.dao.RestaurantDAO;
import app.dto.RestaurantDTO;
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
		return null;
	}

	@Override
	public List<RestaurantDTO> listRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		
	}

}
