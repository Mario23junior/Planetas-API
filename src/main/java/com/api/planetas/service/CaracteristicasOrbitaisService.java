package com.api.planetas.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetas.dto.CaracteristicasOrbitaisDTO;
import com.api.planetas.model.CaracteristicasOrbitais;
import com.api.planetas.repository.CaracteristicasOrbitaisRepository;
import com.api.planetas.utils.ValidationModule;

@Service
public class CaracteristicasOrbitaisService {
  
	private ModelMapper mapper;
	private CaracteristicasOrbitaisRepository caracteOrbiRepository;
	
 	
	public CaracteristicasOrbitaisService(ModelMapper mapper, CaracteristicasOrbitaisRepository caracteOrbiRepository,ValidationModule validationRepeat) {
		super();
		this.mapper = mapper;
		this.caracteOrbiRepository = caracteOrbiRepository;
 	}

	public ResponseEntity<CaracteristicasOrbitaisDTO> saveCaracte(CaracteristicasOrbitaisDTO caracteristicasOrbitaisDto) {
 		CaracteristicasOrbitais saveCaracteri = bodySave(mapper.map(caracteristicasOrbitaisDto, CaracteristicasOrbitais.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(saveCaracteri, CaracteristicasOrbitaisDTO.class));
	}
	
	private CaracteristicasOrbitais bodySave(CaracteristicasOrbitais caracteristicasOrbitais) {
		return caracteOrbiRepository.save(caracteristicasOrbitais);
	}
	
	public ResponseEntity<CaracteristicasOrbitaisDTO> listId(Long id) {
		Optional<CaracteristicasOrbitais> idPla = caracteOrbiRepository.findById(id);
		if(idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), CaracteristicasOrbitaisDTO.class));
 		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<CaracteristicasOrbitaisDTO> update(Long id, CaracteristicasOrbitaisDTO caracteristicasOrbitaisDto) {
		Optional<CaracteristicasOrbitais> caracteOrbitaisFind = caracteOrbiRepository.findById(id);
		if(caracteOrbitaisFind.isPresent()) {
			CaracteristicasOrbitais caracteOrbitais = caracteOrbitaisFind.get();
			caracteOrbitais.setAfelio(caracteristicasOrbitaisDto.getAfelio());
			caracteOrbitais.setExcentricidade(caracteristicasOrbitaisDto.getExcentricidade());
			caracteOrbitais.setGravidade(caracteristicasOrbitaisDto.getGravidade());
			caracteOrbitais.setPeriodoDeRotacao(caracteristicasOrbitaisDto.getPeriodoDeRotacao());
			caracteOrbitais.setPerioDoOrbital(caracteristicasOrbitaisDto.getPeriodoDeRotacao());
			caracteOrbitais.setNumeroDeSatelitesNaturais(caracteristicasOrbitaisDto.getNumeroDeSatelitesNaturais());
			caracteOrbiRepository.save(caracteOrbitais);
			return ResponseEntity.ok(mapper.map(caracteOrbitais, CaracteristicasOrbitaisDTO.class));
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
		}
	}
	
	

	public ResponseEntity<CaracteristicasOrbitaisDTO> delete(Long id) {
		Optional<CaracteristicasOrbitais> findId = caracteOrbiRepository.findById(id);
		if(findId.isPresent()) {
			caracteOrbiRepository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
