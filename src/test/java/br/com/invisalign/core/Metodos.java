package br.com.invisalign.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends Elementos {

	public String urlPadrao = "https://www.invisalign.com.br/";
	public String urlMy = "https://my.invisalign.com.br/";
	Elementos el = new Elementos();
	public static WebDriver driver;

	public static WebDriver navegador() {
		return driver;

	}

	public void iniciarTeste(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.out.println("Iniciando Google Chrome...");
			System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.out.println("Iniciando Firefox...");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("Iniciando Microsoft Edge...");
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else {

			System.out.println("Nenhum navegador Web configurado com este nome.");

		}

	}

	public void click(By elemento) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		element.click();
	}

	public void digitar(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void apagar(By elemento) {

		driver.findElement(elemento).clear();
	}

	public void aceitarAlerta() {

		driver.switchTo().alert().accept();
	}


	public String pegarTextoAlerta() {

		return driver.switchTo().alert().getText();
	}

	public String pegarTexto(By elemento) {

		return driver.findElement(elemento).getText();

	}

	public void fechar() {

		driver.quit();
	}

	public void fecharAba() {

		driver.close();
	}


	public void alternarAba(int aba) {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(aba));
	}

	public void scroll(int numero) {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0," + numero + ")");
	}

	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(nomeArq, destArq);

	}

	public void validarElementoVisivel(By elemento) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		boolean validacao = element.isDisplayed();
		assertTrue(validacao);
	}

	public void validarTexto(By elemento, String texto) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(elemento));
		String textoGet = myDynamicElement.getText();
		String textoEsperado = texto;
		assertEquals(textoEsperado, textoGet);
	}

	public void validarAtributo(By elemento, String atributo, String valorEsperado) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		String valorDoElemento = element.getAttribute(atributo);
		String valorDoElementoEsperado = valorEsperado;
		assertEquals(valorDoElementoEsperado, valorDoElemento);

	}

	public String getUrl() {

		return driver.getCurrentUrl();
	}

	public void HomePage() {

		click(By.xpath("//img[@alt='Home']"));
	}


	public void aceitarCookie() {

		click(By.id("epdsubmit"));
	}

	public void validarTitulo(String texto) {

		String tituloAtual = driver.getTitle();
		String tituloEsperado = texto;
		assertEquals(tituloEsperado, tituloAtual);

	}

	public void validarCheckBox(By elemento) {
		assertTrue(driver.findElement(elemento).isSelected());

	}

	public void passarMouse(By elemento) {

		Actions acao = new Actions(driver);
		WebElement element = driver.findElement(elemento);
		acao.moveToElement(element).build().perform();

	}
	
	public void select(By elemento, String texto, String value, int index) {
		
		WebElement wElement = driver.findElement(elemento);
		Select select = new Select(wElement);
		select.selectByIndex(index);
		select.selectByValue(value);
		select.selectByVisibleText(texto);
		
	}

}
