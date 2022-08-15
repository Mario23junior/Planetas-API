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

import com.api.planetas.dto.CaracteristicasFisicasDTO;
import com.api.planetas.service.CaracteristicasFisicasService;

@RestController
@RequestMapping("/api/system/caracteristicasFisicas/")
public class CaracteristicasFisicasController {

	private CaracteristicasFisicasService service;

	public CaracteristicasFisicasController(CaracteristicasFisicasService service) {
		this.service = service;
	}

	@PostMapping
	ResponseEntity<CaracteristicasFisicasDTO> save(@RequestBody CaracteristicasFisicasDTO caracteristicasFisicasDto) {
		return service.saveCaractFisic(caracteristicasFisicasDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<CaracteristicasFisicasDTO> listid(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<CaracteristicasFisicasDTO> listid(@PathVariable Long id,
			@RequestBody CaracteristicasFisicasDTO caracteristicasFisicasDto) {
		return service.update(id, caracteristicasFisicasDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<CaracteristicasFisicasDTO> delete(@PathVariable Long id) {
		return service.delete(id);
	}
}
