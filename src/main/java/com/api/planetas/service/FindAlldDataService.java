package com.api.planetas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.model.Planetas;
import com.api.planetas.repository.PlanetasRepository;

@Service
public class FindAlldDataService {
  
	private PlanetasRepository repository;
	private ModelMapper mapper;
	
	public FindAlldDataService(PlanetasRepository repository , ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public List<PlanetasDTO> listAllByData() {
		return ((List<Planetas>)
				  repository
				  .findAll())
				  .stream()
				  .map(this::ConvertEntityToDTO)
				  .collect(Collectors.toList());
	}
	
	public PlanetasDTO ConvertEntityToDTO(Planetas planetas) {
		mapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		PlanetasDTO planetDto = mapper.map(planetas, PlanetasDTO.class);
		return planetDto;
	}
	
	public List<PlanetasDTO> listAll(){
		List<PlanetasDTO> list = listAllByData();
		return list
				 .stream()
				 .collect(Collectors.toList());
	}
}
