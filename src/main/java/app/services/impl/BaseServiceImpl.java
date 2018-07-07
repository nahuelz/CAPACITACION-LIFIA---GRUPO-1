package app.services.impl;

import app.dto.DTOFactory;
import app.repositories.*;

public class BaseServiceImpl
{
	public RestaurantRepositoryBI restaurantRepository;
	public DTOFactory dtoFactory;
	
	public DTOFactory getDtoFactory() {
		return dtoFactory;
	}

	public void setDtoFactory(DTOFactory dtoFactory) {
		this.dtoFactory = dtoFactory;
	}

	public void setRestaurantRepository(RestaurantRepositoryBI repository){
		restaurantRepository = repository;
	}
	
	public RestaurantRepositoryBI getRestaurantRepository(){
		return restaurantRepository;
	}	
	
}