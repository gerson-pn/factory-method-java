package com.gpn.modelo;

public class EscritorCSV extends EscritorArquivo {

	public EscritorCSV(String caminho, String nomeArquivo, String extensao, String[] dados) throws Exception {
		super(caminho, nomeArquivo, extensao, dados);
	}

	@Override
	public void escrever() throws Exception {
		for (int i = 0; i < dados.length; i++) {
			if ((i == 0) && (dados.length == 1)) {
				escritorArquivo.write(dados[i]);
			} else if ((i == 0) && (dados.length > 1)) {
				escritorArquivo.write(dados[i] + ",");
			} else if (((i + 1) == dados.length) && (dados.length > 1)) {
				escritorArquivo.append(dados[i]);
			} else {
				escritorArquivo.append(dados[i] + ",");
			}
		}
		escritorArquivo.close();
	}
}