package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.test.util.Constantes.LLAVE_USUARIO_ELIMINADO;
import static com.test.util.Constantes.OPCION_ELIMINADO;

public class VerificarUsuarioEliminado implements Question<Boolean> {

    public static VerificarUsuarioEliminado deLaTabla() {
        return new VerificarUsuarioEliminado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String mensaje = actor.recall(LLAVE_USUARIO_ELIMINADO);

        if (mensaje.trim().equals(OPCION_ELIMINADO)) {
            respuesta = true;
        }
        return respuesta;
    }
}