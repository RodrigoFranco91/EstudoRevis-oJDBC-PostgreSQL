package br.com.rodrigo.testes;

import java.math.BigDecimal;

import br.com.rodrigo.dao.LivroDao;
import br.com.rodrigo.modelo.Livro;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteAdicionaLivro {
	
	public static void main(String[] args) {
		LivroDao dao = new LivroDao();
		Livro l = new Livro();
		TipoLivro tipo = new TipoLivro();
		
		tipo.setId(5);
		l.setAutor("Leila Pereira");
		l.setEditora("Veja");
		l.setNome("Tenha sucesso!");
		l.setPaginas(555);
		l.setPreco(new BigDecimal(97.50));
		l.setTipo(tipo);
		
		dao.adiciona(l);
		
	}
}
