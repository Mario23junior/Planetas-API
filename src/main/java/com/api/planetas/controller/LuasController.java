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

import com.api.planetas.dto.LuasDTO;
import com.api.planetas.service.LuasService;

@RestController
@RequestMapping("/api/system/luas/")
public class LuasController {
  
	private LuasService service;
	
	public LuasController(LuasService service) {
		this.service = service;
	}

	@PostMapping
	ResponseEntity<LuasDTO> save(@RequestBody LuasDTO luasDto) {
		return service.saveLua(luasDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<LuasDTO> listid(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<LuasDTO> listid(@PathVariable Long id, @RequestBody LuasDTO luasDto){
		return service.update(id, luasDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<LuasDTO> delete(@PathVariable Long id){
		return service.delete(id);
	}
}
