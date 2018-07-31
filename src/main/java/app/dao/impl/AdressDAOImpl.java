package app.dao.impl;


import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import app.dao.AdressDAO;
import app.model.Adress;

public class AdressDAOImpl implements AdressDAO {

	@SuppressWarnings("unused")
	private Hibernate util;
	@Override
	public Adress insertAdress(Adress adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Adress updateAdress(Adress adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress deleteAdress(Adress adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress getAdress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
