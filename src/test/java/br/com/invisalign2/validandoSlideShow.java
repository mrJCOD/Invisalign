package br.com.invisalign2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validandoSlideShow extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Imagens_Slide_Show() throws InterruptedException {

		scroll(3000);
		validarElementoVisivel(By.xpath("//img[@alt='Group 161']"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		Thread.sleep(2000);
		validarElementoVisivel(By.xpath("//img[@alt='step 2 easy step carousel']"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		validarElementoVisivel(By.xpath("//img[@alt='Group 6 1']"));

	}

	@Test
	public void Validar_Textos_Slide_Show() {

		scroll(3000);
		validarTexto(By.xpath("(//h2)[7]"), "Passo 1");
		validarTexto(By.xpath("(//h3)[4]"), "Passe em consulta e veja uma simulação do seu novo sorriso");
		validarTexto(By.xpath("(//h4)[2]"),
				"Usando o scanner iTero Element®, seu ortodontista poderá digitalizar o seu sorriso em 3D de forma rápida e precisa3 e poderá fazer um mapeamento do seu tratamento personalizado especialmente para você.");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		validarTexto(By.xpath("(//h2)[7]"), "Passo 2");
		validarTexto(By.xpath("(//h3)[4]"), "Comece a transformar seu sorriso desde o primeiro alinhador");
		validarTexto(By.xpath("(//h4)[2]"),
				"Este é um momento chave no sucesso do seu tratamento. Seu ortodontista vai garantir que seus alinhadores se adaptem perfeitamente aos seus dentes, responderá suas dúvidas e explicará o que esperar do seu tratamento.");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		validarTexto(By.xpath("(//h2)[7]"), "Passo 3");
		validarTexto(By.xpath("(//h3)[4]"), "Mantenha seu mais novo sorriso lindo");
		validarTexto(By.xpath("(//h4)[2]"),
				"Você transformou seu sorriso com o sistema de alinhadores mais avançado do mundo. Agora é fácil manter o sorriso que você conquistou. Nossa contenção Vivera é feita sob medida e é 30% mais resistente que outras contenções.4");

	}

	@Test
	public void Validar_botao_Slide_Show() {

		scroll(3000);
		validarElementoVisivel(By.xpath("(//a[@class='btn-blue'])[4]"));
		validarTexto(By.xpath("(//a[@class='btn-blue'])[4]"), "Saiba mais sobre o Scanner iTero®");
		click(By.xpath("(//a[@class='btn-blue'])[4]"));
		assertEquals(urlPadrao + "vantagens/itero-scanner-3d", getUrl());

		HomePage();
		scroll(3000);
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));

		validarElementoVisivel(By.xpath("(//a[@class='btn-blue'])[4]"));
		validarTexto(By.xpath("(//a[@class='btn-blue'])[4]"), "Saiba mais sobre o material SmartTrack®");
		click(By.xpath("(//a[@class='btn-blue'])[4]"));
		assertEquals(urlPadrao + "vantagens/smarttrack-material", getUrl());

	}

}
