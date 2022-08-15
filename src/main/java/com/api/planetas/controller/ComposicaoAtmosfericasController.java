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

import com.api.planetas.dto.ComposicaoAtmosfericasDTO;
import com.api.planetas.service.ComposicaoAtmosfericasService;

@RestController
@RequestMapping("/api/system/composicaoAtmosfericas/")
public class ComposicaoAtmosfericasController {
   
private ComposicaoAtmosfericasService service;
	
	public ComposicaoAtmosfericasController(ComposicaoAtmosfericasService service) {
		this.service = service;
	}

	@PostMapping
	ResponseEntity<ComposicaoAtmosfericasDTO> save(@RequestBody ComposicaoAtmosfericasDTO composicaoAtmosfericasDto) {
		return service.saveComposicaoAtmosferic(composicaoAtmosfericasDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ComposicaoAtmosfericasDTO> listid(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ComposicaoAtmosfericasDTO> listid(@PathVariable Long id, @RequestBody ComposicaoAtmosfericasDTO composicaoAtmosfericasDto){
		return service.update(id, composicaoAtmosfericasDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ComposicaoAtmosfericasDTO> delete(@PathVariable Long id){
		return service.delete(id);
	}
}
