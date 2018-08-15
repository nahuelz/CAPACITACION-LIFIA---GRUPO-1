package app.dao;

import java.io.Serializable;
import java.util.List;

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
		return sessionFactory.getCurrentSession().save(entity);
	}
	
	@Override
	public <T> void delete(T entity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Override
	public <T> void update(T entity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(entity);
	}
	
	@Override
	public <T> T get(Class<T> entityClass, Long id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM "+ entityClass.getName()).list();
	}
}
