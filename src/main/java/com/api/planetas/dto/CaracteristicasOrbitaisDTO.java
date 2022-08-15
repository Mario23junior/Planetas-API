package com.api.planetas.dto;

import javax.persistence.ManyToOne;

public class CaracteristicasOrbitaisDTO {
	
	private Long id;
	private Double afelio;
	private Double excentricidade;
	private Double perioDoOrbital;
	private Integer numeroDeSatelitesNaturais;
	private Double gravidade;
	private Double periodoDeRotacao;
	
	@ManyToOne
	private PlanetasDTO planetasDto;
	
	
	public PlanetasDTO getPlanetasDto() {
		return planetasDto;
	}

	public void setPlanetasDto(PlanetasDTO planetasDto) {
		this.planetasDto = planetasDto;
	}

	public CaracteristicasOrbitaisDTO() {
 	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAfelio() {
		return afelio;
	}

	public void setAfelio(Double afelio) {
		this.afelio = afelio;
	}

	public Double getExcentricidade() {
		return excentricidade;
	}

	public void setExcentricidade(Double excentricidade) {
		this.excentricidade = excentricidade;
	}

	public Double getPerioDoOrbital() {
		return perioDoOrbital;
	}

	public void setPerioDoOrbital(Double perioDoOrbital) {
		this.perioDoOrbital = perioDoOrbital;
	}

	public Integer getNumeroDeSatelitesNaturais() {
		return numeroDeSatelitesNaturais;
	}

	public void setNumeroDeSatelitesNaturais(Integer numeroDeSatelitesNaturais) {
		this.numeroDeSatelitesNaturais = numeroDeSatelitesNaturais;
	}

	public Double getGravidade() {
		return gravidade;
	}

	public void setGravidade(Double gravidade) {
		this.gravidade = gravidade;
	}

	public Double getPeriodoDeRotacao() {
		return periodoDeRotacao;
	}

	public void setPeriodoDeRotacao(Double periodoDeRotacao) {
		this.periodoDeRotacao = periodoDeRotacao;
	}
	
	
}
