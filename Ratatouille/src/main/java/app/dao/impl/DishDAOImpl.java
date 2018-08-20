package app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.DishDAO;
import app.dao.HibernateUtil;
import app.model.Dish;

@Repository
public class DishDAOImpl implements DishDAO {
	
	@Autowired
	private HibernateUtil util;

	@Override
	public void createDish(Dish dish) {
		// TODO Auto-generated method stub
		util.create(dish);
		
	}

	@Override
	public Dish getDish(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dish> listDish() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDish(Dish dish) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDish(Long id) {
		// TODO Auto-generated method stub
		
	}


}
