package com.gpn;

import com.gpn.fabrica.Fabrica;
import com.gpn.fabrica.FabricaCSV;
import com.gpn.modelo.Escritor;

public class App {
	public static void main(String[] args) throws Exception {
		String[] nomesEmpresas = { "ABC LTDA", "HTD LTDA", " JBD LTDA" };
		Fabrica fabrica = new FabricaCSV();
		Escritor escritor = fabrica.criarEscritor("C:\\Users\\usuario\\Desktop", "nomes-empresas", nomesEmpresas);
		escritor.escrever();
	}
}