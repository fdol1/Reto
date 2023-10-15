package com.test.tasks;

import com.test.interactions.SeleccionarLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.test.userinterface.HomePage.LIST_ELEMENT_HOME_PAGE;
import static com.test.userinterface.UiElements.LIST_ITEMS_ELEMENTS;
import static com.test.util.Constantes.OPCION_ALERT_FRAME_WINDOWS;
import static com.test.util.Constantes.OPCION_BROWSER;

public class IngresarASeccionVentanas implements Task {

    public IngresarASeccionVentanas() {
    }

    public static IngresarASeccionVentanas paraAbrirUnNuevaPestania( ) {
        return Tasks.instrumented(IngresarASeccionVentanas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LIST_ELEMENT_HOME_PAGE, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                SeleccionarLista.desde(LIST_ELEMENT_HOME_PAGE,OPCION_ALERT_FRAME_WINDOWS),
                SeleccionarLista.desde(LIST_ITEMS_ELEMENTS,OPCION_BROWSER)
        );
    }
}