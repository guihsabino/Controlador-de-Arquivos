package controller;

import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArquivosController {
	public ArquivosController() {
		super();
	}
	public void copiaArquivos(String diretorio, String nomeArquivo, String novoDiretorio) throws IOException {
		
		diretorio = JOptionPane.showInputDialog("Digite o diretório do arquivo: ");
		nomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
		novoDiretorio = JOptionPane.showInputDialog("Digite o novo diretório do arquivo: ");
	}
}
