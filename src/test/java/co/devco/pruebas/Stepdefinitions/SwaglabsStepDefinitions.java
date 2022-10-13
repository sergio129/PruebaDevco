package co.devco.pruebas.Stepdefinitions;

import co.devco.pruebas.Interfaces.SwaglabsPage;
import co.devco.pruebas.SwagLabsLoginModel;
import co.devco.pruebas.Tareas.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.devco.pruebas.Interfaces.SwaglabsPage.*;

public class SwaglabsStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    Actor devco = new Actor("pruebas");
    SwagLabsLoginModel login = new SwagLabsLoginModel();
    private final SwaglabsPage url = new SwaglabsPage();

    @Before
    public void setUp() {

        devco.can(BrowseTheWeb.with(getBrowser));
    }
    @Given("pruebas devco compras")
    public void pruebasdevco_compras(){
        devco.wasAbleTo(Open.browserOn(url));
    }

    @When("Ingresar datos de login Usuario {string}, Contrasena: {string}")
    public void ingresarDatosDeLoginUsuarioContrasena(String arg0, String arg1) {
        this.login.setUsuario(arg0);
        this.login.setContrasena(arg1);
        devco.attemptsTo(LoginTask.EscribirDatos(login));
    }

    @And("Agregar los productos al carrito")
    public void agregarLosProductosAlCarrito() {
        devco.attemptsTo(Click.on(ITEM_UNO),
                Click.on(ITEM_DOS),
                Click.on(ITEM_TRES),
                Click.on(CARRITO));
    }

    @Then("Vaciar Carrito")
    public void vaciarCarrito() throws InterruptedException {
        devco.attemptsTo(Click.on(QUITAR_INTEM_UNO),Click.on(QUITAR_ITEM_DOS),Click.on(QUITAR_ITEM_TRES));
        Thread.sleep(500);
    }
}
