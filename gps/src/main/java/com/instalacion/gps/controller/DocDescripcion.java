package com.instalacion.gps.controller;

import java.util.List;

import com.instalacion.gps.models.DocumentoDescripcion;
import com.instalacion.gps.repository.DocumentoDescriocionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/descipciondc")
public class DocDescripcion {

    @Autowired
    private DocumentoDescriocionRepository repository;

    @GetMapping("/")
	public List<DocumentoDescripcion> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-descipciondc")
	public DocumentoDescripcion create(@Validated @RequestBody DocumentoDescripcion l) {
		return repository.save(l);
	}

	@PutMapping("/update-descipciondc/{id}")
	public DocumentoDescripcion update(@PathVariable Long id, @Validated @RequestBody DocumentoDescripcion l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-descipciondc/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
    }
    
}
