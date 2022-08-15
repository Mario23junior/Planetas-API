package com.api.planetas.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class PlanetasDTO {

	private Long id;
	private String urlImage;
	private String nome;
	private String areaSuperficie;
	private Double raio;
	private Double distanciaDoSol;
	private String duracaoDoDia;
	private String descricao;
	
	@OneToMany(mappedBy = "planetasDto", cascade = CascadeType.ALL)
	private List<CaracteristicasFisicasDTO> caracteristicasFisicasDtos;
	
	@OneToMany(mappedBy = "planetasDto", cascade = CascadeType.ALL)
	private List<CaracteristicasOrbitaisDTO> caracteristicasOrbitaisDTOs;
	
	@OneToMany(mappedBy = "planetasDto", cascade = CascadeType.ALL)
	private List<ComposicaoAtmosfericasDTO> atmosfericasDTOs;
	
	@OneToMany(mappedBy = "planetasDto", cascade = CascadeType.ALL)
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

	public List<CaracteristicasFisicasDTO> getCaracteristicasFisicasDtos() {
		return caracteristicasFisicasDtos;
	}

	public void setCaracteristicasFisicasDtos(List<CaracteristicasFisicasDTO> caracteristicasFisicasDtos) {
		this.caracteristicasFisicasDtos = caracteristicasFisicasDtos;
	}

	public List<CaracteristicasOrbitaisDTO> getCaracteristicasOrbitaisDTOs() {
		return caracteristicasOrbitaisDTOs;
	}

	public void setCaracteristicasOrbitaisDTOs(List<CaracteristicasOrbitaisDTO> caracteristicasOrbitaisDTOs) {
		this.caracteristicasOrbitaisDTOs = caracteristicasOrbitaisDTOs;
	}

	public List<ComposicaoAtmosfericasDTO> getAtmosfericasDTOs() {
		return atmosfericasDTOs;
	}

	public void setAtmosfericasDTOs(List<ComposicaoAtmosfericasDTO> atmosfericasDTOs) {
		this.atmosfericasDTOs = atmosfericasDTOs;
	}

	public List<LuasDTO> getLuasDto() {
		return luasDto;
	}

	public void setLuasDto(List<LuasDTO> luasDto) {
		this.luasDto = luasDto;
	}
	
	

}
