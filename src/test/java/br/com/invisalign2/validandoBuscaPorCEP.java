package br.com.invisalign2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validandoBuscaPorCEP extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {

		fechar();
	}

	@Test
	public void validar_campo_cep() {

		validarAtributo(By.xpath("//input[@type='tel']"), "placeholder", "CEP/Cidade");
		digitar("02322290", By.xpath("//input[@type='tel']"));
		validarAtributo(By.xpath("//input[@type='tel']"), "value", "02322290");

	}

	@Test
	public void encontre_um_ortodontista_campo_vazio() {

		digitar("", By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		String msgAlerta = pegarTextoAlerta();
		assertEquals("CEP inválido.", msgAlerta);
		aceitarAlerta();

	}

	@Test
	public void encontre_um_ortodontista_cep_inexistente() {

		String cep = "5555555";
		digitar(cep, By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		assertEquals("https://www.invisalign.com.br/como-usar/encontre-dentista?QuerySource=TR2&loc=" + cep, getUrl());
		validarTexto(By.xpath("(//p[@class='dl-error-msg'])[1]"), "Endereço não reconhecido.");

	}

	@Test
	public void encontre_um_ortodontista_cep_valido() {

		String cep = "02322290";
		digitar(cep, By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		assertEquals(
				"https://www.invisalign.com.br/como-usar/encontre-dentista?QuerySource=TR2&loc=02322290#v=results&z=02322&cy=br&s=e",
				getUrl());
		validarElementoVisivel(By.xpath("//div[@role='region']"));

	}

}
