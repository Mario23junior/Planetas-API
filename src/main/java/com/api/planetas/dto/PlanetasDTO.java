package com.api.planetas.dto;

import java.util.List;

public class PlanetasDTO {

	private Long id;
	private String urlImage;
	private String nome;
	private String areaSuperficie;
	private Double raio;
	private Double distanciaDoSol;
	private String duracaoDoDia;
	private String descricao;
	
 	private List<CaracteristicasFisicasDTO> caracteristicasFisicasDto;
 	private List<CaracteristicasOrbitaisDTO> caracteristicasOrbitaisDto;
 	private List<ComposicaoAtmosfericasDTO> composicaoAtmosfericasDto;
 	private List<LuasDTO> luasDto;
	
	public PlanetasDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaSuperficie() {
		return areaSuperficie;
	}

	public void setAreaSuperficie(String areaSuperficie) {
		this.areaSuperficie = areaSuperficie;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Double getDistanciaDoSol() {
		return distanciaDoSol;
	}

	public void setDistanciaDoSol(Double distanciaDoSol) {
		this.distanciaDoSol = distanciaDoSol;
	}

	public String getDuracaoDoDia() {
		return duracaoDoDia;
	}

	public void setDuracaoDoDia(String duracaoDoDia) {
		this.duracaoDoDia = duracaoDoDia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<CaracteristicasFisicasDTO> getCaracteristicasFisicasDto() {
		return caracteristicasFisicasDto;
	}

	public void setCaracteristicasFisicasDto(List<CaracteristicasFisicasDTO> caracteristicasFisicasDto) {
		this.caracteristicasFisicasDto = caracteristicasFisicasDto;
	}

	public List<CaracteristicasOrbitaisDTO> getCaracteristicasOrbitaisDto() {
		return caracteristicasOrbitaisDto;
	}

	public void setCaracteristicasOrbitaisDto(List<CaracteristicasOrbitaisDTO> caracteristicasOrbitaisDto) {
		this.caracteristicasOrbitaisDto = caracteristicasOrbitaisDto;
	}

	public List<ComposicaoAtmosfericasDTO> getComposicaoAtmosfericasDto() {
		return composicaoAtmosfericasDto;
	}

	public void setComposicaoAtmosfericasDto(List<ComposicaoAtmosfericasDTO> composicaoAtmosfericasDto) {
		this.composicaoAtmosfericasDto = composicaoAtmosfericasDto;
	}

	public List<LuasDTO> getLuasDto() {
		return luasDto;
	}

	public void setLuasDto(List<LuasDTO> luasDto) {
		this.luasDto = luasDto;
	}

	 
	

}
