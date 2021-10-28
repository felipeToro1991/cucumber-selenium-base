package stepDefinition;

import driver.DriverContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.PCFactoryInicioPO;
import page.PCFactoryProductoPO;
import page.PCFactoryResultadoBusqueda;

public class StepPCFactory {


    WebDriver driver = DriverContext.getDriver();

    @When("se busca tipo producto {string}")
    public void seBuscaTipoProducto(String tipoProducto) {
        PCFactoryInicioPO pcFactoryInicioPO = new PCFactoryInicioPO(driver);
        pcFactoryInicioPO.buscarTipoProducto(tipoProducto);
    }

    @And("se selecciona producto {string}")
    public void seSeleccionaProducto(String idProducto) {
        PCFactoryResultadoBusqueda pcFactoryResultadoBusqueda = new PCFactoryResultadoBusqueda(driver);
        pcFactoryResultadoBusqueda.seleccionarProducto(idProducto);
    }

    @And("anadir producto al carro de compras")
    public void anadirProductoAlCarroDeCompras() {
        PCFactoryProductoPO pcFactoryProductoPO = new PCFactoryProductoPO(driver);
        pcFactoryProductoPO.anadirCarro();
        pcFactoryProductoPO.pagarAhora();
    }

    @And("realizar compra ahora")
    public void realizarCompraAhora() {


    }

    @And("seguir como invitado")
    public void seguirComoInvitado() {
    }

    @When("se busca tipo producto")
    public void seBuscaTipoProducto() {

    }


}
