package br.com.invisalign.avaliacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarSelect extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao + "como-usar/avaliacao");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ValidandoSelect() {
		select(By.name("radioconcern"), "escolha", "", 0);
		select(By.name("radioconcern"), "Disponibilidade do Ortodontista", "Time", 1);
		select(By.name("radioconcern"), "Valor do tratamento", "Cost", 2);
		select(By.name("radioconcern"), "É adequado para o meu caso?", "Suitability", 3);
		select(By.name("radioconcern"), "Funciona para arrumar a mordida?", "Will it work?", 4);
		
		validarTexto(By.xpath("(//select[@name='radioconcern']/option)[1]"), "escolha");
		validarTexto(By.xpath("(//select[@name='radioconcern']/option)[2]"), "Disponibilidade do Ortodontista");
		validarTexto(By.xpath("(//select[@name='radioconcern']/option)[3]"), "Valor do tratamento");
		validarTexto(By.xpath("(//select[@name='radioconcern']/option)[4]"), "É adequado para o meu caso?");
		validarTexto(By.xpath("(//select[@name='radioconcern']/option)[5]"), "Funciona para arrumar a mordida?");

	}

}
