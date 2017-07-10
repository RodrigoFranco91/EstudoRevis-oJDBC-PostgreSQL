package br.com.rodrigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.rodrigo.jdbc.ConnectionFactory;
import br.com.rodrigo.modelo.TipoLivro;

public class TipoLivroDao {

	private Connection conn;

	public TipoLivroDao() {
		this.conn = new ConnectionFactory().getConnection();
	}

	public void adiciona(TipoLivro tipo) {
		String sql = "INSERT INTO tipo_livro(nome) VALUES(?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tipo.getNome());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleta(TipoLivro tipo) {
		String sql = "DELETE FROM tipo_livro WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, tipo.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<TipoLivro> lista() {
		List<TipoLivro> tipoList = new ArrayList<TipoLivro>();
		String sql = "SELECT * FROM tipo_livro";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TipoLivro tipo = new TipoLivro();
				tipo.setId(rs.getInt("id"));
				tipo.setNome(rs.getString("nome"));
				tipoList.add(tipo);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoList;
	}

	public TipoLivro readById(Integer id) {
		TipoLivro tipo = null;
		String sql = "SELECT * FROM tipo_livro WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				tipo = new TipoLivro();
				tipo.setId(rs.getInt("id"));
				tipo.setNome(rs.getString("nome"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipo;
	}

	public void altera(TipoLivro tipo) {
		String sql = "UPDATE tipo_livro SET nome=? WHERE id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tipo.getNome());
			ps.setInt(2, tipo.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
