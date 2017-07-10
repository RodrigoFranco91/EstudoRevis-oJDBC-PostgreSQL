package br.com.rodrigo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		System.out.println("Abrindo conexão...");
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost/livros", "postgres", "postgres");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
