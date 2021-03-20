package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; //declarou o objeto do selenium, vulgo bola
    //Protected - incluimos pq ele pode ser usado pelos demais mas deve ser usado um de cada vez.
    //Ao usar o PageFacotry mudar de public para protected

    //criar um constructor pro base e inicializar os elementos do pagefactory
    public Base(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //vai ser usado com a página que chamar ele, por isso tem o this
    }
 }
