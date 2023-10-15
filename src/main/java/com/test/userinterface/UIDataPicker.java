package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIDataPicker {
    public static final Target SECCION_FECHA = Target.the("Elemento para acceder al menu para fechas").located(By.xpath("//input[@id = 'datePickerMonthYearInput']"));
    public static final Target LISTA_MESES = Target.the("Elemento que contiene la lista de los meses").located(By.xpath("//select[@class = 'react-datepicker__month-select']//option"));
    public static final Target LISTA_ANIOS = Target.the("Elemento que contiene la lista de los años").located(By.xpath("//select[@class = 'react-datepicker__year-select']//option"));
    public static final Target LISTA_DIAS = Target.the("Elemento que contiene la lista de los dias").located(By.xpath("//div[@class = 'react-datepicker__month']//div//div"));
    public static final Target SECCION_FECHA_Y_HORA = Target.the("Elemento para acceder al meno para fechas y horas").located(By.xpath("//input[@id = 'dateAndTimePickerInput']"));
    public static final Target CBX_MES = Target.the("Elemento que contiene la lista de los meses en la seccion DATA AND TIME").located(By.xpath("//div[@class = 'react-datepicker__month-read-view']"));
    public static final Target CBX_ANIO = Target.the("Elemento que contiene la lista de los años en la seccion DATA AND TIME").located(By.xpath("//span[@class = 'react-datepicker__year-read-view--selected-year']"));
    public static final Target LISTA_MESES_2 = Target.the("Elemento que contiene la lista de los meses en la seccion DATA AND TIME").located(By.xpath("//div[@class = 'react-datepicker__month-option']"));
    public static final Target LISTA_ANIOS_2 = Target.the("Elemento que contiene la lista de los años en la seccion DATA AND TIME").located(By.xpath("//div[@class = 'react-datepicker__year-option']"));
    public static final Target LISTA_HORA = Target.the("Elemento que contiene la lista de las horas en la seccion DATA AND TIME").located(By.xpath("//li[@class = 'react-datepicker__time-list-item ']"));
}