package com.api.planetas.dto;

public class CaracteristicasFisicasDTO {
  
	private Long id;
    private String diametroEquatorial;
    private Double volume;
    private Double massa;
    private Double densidadeMedia;
    private Double gravidadeEquatorial;
    private Integer temperatura;
    
    public CaracteristicasFisicasDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiametroEquatorial() {
		return diametroEquatorial;
	}

	public void setDiametroEquatorial(String diametroEquatorial) {
		this.diametroEquatorial = diametroEquatorial;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public Double getDensidadeMedia() {
		return densidadeMedia;
	}

	public void setDensidadeMedia(Double densidadeMedia) {
		this.densidadeMedia = densidadeMedia;
	}

	public Double getGravidadeEquatorial() {
		return gravidadeEquatorial;
	}

	public void setGravidadeEquatorial(Double gravidadeEquatorial) {
		this.gravidadeEquatorial = gravidadeEquatorial;
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}    
}
