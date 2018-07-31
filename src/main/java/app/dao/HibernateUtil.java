package app.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil implements ORMUtil {
	
	private SessionFactory sessionFactory;

	public HibernateUtil() {
		
	}
	
	@Override
	public <T> Serializable create(final T entity) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().save(entity);
	}

}
