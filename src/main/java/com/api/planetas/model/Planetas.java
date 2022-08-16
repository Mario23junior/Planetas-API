package com.api.planetas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Planetas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String urlImage;
	private String nome;
	private String areaSuperficie;
	private Double raio;
	private Double distanciaDoSol;
	private String duracaoDoDia;
	private String descricao;

	@OneToMany(mappedBy = "planetas", cascade = CascadeType.ALL)
	private List<CaracteristicasFisicas> caracteristicasFisicas;

	@OneToMany(mappedBy = "planetas", cascade = CascadeType.ALL)
	private List<CaracteristicasOrbitais> caracteristicasOrbitais;

	@OneToMany(mappedBy = "planetas", cascade = CascadeType.ALL)
	private List<ComposicaoAtmosfericas> composicaoAtmosfericas;

	@OneToMany(mappedBy = "planetas", cascade = CascadeType.ALL)
	private List<Luas> luas;

	public Planetas() {
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

	public List<CaracteristicasFisicas> getCaracteristicasFisicas() {
		return caracteristicasFisicas;
	}

	public void setCaracteristicasFisicas(List<CaracteristicasFisicas> caracteristicasFisicas) {
		this.caracteristicasFisicas = caracteristicasFisicas;
	}

	public List<CaracteristicasOrbitais> getCaracteristicasOrbitais() {
		return caracteristicasOrbitais;
	}

	public void setCaracteristicasOrbitais(List<CaracteristicasOrbitais> caracteristicasOrbitais) {
		this.caracteristicasOrbitais = caracteristicasOrbitais;
	}

	public List<ComposicaoAtmosfericas> getComposicaoAtmosfericas() {
		return composicaoAtmosfericas;
	}

	public void setComposicaoAtmosfericas(List<ComposicaoAtmosfericas> composicaoAtmosfericas) {
		this.composicaoAtmosfericas = composicaoAtmosfericas;
	}

	public List<Luas> getLuas() {
		return luas;
	}

	public void setLuas(List<Luas> luas) {
		this.luas = luas;	
	}

	 

}
