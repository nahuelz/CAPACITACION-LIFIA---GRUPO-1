package app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.AdressDAO;
import app.dto.AdressDTO;
import app.model.Adress;
import app.services.AdressService;

@Service
public class AdressServiceImpl implements AdressService {
	
	@Autowired
	AdressDAO adressDAO;
	
	public AdressServiceImpl() {
		
	}

	@Override
	public AdressDTO getAdress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdress(AdressDTO adress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAdress(String country, String state, String city, String street, Integer altitude,
			String departament) {
		Adress adress = new Adress(country, state, city, street, altitude, departament);
		
		System.out.println(adress);
		adressDAO.createAdress(adress);
		
	}

}
