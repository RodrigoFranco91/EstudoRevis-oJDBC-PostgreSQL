package br.com.rodrigo.testes;

import br.com.rodrigo.dao.LivroDao;
import br.com.rodrigo.modelo.Livro;

public class TesteDeletaLivro {

	public static void main(String[] args) {
		Livro l = new Livro();
		l.setId(2);
		LivroDao dao = new LivroDao();
		
		dao.deleta(l);
	}
}
