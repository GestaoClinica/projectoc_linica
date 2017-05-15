package com.clinica.dominio;

public class Enfermaria {
	
	private int idEnfermaria;
	private String designacaoEnfernaria;
    private int totalQuartos;
	public Enfermaria(int idEnfermaria, String designacaoEnfernaria, int totalQuartos) {
		super();
		this.idEnfermaria = idEnfermaria;
		this.designacaoEnfernaria = designacaoEnfernaria;
		this.totalQuartos = totalQuartos;
	}
	public Enfermaria() {
	
	}
	public int getIdEnfermaria() {
		return idEnfermaria;
	}
	public void setIdEnfermaria(int idEnfermaria) {
		this.idEnfermaria = idEnfermaria;
	}
	public String getDesignacaoEnfernaria() {
		return designacaoEnfernaria;
	}
	public void setDesignacaoEnfernaria(String designacaoEnfernaria) {
		this.designacaoEnfernaria = designacaoEnfernaria;
	}
	public int getTotalQuartos() {
		return totalQuartos;
	}
	public void setTotalQuartos(int totalQuartos) {
		this.totalQuartos = totalQuartos;
	}
		

}
