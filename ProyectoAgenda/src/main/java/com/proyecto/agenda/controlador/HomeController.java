package com.proyecto.agenda.controlador;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.util.HibernateUtils;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Model model) {
				
		Session session = HibernateUtils.getSession();
		Query query = session.createQuery("from Persona");
		List personas=query.list();
		model.addAttribute("listado", personas );
		
		return "listadoContactos";
	}
	
	
	
}
