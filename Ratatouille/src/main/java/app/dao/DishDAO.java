package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.model.Dish;

@Repository
public interface DishDAO {
	
	public void createDish(Dish dish);
	public Dish getDish(Long id);
	public List<Dish> listDish();
	public void updateDish(Dish dish);
	public void deleteDish(Long id);
	

}
