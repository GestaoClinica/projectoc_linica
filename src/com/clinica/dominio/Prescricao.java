package com.clinica.dominio;

public class Prescricao {
	
	private int idPrescricao;
	private String descricao;
	private int validade;
	private Paciente idPaciente;
	
		
	public Prescricao() {
		super();
	}
	
	public Prescricao(String descricao, int validade, Paciente idPaciente) {
		super();
		this.descricao = descricao;
		this.validade = validade;
		this.idPaciente = idPaciente;
	}
	
	public Prescricao(int idPrescricao, String descricao, int validade, Paciente idPaciente) {
		super();
		this.idPrescricao = idPrescricao;
		this.descricao = descricao;
		this.validade = validade;
		this.idPaciente = idPaciente;
	}
	
	public int getIdPrescricao() {
		return idPrescricao;
	}
	
	public void setIdPrescricao(int idPrescricao) {
		this.idPrescricao = idPrescricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	

}
