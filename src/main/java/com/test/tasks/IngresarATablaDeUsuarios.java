package com.test.tasks;

import com.test.interactions.SeleccionarLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.test.userinterface.HomePage.LIST_ELEMENT_HOME_PAGE;
import static com.test.userinterface.UiElements.*;
import static com.test.util.Constantes.OPCION_ELEMENT;
import static com.test.util.Constantes.OPCION_WEB_TABLES;

public class IngresarATablaDeUsuarios implements Task {
    public IngresarATablaDeUsuarios() {
    }
    public static IngresarATablaDeUsuarios enTablaDeUsuarios( ) {
        return Tasks.instrumented(IngresarATablaDeUsuarios.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SeleccionarLista.desde(LIST_ELEMENT_HOME_PAGE,OPCION_ELEMENT),
                SeleccionarLista.desde(LIST_ITEMS_ELEMENTS,OPCION_WEB_TABLES)
        );
    }
}
