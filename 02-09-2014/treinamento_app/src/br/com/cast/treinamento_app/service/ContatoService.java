package br.com.cast.treinamento_app.service;

import java.util.List;

import br.com.cast.treinamento_app.dao.ContatoDao;
import br.com.cast.treinamento_app.entity.Contato;

public class ContatoService {

	private static final ContatoService INSTANCE = new ContatoService();

	private ContatoService() {
		super();
	}

	public static ContatoService getInstance() {
		return INSTANCE;
	}

	public List<Contato> listarTodos() {
		return ContatoDao.getInstance().listarTodos();
	}

	public void salvar(Contato contato) {
		ContatoDao.getInstance().salvar(contato);
	}
}
