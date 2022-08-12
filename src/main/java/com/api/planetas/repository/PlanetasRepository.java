package com.api.planetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.planetas.model.Planetas;

public interface PlanetasRepository extends JpaRepository<Planetas, Long>{

}
