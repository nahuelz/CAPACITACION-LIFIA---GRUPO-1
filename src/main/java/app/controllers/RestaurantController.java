package app.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import app.services.RestaurantServiceBI;
import app.services.ServiceLocator;
import app.dto.RestaurantDTO;

@Controller
@ControllerAdvice
@RequestMapping("/restaurant")
@ResponseBody
@EnableWebMvc
public class RestaurantController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void restaurants() {

		RestaurantServiceBI service = ServiceLocator.getRestaurantService();
		List <RestaurantDTO> restaurants = service.getRestaurants();  
		System.out.println("Listado de restaurants: ");
		for (RestaurantDTO r : restaurants) {
			System.out.println("Id del restaurant: " + r.getId());
			System.out.println("Nombre del restaurant: " + r.getName());
		}

		
	}
}