package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validandoComeceAgora extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Botao_Comece_Agora() {
		
		scroll(4200);
		click(By.xpath("//*[text()='Comece agora']"));
		validarElementoVisivel(By.xpath("(//h2)[9]"));
		validarTexto(By.xpath("(//h2)[9]"), "Quer saber mais sobre o tratamento Invisalign?");
		validarTexto(By.xpath("(//h4)[4]"), "Sem problemas, nos conte um pouco mais sobre você.");
		validarTexto(By.xpath("//p[@class='active']"), "01");
		validarTexto(By.xpath("(//div[@class='inner-wrap']/span)[2]"), "02");
		
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_teen']"));
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_parent']"));
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_adult']"));
		
	}

}
