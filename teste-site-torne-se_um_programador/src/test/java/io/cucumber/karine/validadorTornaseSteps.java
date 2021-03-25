package io.cucumber.karine;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class validadorTornaseSteps {

    //criar um construtor
    public validadorTornaseSteps() {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    //browser = new ChromeDriver();
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
	    browser = new EdgeDriver();
    }

    //criação de uma classe
    public WebDriver browser;

    @Dado("que que estou no site do tornese um programador")
    public void que_que_estou_no_site_do_tornese_um_programador() { //aqui podemos colocar qualquer nome (nome da classe)
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        browser.get("https://www.torneseumprogramador.com.br/");

    }
    
    @Dado("digito no campo de busca a palavra {string}")
    public void digito_no_campo_de_busca_a_palavra(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement input = browser.findElement(By.cssSelector("input[name='q']"));
        input.sendKeys(string); //como é um campo de busca, ele deve receber algo, no caso de string
    }

    @Dado("clico no botao pesquisar")
    public void clico_no_botao_pesquisar() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement input = browser.findElement(By.cssSelector("button[class='btn btn-outline-dark btn-pesquisa']"));
        input.click(); // como é um método que não recebe parametro, ele fica em branco dentro das chaves
}

    @Entao("devo ver o resultado na busca")
    public void devo_ver_o_resultado_na_busca() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException(); 
        int cardAulas = browser.findElements(By.cssSelector("div[class='card div-card-aulas']")).size(); //verificar o length tbm
        /*int cardAulas = browser.findElements(By.cssSelector("div[class='card div-card-aulas']")).size();*/
        assertEquals(true, cardAulas > 0);
		browser.quit();                 //pesquisar o quit        
    }   
}