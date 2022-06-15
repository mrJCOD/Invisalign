package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.invisalign.core.Metodos;

public class validarTitulo extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_titulo() {

		validarTitulo("Tratamento Invisalign | Invisalign Alinhador Transparente");
	}

}
