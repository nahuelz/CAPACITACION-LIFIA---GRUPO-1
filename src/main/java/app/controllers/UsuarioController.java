package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.services.AdressService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	AdressService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void usuarios() {

	}
	
	@RequestMapping(value = "/createAdress", method = RequestMethod.GET)
	public void createAdress(@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		service.createAdress(country, state, city, street, altitude, departament);
	}
	
	

}
