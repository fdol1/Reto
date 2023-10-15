package com.test.tasks;

import com.test.interactions.CerrarVentana;
import com.test.interactions.SeleccionarOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.test.userinterface.UiNuevaVentana.LBL_TITULO_NUEVA_VENTANA;


public class AbrirVentanaEmergente implements Task {

    private final String opcion;

    public AbrirVentanaEmergente(String opcion) {
        this.opcion = opcion;
    }

    public static AbrirVentanaEmergente enElPortal(String opcion) {
        return Tasks.instrumented(AbrirVentanaEmergente.class, opcion);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SeleccionarOpcion.emergente(opcion),
                CerrarVentana.emergente(LBL_TITULO_NUEVA_VENTANA)
        );
    }
}
