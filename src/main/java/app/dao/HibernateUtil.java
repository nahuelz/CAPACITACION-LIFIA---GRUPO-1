package app.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil implements ORMUtil {
	
	@Autowired
	private SessionFactory sessionFactory;

	public HibernateUtil() {
		
	}
	
	@Override
	public <T> Serializable create(T entity) {
		// TODO Auto-generated method stub
		System.out.println(entity);
		return sessionFactory.getCurrentSession().save(entity);
	}

}
