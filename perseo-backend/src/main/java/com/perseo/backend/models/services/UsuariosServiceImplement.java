package com.perseo.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perseo.backend.models.dao.IUsuariosDao;
import com.perseo.backend.models.entity.Usuarios;

@Service
public class UsuariosServiceImplement implements IUsuariosService {
	
	@Autowired
	private IUsuariosDao usuariosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuarios> findAll() {
		return (List<Usuarios>) usuariosDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuarios findById(Long dni) {
		// TODO Auto-generated method stub
		return usuariosDao.findById(dni).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuarios save(Usuarios usuario) {
		// TODO Auto-generated method stub
		return usuariosDao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(Long dni) {
		// TODO Auto-generated method stub
		usuariosDao.deleteById(dni);
		
	}

}
