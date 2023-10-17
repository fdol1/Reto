package com.test.tasks;

import com.test.interactions.Scroll;
import com.test.interactions.SeleccionarLista;
import com.test.interactions.SwitchTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static com.test.userinterface.HomePage.LIST_ELEMENT_HOME_PAGE;
import static com.test.userinterface.UiElements.LIST_ITEMS_ELEMENTS;
import static com.test.userinterface.UiIframe.*;
import static com.test.util.Constantes.*;

public class IngresarAIframe implements Task {

    public IngresarAIframe() {
    }

    public static IngresarAIframe enPortal() {
        return Tasks.instrumented(IngresarAIframe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SeleccionarLista.desde(LIST_ELEMENT_HOME_PAGE,OPCION_MODAL_DIAGLOS),
                Scroll.byPixels(500),
                SeleccionarLista.desde(LIST_ITEMS_ELEMENTS,OPCION_MODAL_DIALOGS),
                SwitchTo.iframe(IFRAME)
        );
        actor.remember(LLAVE_ELEMENTO_IFRAME, Text.of(LBL_TITULO).viewedBy(actor).asString());
    }
}