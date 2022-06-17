package br.com.invisalign.avaliacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarH1 extends Metodos {

	@Before
	public void setUp() {

		iniciarTeste("chrome", urlPadrao + "como-usar/avaliacao");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Validar_Textos() {

		// titulo
		validarTexto(By.xpath("(//h1)[2]"), "Invisalign pode ser indicado pra voc�?");
		validarElementoVisivel(By.xpath("(//h1)[2]"));

		// subtitulo
		validarTexto(By.xpath("//*[text()='Queremos saber mais sobre voc�. ']"), "Queremos saber mais sobre voc�.");
		validarElementoVisivel(By.xpath("//*[text()='Queremos saber mais sobre voc�. ']"));
		
		//1- Eu sou: * (selecione uma op��o):
		validarTexto(By.xpath("(//b)[1]"), "Eu sou: * (selecione uma op��o):");
		validarElementoVisivel(By.xpath("(//b)[1]"));
		
		//2 Qual op��o descreve melhor o seu status?*
		validarTexto(By.xpath("(//b)[2]"), "Qual op��o descreve melhor o seu status?*");
		validarElementoVisivel(By.xpath("(//b)[2]"));
		
		//3 Qual � sua maior preocupa��o quanto ao tratamento?*
		validarTexto(By.xpath("(//b)[3]"), "Qual � sua maior preocupa��o quanto ao tratamento?*");
		validarElementoVisivel(By.xpath("(//b)[3]"));
		
		//4 Clique na foto que melhor representa o seu sorriso:*
		validarTexto(By.xpath("(//b)[4]"), "Clique na foto que melhor representa o seu sorriso:*");
		validarElementoVisivel(By.xpath("(//b)[4]"));
		
		//5 Preencha suas informa��es a seguir e um ortodontista pr�ximo a voc� entrar� em contato em breve:
		validarTexto(By.xpath("(//b)[5]"), "Preencha suas informa��es a seguir e um ortodontista pr�ximo a voc� entrar� em contato em breve:");
		validarElementoVisivel(By.xpath("(//b)[5]"));
		
		

	}

}
