package com.test.model;

public class FechaYHoraModel {

    private String mes;
    private String anio;
    private String dia;
    private String hora;

    public FechaYHoraModel(String mes, String anio, String dia, String hora) {
        this.mes = mes;
        this.anio = anio;
        this.dia = dia;
        this.hora = hora;
    }

    public String getMes() {
        return mes;
    }

    public String getAnio() {
        return anio;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
