package app.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import app.model.Restaurant;
import app.repositories.RestaurantRepositoryBI;

public class HibernateRestaurantRepository extends BaseHibernateRepository implements RestaurantRepositoryBI{

	@Override
	public Restaurant getRestaurant(Integer id) {
		Session session = this.getSession();
		Query query =session.createQuery("from Restaurant WHERE id = :restaurantId");
		query.setParameter("restaurantId", id);
		Restaurant restaurant = (Restaurant) query.uniqueResult();
		session.disconnect();
		session.close();
		return restaurant;
	}

	@Override
	public List<Restaurant> getRestaurants() {
		Session session = this.getSession();
		@SuppressWarnings("unchecked")
		List<Restaurant> restaurants = session.createQuery("from Restaurant").list();
		session.disconnect();
		session.close();		
		return restaurants;
	}	

}
