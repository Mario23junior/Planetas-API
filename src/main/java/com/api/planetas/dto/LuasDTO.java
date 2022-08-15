package com.api.planetas.dto;

import javax.persistence.ManyToOne;

public class LuasDTO {

	private Long id;
	private String nome;
	private String urlImage;
	private Double periastro;
	private Double excentricidade;
	private Double diametroEquatorial;
	private String massa;
	private String descricao;

	@ManyToOne
	private PlanetasDTO planetasDto;
	
	
	public PlanetasDTO getPlanetasDto() {
		return planetasDto;
	}

	public void setPlanetasDto(PlanetasDTO planetasDto) {
		this.planetasDto = planetasDto;
	}
	
	public LuasDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Double getPeriastro() {
		return periastro;
	}

	public void setPeriastro(Double periastro) {
		this.periastro = periastro;
	}

	public Double getExcentricidade() {
		return excentricidade;
	}

	public void setExcentricidade(Double excentricidade) {
		this.excentricidade = excentricidade;
	}

	public Double getDiametroEquatorial() {
		return diametroEquatorial;
	}

	public void setDiametroEquatorial(Double diametroEquatorial) {
		this.diametroEquatorial = diametroEquatorial;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
