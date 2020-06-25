package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class IniciarSesionPage extends Base{
      By documentoLocator = By.id("mat-input-0");
      By passLocator = By.id("mat-input-1");
      By iniciar_sesionLocator = By.xpath("//button[@type='submit'][contains(.,'Iniciar sesión')]");
      By suscripcionLocator = By.xpath("//*[@id=\\\"onesignal-popover-cancel-button\\\"]");

      public void iniciar_sesion() throws InterruptedException, IOException {
            click(documentoLocator);
            type("1048460298", documentoLocator);
            click(passLocator);
            type("12345678", passLocator);
            click(iniciar_sesionLocator);
            //executor(iniciar_sesionLocator).executeScript("arguments[0].click();");
            // executor(suscripcionLocator).executeScript("arguments[0].click();");
            capture("login.png");
            Thread.sleep(5000);
    }

    public IniciarSesionPage(WebDriver driver) {
        super(driver);
    }
}
