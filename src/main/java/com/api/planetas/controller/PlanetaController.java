package com.api.planetas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.service.PlanetaService;

@RestController
@RequestMapping("/api/system/planet/")
public class PlanetaController {

	private PlanetaService service;
	
	public PlanetaController(PlanetaService service) {
		this.service = service;
	}

	@PostMapping
	ResponseEntity<PlanetasDTO> save(@RequestBody PlanetasDTO planetasDTO) {
		return service.savePlanet(planetasDTO);
	}
}
