package com.gpn.fabrica;

import com.gpn.modelo.Escritor;

public abstract class Fabrica {
	protected Escritor escritor;

	public abstract Escritor criarEscritor(String caminho, String nomeArquivo, String[] dados) throws Exception;
}