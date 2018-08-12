package app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.dao.AdressDAO;
import app.dao.HibernateUtil;
import app.dto.AdressDTO;
import app.model.Address;

@Repository
public class AdressDAOImpl implements AdressDAO {

	@Autowired
	private HibernateUtil util;
	
	@Override
	public void createAdress(Address adress) {
		util.create(adress);
	}

	@Override
	public AdressDTO getAdress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<AdressDTO> listAdress() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateAdress(AdressDTO adress) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAdress(Long id) {
		// TODO Auto-generated method stub
		
	}

}
