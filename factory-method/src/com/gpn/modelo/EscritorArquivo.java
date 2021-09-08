package com.gpn.modelo;

import java.io.FileWriter;

public abstract class EscritorArquivo implements Escritor{
	protected FileWriter escritorArquivo;
	protected String extensao;
	protected String caminho;
	protected String[] dados;
}
