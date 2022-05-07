package com.instalacion.gps.controller;


import java.util.List;

import com.instalacion.gps.models.Gps;
import com.instalacion.gps.repository.GpsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/gps")
public class GpsController {

    @Autowired
    private GpsRepository  repository;

    @GetMapping("/")
	public List<Gps> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-gps")
	public Gps create(@Validated @RequestBody Gps l) {
		return repository.save(l);
	}

	@PutMapping("/update-gps/{id}")
	public Gps update(@PathVariable Long id, @Validated @RequestBody Gps l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-gps/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
    
}
