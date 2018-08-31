package view;

import java.io.FileInputStream;

import controller.ArquivosController;

public class ArquivosVisao {
	public static void main(String[] args) {
		ArquivosController p = new ArquivosController();
		System.out.println(p.copiaArquivos(diretorio, nomeArquivo, novoDiretorio));
	}
}
