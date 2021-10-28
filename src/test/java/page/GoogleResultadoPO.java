package page;

import driver.DriverContext;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultadoPO extends Base{

    WebDriver driver = DriverContext.getDriver();

    public GoogleResultadoPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy (xpath = "//div[@class='SPZz6b']/h2/span")
    WebElement titleAnimal;

    public String extraerTitulo(){
        return titleAnimal.getText();

    }


}
