package app.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dto.AdressDTO;


@Service
@Transactional
public interface AdressService {
	
	AdressDTO getAdress(Long id);
	void updateAdress(AdressDTO adress);
	void createAdress(String country, String state, String city, String street, Integer altitude, String departament);
	
	
}
