package br.com.cast.treinamento_app.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cast.treinamento_app.entity.Contato;

public class ContatoDao {

	private static final ContatoDao INSTANCE = new ContatoDao();
	private static final List<Contato> REPOSITORIO = new ArrayList<>();
	private static Long SEQUENCE = 0L;
	
	private ContatoDao() {
		super();
	}

	public static ContatoDao getInstance() {
		return INSTANCE;
	}

	public List<Contato> listarTodos() {
		return REPOSITORIO;
	}

	public void salvar(Contato contato) {
		if (contato.getId() == null){
			contato.setId(SEQUENCE++);
			REPOSITORIO.add(contato);
		}else{
			REPOSITORIO.set(REPOSITORIO.indexOf(contato), contato);
		}
	}
}
