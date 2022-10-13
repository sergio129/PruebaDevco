package co.devco.pruebas.Interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SwaglabsPage extends PageObject {
    public static final Target CAMPO_USUARIO = Target.the("CAMPO USUARIO").located(By.id("user-name"));
    public static final Target CAMPO_CONTRASENA = Target.the("CAMPO CONTRASENA").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("BOTON LOGIN").located(By.id("login-button"));

    public static final Target ITEM_UNO = Target.the("INTEM_UNO").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ITEM_DOS = Target.the("INTEM_UNO").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target ITEM_TRES = Target.the("INTEM_UNO").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target CARRITO = Target.the("CARRITO").located(By.id("shopping_cart_container"));


    public static final Target QUITAR_INTEM_UNO = Target.the("INTEM_UNO").located(By.id("remove-sauce-labs-backpack"));
    public static final Target QUITAR_ITEM_DOS = Target.the("INTEM_UNO").located(By.id("remove-sauce-labs-bike-light"));
    public static final Target QUITAR_ITEM_TRES = Target.the("INTEM_UNO").located(By.id("remove-sauce-labs-bolt-t-shirt"));


}
