package Clinica.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class Conexao {
private static final String USUARIO="root";
private static final String SENHA="1846";
private static final String URL="jdbc:mysql://localhost:3306/Clinica";


public static Connection conectar() throws SQLException {
	
Connection conexao=DriverManager.getConnection(URL, USUARIO, SENHA);
return conexao;
}


public static void main(String[] args) {
  try {
      Connection conexao= Conexao.conectar(); 
      System.out.println("conexao realizada com sucesso");
  } catch (SQLException ex) {
      System.out.println("nao foi possivel  realizar a conexao" );
  }
   
}

}