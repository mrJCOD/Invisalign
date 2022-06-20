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

public class PageHome extends Metodos {
	
	String urlPadrao = "https://www.invisalign.com.br/";

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {

		fechar();
	}

	@Test
	public void Validar_Imagens_Estao_Visiveis() {

		
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[1]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[2]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[3]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[4]"));
		validarElementoVisivel(By.xpath("(//img[@class='for-desktop'])[5]"));
		validarElementoVisivel(By.xpath("(//img[@class='fixed-image-img desktop'])"));
		validarElementoVisivel(By.xpath("//div[@class='carousel-inner']"));
		validarElementoVisivel(By.xpath("//img[@alt='Home']"));
	}

	@Test
	public void Validar_h1() {
		
		validarTexto(By.xpath("//h1"), "Por que escolher o tratamento Invisalign®?");

	}

	@Test
	public void Validar_h2() {
		
		validarTexto(By.xpath("(//h2)[1]"), "invisa é a melhor escolha.");



		validarTexto(By.xpath("(//h2)[2]"), "Quanto custa Invisalign?");
		


		validarTexto(By.xpath("(//h2)[3]"), "Quanto tempo dura o tratamento com Invisalign?");
		


		validarTexto(By.xpath("(//h2)[4]"), "Conheça nossas parcerias");
		


		validarTexto(By.xpath("//div[@class='section-heading col-12']"), "invisa é tratamento em 3 passos fáceis");
		
		String h2_5 = pegarTexto(By.xpath("//div[@class='section-heading col-12']"));
		String h2_5_Esperado = "invisa é tratamento em 3 passos fáceis";
		assertEquals(h2_5_Esperado, h2_5);

		validarTexto(By.xpath("(//h2)[8]"), "12 milhões de sorrisos transformados e contando5");
		
		String h2_6 = pegarTexto(By.xpath("(//h2)[8]"));
		String h2_6_Esperado = "12 milhões de sorrisos transformados e contando5";
		assertEquals(h2_6_Esperado, h2_6);

		validarTexto(By.xpath("(//h2)[9]"), "Saiba se o Invisalign é indicado para você!");
		
		String h2_7 = pegarTexto(By.xpath("(//h2)[9]"));
		String h2_7_Esperado = "Saiba se o Invisalign é indicado para você!";
		assertEquals(h2_7_Esperado, h2_7);

		validarTexto(By.xpath("(//h2)[10]"), "Seu novo sorriso começa aqui");
		
		String h2_8 = pegarTexto(By.xpath("(//h2)[10]"));
		String h2_8_Esperado = "Seu novo sorriso começa aqui";
		assertEquals(h2_8_Esperado, h2_8);

		validarTexto(By.xpath("(//h2)[11]"), "Sinta-se bem com a sua escolha");
		
		String h2_9 = pegarTexto(By.xpath("(//h2)[11]"));
		String h2_9_Esperado = "Sinta-se bem com a sua escolha";
		assertEquals(h2_9_Esperado, h2_9);

	}

	@Test
	public void Validar_h3() {

		String h3_1 = pegarTexto(By.xpath("(//h3)[1]"));
		String h3_1_Esperado = "invisa é investir em si mesmo.";
		assertEquals(h3_1_Esperado, h3_1);

		String h3_2 = pegarTexto(By.xpath("(//h3)[3]"));
		String h3_2_Esperado = "invisa é velocidade.";
		assertEquals(h3_2_Esperado, h3_2);

		String h3_3 = pegarTexto(By.xpath("(//h3)[6]"));
		String h3_3_Esperado = "O tratamento Invisalign é indicado para mim?";
		assertEquals(h3_3_Esperado, h3_3);

	}

	@Test
	public void Validar_h4() {

		String h4_1 = pegarTexto(By.xpath("(//h4)[1]"));
		String h4_1_Esperado = "Você poderá ver resultados em poucas semanas2";
		assertEquals(h4_1_Esperado, h4_1);

		String h4_2 = pegarTexto(By.xpath("(//h4)[4]"));
		String h4_2_Esperado = "Se perguntando se Invisalign é indicado para você?";
		assertEquals(h4_2_Esperado, h4_2);

		String h4_3 = pegarTexto(By.xpath("(//h4)[5]"));
		String h4_3_Esperado = "Nós podemos ajudar";
		assertEquals(h4_3_Esperado, h4_3);

		String h4_4 = pegarTexto(By.xpath("(//h4)[6]"));
		String h4_4_Esperado = "invisa é ter um ortodontista especializado perto de você.";
		assertEquals(h4_4_Esperado, h4_4);

		String h4_5 = pegarTexto(By.xpath("(//h4)[7]"));
		String h4_5_Esperado = "invisa é único";
		assertEquals(h4_5_Esperado, h4_5);

	}

