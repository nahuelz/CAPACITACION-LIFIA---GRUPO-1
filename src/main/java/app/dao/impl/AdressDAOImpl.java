package app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.AdressDAO;
import app.dao.HibernateUtil;
import app.dto.AdressDTO;
import app.model.Adress;

@Repository
public class AdressDAOImpl implements AdressDAO {

	@Autowired
	private HibernateUtil util;
	
	@Override
	public void createAdress(Adress adress) {
		System.out.println(adress);
		System.out.println(util);
		util.create(adress);
	}


	public AdressDTO updateAdress(AdressDTO adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdressDTO deleteAdress(AdressDTO adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdressDTO getAdress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
