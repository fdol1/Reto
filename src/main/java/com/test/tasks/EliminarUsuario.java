package com.test.tasks;

import com.test.interactions.ElimiarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.test.userinterface.UiElements.LIST_CORREOS_USUARIOS;

public class EliminarUsuario implements Task {
    private final String email;
    public EliminarUsuario(String email) {
        this.email = email;
    }
    public static EliminarUsuario deLaTabla(String email) {
        return Tasks.instrumented(EliminarUsuario.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ElimiarRegistro.enLaTabla(LIST_CORREOS_USUARIOS,email)
        );
    }
}
