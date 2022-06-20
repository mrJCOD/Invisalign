package br.com.invisalign.avaliacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.invisalign.core.Metodos;

public class Validar_Entrar_Em_Contato extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", urlPadrao + "como-usar/avaliacao");
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void Enviar_Formulario_Sucesso() throws InterruptedException {

		click(By.xpath("(//label[@class='answer-check'])[2]"));
		click(By.xpath("(//label[@class='answer-check'])[4]"));
		select(By.name("radioconcern"), "Valor do tratamento", "Cost", 2);
		click(By.xpath("//label[@for='radioGenerally straighter teeth']"));
		

		digitar("Josivaldo", By.name("first_name"));
		validarAtributo(By.name("first_name"), "value", "Josivaldo");

		digitar("Silva", By.name("last_name"));
		validarAtributo(By.name("last_name"), "value", "Silva");

		digitar("01041996", By.name("dob"));
		validarAtributo(By.name("dob"), "value", "01/04/1996");

		digitar("02322290", By.name("postal_code"));
		validarAtributo(By.name("postal_code"), "value", "02322-290");

		digitar("automacaotestes@gmail.com", By.name("email"));
		validarAtributo(By.name("email"), "value", "automacaotestes@gmail.com");

		digitar("11996765452", By.name("phone"));
		validarAtributo(By.name("phone"), "value", "(11) 996765452");

		validarCheckBox(By.name("offers_accept"));

		click(By.xpath("//a[@class='btn btn-primary btn-lblue btn-wide btn-tall']"));

	}
	
	@Test
	public void Validar_campo_obrigatorio() {
		
		scroll(1000);
		click(By.xpath("//a[@class='btn btn-primary btn-lblue btn-wide btn-tall']"));
		
		
		validarAtributo(By.xpath("//div[@class='sa-question clr-lblue idx1 error']"), "class", "sa-question clr-lblue idx1 error");
		
		validarAtributo(By.xpath("//div[@class='sa-question clr-lblue idx2 error']"), "class", "sa-question clr-lblue idx2 error"); 
		
		validarAtributo(By.xpath("//div[@class='sa-question clr-lblue idx3 error']"), "class", "sa-question clr-lblue idx3 error"); 
		
		validarAtributo(By.xpath("//div[@class='sa-question clr-lblue idx4 error']"), "class", "sa-question clr-lblue idx4 error"); 
		
		validarAtributo(By.name("last_name"), "class", "gray-input error");
		
		validarAtributo(By.name("dob"), "class", "gray-input error");
		
		validarAtributo(By.name("postal_code"), "class", "gray-input error");
		
		validarAtributo(By.name("email"), "class", "gray-input error");
		
		validarAtributo(By.name("phone"), "class", "gray-input error");
		
	}
	
	@Test
	public void Enviar_Formulario_Inf_Incorreta() {
		
		click(By.xpath("(//label[@class='answer-check'])[2]"));
		click(By.xpath("(//label[@class='answer-check'])[4]"));
		select(By.name("radioconcern"), "Valor do tratamento", "Cost", 2);
		click(By.xpath("//label[@for='radioGenerally straighter teeth']"));
		
		digitar("Josivaldo", By.name("first_name"));
		validarAtributo(By.name("first_name"), "value", "Josivaldo");

		digitar("Silva", By.name("last_name"));
		validarAtributo(By.name("last_name"), "value", "Silva");

		digitar("010419", By.name("dob"));
		validarAtributo(By.name("dob"), "value", "01/04/19");

		digitar("023222", By.name("postal_code"));
		validarAtributo(By.name("postal_code"), "value", "02322-2");

		digitar("automacaotestesgmail.com", By.name("email"));
		validarAtributo(By.name("email"), "value", "automacaotestesgmail.com");
		
		
		digitar("11996765", By.name("phone"));
		validarAtributo(By.name("phone"), "value", "(11) 996765");

		validarCheckBox(By.name("offers_accept"));
		
		click(By.xpath("//a[@class='btn btn-primary btn-lblue btn-wide btn-tall']"));
		
		validarAtributo(By.name("email"), "class", "gray-input error");
		validarAtributo(By.name("dob"), "class", "gray-input error");
		validarAtributo(By.name("postal_code"), "class", "gray-input error");
		validarAtributo(By.name("phone"), "class", "gray-input error");

		
		
	}

}
