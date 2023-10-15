package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarUsuarioEnLista implements Question<Boolean> {
    public static VerificarUsuarioEnLista deRegistros() {
        return new VerificarUsuarioEnLista();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean respuesta = false;
        String emailEscenario = actor.recall("Email escenario");
        String emailLista = actor.recall("Email lista");

        if (emailEscenario.trim().equals(emailLista)) {
            respuesta = true;
        }
        return respuesta;
    }
}