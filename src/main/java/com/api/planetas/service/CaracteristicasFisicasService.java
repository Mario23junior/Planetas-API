package com.api.planetas.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.CaracteristicasFisicasDTO;
import com.api.planetas.model.CaracteristicasFisicas;
import com.api.planetas.repository.CaracteristicasFisicasRepository;

@Service
public class CaracteristicasFisicasService {
  
	private ModelMapper mapper;
	private CaracteristicasFisicasRepository caracFisicasRepository;
	
	
	public CaracteristicasFisicasService(ModelMapper mapper, CaracteristicasFisicasRepository caracFisicasRepository) {
		super();
		this.mapper = mapper;
		this.caracFisicasRepository = caracFisicasRepository;
 	}

	public ResponseEntity<CaracteristicasFisicasDTO> saveCaractFisic(CaracteristicasFisicasDTO caracteristicasFisicasDto) {
		CaracteristicasFisicas saveCaractFisicas = bodySave(mapper.map(caracteristicasFisicasDto, CaracteristicasFisicas.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(saveCaractFisicas, CaracteristicasFisicasDTO.class));
	}
	
	private CaracteristicasFisicas bodySave(CaracteristicasFisicas caracteristicasFisicas) {
		return caracFisicasRepository.save(caracteristicasFisicas);
	}
	
	public ResponseEntity<CaracteristicasFisicasDTO> listId(Long id) {
		Optional<CaracteristicasFisicas> idPla = caracFisicasRepository.findById(id);
		if(idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), CaracteristicasFisicasDTO.class));
 		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<CaracteristicasFisicasDTO> update(Long id, CaracteristicasFisicasDTO caracteristicasFisicasDto) {
		Optional<CaracteristicasFisicas> caracteBody = caracFisicasRepository.findById(id);
		if(caracteBody.isPresent()) {
			CaracteristicasFisicas caractUpdate = caracteBody.get();
			caractUpdate.setVolume(caracteristicasFisicasDto.getVolume());
			caractUpdate.setDensidadeMedia(caracteristicasFisicasDto.getDensidadeMedia());
			caractUpdate.setGravidadeEquatorial(caracteristicasFisicasDto.getGravidadeEquatorial());
			caractUpdate.setMassa(caracteristicasFisicasDto.getMassa());
			caractUpdate.setTemperatura(caracteristicasFisicasDto.getTemperatura());
			caractUpdate.setDiametroEquatorial(caracteristicasFisicasDto.getDiametroEquatorial());
			caracFisicasRepository.save(caractUpdate);
			return ResponseEntity.ok(mapper.map(caractUpdate, CaracteristicasFisicasDTO.class));
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
		}
	}

	public ResponseEntity<CaracteristicasFisicasDTO> delete(Long id) {
		Optional<CaracteristicasFisicas> findId = caracFisicasRepository.findById(id);
		if(findId.isPresent()) {
			caracFisicasRepository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
