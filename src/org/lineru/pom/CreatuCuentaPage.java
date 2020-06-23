package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CreatuCuentaPage extends Base {
    By primer_nombreLocator = By.id("mat-input-2");
    By cedulaLocator = By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]");
    By documentoLocator = By.xpath("//*[@id=\"mat-option-1\"]");
    By numeroLocator = By.id("mat-input-3");
    By numero_telefonoLocator = By.id("mat-input-4");
    By correoLocator = By.id("mat-input-5");
    By passLocator = By.id("mat-input-6");
    By acepto_terminoLocator = By.xpath("//label[contains(@for,'terms-0')]");
    By autorizoLocator = By.xpath("//label[contains(@for,'copyright-0')]");
    By boton_siguienteLocator =  By.xpath("//button[@type='submit'][contains(.,'Siguiente')]");

    public void crea_cuenta() throws InterruptedException, IOException {
        executorScroll();
        click(primer_nombreLocator);
        type("Verusca", primer_nombreLocator);
        Thread.sleep(20000);
        click(cedulaLocator);
        click(documentoLocator);
        Thread.sleep(20000);
        click(numeroLocator);
        type("1048460298", numeroLocator);
        executorScroll();
        click(numero_telefonoLocator);
        type("3057352282", numero_telefonoLocator);
        executorScroll();
        click(correoLocator);
        type("pruebaverusca@prueba.com", correoLocator);
        click(passLocator);
        type("12345678", passLocator);
        executor(acepto_terminoLocator).executeScript("arguments[0].click();");
        executor(autorizoLocator).executeScript("arguments[0].click();");
        executor(boton_siguienteLocator).executeScript("arguments[0].click();");
        capture("cuenta.png");

    }

    public CreatuCuentaPage(WebDriver driver) {
        super(driver);
    }
}
