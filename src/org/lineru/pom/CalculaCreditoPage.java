package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CalculaCreditoPage extends Base {
    //*[@id="mat-input-1"]
        By calcula_dineroLocator = By.xpath("//*[@id=\"mat-input-0\"]");
        By fechaPagoLocator = By.xpath("//*[@id=\"mat-input-1\"]");
        By fechaselecLocator = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[4]/td[6]");
        By listaCompraLocator = By.xpath("/html/body/div[3]/div/div/button");
        By solicitudCreditoLocator = By.xpath("/html/body/app-root/app-init/div[1]/div[2]/div[3]/shared-calculator/div/div[1]/div/form/button[1]");
        By text_inicio = By.xpath("/html/body/app-root/app-auth-register/div/div[2]/div/div/div[1]/div/h3[1]");

        public void calculacredito() throws InterruptedException, IOException {
            click(calcula_dineroLocator);
            clear(calcula_dineroLocator);
            type("300000", calcula_dineroLocator);
            Thread.sleep(2000);
            click(calcula_dineroLocator);
            click(fechaPagoLocator);
            click(fechaselecLocator);
            executorScroll();
            click(listaCompraLocator);
            click(solicitudCreditoLocator);
            Thread.sleep(5000);
            //assertEquals(text_inicio, "Crea tu cuenta Lineru");
            capture("credito.png");
        }

    public CalculaCreditoPage(WebDriver driver) {
        super(driver);
    }
}
