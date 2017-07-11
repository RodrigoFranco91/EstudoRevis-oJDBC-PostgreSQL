package br.com.rodrigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.rodrigo.jdbc.ConnectionFactory;
import br.com.rodrigo.modelo.Livro;
import br.com.rodrigo.modelo.TipoLivro;

public class LivroDao {

	private Connection conn;

	public LivroDao() {
		this.conn = new ConnectionFactory().getConnection();
	}

	public void adiciona(Livro livro) {
		String sql = "INSERT INTO livro(nome, preco, paginas, autor, editora, tipo_livro_fk) VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, livro.getNome());
			ps.setBigDecimal(2, livro.getPreco());
			ps.setInt(3, livro.getPaginas());
			ps.setString(4, livro.getAutor());
			ps.setString(5, livro.getEditora());
			ps.setInt(6, livro.getTipo().getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleta(Livro l) {
		String sql = "DELETE FROM livro WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, l.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Livro> lista() {
		List<Livro> livroList = new ArrayList<Livro>();
		String sql = "SELECT * FROM livro";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro();
				TipoLivro tipo = new TipoLivro();
				tipo.setId(rs.getInt("tipo_livro_fk"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setId(rs.getInt("id"));
				livro.setPaginas(rs.getInt("paginas"));
				livro.setNome(rs.getString("nome"));
				livro.setPreco(rs.getBigDecimal("preco"));
				livro.setTipo(tipo);
				livroList.add(livro);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return livroList;
	}

	public Livro readById(Integer id) {
		Livro livro = null;
		String sql = "SELECT * FROM livro WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				livro = new Livro();
				TipoLivro tipo = new TipoLivro();
				tipo.setId(rs.getInt("tipo_livro_fk"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setId(rs.getInt("id"));
				livro.setPaginas(rs.getInt("paginas"));
				livro.setNome(rs.getString("nome"));
				livro.setPreco(rs.getBigDecimal("preco"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return livro;
	}
	
	public void altera(Livro livro) {
		String sql = "UPDATE livro SET nome = ?, preco = ?, paginas = ?, autor=?, editora=?, tipo_livro_fk=? WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, livro.getNome());
			ps.setBigDecimal(2, livro.getPreco());
			ps.setInt(3, livro.getPaginas());
			ps.setString(4, livro.getAutor());
			ps.setString(5, livro.getEditora());
			ps.setInt(6, livro.getTipo().getId());
			ps.setInt(7, livro.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