	@Test
	public void Validar_Paragrafos() {

		String p1 = pegarTexto(By.xpath("(//a[@rel='nofollow'])[1]"));
		String p1Esperado = "Alinha os dentes de forma mais previsível e confortável1";
		assertEquals(p1Esperado, p1);

		String p2 = pegarTexto(By.xpath("(//a[@rel='nofollow'])[2]"));
		String p2Esperado = "Consultas com ortodontistas especializados";
		assertEquals(p2Esperado, p2);

		String p3 = pegarTexto(By.xpath("(//span)[10]"));
		String p3Esperado = "O valor do tratamento ortodôntico com Invisalign é determinado pelas necessidades do seu caso, como o tipo de correção que será feita, a complexidade e a duração do tratamento. Somente o ortodontista, após uma avaliação, poderá informar o valor do tratamento com Invisalign.";
		assertEquals(p3Esperado, p3);

		String p4 = pegarTexto(By.xpath("(//span)[11]"));
		String p4Esperado = "Você deve entrar em contato com um ortodontista credenciado Invisalign para receber um orçamento estimado antes de iniciar o tratamento. Nós podemos te ajudar a encontrar um aqui.";
		assertEquals(p4Esperado, p4);

		String p5 = pegarTexto(By.xpath("(//span)[12]"));
		String p5Esperado = "Conheça as parcerias que vão ajudar você a transformar o seu sorriso com Invisalign®";
		assertEquals(p5Esperado, p5);

		String p6 = pegarTexto(By.xpath("(//p)[6]"));
		String p6Esperado = "Descubra as empresas participantes e encontre um ortodontista para saber sobre valores e condições de pagamento";
		assertEquals(p6Esperado, p6);

	}

	@Test
	public void Validar_Texto_Rodape() {

		String texto1 = pegarTexto(By.xpath("(//ol/li)[4]"));
		String texto1Esperado = "Comparado com os alinhadores padrão de material com única camada de 0,30 polegadas. Dados arquivados na Align Technology Inc.";
		assertEquals(texto1Esperado, texto1);

		String texto2 = pegarTexto(By.xpath("(//ol/li)[5]"));
		String texto2Esperado = "A duração do tratamento varia de acordo com as necessidades individuais do paciente e deve ser determinada pelo ortodontista.";
		assertEquals(texto2Esperado, texto2);

		String texto3 = pegarTexto(By.xpath("(//ol/li)[6]"));
		String texto3Esperado = "Alguns ortodontistas ainda fazem moldagem física. Esses moldes são digitalizados pelos técnicos da Invisalign para criar a imagem 3D a ser usada no software ClinCheck® e na fabricação dos alinhadores.";
		assertEquals(texto3Esperado, texto3);

		String texto4 = pegarTexto(By.xpath("(//ol/li)[7]"));
		String texto4Esperado = "Dados arquivados na Align Technology Inc., desde 12 de outubro de 2017";
		assertEquals(texto4Esperado, texto4);

		String texto5 = pegarTexto(By.xpath("(//ol/li)[4]"));
		String texto5Esperado = "Dados arquivados na Align Technology Inc., desde 2 de Fevereiro, 2022.";
		assertEquals(texto5Esperado, texto5);

	}

	@Test
	public void Validar_Botoes() {

		String textoBotao1 = pegarTexto(By.xpath("(//a[@class='sa-link'])[1]"));
		String textoBotao1Esperado = "O Invisalign é Indicado para mim?";
		assertEquals(textoBotao1Esperado, textoBotao1);
		click(By.xpath("(//a[@class='sa-link'])[1]"));
		String urlAtualBotao1 = driver.getCurrentUrl();
		assertEquals("https://www.invisalign.com.br/como-usar/avaliacao", urlAtualBotao1);
		click(By.xpath("//img[@alt='Home']"));

		String textoBotao2 = pegarTexto(By.xpath("//a[@data-slug='invisalign-custo']"));
		String textoBotao2Esperado = "Saiba mais";
		assertEquals(textoBotao2Esperado, textoBotao2);
		click(By.xpath("//a[@data-slug='invisalign-custo']"));
		String urlAtualBotao2 = driver.getCurrentUrl();
		assertEquals("https://www.invisalign.com.br/invisalign-custo", urlAtualBotao2);

		String textoBotao3 = pegarTexto(By.xpath("(//a[@class='btn-blue'])[2]"));
		String textoBotao3Esperado = "Como Invisalign funciona";
		assertEquals(textoBotao3Esperado, textoBotao3);
		click(By.xpath("(//a[@class='btn-blue'])[2]"));
		String urlAtualBotao3 = driver.getCurrentUrl();
		assertEquals("https://www.invisalign.com.br/como-funciona", urlAtualBotao3);

		String textoBotao4 = pegarTexto(By.xpath("(//a[@class='btn-blue'])[3]"));
		String textoBotao4Esperado = "Encontre um Parceiro";
		assertEquals(textoBotao4Esperado, textoBotao4);
		click(By.xpath("(//a[@class='btn-blue'])[3]"));
		String urlAtualBotao4 = driver.getCurrentUrl();
		assertEquals("https://www.invisalign.com.br/parcerias", urlAtualBotao4);

	}

