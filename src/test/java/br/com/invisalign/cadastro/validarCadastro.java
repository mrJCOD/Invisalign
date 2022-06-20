package br.com.invisalign.cadastro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarCadastro extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlMy + "register");
	}

	@After
	public void tearDown() throws Exception {
		
		//fechar();
	}

	@Test
	public void validar_Inputs() throws InterruptedException {
		
		click(By.xpath("//*[text()='Continuar']"));
		
		Thread.sleep(2000);
		digitar("Josivaldo", By.name("firstName"));
		validarAtributo(By.name("firstName"), "value", "Josivaldo");
		digitar("Silva", By.name("lastName"));
		validarAtributo(By.name("lastName"), "value", "Silva");
		digitar("7864536", By.name("invisalignID"));
		validarAtributo(By.name("invisalignID"), "value", "7864536");
		digitar("automacaotestes420@gmail.com", By.name("email"));
		validarAtributo(By.name("email"), "value", "automacaotestes420@gmail.com");
		digitar("josivaldo123*", By.name("password"));
		validarAtributo(By.name("password"), "value", "josivaldo123*");
		
		
	}

}
