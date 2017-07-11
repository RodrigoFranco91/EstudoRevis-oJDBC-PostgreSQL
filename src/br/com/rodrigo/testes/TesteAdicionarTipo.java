package br.com.rodrigo.testes;

import br.com.rodrigo.dao.TipoLivroDao;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteAdicionarTipo {
	
	public static void main(String[] args) {
		TipoLivroDao dao = new TipoLivroDao();
		TipoLivro tipo = new TipoLivro();
		
		tipo.setNome("Filosofia");
		dao.adiciona(tipo);
	}
}