	@Test
	public void Validar_Menus() {

		WebElement portal_do_paciente = driver.findElement(By.xpath("(//a[@rel='noopener'])[1]"));
		assertTrue(portal_do_paciente.isDisplayed());
		assertEquals("Portal do paciente|", portal_do_paciente.getText());
		portal_do_paciente.click();
		alternarAba(1);
		assertEquals("https://my.invisalign.com.br/login", driver.getCurrentUrl());
		fecharAba();
		alternarAba(0);

		WebElement portal_para_doutores = driver.findElement(By.xpath("(//a[@rel='noopener'])[2]"));
		assertTrue(portal_para_doutores.isDisplayed());
		assertEquals("Para doutores", portal_para_doutores.getText());
		portal_para_doutores.click();
		alternarAba(1);
		assertEquals("https://www.doutor.invisalign.com.br/pt", driver.getCurrentUrl());
		fecharAba();
		alternarAba(0);

		WebElement invisalign_para_mim = driver.findElement(By.xpath("(//a[@class='sa-link'])[1]"));
		assertTrue(invisalign_para_mim.isDisplayed());
		assertEquals("O Invisalign é Indicado para mim?", invisalign_para_mim.getText());
		invisalign_para_mim.click();
		assertEquals("https://www.invisalign.com.br/como-usar/avaliacao", driver.getCurrentUrl());
		click(By.xpath("//img[@alt='Home']"));

		WebElement encontre_um_ortodontista = driver.findElement(By.xpath("//a[@class='fad-link']"));
		assertTrue(encontre_um_ortodontista.isDisplayed());
		assertEquals("Encontre um ortodontista:", encontre_um_ortodontista.getText());
		encontre_um_ortodontista.click();
		assertEquals("https://www.invisalign.com.br/como-usar/encontre-dentista", driver.getCurrentUrl());
		click(By.xpath("//img[@alt='Home']"));
		
		WebElement como_funciona_o_invisalign = driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[1]"));
		assertTrue(como_funciona_o_invisalign.isDisplayed());
		assertEquals("Como funciona o Invisalign", como_funciona_o_invisalign.getText());
		como_funciona_o_invisalign.click();
		assertEquals(urlPadrao + "como-funciona", driver.getCurrentUrl());
		click(By.xpath("//img[@alt='Home']")); 
		
		
		WebElement qual_a_diferenca_do_invisalign = driver.findElement(By.xpath("(//div[@class='dropdown-heading'])[2]"));
		assertTrue(qual_a_diferenca_do_invisalign.isDisplayed());
		String textoElemento = qual_a_diferenca_do_invisalign.getText();
		assertEquals("Qual a diferença do Invisalign?", textoElemento);
		Actions acao = new Actions(driver);
		acao.moveToElement(qual_a_diferenca_do_invisalign).build().perform();
		boolean elemento1Visivel = driver.findElement(By.xpath("//a[text()='A diferença do Invisalign']")).isDisplayed();
		boolean elemento2Visivel = driver.findElement(By.xpath("//a[@class='class_itero_scanner_sub_menu dropdown-item']")).isDisplayed();
		boolean elemento3Visivel = driver.findElement(By.xpath("//a[@class='class_clincheck_software_sub_menu dropdown-item']")).isDisplayed();
		boolean elemento4Visivel = driver.findElement(By.xpath("//a[@class='class_smart_track_sub_menu dropdown-item']")).isDisplayed();
		boolean elemento5Visivel = driver.findElement(By.xpath("//a[@class='class_smart_force_sub_menu dropdown-item']")).isDisplayed();
		boolean elemento6Visivel = driver.findElement(By.xpath("//a[@class='class_mandibular_sub_menu dropdown-item']")).isDisplayed();
		assertTrue(elemento1Visivel);
		assertTrue(elemento2Visivel);
		assertTrue(elemento3Visivel);
		assertTrue(elemento4Visivel);
		assertTrue(elemento5Visivel);
		assertTrue(elemento6Visivel);
		
		WebElement casos_trataveis = driver.findElement(By.xpath("(//div[@class='dropdown-heading'])[3]"));
		assertTrue(casos_trataveis.isDisplayed());
		assertEquals("Casos tratáveis", casos_trataveis.getText());
		casos_trataveis.click();
		assertEquals(urlPadrao + "tratamentos", driver.getCurrentUrl());
		click(By.xpath("//img[@alt='Home']")); 
		
		WebElement custo_do_invisalign = driver.findElement(By.xpath("(//div[@class='dropdown-heading'])[4]"));
		assertTrue(custo_do_invisalign.isDisplayed());
		assertEquals("Custo do Invisalign", custo_do_invisalign.getText());
		custo_do_invisalign.click();
		assertEquals(urlPadrao + "invisalign-custo", driver.getCurrentUrl());
		click(By.xpath("//img[@alt='Home']"));
		
		WebElement use_invisalign = driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[5]"));
		assertTrue(use_invisalign.isDisplayed());
		String textoElemento2 = use_invisalign.getText();
		assertEquals("Use Invisalign", textoElemento2);
		acao.moveToElement(use_invisalign).build().perform();
		boolean elementoVisivel1 = driver.findElement(By.xpath("//a[@class='class_get_inv dropdown-item']")).isDisplayed();
		boolean elementoVisivel2 = driver.findElement(By.xpath("//a[@class='class_request_appt_sub_menu dropdown-item']")).isDisplayed();
		boolean elementoVisivel3 = driver.findElement(By.xpath("//a[@class='class_find_a_doctor_sub_menu dropdown-item']")).isDisplayed();
		boolean elementoVisivel4 = driver.findElement(By.xpath("//a[@class='class_take_smile_assessment_sub_menu dropdown-item']")).isDisplayed();
		boolean elementoVisivel5 = driver.findElement(By.xpath("//a[@class='class_contact_us_sub_menu dropdown-item']")).isDisplayed();
		assertTrue(elementoVisivel1);
		assertTrue(elementoVisivel2);
		assertTrue(elementoVisivel3);
		assertTrue(elementoVisivel4);
		assertTrue(elementoVisivel5);
		
		
		
		
		
		
		
		

	}
	

