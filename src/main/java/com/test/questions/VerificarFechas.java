package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

import static com.test.userinterface.UIDataPicker.SECCION_FECHA;
import static com.test.userinterface.UIDataPicker.SECCION_FECHA_Y_HORA;

public class VerificarFechas implements Question<Boolean> {

    public static VerificarFechas seleccionadas() {
        return new VerificarFechas();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String fecha = actor.recall("fecha");
        String fechaYHora = actor.recall("fechaYHora");

        if (fecha.equals(Value.of(SECCION_FECHA).viewedBy(actor).asString()) &&
                fechaYHora.equals(Value.of(SECCION_FECHA_Y_HORA).viewedBy(actor).asString())) {
            respuesta = true;
        }
        return respuesta;
    }
}
