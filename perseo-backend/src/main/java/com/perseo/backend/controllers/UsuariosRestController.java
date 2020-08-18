package com.perseo.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.perseo.backend.models.entity.Usuarios;
import com.perseo.backend.models.services.IUsuariosService;

//@CrossOrigin(origins={"localhost"})
@RestController
@RequestMapping("/api")
public class UsuariosRestController {
	
	@Autowired
	private IUsuariosService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuarios> index(){
		return usuarioService.findAll();
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuarios createUsuario(@RequestBody Usuarios usuario){
		return usuarioService.save(usuario);
	}

}
