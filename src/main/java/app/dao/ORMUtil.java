package app.dao;

import java.io.Serializable;

public interface ORMUtil {

	<T> Serializable create(T entity);

}
