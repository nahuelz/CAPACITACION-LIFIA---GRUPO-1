package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@ControllerAdvice
@RequestMapping("/")
@ResponseBody
@EnableWebMvc
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("hello");
		return view;
	}

}
