package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void usuarios() {

	}
	
	@RequestMapping(value = "/createAdress", method = RequestMethod.GET)
	public void createAdress(@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		/*
		 * http://localhost:8080/Spring/usuario/createAdress?country='Argentina'&state='Buenos Aires'&city='La Plata'&street='calle 57'&altitude=123&departament='B'
		 */
		//service.createAdress(country, state, city, street, altitude, departament);
	}
	
	@RequestMapping(value = "/editAdress", method = RequestMethod.GET)
	public void editAdress(@RequestParam Long id, @RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("city") String city, @RequestParam("street") String street, @RequestParam("altitude") Integer altitude, @RequestParam("departament") String departament) {
		/*
		 * http://localhost:8080/Spring/usuario/editAdress?id=1&country='Argentina'&state='Buenos Aires'&city='La Plata'&street='calle 57'&altitude=123&departament='B'
		 */
		//service.editAdress(id, country, state, city, street, altitude, departament);
	}
	
	

}
