package com.clinica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.clinica.dominio.Paciente;

import Clinica.conexao.Conexao;


public class PacienteDAO {
	
	
public void salvar (Paciente p) throws SQLException{
		
		StringBuilder sql= new StringBuilder();
		sql.append("INSERT INTO paciente ");
		sql.append("(nome_pac, bi, data_nas, bairro, rua, nr_casa) ");
		sql.append("VALUES (?, ?, ?, ?, ?, ?) ");
		
		Connection conexao= Conexao.conectar();
		//
		PreparedStatement comando=conexao.prepareStatement(sql.toString());
		comando.setString(1, p.getNomePaciente());
		comando.setString(2, p.getBiPaciente());
		comando.setString(3, p.getDataNascimentoPaciente());
		comando.setString(4, p.getBairro());
		comando.setString(5, p.getRua());
		comando.setInt(6, p.getNrCasa());
		comando.executeUpdate();
	}
	
//
public static void main(String[] args) throws SQLException {
	PacienteDAO dao= new PacienteDAO();
	
	
	for(int i=0; i<10; i++){
		
	Paciente p= new Paciente("jao","6789123p"+i,"2017-05-10", "bairro","rua",2);
	
	dao.salvar(p);
	
		//		
	}
}

}
