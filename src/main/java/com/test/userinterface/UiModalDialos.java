package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiModalDialos {

    public static final Target BTN_SMALL_MODAL = Target.the("Boton para abrir el small modal").located(By.xpath("//button[@id='showSmallModal']"));
    public static final Target BTN_LARGE_MODAL = Target.the("Boton para abrir large modal").located(By.xpath("//button[@id='showLargeModal']"));

    public static final Target BTN_CLOSE_SMALL_MODAL = Target.the("boton para cerrar el modal").located(By.xpath("//button[@id='closeSmallModal']"));
    public static final Target BTN_CLOSE_LARGE_MODAL = Target.the("boton para cerrar el modal").located(By.xpath("//button[@id='closeLargeModal']"));

}


