package com.test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class SeleccionarLista implements Interaction {

    private Target lista;
    private String opcion;

    public SeleccionarLista(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public static SeleccionarLista desde(Target lista, String opcion) {
        return new SeleccionarLista(lista, opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
        for (int i = 0; i < listObjeto.size(); i++) {
            if (listObjeto.get(i).getText().trim().equals(opcion)) {
                listObjeto.get(i).click();
                break;
            }
        }
    }
}