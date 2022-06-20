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

public class PageHomeRefactor extends Metodos {


	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao);

	}

	@After
	public void tearDown() throws Exception {

		fechar();
	}

	@Test
	public void Validar_titulo() {

		validarTitulo("Tratamento Invisalign | Invisalign Alinhador Transparente");
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
		validarElementoVisivel(By.xpath("//div[@class='sa-background-image-wrapper']"));
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
		validarTexto(By.xpath("(//h2)[8]"), "12 milhões de sorrisos transformados e contando5");
		validarTexto(By.xpath("(//h2)[9]"), "Saiba se o Invisalign é indicado para você!");
		validarTexto(By.xpath("(//h2)[10]"), "Seu novo sorriso começa aqui");
		validarTexto(By.xpath("(//h2)[11]"), "Sinta-se bem com a sua escolha");
	}

	@Test
	public void Validar_h3() {

		validarTexto(By.xpath("(//h3)[1]"), "invisa é investir em si mesmo.");
		validarTexto(By.xpath("(//h3)[3]"), "invisa é velocidade.");
		validarTexto(By.xpath("(//h3)[6]"), "O tratamento Invisalign é indicado para mim?");

	}

	@Test
	public void Validar_h4() {

		validarTexto(By.xpath("(//h4)[1]"), "Você poderá ver resultados em poucas semanas2");
		validarTexto(By.xpath("(//h4)[4]"), "Se perguntando se Invisalign é indicado para você?");
		validarTexto(By.xpath("(//h4)[5]"), "Nós podemos ajudar");
		validarTexto(By.xpath("(//h4)[6]"), "invisa é ter um ortodontista especializado perto de você.");
		validarTexto(By.xpath("(//h4)[7]"), "invisa é único");

	}

	@Test
	public void Validar_Paragrafos() {

		validarTexto(By.xpath("(//a[@rel='nofollow'])[1]"), "Alinha os dentes de forma mais previsível e confortável1");
		validarTexto(By.xpath("(//a[@rel='nofollow'])[2]"), "Consultas com ortodontistas especializados");
		validarTexto(By.xpath("(//span)[10]"),
				"O valor do tratamento ortodôntico com Invisalign é determinado pelas necessidades do seu caso, como o tipo de correção que será feita, a complexidade e a duração do tratamento. Somente o ortodontista, após uma avaliação, poderá informar o valor do tratamento com Invisalign.");
		validarTexto(By.xpath("(//span)[11]"),
				"Você deve entrar em contato com um ortodontista credenciado Invisalign para receber um orçamento estimado antes de iniciar o tratamento. Nós podemos te ajudar a encontrar um aqui.");
		validarTexto(By.xpath("(//span)[12]"),
				"Conheça as parcerias que vão ajudar você a transformar o seu sorriso com Invisalign®");
		validarTexto(By.xpath("(//p)[6]"),
				"Descubra as empresas participantes e encontre um ortodontista para saber sobre valores e condições de pagamento");

	}

	@Test
	public void Validar_Texto_Rodape() {

		validarTexto(By.xpath("(//ol/li)[4]"),
				"Comparado com os alinhadores padrão de material com única camada de 0,30 polegadas. Dados arquivados na Align Technology Inc.");
		validarTexto(By.xpath("(//ol/li)[5]"),
				"A duração do tratamento varia de acordo com as necessidades individuais do paciente e deve ser determinada pelo ortodontista.");
		validarTexto(By.xpath("(//ol/li)[6]"),
				"Alguns ortodontistas ainda fazem moldagem física. Esses moldes são digitalizados pelos técnicos da Invisalign para criar a imagem 3D a ser usada no software ClinCheck® e na fabricação dos alinhadores.");
		validarTexto(By.xpath("(//ol/li)[7]"),
				"Dados arquivados na Align Technology Inc., desde 12 de outubro de 2017");
		validarTexto(By.xpath("(//ol/li)[8]"),
				"Dados arquivados na Align Technology Inc., desde 2 de Fevereiro, 2022.");

	}

	@Test
	public void Validar_Botoes() throws InterruptedException {
		


		validarTexto(By.xpath("(//a[@class='btn-blue'])[1]"), "É indicado pra mim?");
		click(By.xpath("(//a[@class='btn-blue'])[1]"));
		assertEquals(urlPadrao + "como-usar/avaliacao", getUrl());
		HomePage();

		scroll(800);
		validarTexto(By.xpath("//a[@data-slug='invisalign-custo']"), "Saiba mais");
		click(By.xpath("(//div[@class='get-start']/a)[1]"));
		Thread.sleep(2000);
		assertEquals(urlPadrao + "invisalign-custo", getUrl());
		HomePage();

		scroll(1200);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[2]"), "Como Invisalign funciona");
		click(By.xpath("(//a[@class='btn-blue'])[2]"));
		Thread.sleep(2000);
		assertEquals(urlPadrao + "como-funciona", getUrl());
		HomePage();

		scroll(1600);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[3]"), "Encontre um Parceiro");
		click(By.xpath("(//a[@data-telium-event='homepage_how_invisalign_works'])[2]"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "parcerias", getUrl());
		HomePage();
		
		scroll(1900);
		validarTexto(By.xpath("//a[@class='btn-white']"), "Solicite uma consulta");
		click(By.xpath("//a[@class='btn-white']"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "como-usar/marcar-consulta", getUrl());
		HomePage();
		
		scroll(2100);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[5]"), "Encontre um ortodontista");
		click(By.xpath("(//a[@class='btn-blue'])[5]"));
		Thread.sleep(1000);
		assertEquals(urlPadrao + "como-usar/encontre-dentista", getUrl());
		HomePage();
		
		Thread.sleep(2000);
		scroll(500);
		validarTexto(By.xpath("(//a[@class='btn-blue'])[6]"), "Encontre um ortodontista");
		click(By.xpath("(//a[@class='btn-blue'])[6]"));
		
		assertEquals(urlPadrao + "como-usar/encontre-dentista", getUrl());
		
		
		
		
		
		

	}

	@Test
	public void Validar_Menus() throws InterruptedException {

		Actions acao = new Actions(driver);

		WebElement portal_do_paciente = driver.findElement(By.xpath("(//a[@rel='noopener'])[1]"));
		assertTrue(portal_do_paciente.isDisplayed());
		assertEquals("Portal do paciente|", portal_do_paciente.getText());
		portal_do_paciente.click();
		alternarAba(1);
		assertEquals("https://my.invisalign.com.br/login", getUrl());
		fecharAba();
		alternarAba(0);

		WebElement portal_para_doutores = driver.findElement(By.xpath("(//a[@rel='noopener'])[2]"));
		assertTrue(portal_para_doutores.isDisplayed());
		assertEquals("Para doutores", portal_para_doutores.getText());
		portal_para_doutores.click();
		alternarAba(1);
		assertEquals("https://www.doutor.invisalign.com.br/pt", getUrl());
		fecharAba();
		alternarAba(0);

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

	@Test
	public void Validar_Imagens_Slide_Show() throws InterruptedException {

		scroll(3000);
		validarElementoVisivel(By.xpath("//img[@alt='Group 161']"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		Thread.sleep(2000);
		validarElementoVisivel(By.xpath("//img[@alt='step 2 easy step carousel']"));
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		validarElementoVisivel(By.xpath("//img[@alt='Group 6 1']"));

	}

	@Test
	public void Validar_Textos_Slide_Show() {

		scroll(3000);
		validarTexto(By.xpath("(//h2)[7]"), "Passo 1");
		validarTexto(By.xpath("(//h3)[4]"), "Passe em consulta e veja uma simulação do seu novo sorriso");
		validarTexto(By.xpath("(//h4)[2]"),
				"Usando o scanner iTero Element®, seu ortodontista poderá digitalizar o seu sorriso em 3D de forma rápida e precisa3 e poderá fazer um mapeamento do seu tratamento personalizado especialmente para você.");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		validarTexto(By.xpath("(//h2)[7]"), "Passo 2");
		validarTexto(By.xpath("(//h3)[4]"), "Comece a transformar seu sorriso desde o primeiro alinhador");
		validarTexto(By.xpath("(//h4)[2]"),
				"Este é um momento chave no sucesso do seu tratamento. Seu ortodontista vai garantir que seus alinhadores se adaptem perfeitamente aos seus dentes, responderá suas dúvidas e explicará o que esperar do seu tratamento.");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		validarTexto(By.xpath("(//h2)[7]"), "Passo 3");
		validarTexto(By.xpath("(//h3)[4]"), "Mantenha seu mais novo sorriso lindo");
		validarTexto(By.xpath("(//h4)[2]"),
				"Você transformou seu sorriso com o sistema de alinhadores mais avançado do mundo. Agora é fácil manter o sorriso que você conquistou. Nossa contenção Vivera é feita sob medida e é 30% mais resistente que outras contenções.4");

	}

	@Test
	public void Validar_botao_Slide_Show() {

		scroll(3000);
		validarElementoVisivel(By.xpath("(//a[@class='btn-blue'])[4]"));
		validarTexto(By.xpath("(//a[@class='btn-blue'])[4]"), "Saiba mais sobre o Scanner iTero®");
		click(By.xpath("(//a[@class='btn-blue'])[4]"));
		assertEquals(urlPadrao + "vantagens/itero-scanner-3d", getUrl());

		HomePage();
		scroll(3000);
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));

		validarElementoVisivel(By.xpath("(//a[@class='btn-blue'])[4]"));
		validarTexto(By.xpath("(//a[@class='btn-blue'])[4]"), "Saiba mais sobre o material SmartTrack®");
		click(By.xpath("(//a[@class='btn-blue'])[4]"));
		assertEquals(urlPadrao + "vantagens/smarttrack-material", getUrl());

	}
	
	@Test
	public void Validar_Botao_Comece_Agora() {
		
		scroll(4200);
		click(By.xpath("//*[text()='Comece agora']"));
		validarElementoVisivel(By.xpath("(//h2)[9]"));
		validarTexto(By.xpath("(//h2)[9]"), "Quer saber mais sobre o tratamento Invisalign?");
		validarTexto(By.xpath("(//h4)[4]"), "Sem problemas, nos conte um pouco mais sobre você.");
		validarTexto(By.xpath("//p[@class='active']"), "01");
		validarTexto(By.xpath("(//div[@class='inner-wrap']/span)[2]"), "02");
		
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_teen']"));
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_parent']"));
		validarElementoVisivel(By.xpath("//label[@for='homepage_sa_adult']"));
		
	}
	
	
	
	

}
