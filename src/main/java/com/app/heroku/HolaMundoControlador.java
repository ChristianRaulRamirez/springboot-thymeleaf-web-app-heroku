package com.app.heroku;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundoControlador {

	@GetMapping("/hola")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("mensaje", "   Hola mundo ");
		return "holamundo";
	}
	
}
