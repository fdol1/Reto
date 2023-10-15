package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

import static com.test.userinterface.UIDataPicker.SECCION_FECHA;
import static com.test.userinterface.UIDataPicker.SECCION_FECHA_Y_HORA;
import static com.test.util.Constantes.LLAVE_FECHA;
import static com.test.util.Constantes.LLAVE_FEHCA_Y_HORA;

public class VerificarClick implements Question<Boolean> {

    public static VerificarClick seleccionadas() {
        return new VerificarClick();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;



        return respuesta;
    }
}
