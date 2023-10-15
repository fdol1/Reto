package com.test.tasks;

import com.test.interactions.ConvertirFormatoDeFechas;
import com.test.interactions.SeleccionarLista;
import com.test.model.FechaYHoraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.test.userinterface.UIDataPicker.*;

public class SeleccionarFechasYHora implements Task {

    private final FechaYHoraModel fechaYHoraModel;

    public SeleccionarFechasYHora(FechaYHoraModel fechaYHoraModel) {
        this.fechaYHoraModel = fechaYHoraModel;
    }

    public static SeleccionarFechasYHora enDataPicker(FechaYHoraModel fechaYHoraModel) {
        return Tasks.instrumented(SeleccionarFechasYHora.class, fechaYHoraModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SECCION_FECHA, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                Click.on(SECCION_FECHA),
                SeleccionarLista.desde(LISTA_MESES, fechaYHoraModel.getMes()),
                SeleccionarLista.desde(LISTA_ANIOS, fechaYHoraModel.getAnio()),
                SeleccionarLista.desde(LISTA_DIAS, fechaYHoraModel.getDia()),
                Click.on(SECCION_FECHA_Y_HORA),
                Click.on(CBX_MES),
                SeleccionarLista.desde(LISTA_MESES_2, fechaYHoraModel.getMes()),
                Click.on(CBX_ANIO),
                SeleccionarLista.desde(LISTA_ANIOS_2, fechaYHoraModel.getAnio()),
                SeleccionarLista.desde(LISTA_DIAS, fechaYHoraModel.getDia()),
                SeleccionarLista.desde(LISTA_HORA, fechaYHoraModel.getHora()),
                ConvertirFormatoDeFechas.alFormatoWeb(fechaYHoraModel)
        );
    }
}
