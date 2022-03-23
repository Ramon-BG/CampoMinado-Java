package br.com.cm.mygames.visao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cm.mygames.excecao.ExplosaoException;
import br.com.cm.mygames.modelo.Tabuleiro;

class TabuleiroConsoleTest {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void executarJogo() {
		tabuleiro = new Tabuleiro(6, 6, 2);
	}
	
	@Test
	void testeExcultarNOK() {
	}

}

