package com.instalacion.gps.controller;
import java.util.List;

import com.instalacion.gps.models.Vehiculo;
import com.instalacion.gps.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoRepository  repository;

    @GetMapping("/")
	public List<Vehiculo> readAll() {
		return repository.findAll();
	}

	@PostMapping("/create-vehiculo")
	public Vehiculo create(@Validated @RequestBody Vehiculo l) {
		return repository.save(l);
	}

	@PutMapping("/update-vehiculo/{id}")
	public Vehiculo update(@PathVariable Long id, @Validated @RequestBody Vehiculo l) {
		return repository.save(l);
	}

	@DeleteMapping("/delete-vehiculo/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
    
}
