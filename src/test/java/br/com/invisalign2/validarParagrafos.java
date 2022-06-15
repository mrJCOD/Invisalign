package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarParagrafos extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Paragrafos() {

		validarTexto(By.xpath("(//a[@rel='nofollow'])[1]"), "Alinha os dentes de forma mais previs�vel e confort�vel1");
		validarTexto(By.xpath("(//a[@rel='nofollow'])[2]"), "Consultas com ortodontistas especializados");
		validarTexto(By.xpath("(//span)[10]"),
				"O valor do tratamento ortod�ntico com Invisalign � determinado pelas necessidades do seu caso, como o tipo de corre��o que ser� feita, a complexidade e a dura��o do tratamento. Somente o ortodontista, ap�s uma avalia��o, poder� informar o valor do tratamento com Invisalign.");
		validarTexto(By.xpath("(//span)[11]"),
				"Voc� deve entrar em contato com um ortodontista credenciado Invisalign para receber um or�amento estimado antes de iniciar o tratamento. N�s podemos te ajudar a encontrar um aqui.");
		validarTexto(By.xpath("(//span)[12]"),
				"Conhe�a as parcerias que v�o ajudar voc� a transformar o seu sorriso com Invisalign�");
		validarTexto(By.xpath("(//p)[6]"),
				"Descubra as empresas participantes e encontre um ortodontista para saber sobre valores e condi��es de pagamento");

	}

}
