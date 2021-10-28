package page;

import driver.DriverContext;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class PCFactoryProductoPO extends Base{

    WebDriver driver = DriverContext.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public PCFactoryProductoPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy (xpath = "//button[@class='product-single__add-to-cart-button']")
    WebElement btnAnadirCarro;

    @FindBy (xpath = "//*[@id='pagar_ahora']")
    WebElement btnPagarAhora;

    @FindBy (xpath = "//*[@class='product-single-cart-modal']")
    WebElement ventanaModal;



    public void anadirCarro(){
        try {
            wait.until(ExpectedConditions.visibilityOf(btnAnadirCarro));
            btnAnadirCarro.click();
        }catch (NoSuchElementException | TimeoutException ignored){

        }
    }

    public void pagarAhora(){
        try {
            wait.until(ExpectedConditions.visibilityOf(ventanaModal));
            wait.until(ExpectedConditions.visibilityOf(btnPagarAhora));
            btnPagarAhora.click();
        }catch (NoSuchElementException | TimeoutException ignored){

        }
    }


}
