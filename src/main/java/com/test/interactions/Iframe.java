package com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Iframe implements Interaction {

    private Target target;

    public Iframe(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().switchTo().frame(target.resolveFor(actor));
    }
}
