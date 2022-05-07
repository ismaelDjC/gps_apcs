package com.instalacion.gps.repository;

import com.instalacion.gps.models.Gps;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GpsRepository extends JpaRepository<Gps,Long>{
    
}
