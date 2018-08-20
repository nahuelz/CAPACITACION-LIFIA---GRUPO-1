package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.model.Menu;

@Repository
public interface MenuDAO {
	
	public void createMenu(Menu menu);
	public Menu getMenu(Long id);
	public List<Menu> listMenu();
	public void updateMenu(Menu menu);
	public void deleteMenu(Long id);

}
