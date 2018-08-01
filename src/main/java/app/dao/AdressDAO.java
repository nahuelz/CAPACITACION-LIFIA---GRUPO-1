package app.dao;

import org.springframework.stereotype.Repository;

import app.dto.AdressDTO;
import app.model.Adress;

@Repository
public interface AdressDAO {
	
	AdressDTO updateAdress(AdressDTO adress);
	AdressDTO deleteAdress(AdressDTO adress);
	AdressDTO getAdress(Long id);
	void createAdress(Adress adress);
}
