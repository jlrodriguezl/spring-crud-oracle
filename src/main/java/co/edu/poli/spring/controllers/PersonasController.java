package co.edu.poli.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.poli.spring.models.service.IPersonasService;

/**
 * Controlador que interactua con las vistas del crud de personas
 * @author jlrodriguez
 *
 */
@Controller
public class PersonasController {
	@Autowired
	private IPersonasService personaService;
	
	/**
	 * Método para consultar personas y devolver a la vista
	 * @param model
	 * @return String con el nombre de la vista
	 */
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("personas", personaService.findAll());
		return "listar";
	}
}
