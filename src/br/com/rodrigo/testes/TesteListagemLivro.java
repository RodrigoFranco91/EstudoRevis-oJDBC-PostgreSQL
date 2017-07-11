package br.com.rodrigo.testes;

import java.util.List;

import br.com.rodrigo.dao.LivroDao;
import br.com.rodrigo.modelo.Livro;

public class TesteListagemLivro {
	
	public static void main(String[] args) {
		LivroDao dao = new LivroDao();
		List<Livro> lista = dao.lista();
		
		for(Livro aux : lista) {
			System.out.println(aux.getNome());
		}
	}
}
