package com.gpn.modelo;

import java.io.File;
import java.io.FileWriter;

public abstract class EscritorArquivo implements Escritor {
	protected FileWriter escritorArquivo;
	protected String caminho;
	protected String nomeArquivo;
	protected String extensao;
	protected String[] dados;

	public EscritorArquivo(String caminho, String nomeArquivo, String extensao, String[] dados) throws Exception {
		this.caminho = caminho;
		this.nomeArquivo = nomeArquivo;
		this.extensao = extensao;
		this.dados = dados;

		File arquivo = new File(caminho + "\\" + nomeArquivo + "." + extensao);
		escritorArquivo = new FileWriter(arquivo);
	}

}
