package app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.HibernateUtil;
import app.dao.MenuDAO;
import app.model.Menu;

@Repository
public class MenuDAOImpl implements MenuDAO {
	
	@Autowired
	private HibernateUtil util;
	
	@Override
	public void createMenu(Menu menu) {
		// TODO Auto-generated method stub
		util.create(menu);
		
	}

	@Override
	public Menu getMenu(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> listMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMenu(Long id) {
		// TODO Auto-generated method stub
		
	}

}
