package br.com.invisalign2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.invisalign.core.Metodos;

public class validarMenus extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Menus() throws InterruptedException {

		Actions acao = new Actions(driver);

		WebElement portal_do_paciente = driver.findElement(By.xpath("(//a[@rel='noopener'])[1]"));
		assertTrue(portal_do_paciente.isDisplayed());
		assertEquals("Portal do paciente|", portal_do_paciente.getText());
		portal_do_paciente.click();
		alternarAba1();
		assertEquals("https://my.invisalign.com.br/login", getUrl());
		fecharAba();
		alternarAba0();

		WebElement portal_para_doutores = driver.findElement(By.xpath("(//a[@rel='noopener'])[2]"));
		assertTrue(portal_para_doutores.isDisplayed());
		assertEquals("Para doutores", portal_para_doutores.getText());
		portal_para_doutores.click();
		alternarAba1();
		assertEquals("https://www.doutor.invisalign.com.br/pt", getUrl());
		fecharAba();
		alternarAba0();

		WebElement invisalign_para_mim = driver.findElement(By.xpath("(//a[@class='sa-link'])[1]"));
		assertTrue(invisalign_para_mim.isDisplayed());
		assertEquals("O Invisalign é Indicado para mim?", invisalign_para_mim.getText());
		invisalign_para_mim.click();
		assertEquals("https://www.invisalign.com.br/como-usar/avaliacao", getUrl());
		click(By.xpath("//img[@alt='Home']"));

		WebElement encontre_um_ortodontista = driver.findElement(By.xpath("//a[@class='fad-link']"));
		assertTrue(encontre_um_ortodontista.isDisplayed());
		assertEquals("Encontre um ortodontista:", encontre_um_ortodontista.getText());
		encontre_um_ortodontista.click();
		assertEquals("https://www.invisalign.com.br/como-usar/encontre-dentista", getUrl());
		click(By.xpath("//img[@alt='Home']"));

		WebElement como_funciona_o_invisalign = driver
				.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[1]"));
		assertTrue(como_funciona_o_invisalign.isDisplayed());
		assertEquals("Como funciona o Invisalign", como_funciona_o_invisalign.getText());
		como_funciona_o_invisalign.click();
		assertEquals(urlPadrao + "como-funciona", getUrl());
		click(By.xpath("//img[@alt='Home']"));

		scroll(9000);
		WebElement como_funciona_o_invisalign_rodape = driver
				.findElement(By.xpath("(//a[@class='footer-link-header footerclick_track '])[1]"));
		assertTrue(como_funciona_o_invisalign_rodape.isDisplayed());
		assertEquals("Como funciona o Invisalign", como_funciona_o_invisalign_rodape.getText());
		como_funciona_o_invisalign_rodape.click();
		assertEquals(urlPadrao + "como-funciona", getUrl());
		click(By.xpath("//img[@alt='Home']"));

		WebElement qual_a_diferenca_do_invisalign = driver
				.findElement(By.xpath("(//div[@class='dropdown-heading'])[2]"));
		validarElementoVisivel(By.xpath("(//div[@class='dropdown-heading'])[2]"));
		acao.moveToElement(qual_a_diferenca_do_invisalign).build().perform();
		validarElementoVisivel(By.xpath("//a[text()='A diferença do Invisalign']"));
		validarElementoVisivel(By.xpath("//a[@class='class_itero_scanner_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_clincheck_software_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_smart_track_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_smart_force_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_mandibular_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("(//div[@class='dropdown-heading'])[3]"));

		scroll(9000);
		validarElementoVisivel(By.xpath("(//a[@class='footer-link-header footerclick_track '])[2]"));
		validarTexto(By.xpath("(//a[@class='footer-link-header footerclick_track '])[2]"),
				"Qual a diferença do Invisalign?");
		click(By.xpath("(//a[@class='footer-link-header footerclick_track '])[2]"));
		assertEquals(urlPadrao + "a-diferenca-de-Invisalign/adolescente", getUrl());

		validarTexto(By.xpath("(//div[@class='dropdown-heading'])[3]"), "Casos tratáveis");
		click(By.xpath("(//div[@class='dropdown-heading'])[3]"));
		assertEquals(urlPadrao + "tratamentos", getUrl());
		HomePage();

		scroll(9000);
		validarTexto(By.xpath("(//a[@class='footer-link-header footerclick_track footer-no-child'])[1]"),
				"Casos tratáveis");
		click(By.xpath("(//a[@class='footer-link-header footerclick_track footer-no-child'])[1]"));
		assertEquals(urlPadrao + "tratamentos", getUrl());
		HomePage();

		validarElementoVisivel(By.xpath("(//div[@class='dropdown-heading'])[4]"));
		validarTexto(By.xpath("(//div[@class='dropdown-heading'])[4]"), "Custo do Invisalign");
		click(By.xpath("(//div[@class='dropdown-heading'])[4]"));
		assertEquals(urlPadrao + "invisalign-custo", getUrl());
		HomePage();

		scroll(9000);
		validarElementoVisivel(By.xpath("(//a[@class='footer-link-header footerclick_track footer-no-child'])[2]"));
		validarTexto(By.xpath("(//a[@class='footer-link-header footerclick_track footer-no-child'])[2]"),
				"Custo do Invisalign");
		click(By.xpath("(//a[@class='footer-link-header footerclick_track footer-no-child'])[2]"));
		assertEquals(urlPadrao + "invisalign-custo", getUrl());
		HomePage();

		WebElement use_invisalign = driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[5]"));
		validarElementoVisivel(By.xpath("(//a[@class='dropdown-toggle nav-link'])[5]"));
		validarTexto(By.xpath("(//a[@class='dropdown-toggle nav-link'])[5]"), "Use Invisalign");
		acao.moveToElement(use_invisalign).build().perform();
		validarElementoVisivel(By.xpath("//a[@class='class_get_inv dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_request_appt_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_find_a_doctor_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_take_smile_assessment_sub_menu dropdown-item']"));
		validarElementoVisivel(By.xpath("//a[@class='class_contact_us_sub_menu dropdown-item']"));
		
	}

}
