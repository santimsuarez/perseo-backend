package com.perseo.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.perseo.backend.models.entity.Usuarios;

public interface IUsuariosDao extends CrudRepository <Usuarios, Long>{

}
