package com.api.planetas.service;

import java.util.Optional;

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
	
	public ResponseEntity<PlanetasDTO> listId(Long id) {
		Optional<Planetas> idPla = planetasRepository.findById(id);
		if(idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), PlanetasDTO.class));
 		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<PlanetasDTO> update(Long id, PlanetasDTO planetasDto) {
		Optional<Planetas> planetsBody = planetasRepository.findById(id);
		if(planetsBody.isPresent()) {
			Planetas planetsUpda = planetsBody.get();
			planetsUpda.setNome(planetasDto.getNome());
			planetsUpda.setUrlImage(planetasDto.getUrlImage());
			planetsUpda.setAreaSuperficie(planetasDto.getAreaSuperficie());
			planetsUpda.setRaio(planetasDto.getRaio());
			planetsUpda.setDistanciaDoSol(planetasDto.getDistanciaDoSol());
			planetsUpda.setDuracaoDoDia(planetasDto.getDuracaoDoDia());
			planetsUpda.setDescricao(planetasDto.getDescricao());
 
			planetasRepository.save(planetsUpda);
			return ResponseEntity.ok(mapper.map(planetsUpda, PlanetasDTO.class));
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
