package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.test.userinterface.UiBrowserWimdows.BTN_NEW_WINDOWS;

public class VerificarVentanaPrincipal implements Question<Boolean> {

    public static VerificarVentanaPrincipal delPortal() {
        return new VerificarVentanaPrincipal();
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        return BTN_NEW_WINDOWS.resolveFor(actor).isVisible();
    }
}
