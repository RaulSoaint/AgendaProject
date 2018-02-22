package com.proyecto.agenda.controlador;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.agenda.dao.Dao;
import com.proyecto.agenda.modelo.Filtro;
import com.proyecto.agenda.util.HibernateUtils;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(@ModelAttribute("filtro") Filtro filtro, Model model) {
				
		model.addAttribute("listado",Dao.busquedaTodosContactos());
		return "listadoContactos";
	}
	
	
	@RequestMapping(value="/",method = RequestMethod.POST)
	public String form(Filtro filtro,Model model) {
				
		model.addAttribute("listado",Dao.busquedaOrdenada(filtro.getSeleccion()));
		return "listadoContactos";
	}
	
}
