package br.com.cm.mygames;

import br.com.cm.mygames.modelo.Tabuleiro;
import br.com.cm.mygames.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[]args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 4);
		new TabuleiroConsole(tabuleiro);
	}
}