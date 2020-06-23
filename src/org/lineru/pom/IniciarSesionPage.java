package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class IniciarSesionPage extends Base{
      By scroll_comprasLocator = By.xpath("/html/body/div[3]/div/div/button/span");
      By cuentaLocator = By.xpath("//a[@role='button'][contains(.,'Mi cuenta')]");
      By documentoLocator = By.id("mat-input-2");
      By passLocator = By.id("mat-input-3");
      By iniciar_sesionLocator = By.xpath("//button[@type='submit'][contains(.,'Iniciar sesión')]");
      By suscripcionLocator = By.xpath("//*[@id=\\\"onesignal-popover-cancel-button\\\"]");

      public void iniciar_sesion() throws InterruptedException, IOException {
            click(scroll_comprasLocator);
            click(cuentaLocator);
            click(documentoLocator);
            type("1048460298", documentoLocator);
            click(passLocator);
            type("12345678", passLocator);
            executor(iniciar_sesionLocator).executeScript("arguments[0].click();");
            executor(suscripcionLocator).executeScript("arguments[0].click();");
            capture("login.png");
            Thread.sleep(5000);


    }

    public IniciarSesionPage(WebDriver driver) {
        super(driver);
    }
}
