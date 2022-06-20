package br.com.invisalign.tratamentos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarImagens extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao + "tratamentos");
		click(By.id("epdsubmit"));
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();

	}

	@Test
	public void Validar_Imagens() throws InterruptedException {
		
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[1]"));
		

		scroll(900);
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[1]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[1]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[2]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[2]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[2]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[3]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[3]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[3]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[4]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[4]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[4]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[5]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[5]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[5]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[6]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[6]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[6]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[7]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[7]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[7]"));
		
		Thread.sleep(500);
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[8]"));
		validarElementoVisivel(By.xpath("(//img[@alt='invisalign'])[8]"));
		validarElementoVisivel(By.xpath("(//div[@class='treatmentCarousel teethTypeCarousel text-fontsize homepage-hero-section treatable-case left rightTextAlign'])[8]"));
		
		scroll(900);
		validarElementoVisivel(By.xpath("//div[@class='alignerTextBottom homepage-hero-section hide-bkg-mobile margin-bottom-60 left rightTextAlign']"));
		
		scroll(2000);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[1]"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		
		Thread.sleep(500);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[2]"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		Thread.sleep(500);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[3]"));
		
		
		scroll(1300);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[4]"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[5]"));
		
		Thread.sleep(500);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[5]"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[6]"));
		
		Thread.sleep(500);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[6]"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[7]"));
		
		Thread.sleep(500);
		validarElementoVisivel(By.xpath("(//video[@class='videoCarousel1'])[7]"));
		
		scroll(800);
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[2]"));
	}

}
