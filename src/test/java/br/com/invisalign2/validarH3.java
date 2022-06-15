package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarH3 extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_h3() {

		validarTexto(By.xpath("(//h3)[1]"), "invisa � investir em si mesmo.");
		validarTexto(By.xpath("(//h3)[3]"), "invisa � velocidade.");
		validarTexto(By.xpath("(//h3)[6]"), "O tratamento Invisalign � indicado para mim?");

	}

}
