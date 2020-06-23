package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class CalculaCreditoPage extends Base {
        By calcula_dineroLocator = By.xpath("//*[@id=\\\"mat-input-1\\\"]");
        By fechaPagoLocator = By.xpath("//*[@id=\\\"mat-datepicker-0\\\"]/div/mat-month-view/table/tbody/tr[4]/td[2]/div");
        By fechaselecLocator = By.xpath("/html/body/div[3]/div/div/button");
        By listaCompraLocator = By.xpath("(//button[@role='button'])[4]");
        By solicitudCreditoLocator = By.xpath("(//button[@role='button'])[9]");
        By text_inicio = By.xpath("/html/body/app-root/app-auth-login/div/div[2]/div/div/div[1]/div/h3[1]");

        public void calculacredito() throws InterruptedException, IOException {
            click(calcula_dineroLocator);
            clear(calcula_dineroLocator);
            type("300000", calcula_dineroLocator);
            Thread.sleep(2000);
            click(calcula_dineroLocator);
            click(fechaPagoLocator);
            click(fechaselecLocator);
            executorScroll();
            executor(listaCompraLocator).executeScript("arguments[0].click();");
            executor(solicitudCreditoLocator).executeScript("arguments[0].click();");
            Thread.sleep(5000);
            assertEquals(text_inicio, "Inicia sesión en Lineru");
            capture("credito.png");
        }

    public CalculaCreditoPage(WebDriver driver) {
        super(driver);
    }
}
