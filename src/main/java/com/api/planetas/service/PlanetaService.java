package com.api.planetas.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.model.Planetas;
import com.api.planetas.repository.PlanetasRepository;
import com.api.planetas.utils.ValidationModule;

@Service
public class PlanetaService {
  
	private ModelMapper mapper;
	private PlanetasRepository planetasRepository;
	
	private ValidationModule validationRepeat;
	
	public PlanetaService(ModelMapper mapper, PlanetasRepository planetasRepository,ValidationModule validationRepeat) {
		super();
		this.mapper = mapper;
		this.planetasRepository = planetasRepository;
		this.validationRepeat = validationRepeat;
	}

	public ResponseEntity<PlanetasDTO> savePlanet(PlanetasDTO planetasDTO) {
		validationRepeat.ValidValueDuplicate(planetasDTO);
 		Planetas saveplanet = bodySave(mapper.map(planetasDTO, Planetas.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(saveplanet, PlanetasDTO.class));
	}
	
	private Planetas bodySave(Planetas planeta) {
		return planetasRepository.save(planeta);
	}
}
