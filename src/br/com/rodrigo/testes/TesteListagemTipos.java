package br.com.rodrigo.testes;

import java.util.List;

import br.com.rodrigo.dao.TipoLivroDao;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteListagemTipos {
	
	public static void main(String[] args) {
		TipoLivroDao dao = new TipoLivroDao();
		List<TipoLivro> lista = dao.lista();
		
		for(TipoLivro aux : lista) {
			System.out.println(aux.getNome());
		}
	}
}
