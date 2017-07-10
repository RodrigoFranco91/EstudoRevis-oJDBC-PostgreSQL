package br.com.rodrigo.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.rodrigo.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		System.out.println("Abrindo conexao");
		Connection conn = new ConnectionFactory().getConnection();
		conn.close();
	}

}
