package page;

import driver.DriverContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class PCFactoryInicioPO extends Base{

    WebDriver driver = DriverContext.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public PCFactoryInicioPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//*[@id='searchalgolia']/div/div/div/div/div/form/div/input")
    WebElement inputBuscar;




    public void buscarTipoProducto(String tipoProducto){
        try{
            wait.until(ExpectedConditions.visibilityOf(inputBuscar));
            inputBuscar.sendKeys(tipoProducto+ Keys.ENTER);
        }catch (NoSuchElementException | TimeoutException ignored){

        }
    }
}
