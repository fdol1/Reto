package com.test.userinterface;

import com.test.util.Constantes;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(Constantes.URL_PORTAL)
public class HomePage extends PageObject {
    public static final Target LIST_ELEMENT_HOME_PAGE = Target.the("Seccion de elementos").located(By.xpath("//div[@class = 'card mt-4 top-card']"));
}