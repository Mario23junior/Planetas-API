package com.api.planetas.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.LuasDTO;
import com.api.planetas.model.Luas;
import com.api.planetas.repository.LuasRepository;

@Service
public class LuasService {
  
	private ModelMapper mapper;
	private LuasRepository luasRepository;
	
 	
	public LuasService(ModelMapper mapper, LuasRepository luasRepository) {
		super();
		this.mapper = mapper;
		this.luasRepository = luasRepository;
 	}

	public ResponseEntity<LuasDTO> saveLua(LuasDTO luasDto) {
  		Luas saveplanet = bodySave(mapper.map(luasDto, Luas.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(saveplanet, LuasDTO.class));
	}
	
	private Luas bodySave(Luas luas) {
		return luasRepository.save(luas);
	}
	
	public ResponseEntity<LuasDTO> listId(Long id) {
		Optional<Luas> idPla = luasRepository.findById(id);
		if(idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), LuasDTO.class));
 		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<LuasDTO> update(Long id, LuasDTO luasDto) {
		Optional<Luas> luasBody = luasRepository.findById(id);
		if(luasBody.isPresent()) {
			Luas luasUpdate = luasBody.get();
			luasUpdate.setNome(luasDto.getNome());
			luasUpdate.setUrlImage(luasDto.getUrlImage());
			luasUpdate.setMassa(luasDto.getMassa());
			luasUpdate.setExcentricidade(luasDto.getExcentricidade());
			luasUpdate.setDiametroEquatorial(luasDto.getDiametroEquatorial());
			luasUpdate.setPeriastro(luasDto.getPeriastro());
			luasUpdate.setDescricao(luasDto.getDescricao());
			luasRepository.save(luasUpdate);
			return ResponseEntity.ok(mapper.map(luasUpdate, LuasDTO.class));
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
		}
	}
	
	

	public ResponseEntity<LuasDTO> delete(Long id) {
		Optional<Luas> findId = luasRepository.findById(id);
		if(findId.isPresent()) {
			luasRepository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
}
