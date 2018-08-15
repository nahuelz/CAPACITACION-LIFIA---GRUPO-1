package app.dao;

import java.io.Serializable;
import java.util.List;

public interface ORMUtil {

	<T> Serializable create(T entity);

	<T> void delete(T entity);

	<T> void update(T entity);

	<T> T get(Class<T> entityClass, Long id);

	<T> List<T> getAll(Class<T> entityClass);

	
}
