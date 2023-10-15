package com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CerrarVentana implements Interaction {

    private final Target elemento;

    public CerrarVentana(Target elemento) {
        this.elemento = elemento;
    }

    public static CerrarVentana emergente(Target elemento) {
        return Tasks.instrumented(CerrarVentana.class, elemento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String ventanaPrincipal = getDriver().getWindowHandle();
        Set<String> ventanasAbiertas = getDriver().getWindowHandles();

        String segundaVentana = (String) ventanasAbiertas.toArray()[1];
        getDriver().switchTo().window(segundaVentana);

        System.out.println("Texto::: " + Text.of(elemento).viewedBy(actor).asString());
        getDriver().close();
        getDriver().switchTo().window(ventanaPrincipal);
    }
}
