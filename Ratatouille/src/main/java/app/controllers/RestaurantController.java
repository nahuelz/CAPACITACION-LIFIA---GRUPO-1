package app.controllers;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import app.dto.RestaurantDTO;
import app.services.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String>  detailRestaurant() {
		/*
		 * http://localhost:8080/Spring/restaurant/
		 */
	
		Map<String, Object> mapAll = new LinkedHashMap<String, Object>();
		Map<Integer, Object> mapRestaurants = new LinkedHashMap<Integer, Object>();
		Map<String, Object> mapAtributos = new LinkedHashMap<String, Object>();

		List<RestaurantDTO> restaurants = service.listRestaurants();
		Integer i = 0;
		for (RestaurantDTO r : restaurants) {
			mapAtributos.put("id", r.getId());
			mapAtributos.put("nombre", r.getName());
			mapAtributos.put("description", r.getDescription());
			mapAtributos.put("phone", r.getPhone());
			mapAtributos.put("category", r.getCategory());
			mapAtributos.put("Country", r.getAddress().getCountry());
			mapAtributos.put("State", r.getAddress().getState());
			mapAtributos.put("city", r.getAddress().getCity());
			mapAtributos.put("street", r.getAddress().getStreet());
			mapAtributos.put("altitude", r.getAddress().getAltitude());
			mapAtributos.put("departament", r.getAddress().getDepartament());
			mapRestaurants.put(i, new LinkedHashMap<String, Object>(mapAtributos));
			i++;
		}
		mapAll.put("result", "OK");
		mapAll.put("restaurants", mapRestaurants);
		String json = new Gson().toJson(mapAll);
		return new ResponseEntity<String>(json, HttpStatus.OK);
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
	public ResponseEntity<String>  detailRestaurant(@RequestParam("idRestaurant") Long idRestaurant) {
		/*
		 * http://localhost:8080/Spring/restaurant/detailRestaurant?idRestaurant=5
		 */
		RestaurantDTO restaurant = service.getRestaurant(idRestaurant);
		String json = new Gson().toJson(restaurant);
		return new ResponseEntity<String>(json, HttpStatus.OK);
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