package br.com.rodrigo.modelo;

import java.math.BigDecimal;

public class Livro {

	private Integer id;
	private String nome;
	private BigDecimal preco;
	private Integer paginas;
	private String autor;
	private String editora;
	private TipoLivro tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public TipoLivro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLivro tipo) {
		this.tipo = tipo;
	}

}
