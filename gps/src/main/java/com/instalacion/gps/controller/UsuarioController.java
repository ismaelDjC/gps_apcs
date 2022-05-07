package com.instalacion.gps.controller;
import java.util.List;

import com.instalacion.gps.models.Usuario;
import com.instalacion.gps.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository  repository;

    @GetMapping("/")
	public List<Usuario> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-user")
	public Usuario create(@Validated @RequestBody Usuario l) {
		return repository.save(l);
	}

	@PutMapping("/update-user/{id}")
	public Usuario update(@PathVariable Long id, @Validated @RequestBody Usuario l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-user/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

    
}
