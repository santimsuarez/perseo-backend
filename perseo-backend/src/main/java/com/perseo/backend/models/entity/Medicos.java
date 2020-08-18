package com.perseo.backend.models.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="usuarios_dni")
public class Medicos extends Usuarios {

	private static final long serialVersionUID = 1L;
	
	private Especialidades especialidad;

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	
}
