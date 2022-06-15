package br.com.invisalign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class validarTextosRodape extends Metodos{

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", urlPadrao);
	}

	@After
	public void tearDown() throws Exception {
		
		fechar();
	}

	@Test
	public void Validar_Texto_Rodape() {

		validarTexto(By.xpath("(//ol/li)[4]"),
				"Comparado com os alinhadores padr�o de material com �nica camada de 0,30 polegadas. Dados arquivados na Align Technology Inc.");
		validarTexto(By.xpath("(//ol/li)[5]"),
				"A dura��o do tratamento varia de acordo com as necessidades individuais do paciente e deve ser determinada pelo ortodontista.");
		validarTexto(By.xpath("(//ol/li)[6]"),
				"Alguns ortodontistas ainda fazem moldagem f�sica. Esses moldes s�o digitalizados pelos t�cnicos da Invisalign para criar a imagem 3D a ser usada no software ClinCheck� e na fabrica��o dos alinhadores.");
		validarTexto(By.xpath("(//ol/li)[7]"),
				"Dados arquivados na Align Technology Inc., desde 12 de outubro de 2017");
		validarTexto(By.xpath("(//ol/li)[8]"),
				"Dados arquivados na Align Technology Inc., desde 2 de Fevereiro, 2022.");

	}

}
