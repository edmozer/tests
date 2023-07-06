package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class GaiaRobo {

    public ChromeDriver edDriver;

    public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        edDriver = new ChromeDriver();
    }

    public void acessarUmSite(){

        edDriver.get("https://globoesporte.globo.com");
    }
    public void fazerLogin(){
        System.out.println("Vou fazer login!");
    }
    public void lancarNota() {
        System.out.println("Vou lancar uma nota!");
    }
}
