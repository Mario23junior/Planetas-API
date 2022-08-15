package com.api.planetas.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.PlanetasDTO;
import com.api.planetas.exceptions.ReturnErroFindNotFound;
import com.api.planetas.model.Planetas;
import com.api.planetas.repository.PlanetasRepository;

@Service
public class ValidationModule {

	private PlanetasRepository repository;
	private ModelMapper mapper;

	public ValidationModule(PlanetasRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public void ValidValueDuplicate(PlanetasDTO planetasDto) {
		PlanetasDTO dtoPlane = mapper.map(planetasDto, PlanetasDTO.class);
		Planetas systemFind = repository.findByNome(planetasDto.getNome());
		if (systemFind != null && systemFind.getId() != dtoPlane.getId()) {
			throw new ReturnErroFindNotFound("Planeta " + planetasDto.getNome() + " Já esta cadastro na base de dados");
		}
	}
	
	public void ValidValueDuplicate(Planetas planetas) {
 		Planetas systemFind = repository.findByNome(planetas.getNome());
		if (systemFind != null && systemFind.getId() != systemFind.getId()) {
			throw new ReturnErroFindNotFound("Planeta " + planetas.getNome() + " Já esta cadastro na base de dados");
		}
	}
}
