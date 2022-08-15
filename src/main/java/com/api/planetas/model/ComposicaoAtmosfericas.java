package com.api.planetas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ComposicaoAtmosfericas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String hressaoAtmosferica;
	private String hidrogenio;
	private String helio;
	private Double metano;
	private Double amonia;
	private Double fosforo;
	private Double vaporDeAgua;

	public ComposicaoAtmosfericas() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	private Planetas planetas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHressaoAtmosferica() {
		return hressaoAtmosferica;
	}

	public void setHressaoAtmosferica(String hressaoAtmosferica) {
		this.hressaoAtmosferica = hressaoAtmosferica;
	}

	public String getHidrogenio() {
		return hidrogenio;
	}

	public void setHidrogenio(String hidrogenio) {
		this.hidrogenio = hidrogenio;
	}

	public String getHelio() {
		return helio;
	}

	public void setHelio(String helio) {
		this.helio = helio;
	}

	public Double getMetano() {
		return metano;
	}

	public void setMetano(Double metano) {
		this.metano = metano;
	}

	public Double getAmonia() {
		return amonia;
	}

	public void setAmonia(Double amonia) {
		this.amonia = amonia;
	}

	public Double getFosforo() {
		return fosforo;
	}

	public void setFosforo(Double fosforo) {
		this.fosforo = fosforo;
	}

	public Double getVaporDeAgua() {
		return vaporDeAgua;
	}

	public void setVaporDeAgua(Double vaporDeAgua) {
		this.vaporDeAgua = vaporDeAgua;
	}

	public Planetas getPlanetas() {
		return planetas;
	}

	public void setPlanetas(Planetas planetas) {
		this.planetas = planetas;
	}
	
	

}
