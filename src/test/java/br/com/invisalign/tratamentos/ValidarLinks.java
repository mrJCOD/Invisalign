package br.com.invisalign.tratamentos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarLinks extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao + "tratamentos");
	}

	@After
	public void tearDown() throws Exception {
		fechar();
	}

	@Test
	public void Validar_Links() {
		
		scroll(900);
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[1]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[2]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[2]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[3]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[3]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[4]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[4]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[5]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[5]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[6]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[6]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[7]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[7]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[8]"));
		
		validarAtributo(By.xpath("(//div[@class='inner-wrapper']/div/div/p/a)[8]"), "href", "https://www.invisalign.com.br/como-usar/encontre-dentista");
	
	}

}
