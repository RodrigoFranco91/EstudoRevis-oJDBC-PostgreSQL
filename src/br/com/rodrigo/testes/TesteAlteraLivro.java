package br.com.rodrigo.testes;

import java.math.BigDecimal;

import br.com.rodrigo.dao.LivroDao;
import br.com.rodrigo.modelo.Livro;
import br.com.rodrigo.modelo.TipoLivro;

public class TesteAlteraLivro {
	
	public static void main(String[] args) {
		Livro l = new Livro();
		l.setId(1);
		l.setPaginas(999);
		l.setEditora("Deitel2");
		l.setAutor("Rodrigo Franco de Lima");
		l.setPreco(new BigDecimal(500));
		l.setNome("Aprendendo Java EE");
		TipoLivro tipo = new TipoLivro();
		tipo.setId(5);
		l.setTipo(tipo);
		
		LivroDao dao = new LivroDao();
		dao.altera(l);
	}

}
