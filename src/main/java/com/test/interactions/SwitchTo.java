package com.test.interactions;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SwitchTo {

    public static Iframe iframe(Target frame) {
        return Tasks.instrumented(Iframe.class, frame);
    }

    public static IframeDefault iframeDefault() {
        return Tasks.instrumented(IframeDefault.class);
    }
}
