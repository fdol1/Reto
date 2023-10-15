package com.test.tasks;

import com.test.interactions.BuscarEmailRegistrado;
import com.test.model.RegistroUsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.test.userinterface.UiElements.*;
import static com.test.util.Constantes.LLAVE_EMAIL_ESCENARIO;

public class RegistrarUsuarios implements Task {

    private final RegistroUsuarioModel registroUsuarioData;

    public RegistrarUsuarios(RegistroUsuarioModel registroUsuarioData) {
        this.registroUsuarioData = registroUsuarioData;
    }

    public static RegistrarUsuarios enTablaDeUsuarios(RegistroUsuarioModel registroUsuarioData) {
        return Tasks.instrumented(RegistrarUsuarios.class, registroUsuarioData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_AGREGAR_USUARIO, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                Click.on(BTN_AGREGAR_USUARIO),
                Enter.theValue(registroUsuarioData.getNombre1()).into(TXT_PRIMER_NOMBEE),
                Enter.theValue(registroUsuarioData.getNombre2()).into(TXT_SEGUNDO_NOBRE),
                Enter.theValue(registroUsuarioData.getEmail()).into(TXT_EMAIL),
                Enter.theValue(registroUsuarioData.getEdad()).into(TXT_EDAD),
                Enter.theValue(registroUsuarioData.getSalario()).into(TXT_SALARIO),
                Enter.theValue(registroUsuarioData.getDepartamento()).into(TXT_DEPARTAMENTO),
                Click.on(BTN_GUARDAR_REGISTRO),
                BuscarEmailRegistrado.enLaTabla(LIST_CORREOS_USUARIOS,registroUsuarioData.getEmail())
        );
        actor.remember(LLAVE_EMAIL_ESCENARIO, registroUsuarioData.getEmail());
    }
}