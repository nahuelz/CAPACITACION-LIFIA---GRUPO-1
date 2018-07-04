package Controller;

@Controller
public class MainController {

		@Autowired
		UsuarioService usuarioService;
		
		@RequestMapping(value = { "index", "/"}, produces = "text/plain;charset=UTF-8")
		public ModelAndView index() {
			return new ModelAndView("index");
		}
		
		@RequestMapping (value = "errorview")
		public ModelAndView errorview(String motivo) {
			ModelAndView model = new ModelAndView("error");
			model.addObjetct("motivo", motivo);
			return model;
		}

}
