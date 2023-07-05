package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class GaiaRobo {
    public void abrirChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver edDriver = new ChromeDriver();

        edDriver.get("https://www.google.com");
    }
    public void fazerLogin(){
        System.out.println("Vou fazer login!");
    }
    public void lancarNota() {
        System.out.println("Vou lancar uma nota!");
    }
}
