package app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import app.dto.DishDTO;
import app.dto.MenuDTO;
import app.dto.RestaurantDTO;
import app.services.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;

	//LIST RESTAURANTS
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String>  listRestaurant() {
		/*
		 * http://localhost:8080/Spring/restaurant/
		 */


		List<RestaurantDTO> restaurants = service.listRestaurants();
		String json = new Gson().toJson(restaurants);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//CREATE RESTAURANT
	@RequestMapping(value = "/createRestaurant", method = RequestMethod.GET)
	public void createRestaurant(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("phone") String phone, @RequestParam("category") String category,
			@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament, @RequestParam("imagen") String imagen) {
		/*
		 * http://localhost:8080/Spring/restaurant/createRestaurant?name=Nombre Restaurant&description=Una descripcion&phone=0303456&category='Una Categoria&country=Argentina&state=Buenos Aires&city=La Plata&street=calle 57&altitude=123&departament=B&imagen=123
		 */
		service.createRestaurant(name, description, phone, category, imagen, country, state, city, street, altitude, departament);
	}
	//GET RESTAURANT
	@RequestMapping(value = "/detailRestaurant", method = RequestMethod.GET)
	public ResponseEntity<String>  getRestaurant(@RequestParam("idRestaurant") Long idRestaurant) {
		/*
		 * http://localhost:8080/Spring/restaurant/detailRestaurant?idRestaurant=5
		 */
		RestaurantDTO restaurant = service.getRestaurant(idRestaurant);
		String json = new Gson().toJson(restaurant);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//UPDATE RESTAURANT
	@RequestMapping(value = "/updateRestaurant", headers="accept=*/*", method = RequestMethod.POST, produces="application/json; charset=UTF-8")
	public @ResponseBody ResponseEntity<String> updateRestaurant(@RequestBody String object){
		/*
		 * http://localhost:8080/Spring/restaurant/updateRestaurant
		 */
		RestaurantDTO restaurantDTO = new Gson().fromJson(object, RestaurantDTO.class);
		service.updateRestaurant(restaurantDTO);
		String json = new Gson().toJson(restaurantDTO);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//ADD MENU
	@RequestMapping(value = "/createMenu", method = RequestMethod.GET)
	public void createMenu(@RequestParam("idRestaurant") Long idRestaurant, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("photo") String photo) {
		/*
		 * http://localhost:8080/Spring/restaurant/createMenu?idRestaurant=5&name='Nombre Menu'&description='Una descripcion menu'&photo=1234
		 */
		service.addMenu(idRestaurant, name, description, photo);
	}
	//GET MENU
	@RequestMapping(value = "/detailMenu", method = RequestMethod.GET)
	public ResponseEntity<String> detailMenu(@RequestParam("idMenu") Long idMenu) {
		/*
		 * http://localhost:8080/Spring/restaurant/detailMenu?idMenu=7
		 */
		MenuDTO menuDTO = service.getMenu(idMenu);
		String json = new Gson().toJson(menuDTO);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//UPDATE MENU
	@RequestMapping(value = "/updateMenu", method = RequestMethod.GET)
	public void updateMenu(@RequestParam("idRestaurant") Long idRestaurant, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("photo") String photo) {
		/*
		 * http://localhost:8080/Spring/restaurant/updateMenu?idRestaurant=5&name='Nombre Menu'&description='Una descripcion menu'&photo=1234
		 */
		service.updateMenu(idRestaurant, name, description, photo);
	}
	//LIST MENUES RESTAURANT
	@RequestMapping(value = "/menues", method = RequestMethod.GET)
	public ResponseEntity<String> listMenues(@RequestParam("idRestaurant") Long idRestaurant){
		/*
		 * http://localhost:8080/Spring/restaurant/menues?idRestaurant=30
		 */
		List<MenuDTO> menues = service.listMenues(idRestaurant);
		String json = new Gson().toJson(menues);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//LIST DISHES MENU
	@RequestMapping(value = "/menu/dishes", method = RequestMethod.GET)
	public ResponseEntity<String> listDishes(@RequestParam("idMenu") Long idMenu){
		/*
		 * http://localhost:8080/Spring/restaurant/menu/dishes?idMenu=5
		 */
		List<DishDTO> dishes = service.listDishes(idMenu);
		String json = new Gson().toJson(dishes);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
	//ADD DISH
	@RequestMapping(value = "/menu/addDish", method = RequestMethod.GET)
	public void createDish(@RequestParam("idMenu") Long idMenu, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("photo") String photo) {
		/*
		 * http://localhost:8080/Spring/restaurant/menu/addDish?idMenu=5&name='Nombre Menu'&description='Una descripcion menu'&photo=1234
		 */	
		service.addDish(idMenu, name, description, photo);
	}
}