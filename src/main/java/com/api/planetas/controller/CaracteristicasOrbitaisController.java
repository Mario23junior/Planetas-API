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

import com.api.planetas.dto.CaracteristicasOrbitaisDTO;
import com.api.planetas.service.CaracteristicasOrbitaisService;

@RestController
@RequestMapping("/api/system/caracteristicasOrbitais/")
public class CaracteristicasOrbitaisController {
  
private CaracteristicasOrbitaisService service;
	
	public CaracteristicasOrbitaisController(CaracteristicasOrbitaisService service) {
		this.service = service;
	}

	@PostMapping
	ResponseEntity<CaracteristicasOrbitaisDTO> save(@RequestBody CaracteristicasOrbitaisDTO caracteristicasOrbitaisDto) {
		return service.saveCaracte(caracteristicasOrbitaisDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<CaracteristicasOrbitaisDTO> listid(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CaracteristicasOrbitaisDTO> listid(@PathVariable Long id, @RequestBody CaracteristicasOrbitaisDTO caracteristicasOrbitaisDto){
		return service.update(id, caracteristicasOrbitaisDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<CaracteristicasOrbitaisDTO> delete(@PathVariable Long id){
		return service.delete(id);
	}
}
