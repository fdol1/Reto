package com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteraccionConAlertas implements Interaction {

    public InteraccionConAlertas() {
    }

    public static InteraccionConAlertas emergentes() {
        return Tasks.instrumented(InteraccionConAlertas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String textoAlerta = alert.getText();

        System.out.println("alerta: " + textoAlerta);

        alert.accept();
    }
}
