package com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiIframe {

    public static final Target IFRAME = Target.the("Iframe simple").located(By.xpath("//div[@id ='frame1Wrapper']//iframe[@id = 'frame1']"));
    public static final Target LBL_TITULO = Target.the("Iframe simple").located(By.xpath("//h1[@id = 'sampleHeading']"));
    public static final Target BODY = Target.the("Body principal").located(By.xpath("//div[@class = 'body-height']"));


}
