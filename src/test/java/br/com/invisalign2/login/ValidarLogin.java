package br.com.invisalign2.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarLogin extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlMy + "login");
	}

	@After
	public void tearDown() throws Exception {
		
		//fechar();
	}

	@Test
	public void validar_Login_Sucesso() {
		
		digitar("automacaotestes420@gmail.com", By.name("username"));
		digitar("teste@123", By.name("password"));
		click(By.name("remember_me"));
		
		

		
	}

}
