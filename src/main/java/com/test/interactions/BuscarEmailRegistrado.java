package com.test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class BuscarEmailRegistrado implements Interaction {

    private Target lista;
    private String opcion;

    public BuscarEmailRegistrado(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public static BuscarEmailRegistrado enLaTabla(Target lista, String opcion) {
        return new BuscarEmailRegistrado(lista, opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
        for (int i = 0; i < listObjeto.size(); i++) {
            if (listObjeto.get(i).getText().trim().equals(opcion)) {
                actor.remember("Email lista", listObjeto.get(i).getText().trim());
                break;
            }
        }
    }
}