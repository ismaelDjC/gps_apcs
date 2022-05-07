package com.instalacion.gps.controller;
import java.util.List;

import com.instalacion.gps.models.Cliente;
import com.instalacion.gps.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/client")
public class ClienteController {

    @Autowired
    private ClienteRepository  repository;

    @GetMapping("/")
	public List<Cliente> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-client")
	public Cliente create(@Validated @RequestBody Cliente l) {
		return repository.save(l);
	}

	@PutMapping("/update-client/{id}")
	public Cliente update(@PathVariable Long id, @Validated @RequestBody Cliente l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-client/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

    
}
