package app.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.model.Adress;


@Service
@Transactional
public interface AdressService {
	
	Long createAdress(Adress adress);
	Adress getAdress(Long id);
	void updateAdress(Adress adress);
	
	
}
