package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Base {

    @FindBy(css = "div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)")
    private WebElement productTile;

    @FindBy(css = "div.price-current")
    private WebElement priceCurrente;

    public Product(WebDriver driver) {
        super(driver);
    }

    // Ler o t�tulo da guia
    public String readTitleTab(){
        return driver.getTitle();
    }

    // Ler o nome do produto
    public String readProductTitle(){
       return productTile.getText();
    }

    // Ler o pre�o atual
    public String readPriceCurrent(){
        return priceCurrente.getText();
    }

}
