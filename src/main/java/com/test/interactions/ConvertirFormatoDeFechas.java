package com.test.interactions;

import com.test.model.FechaYHoraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static com.test.util.Constantes.LLAVE_FECHA;
import static com.test.util.Constantes.LLAVE_FEHCA_Y_HORA;

public class ConvertirFormatoDeFechas implements Interaction {

    private final FechaYHoraModel fechaYHoraModel;

    public ConvertirFormatoDeFechas(FechaYHoraModel fechaYHoraModel) {
        this.fechaYHoraModel = fechaYHoraModel;
    }

    public static ConvertirFormatoDeFechas alFormatoWeb(FechaYHoraModel fechaYHoraModel) {
        return Tasks.instrumented(ConvertirFormatoDeFechas.class, fechaYHoraModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String fecha="";
        String fechaYHora="";

        switch (fechaYHoraModel.getMes()) {
            case "January":
                fecha= "01";
                break;
            case "February":
                fecha= "02";
                break;
            case "March":
                fecha= "03";
                break;
            case "April":
                fecha= "04";
                break;
            case "May":
                fecha= "05";
                break;
            case "June":
                fecha= "06";
                break;
            case "July":
                fecha= "07";
                break;
            case "August":
                fecha= "08";
                break;
            case "September":
                fecha= "09";
                break;
            case "Octuber":
                fecha= "10";
                break;
            case "November":
                fecha= "11";
                break;
            case "December":
                fecha= "12";
                break;
        }

        fecha+="/"+fechaYHoraModel.getDia()+"/"+fechaYHoraModel.getAnio();
        fechaYHora = fechaYHoraModel.getMes() + " " + fechaYHoraModel.getDia() + ", " + fechaYHoraModel.getAnio() + " ";

        switch (fechaYHoraModel.getHora().substring(0,2)) {
            case "00":
                fechaYHora+= "12"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "01":
                fechaYHora+= "1"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "02":
                fechaYHora+= "2"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "03":
                fechaYHora+= "3"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "04":
                fechaYHora+= "4"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "05":
                fechaYHora+= "5"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "06":
                fechaYHora+= "6"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "07":
                fechaYHora+= "7"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "08":
                fechaYHora+= "8"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "09":
                fechaYHora+= "9"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "10":
            case "11":
            case "12":
                fechaYHora+= fechaYHoraModel.getHora() + " AM";
                break;
            case "13":
                fechaYHora+= "1"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "14":
                fechaYHora+= "2"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "15":
                fechaYHora+= "3"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "16":
                fechaYHora+= "4"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "17":
                fechaYHora+= "5"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "18":
                fechaYHora+= "6"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "19":
                fechaYHora+= "7"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "20":
                fechaYHora+= "8"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "21":
                fechaYHora+= "9"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
            case "22":
                fechaYHora+= "10"+ fechaYHoraModel.getHora().substring(2,5) + " AM";
                break;
            case "23":
                fechaYHora+= "11"+ fechaYHoraModel.getHora().substring(2,5) + " PM";
                break;
        }
        actor.remember(LLAVE_FECHA, fecha);
        actor.remember(LLAVE_FEHCA_Y_HORA, fechaYHora);
    }
}