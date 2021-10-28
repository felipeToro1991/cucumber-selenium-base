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

public class GoogleInicio extends Base{

    WebDriver driver = DriverContext.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public GoogleInicio(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[contains]")
    WebElement inputBuscar;

    public void buscarAlgo(String dato){
        try{
            wait.until(ExpectedConditions.visibilityOf(inputBuscar));
            inputBuscar.sendKeys(dato, Keys.ENTER);
        }catch (NoSuchElementException | TimeoutException ignored){

        }

    }



}
