package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class InformacionPersonalPage extends Base{

    By segundo_nombre = By.id("mat-input-5");
    By primer_ape = By.id("mat-input-6");
    By segund_ape = By.id("segund_ape");
    By fecha_nacimiento = By.id("mat-input-8");
    By exp_documento = By.id("exp_documento");
    By primer_js = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[1]/form-radio[1]/div/div/div[1]/label/div");
    By estado_civil = By.xpath("//*[@id=\"mat-select-2\"]/div");
    By union_libre = By.xpath("//*[@id=\"mat-option-26\"]");
    By hijos = By.xpath("//*[@id=\\\"live_with-Hijos\\\"]");
    By select1 = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[1]/form-radio[2]/div/div/div[2]/label");
    By select2 = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[1]/form-radio[3]/div/div/div[2]/label");
    By estudios = By.xpath("//*[@id=\"mat-select-3\"]/div");
    By profesional = By.xpath("//*[@id=\"mat-option-33\"]");
    By ciudad_depart = By.id("mat-input-11");
    By ciudad = By.id("mat-option-1005");
    By direccion = By.id("mat-input-12");
    By estrato = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[2]/form-radio/div/div/div[3]/label");
    By tiempo = By.xpath("//*[@id=\"mat-select-4\"]/div");
    By anos = By.xpath("//*[@id=\"mat-option-39\"]");
    By segundo_js = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[3]/form-radio/div/div/div[1]/label");
    By tercer_js = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[4]/form-radio/div/div/div[3]/label");
    By nosotros = By.xpath("//*[@id=\"mat-select-5\"]");
    By google = By.xpath("//*[@id=\"mat-option-46\"]");
    By guardar = By.xpath("//*[@id=\\\"step1\\\"]/div[2]/div[2]/form/div[7]/button");

    public void informacion_personal() throws InterruptedException, IOException {
        click(segundo_nombre);
        type("prueba", segundo_nombre);
        click(primer_ape);
        type("perez", primer_ape);
        click(segund_ape);
        type("prueba",segund_ape);
        executorScroll();
        click(fecha_nacimiento);
        type("12/9/1989", fecha_nacimiento);
        click(exp_documento);
        type("11/7/2019", exp_documento);
        executorScroll();
        executor(primer_js).executeScript("arguments[0].click();");
        click(estado_civil);
        executorScroll();
        click(union_libre);
        executorScroll();
        executor(hijos).executeScript("arguments[0].click();");
        executor(select1).executeScript("arguments[0].click();");
        executor(select2).executeScript("arguments[0].click();");
        executorScroll();
        click(estudios);
        click(profesional);
        executorScroll();
        click(ciudad_depart);
        click(ciudad);
        click(direccion);
        type("direccion prueba", direccion);
        executorScroll();
        executor(estrato).executeScript("arguments[0].click();");
        click(tiempo);
        click(anos);
        executorScroll();
        executor(segundo_js).executeScript("arguments[0].click();");
        executorScroll();
        executor(tercer_js).executeScript("arguments[0].click();");
        click(nosotros);
        click(google);
        executor(guardar).executeScript("arguments[0].click();");
        capture("personal.png");

    }


    public InformacionPersonalPage(WebDriver driver) {
        super(driver);
    }
}
