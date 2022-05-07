package com.instalacion.gps.controller;

import java.util.List;

import com.instalacion.gps.models.DocumentoServicio;
import com.instalacion.gps.repository.DocumentoSevicioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/docservicio")
public class DocSevicioController {

    @Autowired
    private DocumentoSevicioRepository repository;

    @GetMapping("/")
	public List<DocumentoServicio> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-docservicio")
	public DocumentoServicio create(@Validated @RequestBody DocumentoServicio l) {
		return repository.save(l);
	}

	@PutMapping("/update-docservicio/{id}")
	public DocumentoServicio update(@PathVariable Long id, @Validated @RequestBody DocumentoServicio l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-docservicio/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
    }
}
