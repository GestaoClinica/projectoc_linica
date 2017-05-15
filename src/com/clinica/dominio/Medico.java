package com.clinica.dominio;

public class Medico {
private int idMedico;
private String nomeMedico;
private String cartaoMedico;
private String especialidade;
public Medico(int idMedico, String nomeMedico, String cartaoMedico, String especialidade) {
	super();
	this.idMedico = idMedico;
	this.nomeMedico = nomeMedico;
	this.cartaoMedico = cartaoMedico;
	this.especialidade = especialidade;
}
public Medico(String nomeMedico, String cartaoMedico, String especialidade) {
	super();
	this.nomeMedico = nomeMedico;
	this.cartaoMedico = cartaoMedico;
	this.especialidade = especialidade;
}
public Medico() {

}
public int getIdMedico() {
	return idMedico;
}
public void setIdMedico(int idMedico) {
	this.idMedico = idMedico;
}
public String getNomeMedico() {
	return nomeMedico;
}
public void setNomeMedico(String nomeMedico) {
	this.nomeMedico = nomeMedico;
}
public String getCartaoMedico() {
	return cartaoMedico;
}
public void setCartaoMedico(String cartaoMedico) {
	this.cartaoMedico = cartaoMedico;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
	
	
}
