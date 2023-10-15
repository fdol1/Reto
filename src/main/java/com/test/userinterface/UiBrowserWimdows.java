package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UiBrowserWimdows {
    public static final Target BTN_NEW_TAP = Target.the("Boton para abrir una pestaña").located(By.xpath("//button[@id='tabButton']"));
    public static final Target BTN_NEW_WINDOWS = Target.the("boton para abrir una ventana").located(By.xpath("//button[@id='windowButton']"));
    public static final Target BTN_NEW_WINDOW_MESSAGE = Target.the("boton para abrir una ventana").located(By.xpath("//button[@id='messageWindowButton']"));
}