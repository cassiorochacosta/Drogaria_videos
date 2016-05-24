package br.pro.delfino.drogria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogria.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}

	@Ignore
	@Test
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		for (Estado estado : resultado) {
			System.out.println(estado.getSigla() + "-" + estado.getNome());
		}

	}

	@Ignore
	@Test
	public void buscar() {
		Long codigo = 3L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum Estado Encontrado");
		}
		System.out.println(estado.getSigla() + "-" + estado.getNome());
	}

	@Ignore
	@Test
	public void excluir() {
		Long codigo = 4L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum Estado Encontrado");
		} else {
			estadoDAO.excluir(estado);
			System.out.println("Estado Removido");
			System.out.println(estado.getSigla() + "-" + estado.getNome());
		}
	}

	@Ignore
	@Test
	public void editar() {
		Long codigo = 3L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum Estado Encontrado");
		} else {
			estado.setNome("Camapuã");
			estadoDAO.editar(estado);
			System.out.println("Estado Alterado");
			System.out.println(estado.getSigla() + "-" + estado.getNome());
		}

	}

}
