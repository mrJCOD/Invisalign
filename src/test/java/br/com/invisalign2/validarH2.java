package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarH2 extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_h2() {

		validarTexto(By.xpath("(//h2)[1]"), "invisa � a melhor escolha.");
		validarTexto(By.xpath("(//h2)[2]"), "Quanto custa Invisalign?");
		validarTexto(By.xpath("(//h2)[3]"), "Quanto tempo dura o tratamento com Invisalign?");
		validarTexto(By.xpath("(//h2)[4]"), "Conhe�a nossas parcerias");
		validarTexto(By.xpath("//div[@class='section-heading col-12']"), "invisa � tratamento em 3 passos f�ceis");
		validarTexto(By.xpath("(//h2)[8]"), "12 milh�es de sorrisos transformados e contando5");
		validarTexto(By.xpath("(//h2)[9]"), "Saiba se o Invisalign � indicado para voc�!");
		validarTexto(By.xpath("(//h2)[10]"), "Seu novo sorriso come�a aqui");
		validarTexto(By.xpath("(//h2)[11]"), "Sinta-se bem com a sua escolha");
	}

}
