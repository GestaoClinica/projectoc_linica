package com.clinica.dominio;

public class Patologia {
	private int idPatologia;
	private String nomePatologia;
	private String grau;
	private Paciente idPaciente;
	
	
	public Patologia(int idPatologia, String nomePatologia, String grau, Paciente idPaciente) {
		super();
		this.idPatologia = idPatologia;
		this.nomePatologia = nomePatologia;
		this.grau = grau;
		this.idPaciente = idPaciente;
	}


	public Patologia(String nomePatologia, String grau, Paciente idPaciente) {
		super();
		this.nomePatologia = nomePatologia;
		this.grau = grau;
		this.idPaciente = idPaciente;
	}


	public Patologia() {
		super();
	}


	public int getIdPatologia() {
		return idPatologia;
	}


	public void setIdPatologia(int idPatologia) {
		this.idPatologia = idPatologia;
	}


	public String getNomePatologia() {
		return nomePatologia;
	}


	public void setNomePatologia(String nomePatologia) {
		this.nomePatologia = nomePatologia;
	}


	public String getGrau() {
		return grau;
	}


	public void setGrau(String grau) {
		this.grau = grau;
	}


	public Paciente getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
	
	
	
	
	
	
	
	

}
