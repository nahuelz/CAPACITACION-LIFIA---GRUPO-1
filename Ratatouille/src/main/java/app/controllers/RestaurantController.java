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
	public void createRestaurant(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("phone") String phone, @RequestParam("category") String category,
			@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		/*
		 * http://localhost:8080/Spring/restaurant/createRestaurant?name='Nombre Restaurant'&description='Una descripcion'&phone='0303456'&category='Una Categoria'&country='Argentina'&state='Buenos Aires'&city='La Plata'&street='calle 57'&altitude=123&departament='B'
		 */
		service.createRestaurant(name, description, phone, category, country, state, city, street, altitude, departament);
	}
	
	@RequestMapping(value = "/detailRestaurant", method = RequestMethod.GET)
	public void detailRestaurant(@RequestParam("idRestaurant") Long idRestaurant) {
		/*
		 * http://localhost:8080/Spring/restaurant/detailRestaurant?idRestaurant=5
		 */
		System.out.println(service.getRestaurant(idRestaurant).getName());
	}
	
	@RequestMapping(value = "/updateRestaurant", method = RequestMethod.GET)
	public void updateRestaurant(@RequestParam("idRestaurant") Long idRestaurant, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("phone") String phone, @RequestParam("category") String category,
			@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		/*
		 * http://localhost:8080/Spring/restaurant/updateRestaurant?idRestaurant=5&name='Nombre Restaurant Editado'&description='Una descripcion'&phone='0303456'&category='Una Categoria'&country='Argentina'&state='Buenos Aires'&city='La Plata'&street='calle 57'&altitude=123&departament='B'
		 */
		service.updateRestaurant(idRestaurant, name, description, phone, category, country, state, city, street, altitude, departament);
	}
	
	@RequestMapping(value = "/createMenu", method = RequestMethod.GET)
	public void createMenu(@RequestParam("idRestaurant") Long idRestaurant, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("photo") Integer photo) {
		/*
		 * http://localhost:8080/Spring/restaurant/createMenu?idRestaurant=5&name='Nombre Menu'&description='Una descripcion menu'&photo=1234
		 */
		service.createMenu(idRestaurant, name, description, photo);
	}
	
	@RequestMapping(value = "/detailMenu", method = RequestMethod.GET)
	public void detailMenu(@RequestParam("idMenu") Long idMenu) {
		/*
		 * http://localhost:8080/Spring/restaurant/detailMenu?idMenu=7
		 */
		System.out.println(service.detailMenu(idMenu).getName());
	}
	
	@RequestMapping(value = "/updateMenu", method = RequestMethod.GET)
	public void updateMenu(@RequestParam("idRestaurant") Long idRestaurant, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("photo") Integer photo) {
		/*
		 * http://localhost:8080/Spring/restaurant/updateMenu?idRestaurant=5&name='Nombre Menu'&description='Una descripcion menu'&photo=1234
		 */
		service.updateMenu(idRestaurant, name, description, photo);
	}
}