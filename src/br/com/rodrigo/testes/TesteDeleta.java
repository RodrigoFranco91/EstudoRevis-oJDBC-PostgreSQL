package br.com.rodrigo.testes;

import br.com.rodrigo.dao.TipoLivroDao;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteDeleta {

	public static void main(String[] args) {
		TipoLivro tipo = new TipoLivro();
		TipoLivroDao dao = new TipoLivroDao();
		
		tipo.setId(2);
		dao.deleta(tipo);
	}
}
