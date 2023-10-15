package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarUsuarioEliminado implements Question<Boolean> {

    public static VerificarUsuarioEliminado deLaTabla() {
        return new VerificarUsuarioEliminado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String mensaje = actor.recall("usuario eliminado");

        if (mensaje.trim().equals("Eliminado")) {
            respuesta = true;
        }
        return respuesta;
    }
}