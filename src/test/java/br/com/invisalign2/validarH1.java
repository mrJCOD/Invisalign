package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarH1 extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_h1() {

		validarTexto(By.xpath("//h1"), "Por que escolher o tratamento Invisalign®?");

	}

}
