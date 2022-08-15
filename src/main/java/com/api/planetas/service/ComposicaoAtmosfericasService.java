package com.api.planetas.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.ComposicaoAtmosfericasDTO;
import com.api.planetas.model.ComposicaoAtmosfericas;
import com.api.planetas.repository.ComposicaoAtmosfericasRepository;
import com.api.planetas.utils.ValidationModule;

@Service
public class ComposicaoAtmosfericasService {

	private ModelMapper mapper;
	private ComposicaoAtmosfericasRepository composiAtmoRepository;
 
	public ComposicaoAtmosfericasService(ModelMapper mapper, ComposicaoAtmosfericasRepository composiAtmoRepository,
			ValidationModule validationRepeat) {
		super();
		this.mapper = mapper;
		this.composiAtmoRepository = composiAtmoRepository;
 	}

	public ResponseEntity<ComposicaoAtmosfericasDTO> saveComposicaoAtmosferic(
			ComposicaoAtmosfericasDTO composicaoAtFDto) {
		ComposicaoAtmosfericas saveplanet = bodySave(mapper.map(composicaoAtFDto, ComposicaoAtmosfericas.class));
		return ResponseEntity.status(HttpStatus.OK).body(mapper.map(saveplanet, ComposicaoAtmosfericasDTO.class));
	}

	private ComposicaoAtmosfericas bodySave(ComposicaoAtmosfericas composicaoAtmosfericas) {
		return composiAtmoRepository.save(composicaoAtmosfericas);
	}

	public ResponseEntity<ComposicaoAtmosfericasDTO> listId(Long id) {
		Optional<ComposicaoAtmosfericas> idPla = composiAtmoRepository.findById(id);
		if (idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), ComposicaoAtmosfericasDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	public ResponseEntity<ComposicaoAtmosfericasDTO> update(Long id, ComposicaoAtmosfericasDTO composiAtmosfericasDto) {
		Optional<ComposicaoAtmosfericas> CompositAtmosFercBody = composiAtmoRepository.findById(id);
		if (CompositAtmosFercBody.isPresent()) {
			ComposicaoAtmosfericas composicaoAtmosferic = CompositAtmosFercBody.get();
			composicaoAtmosferic.setAmonia(composiAtmosfericasDto.getAmonia());
			composicaoAtmosferic.setFosforo(composiAtmosfericasDto.getFosforo());
			composicaoAtmosferic.setHelio(composiAtmosfericasDto.getHelio());
			composicaoAtmosferic.setHidrogenio(composiAtmosfericasDto.getHelio());
			composicaoAtmosferic.setMetano(composiAtmosfericasDto.getMetano());
			composicaoAtmosferic.setVaporDeAgua(composiAtmosfericasDto.getVaporDeAgua());
			composicaoAtmosferic.setHressaoAtmosferica(composiAtmosfericasDto.getHressaoAtmosferica());
			composiAtmoRepository.save(composicaoAtmosferic);
			return ResponseEntity.ok(mapper.map(composicaoAtmosferic, ComposicaoAtmosfericasDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	public ResponseEntity<ComposicaoAtmosfericasDTO> delete(Long id) {
		Optional<ComposicaoAtmosfericas> findId = composiAtmoRepository.findById(id);
		if (findId.isPresent()) {
			composiAtmoRepository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

}
