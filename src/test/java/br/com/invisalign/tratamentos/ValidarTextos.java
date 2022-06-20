package br.com.invisalign.tratamentos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class ValidarTextos extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao + "tratamentos");

	}

	@After
	public void tearDown() throws Exception {

		fechar();
	}

	@Test
	public void Validando_H1() {

		validarTexto(By.xpath("(//h1)[1]"), "Como funciona o tratamento Invisalign�?");
		validarTexto(By.xpath("(//h1)[2]"), "Veja o que o tratamento com Invisalign pode fazer");
		validarTexto(By.xpath("(//h1)[3]"), "Como seu plano de tratamento Invisalign � feito.");
		validarTexto(By.xpath("(//h1)[4]"), "Como os meus alinhadores sob medida s�o feitos?");
		validarTexto(By.xpath("(//h1)[5]"), "Obtendo seus primeiros alinhadores Invisalign�");

	}

	@Test
	public void Validando_H3() throws InterruptedException {

		validarTexto(By.xpath("(//h3)[1]"),
				"Invisalign � o aparelho ortod�ntico mais avan�ado do mundo, comprovado por mais de 12 milh�es sorrisos transformados�.");
		validarTexto(By.xpath("(//h3)[2]"), "Quase invis�vel");
		validarTexto(By.xpath("(//h3)[3]"), "Remov�vel");
		validarTexto(By.xpath("(//h3)[4]"), "Mais confort�vel2");
		validarTexto(By.xpath("(//h3)[5]"), "Mais r�pido3");
		validarTexto(By.xpath("(//h3)[6]"), "Maior previsibilidade2");
		validarTexto(By.xpath("(//h3)[7]"), "Comodidade");

		scroll(3700);
		Thread.sleep(500);
		// slide1
		validarTexto(By.xpath("(//div/h3)[8]"), "Ele come�a com um escaneamento do seu sorriso");
		Thread.sleep(500);
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[2]"));
		// slide2
		validarTexto(By.xpath("(//div/h3)[8]"), "Mapeando as mudan�as � frente");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[3]"));
		// slide3
		validarTexto(By.xpath("(//div/h3)[8]"), "Prevendo o seu sorriso");

		scroll(1200);
		Thread.sleep(500);
		// slide1
		validarTexto(By.xpath("(//h3)[9]"), "Preciso e personalizado");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[5]"));
		Thread.sleep(500);
		// slide2
		validarTexto(By.xpath("(//h3)[9]"), "Feito com excel�ncia");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[6]"));
		Thread.sleep(500);
		// slide3
		validarTexto(By.xpath("(//h3)[9]"), "Desenhado para voc�");
		click(By.xpath("(//ol[@class='carousel-indicators']/li)[7]"));
		Thread.sleep(500);
		// slide4
		validarTexto(By.xpath("(//h3)[9]"), "Qualidade comprovada");

	}

	@Test
	public void Validando_H4() throws InterruptedException {

		scroll(3700);
		Thread.sleep(1000);
		// slide1
		validarTexto(By.xpath("(//h4)[1]"),
				"N�o h� moldes de massa4. O seu ortodontista rapidamente captura uma imagem 3D precisa dos seus dentes usando nosso scanner iTero Element.");
		click(By.xpath("(//ol/li)[2]"));
		// slide2
		validarTexto(By.xpath("(//h4)[1]"),
				"O seu ortodontista trabalha com a gente para afinar cada movimento em cada dente usando software ClinCheck - constru�do sobre o poder dos dados de 12 milh�es1 de sorrisos. Pense nisso como o roteiro do seu novo sorriso.");
		click(By.xpath("(//ol/li)[3]"));
		// slide3
		validarTexto(By.xpath("(//h4)[1]"),
				"Ver � crer. O seu ortodontista pode mostrar a simula��o do seu novo sorriso antes mesmo de come�ar.");

		scroll(1300);
		Thread.sleep(1000);
		// slide1
		validarTexto(By.xpath("(//h4)[2]"),
				"O seu ortodontista rapidamente captura uma imagem 3D precisa dos seus dentes usando nosso scanner iTeroElement - sem necessidade de impress�es f�sicas4.");
		click(By.xpath("(//ol/li)[5]"));
		// slide2
		validarTexto(By.xpath("(//h4)[2]"),
				"Seus alinhadores personalizados s�o criados para proporcionar maior conforto2. Nosso material SmartTrack foi projetado especialmente para o sistema Invisalign para garantir o melhor ajuste2.");
		click(By.xpath("(//ol/li)[6]"));
		// slide3
		validarTexto(By.xpath("(//h4)[2]"),
				"Cada gengiva � diferente, � por isso que cada um de seus alinhadores � recortado individualmente. O resultado � um alinhador mais discreto e confort�vel2.");
		click(By.xpath("(//ol/li)[7]"));
		// slide4
		validarTexto(By.xpath("(//h4)[2]"),
				"Quando seu sorriso est� em jogo, a qualidade � tudo. Cada um de seus alinhadores � examinado para satisfazer aos nossos elevados padr�es de qualidade.");

	}

	@Test
	public void Validando_Paragrafos() {

		validarTexto(By.xpath(
				"//p[text()='O Invisalign � indicado para voc�? Basta selecionar abaixo, o sorriso que mais se parece com o seu, para saber mais']"),
				"O Invisalign � indicado para voc�? Basta selecionar abaixo, o sorriso que mais se parece com o seu, para saber mais");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[1]"),
				"Alinhadores Invisalign s�o virtualmente invis�veis. Isso significa que voc� sempre pode sorrir com confian�a.");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[2]"),
				"Os alinhadores Invisalign s�o feitos com material flex�vel SmartTrack�, tornando-se super f�cil de colocar e remover. Agora, voc� pode apreciar a sua comida favorita a qualquer hora, sem restri��es.");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[3]"),
				"As tecnologias SmartStage� e SmartForce� garantem que cada movimento dos seus dentes durante o tratamento ser� gradual, suave e eficaz.");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[4]"),
				"Voc� come�ar� a ver os resultados os primeiros resultados em poucas semanas, o tempo total de tratamento depender� da complexidade do seu diagn�stico.");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[5]"),
				"O tratamento Invisalign permite que voc� visualize todas as fases do progresso, dando-lhe uma vis�o mais clara do andamento do tratamento.");

		validarTexto(By.xpath("(//div[@class='wrap-content']/p)[6]"),
				"Como os alinhadores Invisalign s�o remov�veis, voc� poder� usar o fio dental e escovar os dentes normalmente.");

		validarTexto(By.xpath("(//div[@class='main-content']/p)[2]"),
				"Mesmo antes de seus alinhadores serem criados, muita tecnologia de ponta � usada para moldar o seu novo sorriso. Combine isso com o conhecimento do seu ortodontista, e voc� ter� um plano digital preciso feito especialmente para voc�.");

		validarTexto(By.xpath("(//div[@class='main-content']/p)[3]"),
				"Seus alinhadores s�o criados usando a tecnologia l�der da ind�stria com base no seu plano de tratamento personalizado.");

		validarTexto(By.xpath("(//div/p)[20]"),
				"� o primeiro dia de seu novo sorriso e chegou a hora de pegar seus primeiros alinhadores com seu ortodontista. Este � um passo fundamental no seu sucesso. Com o tratamento Invisalign, voc� nunca est� sozinho.");

		validarTexto(By.xpath("(//div/p)[21]"),
				"Quando voc� pegar seus primeiros alinhadores, o seu ortodontista vai:");

		validarTexto(By.xpath("(//ul[@class='checklist']/li/p)[1]"),
				"Se certificar de que seus alinhadores se encaixam bem.");

		validarTexto(By.xpath("(//ul[@class='checklist']/li/p)[2]"), "Responder �s suas perguntas.");

		validarTexto(By.xpath("(//ul[@class='checklist']/li/p)[3]"), "Explicar o que esperar.");

	}

	@Test
	public void Validar_Footnote() {

		validarTexto(By.xpath("(//ol[@id='footnote']/li)[1]"),
				"1. Dados arquivados na Align Technology Inc., desde 2 de Fevereiro, 2022.");

		validarTexto(By.xpath("(//ol[@id='footnote']/li)[2]"),
				"2. Em compara��o com os alinhadores Invisalign feitos anteriormente com material EX30 de camada �nica. > 75% com base na m�dia da previsibilidade aprimorada dos movimentos dent�rios estudados (rota��o, extrus�o, ponta da raiz) em 110.000 casos com exames iniciais e secund�rios que foram selecionados aleatoriamente no banco de dados Invisalign.");

		validarTexto(By.xpath("(//ol[@id='footnote']/li)[3]"),
				"3. Com altera��es semanais de alinhador, em compara��o com as trocas de alinhador a cada duas semanas. O tempo de tratamento varia de acordo com as necessidades individuais do paciente e deve ser determinado pelo ortodontista.");

		validarTexto(By.xpath("(//ol[@id='footnote']/li)[4]"),
				"4. Alguns ortodontistas ainda fazem moldagens f�sicas utilizando uma massa. Essas moldagens s�o posteriormente digitalizadas pelos t�cnicos Invisalign para criar a imagem 3D para uso no software ClinCheck� e fabricar os alinhadores");

	}

	@Test
	public void Validar_Carousel() throws InterruptedException {
		
		scroll(900);
		
		//titulo dos slides
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[1]"), "Sobremordida");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[2]"), "Prognatismo");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[3]"), "Mordida cruzada");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[4]"), "Diastema");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[5]"), "Mordida aberta");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[6]"), "Dentes apinhados");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[7]"), "Alinhamento geral dos dentes");
		validarTexto(By.xpath("(//div[@class='carousel-tab-text'])[8]"), "Crian�as com dentes de leite e permanentes");
		
		//slide1
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[1]"),
				"Os alinhadores Invisalign podem corrigir sobremordida?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[1]"),
				"Sim, os alinhadores Invisalign podem corrigir sobremordida ou mordida profunda e para saber se � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");

		//slide2
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[2]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[2]"),
				"Os alinhadores Invisalign podem corrigir prognatismo?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[2]"),
				"Sim, os alinhadores Invisalign podem corrigir alguns tipos de prognatismo. O prognatismo mais grave pode requerer tratamento Invisalign combinado com cirurgia, para saber se Invisalign � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");

		//slide3
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[3]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[3]"),
				"Os alinhadores Invisalign podem corrigir mordida cruzada?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[3]"),
				"Sim, os alinhadores Invisalign podem corrigir alguns tipos de mordida cruzada, para saber se Invisalign � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");

		//slide4
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[4]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[4]"),
				"Os alinhadores Invisalign podem corrigir diastema?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[4]"),
				"Sim, os alinhadores Invisalign podem corrigir diastema, para saber se Invisalign � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");
		
		//slide5
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[5]"));
		Thread.sleep(500);
		
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[5]"),
				"Os alinhadores Invisalign podem corrigir mordida aberta?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[5]"),
				"Sim, os alinhadores Invisalign podem corrigir mordida aberta, para saber se Invisalign � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");
		
		//slide6
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[6]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[6]"),
				"Os alinhadores Invisalign podem corrigir dentes apinhados?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[6]"),
				"Sim, os alinhadores Invisalign podem corrigir dentes apinhados, para saber se Invisalign � adequado ao seu caso, voc� precisar� ser avaliado por um ortodontista. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que pode te mostrar o que tratamento com Invisalign pode fazer por voc�.");
		
		//slide7
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[7]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[7]"),
				"Parece algo simples. Por que voc� deveria corrigi-lo?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[7]"),
				"Voc� gosta do seu sorriso e pode am�-lo ainda mais. Talvez voc� o seu objetivo seja aumentar a autoestima e confian�a ou preparar o seu sorriso para uma ocasi�o especial. Pequenos detalhes podem fazer grandes diferen�as. N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que ir� te mostrar como o tratamento com Invisalign pode transformar o seu sorriso");
		
		//slide8
		passarMouse(By.xpath("(//div[@class='carousel-tabs']/div)[8]"));
		Thread.sleep(500);
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/h2)[8]"),
				"Os alinhadores Invisalign podem corrigir o sorriso de uma crian�a?");

		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[8]"),
				"Conforme a crian�a cresce, seu sorriso cresce junto. Na fase da denti��o mista, ainda com os dentes de leite e permanentes, pode ser o momento perfeito para crian�as entre 6 e 10 anos iniciarem um tratamento ortod�ntico. Esse tratamento � conhecido como Fase 1.");
		
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[9]"),
				"O objetivo da Fase 1 do tratamento � desenvolver os maxilares e/ou as arcadas dos dentes para que haja espa�o para os dentes que j� existem e para os permanentes que nascer�o.");
		
		validarTexto(By.xpath("(//div[@class='inner-wrapper']/div/div/p)[10]"),
				"N�s podemos ajudar voc� a encontrar um ortodontista Invisalign experiente que ir� te mostrar como o tratamento com Invisalign pode ajudar a transformar o sorriso do seu filho(a).");
	}

}
