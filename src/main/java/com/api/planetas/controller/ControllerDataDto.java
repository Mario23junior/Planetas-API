package com.api.planetas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.service.FindAlldDataService;

@RestController
@RequestMapping("/api/system/all/")
public class ControllerDataDto {
  
	private FindAlldDataService service;
	
	public ControllerDataDto(FindAlldDataService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<PlanetasDTO> listByAll() {
		 return service.listAll();
	}
}
