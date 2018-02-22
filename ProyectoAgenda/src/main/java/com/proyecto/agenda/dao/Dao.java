package com.proyecto.agenda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

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
}
