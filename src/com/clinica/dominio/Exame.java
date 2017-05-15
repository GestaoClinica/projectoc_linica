package com.clinica.dominio;

public class Exame {
	
	private int idExame;
	private String tipoExame;
	private String nomeExame;
	private Paciente idPaciente;
	
	public Exame(int idExame, String tipoExame, String nomeExame, Paciente idPaciente) {
		super();
		this.idExame = idExame;
		this.tipoExame = tipoExame;
		this.nomeExame = nomeExame;
		this.idPaciente = idPaciente;
	}
	
	public Exame() {
		
	}
	public int getIdExame() {
		return idExame;
	}
	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}
	public String getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}

}
