package com.clinica.dominio;

public class Cirugia {
	private int idCirugia;
	private String tipoCirugia;
	private String dataCirugia;
	private Paciente idPaciente;
	
	
	
	//testeIntegracao
	
	public Cirugia(String tipoCirugia, String dataCirugia, Paciente idPaciente) {
		super();
		this.tipoCirugia = tipoCirugia;
		this.dataCirugia = dataCirugia;
		this.idPaciente = idPaciente;
	}




	public Cirugia(int idCirugia, String tipoCirugia, String dataCirugia, Paciente idPaciente) {
		super();
		this.idCirugia = idCirugia;
		this.tipoCirugia = tipoCirugia;
		this.dataCirugia = dataCirugia;
		this.idPaciente = idPaciente;
	}




	public int getIdCirugia() {
		return idCirugia;
	}
	
	
	
	
	public void setIdCirugia(int idCirugia) {
		this.idCirugia = idCirugia;
	}
	public String getTipoCirugia() {
		return tipoCirugia;
	}
	public void setTipoCirugia(String tipoCirugia) {
		this.tipoCirugia = tipoCirugia;
	}
	public String getDataCirugia() {
		return dataCirugia;
	}
	public void setDataCirugia(String dataCirugia) {
		this.dataCirugia = dataCirugia;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
	
	
	

}