	@Test
	public void validar_campo_cep() {

		String placeHolderAtual = driver.findElement(By.xpath("//input[@type='tel']")).getAttribute("placeholder");
		String placeHolderEsperado = "CEP/Cidade";
		assertEquals(placeHolderEsperado, placeHolderAtual);

		digitar("02322290", By.xpath("//input[@type='tel']"));
		String valorAtual = driver.findElement(By.xpath("//input[@type='tel']")).getAttribute("value");
		String valorEsperado = "02322290";
		assertEquals(valorEsperado, valorAtual);

	}

	@Test
	public void encontre_um_ortodontista_campo_vazio() {

		digitar("", By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		String msgAlerta = driver.switchTo().alert().getText();
		String msgEsperada = "CEP inválido.";
		driver.switchTo().alert().accept();
		assertEquals(msgEsperada, msgAlerta);

	}

	@Test
	public void encontre_um_ortodontista_cep_inexistente() {

		String cep = "5555555";
		digitar(cep, By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		String urlAtual = driver.getCurrentUrl();
		String urlEsperada = "https://www.invisalign.com.br/como-usar/encontre-dentista?QuerySource=TR2&loc=" + cep;
		assertEquals(urlEsperada, urlAtual);
		String msgRecebida = driver.findElement(By.xpath("(//p[@class='dl-error-msg'])[1]")).getText();
		String msgEsperada = "Endereço não reconhecido.";
		assertEquals(msgEsperada, msgRecebida);

	}
	
	@Test
	public void encontre_um_ortodontista_cep_valido() {
		
		String cep = "02322290";
		digitar(cep, By.xpath("//input[@type='tel']"));
		click(By.xpath("//a[text()='Ir']"));
		String urlAtual = driver.getCurrentUrl();
		String urlEsperada = "https://www.invisalign.com.br/como-usar/encontre-dentista?QuerySource=TR2&loc=02322290#v=results&z=02322&cy=br&s=e";
		assertEquals(urlEsperada, urlAtual);
		
		boolean mapa = driver.findElement(By.xpath("//div[@role='region']")).isDisplayed();
		assertTrue(mapa);
		
		
	}
	
	

}
