package com.proyecto.agenda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.proyecto.agenda.modelo.Personas;
import com.proyecto.agenda.util.HibernateUtils;

public class Dao {

	private static List contactos;
	
	public static List busquedaOrdenada(String orden){
		Session session = HibernateUtils.getSession();
		Query query = session.createQuery("FROM Personas ORDER BY " +orden+ " asc");
		contactos = query.list();
		session.close();
		return contactos;
	}
	
	public static List busquedaTodosContactos(){
		Session session = HibernateUtils.getSession();
		Query query = session.createQuery("FROM Personas");
		contactos = query.list();
		session.close();
		return contactos;
	}
	
	public static Personas busquedaContacto(int idPersona){
		Session session = HibernateUtils.getSession();
		Personas persona = (Personas) session.get(Personas.class,idPersona);
		session.close();
		return persona;
	}
}
