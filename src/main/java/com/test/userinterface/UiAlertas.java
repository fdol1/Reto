package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiAlertas {
    public static final Target BTN_CLICK = Target.the("Boton para abrir alerta").located(By.xpath("//button[@id='alertButton']"));
    public static final Target BTN_CLICK_ESPERA = Target.the("Boton para abrir alerta").located(By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='timerAlertButton']"));
    public static final Target BTN_CLICK_CONFIRMAR = Target.the("Boton para abrir alerta").located(By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='confirmButton']"));
    public static final Target BTN_CLICK_ESCRIBIR = Target.the("Boton para abrir alerta").located(By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='promtButton']"));
    public static final Target LBL_RESULTADO_CLICK_CONFIRMAR = Target.the("").located(By.xpath("//span[@id='confirmResult']"));
    public static final Target LBL_RESULTADO_CLICK_ESCRIBIR = Target.the("").located(By.xpath("//button[@id='promptResult']"));

}
