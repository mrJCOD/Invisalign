package br.com.invisalign.cadastro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class teste extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", "https://www.phptravels.net/login");
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
