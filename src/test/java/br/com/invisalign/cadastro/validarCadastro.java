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
	public void test() throws InterruptedException {
		
		click(By.xpath("//*[text()='Continuar']"));
		Thread.sleep(2000);
		digitar("Josivaldo", By.name("firstName"));
		getAtributo(By.name("firstName"), "Josivaldo");
		digitar("Silva", By.name("lastName"));
		getAtributo(By.name("firstName"), "Silva");
		digitar("7778657", By.name("invisalignID"));
		getAtributo(By.name("firstName"), "7778657");
		digitar("automacaotestes420@gmail.com", By.name("email"));
		getAtributo(By.name("firstName"), "automacaotestes420@gmail.com");
		digitar("teste@123", By.name("password"));
		getAtributo(By.name("firstName"), "teste@123");
		
		//click(By.id("form-group-terms-check"));
		//validarCheckBox(By.id("form-group-terms-check"));
		Thread.sleep(2000);
		driver.findElement(By.name("infoCheck")).click();
		//validarCheckBox(By.name("infoCheck"));
		
		
		
		
		
		
		

		

	}

}
