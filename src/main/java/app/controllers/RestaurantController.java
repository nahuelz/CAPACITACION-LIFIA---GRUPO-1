package app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void restaurants() {

		
	}
}