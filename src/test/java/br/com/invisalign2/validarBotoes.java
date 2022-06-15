package br.com.invisalign2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarBotoes extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}
	
	@Test
	public void Validar_Botoes() throws InterruptedException {
		
		validarTexto(By.xpath("(//a[@class='btn-blue'])[1]"), "É indicado pra mim?");
		click(By.xpath("(//a[@class='btn-blue'])[1]"));
		assertEquals(urlPadrao + "como-usar/avaliacao", getUrl());
		HomePage();

		scroll(800);
		validarTexto(By.xpath("//a[@data-slug='invisalign-custo']"), "Saiba mais");
		click(By.xpath("(//div[@class='get-start']/a)[1]"));
		Thread.sleep(2000);
		assertEquals(urlPadrao + "invisalign-custo", getUrl());
		HomePage();

		scroll(1200);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[2]"), "Como Invisalign funciona");
		click(By.xpath("(//a[@class='btn-blue'])[2]"));
		Thread.sleep(2000);
		assertEquals(urlPadrao + "como-funciona", getUrl());
		HomePage();

		scroll(1600);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[3]"), "Encontre um Parceiro");
		click(By.xpath("(//a[@data-telium-event='homepage_how_invisalign_works'])[2]"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "parcerias", getUrl());
		HomePage();
		
		scroll(1900);
		validarTexto(By.xpath("//a[@class='btn-white']"), "Solicite uma consulta");
		click(By.xpath("//a[@class='btn-white']"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "como-usar/marcar-consulta", getUrl());
		HomePage();
		
		scroll(2100);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[5]"), "Encontre um ortodontista");
		click(By.xpath("(//a[@class='btn-blue'])[5]"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "como-usar/encontre-dentista", getUrl());
		HomePage();
		
		Thread.sleep(2000);
		scroll(500);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[6]"), "Encontre um ortodontista");
		click(By.xpath("(//a[@class='btn-blue'])[6]"));
		
		assertEquals(urlPadrao + "como-usar/encontre-dentista", getUrl());

	}

}
