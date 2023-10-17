package com.test.tasks;

import com.test.interactions.Scroll;
import com.test.interactions.SeleccionarLista;
import com.test.model.FechaYHoraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.userinterface.HomePage.LIST_ELEMENT_HOME_PAGE;
import static com.test.userinterface.UiElements.LIST_ITEMS_ELEMENTS;
import static com.test.userinterface.UiModalDialos.*;
import static com.test.util.Constantes.*;

public class SeleccionarModalDialogs implements Task {


    public SeleccionarModalDialogs() {
    }

    public static SeleccionarModalDialogs enElPortal() {
        return Tasks.instrumented(SeleccionarModalDialogs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SeleccionarLista.desde(LIST_ELEMENT_HOME_PAGE, OPCION_ALERT_FRAME_WINDOWS),
                Scroll.byPixels(500),
                SeleccionarLista.desde(LIST_ITEMS_ELEMENTS, OPCION_MODAL_DIALOGS),
                Click.on(BTN_SMALL_MODAL),
                Click.on(BTN_CLOSE_SMALL_MODAL),
                Click.on(BTN_LARGE_MODAL),
                Click.on(BTN_CLOSE_LARGE_MODAL)
        );
    }
}
