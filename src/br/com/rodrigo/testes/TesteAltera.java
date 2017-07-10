package br.com.rodrigo.testes;

import br.com.rodrigo.dao.TipoLivroDao;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteAltera {
	public static void main(String[] args) {
		TipoLivro tipo = new TipoLivro();
		tipo.setId(1);
		tipo.setNome("Cientifico");
		
		TipoLivroDao dao = new TipoLivroDao();
		dao.altera(tipo);
	}
}
