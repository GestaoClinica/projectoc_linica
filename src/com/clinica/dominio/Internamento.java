package com.clinica.dominio;

public class Internamento {
	private int idInternamento;
	private String dataEntradaInternamento;
	private String dataSaidaInternamento;
	private Paciente idPaciente;
	private Enfermaria idEnfermaria;
		
	
	
	public Internamento(int idInternamento, String dataEntradaInternamento, String dataSaidaInternamento,
			Paciente idPaciente, Enfermaria idEnfermaria) {
		super();
		this.idInternamento = idInternamento;
		this.dataEntradaInternamento = dataEntradaInternamento;
		this.dataSaidaInternamento = dataSaidaInternamento;
		this.idPaciente = idPaciente;
		this.idEnfermaria = idEnfermaria;
		
	}

		
	
	public Internamento(String dataEntradaInternamento, String dataSaidaInternamento, Paciente idPaciente,
			Enfermaria idEnfermaria) {
		super();
		this.dataEntradaInternamento = dataEntradaInternamento;
		this.dataSaidaInternamento = dataSaidaInternamento;
		this.idPaciente = idPaciente;
		this.idEnfermaria = idEnfermaria;
	}
	
	




	public Internamento() {
		super();
	}



	public int getIdInternamento() {
		return idInternamento;
	}
	public void setIdInternamento(int idInternamento) {
		this.idInternamento = idInternamento;
	}
	public String getDataEntradaInternamento() {
		return dataEntradaInternamento;
	}
	public void setDataEntradaInternamento(String dataEntradaInternamento) {
		this.dataEntradaInternamento = dataEntradaInternamento;
	}
	public String getDataSaidaInternamento() {
		return dataSaidaInternamento;
	}
	public void setDataSaidaInternamento(String dataSaidaInternamento) {
		this.dataSaidaInternamento = dataSaidaInternamento;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Enfermaria getIdEnfermaria() {
		return idEnfermaria;
	}
	public void setIdEnfermaria(Enfermaria idEnfermaria) {
		this.idEnfermaria = idEnfermaria;
	}
	
	
	

}
