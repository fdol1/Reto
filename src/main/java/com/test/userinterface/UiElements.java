package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiElements {

    public static final Target LIST_ITEMS_ELEMENTS = Target.the("Lista de elementos en seccion Elements").located(By.xpath("//li[@class = 'btn btn-light ']//span"));
    public static final Target BTN_AGREGAR_USUARIO = Target.the("Boton para abrir formulario de registro").located(By.xpath("//button[@id = 'addNewRecordButton']"));
    public static final Target LIST_CORREOS_USUARIOS = Target.the("Listado de correos electronicos").located(By.xpath("//div[@class='rt-tr-group']//div[4]"));
    public static final Target TXT_PRIMER_NOMBEE = Target.the("Campo para el primer nombre del usuario").located(By.xpath("//input[@id = 'firstName']"));
    public static final Target TXT_SEGUNDO_NOBRE = Target.the("Campo para el segundo nombre del usuario").located(By.xpath("//input[@id = 'lastName']"));
    public static final Target TXT_EMAIL = Target.the("Campo para el email del usuario").located(By.xpath("//input[@id = 'userEmail']"));
    public static final Target TXT_EDAD = Target.the("Campo para la edad del usuario").located(By.xpath("//input[@id = 'age']"));
    public static final Target TXT_SALARIO = Target.the("Campo para el salario del usuario").located(By.xpath("//input[@id = 'salary']"));
    public static final Target TXT_DEPARTAMENTO = Target.the("Campo para el departamento del usuario").located(By.xpath("//input[@id = 'department']"));
    public static final Target BTN_GUARDAR_REGISTRO = Target.the("Boton para guardar el registro del usuario").located(By.xpath("//button[@id = 'submit']"));
    public static final Target ICON_DELETE = Target.the("").located(By.xpath("//div//span[@title= 'Delete']"));
}