package io.cucumber.karine;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class TestValidacaoStepsGama {

    public TestValidacaoStepsGama() {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        browser = new EdgeDriver();
    }    
    
    //criação de uma classe
    public WebDriver browser;
    
    @Dado("que eu estou no site da gama academy")
    public void que_eu_estou_no_site_da_gama_academy() {
    browser.get("https://www.gama.academy/");
    }

    @Dado("cliclo na opcao {string}")
    public void cliclo_na_opcao(String string) {
        WebElement input = browser.findElement(By.cssSelector(".nav-menu a"));
        input.click();
    }

    @Entao("deve ver o item do {string}")
    public void deve_ver_o_item_do(String string) {
        WebElement input = browser.findElement( By.cssSelector(".manifesto h1.heading.lado"));
        assertEquals(string, input.getText());
        browser.quit();
                

    }
}