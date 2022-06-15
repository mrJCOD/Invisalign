package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarImagens extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Imagens_Estao_Visiveis() {

		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[1]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[2]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[3]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[4]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[5]"));
		validarElementoVisivel(By.xpath("(//img[@class='fixed-image-img desktop'])"));
		validarElementoVisivel(By.xpath("//div[@class='carousel-inner']"));
		validarElementoVisivel(By.xpath("//img[@alt='Home']"));
		validarElementoVisivel(By.xpath("//div[@class='sa-background-image-wrapper']"));
	}

}
