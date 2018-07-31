package app.dao;

import app.model.Adress;

public interface AdressDAO {
	
	Adress insertAdress(Adress adress);
	Adress updateAdress(Adress adress);
	Adress deleteAdress(Adress adress);
	Adress getAdress(Long id);
}
