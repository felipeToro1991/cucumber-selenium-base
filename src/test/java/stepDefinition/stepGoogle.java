package stepDefinition;

import contants.Navegador;
import driver.DriverContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.base.Function;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import page.GoogleInicio;
import page.GoogleResultadoPO;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class stepGoogle {


    String animal = "Elefantes";
    String url = "https://www.google.cl/";
    WebDriver driver = DriverContext.getDriver();


    @Given("un navegador web en la pagina de google")
    public void unNavegadorWebEnLaPaginaDeGoogle() {

    }


    @When("Se introduce la palabra de busqueda {string}")
    public void seIntroduceLaPalabraDeBusqeuda(String animal) {
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



        //googleInicio.buscarAlgo(animal);
    }

    @Then("se muestraa el resultado {string}")
    public void seMuestraaElResultado(String animal) {
    }

    @When("Se introduce la palabra de busqueda")
    public void seIntroduceLaPalabraDeBusqueda(DataTable table) {
        GoogleInicio googleInicio = new GoogleInicio(driver);
        List<List<String>> rows = table.asLists();
        for (List<String> columns :rows){
            if(columns.get(0).equals(animal)){
                String data = columns.get(0);
                googleInicio.buscarAlgo(data);
            }
            //System.out.println(columns.get(1));

        }
    }

    @Then("se muestraa el resultado")
    public void seMuestraaElResultado(DataTable table) {

        GoogleResultadoPO googleResultadoPO = new GoogleResultadoPO(driver);
        String ani = googleResultadoPO.extraerTitulo();


        List<List<String>> rows = table.asLists();
        for (List<String> columns :rows){
            if(columns.equals(animal)){
                Assert.assertEquals("Los datos no son Correctos",columns.get(0), ani);
            }

            //System.out.println(columns.get(1));

        }
    }
}
