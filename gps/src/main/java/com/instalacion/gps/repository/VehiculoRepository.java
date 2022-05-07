package com.instalacion.gps.repository;

import com.instalacion.gps.models.Vehiculo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo,Long>  {
    
}
