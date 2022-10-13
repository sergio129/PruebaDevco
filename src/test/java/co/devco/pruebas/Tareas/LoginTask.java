package co.devco.pruebas.Tareas;

import co.devco.pruebas.SwagLabsLoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.devco.pruebas.Interfaces.SwaglabsPage.*;


public class LoginTask implements Task {
    private final SwagLabsLoginModel loginModel;

    public LoginTask(SwagLabsLoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(loginModel.getUsuario()).into(CAMPO_USUARIO),
                Enter.theValue(loginModel.getContrasena()).into(CAMPO_CONTRASENA),
                Click.on(BOTON_LOGIN)
        );
    }
    public static LoginTask EscribirDatos(SwagLabsLoginModel loginModel){
        return new LoginTask(loginModel);
    }
}
