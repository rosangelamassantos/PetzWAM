package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private Base base; // Objeto local para a comunicação com o objeto da classe extendida

    //Construtor para a classe Base
    public Hooks(Base base){
        super(base.driver);
        this.base = base;
    }

    //Before
    @Before
    public void setup(){
        //Onde está o driver do browser
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/89/chromedriver.exe");
        //Instanciar o driver do chrome
        base.driver = new ChromeDriver();

        //Maximizar a tela
        base.driver.manage().window().maximize();

        //Definir a espera implicita do Selenium WebDriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDowm(){
        base.driver.quit();
        }
}
