package com.perseo.backend.models.services;

import java.util.List;

import com.perseo.backend.models.entity.Usuarios;

public interface IUsuariosService {
	
	public List<Usuarios> findAll();
	
	public Usuarios findById(Long dni);
	
	public Usuarios save(Usuarios usuario);
	
	public void delete(Long dni);
	
}
