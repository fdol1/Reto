package com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.test.util.Constantes.*;

public class VerificarTextoNestedFrame implements Question<Boolean> {

    public static VerificarTextoNestedFrame seleccionadas() {
        return new VerificarTextoNestedFrame();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        String textoIframe1 = actor.recall(LLAVE_ELEMENTO_IFRAME1);
        String textoIframe2 = actor.recall(LLAVE_ELEMENTO_IFRAME2);


        System.out.println("datos:::." + textoIframe1 + " "  + textoIframe2);

        if (textoIframe1.equals(OPCION_TEXTO_INFRAME_PADRE) && textoIframe2.equals(OPCION_TEXTO_IFRAME_HIJP) ) {
            respuesta = true;
        }
        return respuesta;
    }
}
