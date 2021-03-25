package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class validadorTornese{

    public validadorTornese() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();
	}
	
	public WebDriver browser;
	
	@Dado("que eu acesso o site do torne-se um programador")
	public void que_eu_acesso_o_site_do_torne_se_um_programador() {
		browser.get("https://www.torneseumprogramador.com.br/");
	}

	@Dado("busco pelo conteudo {string}")
	public void busco_pelo_conteudo(String string) {
		WebElement input = browser.findElement(By.cssSelector("input[name='q']"));
		input.sendKeys(string);
	}

	@Dado("clico no botao pesquisar")
	public void clico_no_botao_pesquisar() {
		WebElement input = browser.findElement( By.cssSelector("button[class='btn btn-outline-dark btn-pesquisa']") );
		input.click();
	}

	@Entao("devo ver o resultado da busca")
	public void devo_ver_o_resultado_da_busca() {
		int cardAulas = browser.findElements(By.cssSelector("div[class='card div-card-aulas']")).size();
		assertEquals(true, cardAulas > 0);
		browser.quit();
	}

}
