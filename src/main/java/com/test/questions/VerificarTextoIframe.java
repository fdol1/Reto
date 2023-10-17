package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

import static com.test.userinterface.UIDataPicker.SECCION_FECHA;
import static com.test.userinterface.UIDataPicker.SECCION_FECHA_Y_HORA;
import static com.test.util.Constantes.*;

public class VerificarTextoIframe implements Question<Boolean> {

    public static VerificarTextoIframe seleccionadas() {
        return new VerificarTextoIframe();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String textoIframe = actor.recall(LLAVE_ELEMENTO_IFRAME);

        if (textoIframe.equals("This is a sample page")) {
            respuesta = true;
        }
        return respuesta;
    }
}
