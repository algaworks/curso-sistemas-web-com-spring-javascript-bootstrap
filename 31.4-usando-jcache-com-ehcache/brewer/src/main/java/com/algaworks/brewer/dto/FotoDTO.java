package com.algaworks.brewer.dto;

public class FotoDTO {

	private String nome;
	private String contentType;
	private String url;

	public FotoDTO(String nome, String contentType, String url) {
		this.nome = nome;
		this.contentType = contentType;
		this.url = url;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
