package Clinica.conexao;

//teste do mabuito 34
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/Clinica";

	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}
	public static void main(String[] args) {
		try{
		Connection conexao = Conexao.conectar();
			System.out.println("Conexao realizada com sucesso");
		} catch (SQLException ex){
			//ex.printStackTrace();
			System.out.println("Nao foi possivel realizar a conexao");
		}
	}
		
}
