package com.test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static com.test.userinterface.UiElements.ICON_DELETE;
import static com.test.util.Constantes.*;

public class ElimiarRegistro implements Interaction {

    private Target lista;
    private String opcion;

    public ElimiarRegistro(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public static ElimiarRegistro enLaTabla(Target lista, String opcion) {
        return new ElimiarRegistro(lista, opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listDelet = ICON_DELETE.resolveAllFor(actor);
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);

        for (int i = 0; i < listObjeto.size(); i++) {
            if (listObjeto.get(i).getText().trim().equals(opcion)) {
                listDelet.get(i).click();
                actor.remember(LLAVE_USUARIO_ELIMINADO, OPCION_ELIMINADO);
                break;
            }
            else{
                actor.remember(LLAVE_USUARIO_NO_ELIMINADO, OPCION_NO_ELIMINADO);

            }
        }
    }
}