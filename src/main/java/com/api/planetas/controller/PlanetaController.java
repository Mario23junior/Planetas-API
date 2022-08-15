package com.api.planetas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.model.Planetas;
import com.api.planetas.service.PlanetaService;

@RestController
@RequestMapping("/api/system/planet/")
public class PlanetaController {

	private PlanetaService service;
	
	public PlanetaController(PlanetaService service) {
		this.service = service;
	}

	@PostMapping
	Planetas save(@RequestBody Planetas planetas) {
		return service.bodySave(planetas);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<PlanetasDTO> listid(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PlanetasDTO> listid(@PathVariable Long id, @RequestBody PlanetasDTO planetasDto){
		return service.update(id, planetasDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<PlanetasDTO> delete(@PathVariable Long id){
		return service.delete(id);
	}
}
