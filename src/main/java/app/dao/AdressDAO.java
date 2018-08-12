package app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import app.dto.AdressDTO;
import app.model.Address;

@Repository
public interface AdressDAO {
	
	public void createAdress(Address adress);
	public AdressDTO getAdress(Long id);
	public List<AdressDTO> listAdress();
	public void updateAdress(AdressDTO adress);
	public void deleteAdress(Long id);
	
}
