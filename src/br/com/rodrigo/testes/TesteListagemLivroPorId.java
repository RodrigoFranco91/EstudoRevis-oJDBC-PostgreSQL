package br.com.rodrigo.testes;

import br.com.rodrigo.dao.LivroDao;
import br.com.rodrigo.modelo.Livro;


public class TesteListagemLivroPorId {

	public static void main(String[] args) {
		LivroDao dao = new LivroDao();
		
		Livro l = dao.readById(1);
		System.out.println(l.getNome());
	}

}
