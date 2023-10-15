package com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.userinterface.UiAlertas.*;
import static com.test.userinterface.UiBrowserWimdows.*;
import static com.test.util.Constantes.*;

public class SeleccionarOpcion implements Interaction {

    private final String opcion;

    public SeleccionarOpcion(String opcion) {
        this.opcion = opcion;
    }

    public static SeleccionarOpcion emergente(String opcion) {
        return Tasks.instrumented(SeleccionarOpcion.class,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        switch (opcion){
            case OPCION_NEW_TAP:
                actor.attemptsTo(Click.on(BTN_NEW_TAP));
                break;
            case OPCION_NEW_WINDOW:
                actor.attemptsTo(Click.on(BTN_NEW_WINDOWS));
                break;
            case OPCION_NEW_WINDOW_MESSAGE:
                actor.attemptsTo(Click.on(BTN_NEW_WINDOW_MESSAGE));
                break;
            case OPCION_CLICK:
                actor.attemptsTo(Click.on(BTN_CLICK), InteraccionConAlertas.emergentes());
                break;
            case OPCION_CLICK_ESPERA:
                actor.attemptsTo(Click.on(BTN_CLICK_ESPERA), InteraccionConAlertas.emergentes());
                break;
            case OPCION_CLICK_CONFIRMAR:
                actor.attemptsTo(Click.on(BTN_CLICK_CONFIRMAR));
                break;
            case OPCION_CLICK_ESCRIBIR:
                actor.attemptsTo(Click.on(BTN_CLICK_ESCRIBIR));
                break;
        }
    }
}
