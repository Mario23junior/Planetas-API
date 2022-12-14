package com.api.planetas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planetas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String urlImage;
	private String nome;
	private String areaSuperficie;
	private Double raio;
	private Double distanciaDoSo;
	private String duracaoDoDia;
	private String descricao;

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

	public Double getDistanciaDoSo() {
		return distanciaDoSo;
	}

	public void setDistanciaDoSo(Double distanciaDoSo) {
		this.distanciaDoSo = distanciaDoSo;
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

}
