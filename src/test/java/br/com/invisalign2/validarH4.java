package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarH4 extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_h4() {

		validarTexto(By.xpath("(//h4)[1]"), "Voc� poder� ver resultados em poucas semanas2");
		validarTexto(By.xpath("(//h4)[4]"), "Se perguntando se Invisalign � indicado para voc�?");
		validarTexto(By.xpath("(//h4)[5]"), "N�s podemos ajudar");
		validarTexto(By.xpath("(//h4)[6]"), "invisa � ter um ortodontista especializado perto de voc�.");
		validarTexto(By.xpath("(//h4)[7]"), "invisa � �nico");

	}

}
