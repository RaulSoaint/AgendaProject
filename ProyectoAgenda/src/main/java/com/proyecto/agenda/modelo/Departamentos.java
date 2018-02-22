package com.proyecto.agenda.modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos", catalog = "agenda")
public class Departamentos implements java.io.Serializable {

	private Integer iddepartamento;
	private String nombre;
	private Set<Empleados> empleadoses = new HashSet(0);

	public Departamentos() {
	}

	public Departamentos(String nombre) {
		this.nombre = nombre;
	}

	public Departamentos(String nombre, Set<Empleados> empleadoses) {
		this.nombre = nombre;
		this.empleadoses = empleadoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "iddepartamento", unique = true, nullable = false)
	public Integer getIddepartamento() {
		return this.iddepartamento;
	}

	public void setIddepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamentos")
	public Set<Empleados> getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set<Empleados> empleadoses) {
		this.empleadoses = empleadoses;
	}

}