package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.test.util.Constantes.LLAVE_EMAIL_ESCENARIO;
import static com.test.util.Constantes.LLAVE_EMAIL_WEB;

public class VerificarUsuarioEnLista implements Question<Boolean> {
    public static VerificarUsuarioEnLista deRegistros() {
        return new VerificarUsuarioEnLista();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean respuesta = false;
        String emailEscenario = actor.recall(LLAVE_EMAIL_ESCENARIO);
        String emailLista = actor.recall(LLAVE_EMAIL_WEB);

        if (emailEscenario.trim().equals(emailLista)) {
            respuesta = true;
        }
        return respuesta;
    }
}