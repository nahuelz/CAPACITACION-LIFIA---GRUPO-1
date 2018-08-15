package app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.services.RestaurantService;


@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void restaurants() {

		
	}
	
	@RequestMapping(value = "/createRestaurant", method = RequestMethod.GET)
	public void createAdress(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("phone") String phone, @RequestParam("category") String category,
			@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		/*
		 * http://localhost:8080/Spring/restaurant/createRestaurant?name='Nombre Restaurant'&description='Una descripcion'&phone='0303456'&category='Una Categoria'&country='Argentina'&state='Buenos Aires'&city='La Plata'&street='calle 57'&altitude=123&departament='B'
		 */
		service.createRestaurant(name, description, phone, category, country, state, city, street, altitude, departament);
	}
}