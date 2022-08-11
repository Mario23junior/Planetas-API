package com.api.planetas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CaracteristicasOrbitais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double afelio;
	private Double excentricidade;
	private Double perioDoOrbital;
	private Integer numeroDeSatelitesNaturais;
	private Double gravidade;
	private Double periodoDeRotacao;
	
	public CaracteristicasOrbitais() {
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
