package br.com.rodrigo.testes;

import br.com.rodrigo.dao.TipoLivroDao;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteListagemPorId {
	public static void main(String[] args) {

		
		TipoLivroDao dao = new TipoLivroDao();
		TipoLivro tipo = dao.readById(1);
		
		System.out.println(tipo.getNome());
	}
}
