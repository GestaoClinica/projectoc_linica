package com.clinica.dominio;


public class Paciente {
	
	private int idPaciente;
	private String nomePaciente;
	private String biPaciente;
	private String dataNascimentoPaciente;
	private String bairro;
	private String rua;
	private int nrCasa;
	public Paciente(int idPaciente, String nomePaciente, String biPaciente, String dataNascimentoPaciente, String bairro,
			String rua, int nrCasa) {
		super();
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.biPaciente = biPaciente;
		this.dataNascimentoPaciente = dataNascimentoPaciente;
		this.bairro = bairro;
		this.rua = rua;
		this.nrCasa = nrCasa;
	}
	
	
	
	
	public Paciente(String nomePaciente, String biPaciente, String dataNascimentoPaciente, String bairro, String rua,
			int nrCasa) {
		super();
		this.nomePaciente = nomePaciente;
		this.biPaciente = biPaciente;
		this.dataNascimentoPaciente = dataNascimentoPaciente;
		this.bairro = bairro;
		this.rua = rua;
		this.nrCasa = nrCasa;
	}




	public Paciente() {
		
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getBiPaciente() {
		return biPaciente;
	}
	public void setBiPaciente(String biPaciente) {
		this.biPaciente = biPaciente;
	}
	public String getDataNascimentoPaciente() {
		return dataNascimentoPaciente;
	}
	public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
		this.dataNascimentoPaciente = dataNascimentoPaciente;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNrCasa() {
		return nrCasa;
	}
	public void setNrCasa(int nrCasa) {
		this.nrCasa = nrCasa;
	}

}
