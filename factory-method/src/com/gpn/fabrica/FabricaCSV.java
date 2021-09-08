package com.gpn.fabrica;

import com.gpn.modelo.Escritor;
import com.gpn.modelo.EscritorCSV;

public class FabricaCSV extends Fabrica {

	@Override
	public Escritor criarEscritor(String caminho, String nomeArquivo, String[] dados) throws Exception {
		this.escritor = new EscritorCSV(caminho, nomeArquivo, "csv", dados);
		return escritor;
	}

}
