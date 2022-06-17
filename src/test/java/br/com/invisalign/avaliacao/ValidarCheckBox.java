package br.com.invisalign.avaliacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarCheckBox extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao + "como-usar/avaliacao");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		//checkbox adolescente
		click(By.xpath("(//label[@class='answer-check'])[1]"));
		validarCheckBox(By.id("radio1002"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[1]"), "adolescente");
		
		//checkbox adulto
		click(By.xpath("(//label[@class='answer-check'])[2]"));
		validarCheckBox(By.id("radio1000"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[2]"), "adulto");
		
		//checkbox pai/mae
		click(By.xpath("(//label[@class='answer-check'])[3]"));
		validarCheckBox(By.id("radio1001"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[3]"), "pai/mãe");
		
		//checkbox estou pesquisando no momento
		click(By.xpath("(//label[@class='answer-check'])[4]"));
		validarCheckBox(By.id("radioI've just started my research"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[4]"), "estou pesquisando no momento");
		
		//checkbox estou pronto para marcar uma consulta
		click(By.xpath("(//label[@class='answer-check'])[5]"));
		validarCheckBox(By.id("radioI'd like to set up an appointment for a consultation"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[5]"), "estou pronto para marcar uma consulta");
									
		//checkbox eu marquei uma consulta
		click(By.xpath("(//label[@class='answer-check'])[6]"));
		validarCheckBox(By.id("radioI've made an appointment for a consultation"));
		validarTexto(By.xpath("(//label[@class='answer-check'])[6]"), "eu marquei uma consulta");
		
		//checkbox alinhamento dos dentes
		click(By.xpath("//label[@for='radioGenerally straighter teeth']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[1]"));
		validarTexto(By.xpath("(//span)[9]"), "alinhamento dos dentes");
		
		//checkbox sobremordida
		click(By.xpath("//label[@class='image-check sa-teeth-img logo-radioOverbite']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[2]"));
		validarTexto(By.xpath("(//span)[10]"), "sobremordida");
		
		//checkbox prognatismo
		click(By.xpath("//label[@for='radioUnderbite']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[3]"));
		validarTexto(By.xpath("(//span)[11]"), "prognatismo");
		
		//checkbox mordida cruzada
		click(By.xpath("//label[@for='radioCrossbite']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[4]"));
		validarTexto(By.xpath("(//span)[12]"), "mordida cruzada");
		
		//checkbox diastema
		click(By.xpath("//label[@for='radiogappy']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[5]"));
		validarTexto(By.xpath("(//span)[13]"), "diastema");

		//checkbox mordida aberta
		click(By.xpath("//label[@for='radioOpen Bite']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[6]"));
		validarTexto(By.xpath("(//span)[14]"), "mordida aberta");
		
		//checkbox dentes apinhados
		click(By.xpath("//label[@for='radioFix a crowding issue']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[7]"));
		validarTexto(By.xpath("(//span)[15]"), "dentes apinhados");
		
		//checkbox denticao mista
		click(By.xpath("//label[@for='radioInvisalign First-Phase 1']"));
		validarCheckBox(By.xpath("(//input[@name='radio_teethtype'])[8]"));
		validarTexto(By.xpath("(//span)[16]"), "Dentição mista (presença de dentes de leite e permanentes)");
		
		
		

		
	
		
		

	}

}
