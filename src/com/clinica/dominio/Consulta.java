package com.clinica.dominio;

public class Consulta {
	
	private String dataConsulta;
	private Paciente idPaciente;
	private Medico idMedico;
	
	
	
	
	public Consulta() {
		
	}
	public Consulta(String dataConsulta, Paciente idPaciente, Medico idMedico) {
		super();
		this.dataConsulta = dataConsulta;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
	}
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Medico getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Medico idMedico) {
		this.idMedico = idMedico;
	}
	
	
	

}
