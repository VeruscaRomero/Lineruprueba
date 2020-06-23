package org.lineru.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class InformacionLaboralPage extends Base{
    By actividad_eco = By.id("mat-select-6");
    By estudiante = By.id("mat-option-52");
    By ingresos_mensuales = By.id("mat-select-7");
    By ingresos = By.id("mat-option-60");
    By banco_sele = By.id("mat-select-8");
    By banco = By.id("mat-option-72");
    By dinero = By.id("mat-select-9");
    By educacion = By.id("mat-option-93");
    By script1 = By.xpath("//*[@id=\\\"step2\\\"]/div[2]/div[2]/form/div[3]/button");
    By siguiente = By.xpath("//*[@id=\\\"step3\\\"]/div[2]/div[2]/app-request-detail/form/button");
    By virtual_pass = By.id("virtual_password_0");
    By virtual_pass1 = By.id("virtual_password_1");
    By virtual_pass2 = By.id("virtual_password_2");
    By virtual_pass3 = By.id("virtual_password_3");
    By seguridad = By.id("mat-select-0");
    By luna_miel = By.id("mat-option-1");
    By pregunta_seguridad = By.id("mat-input-0");
    By seguridad_Selec = By.xpath("/html/body/app-root/app-account/app-request/account-security-question/div/div/div/div[2]/form/button");


    public void informacion_laboral () throws InterruptedException, IOException {
        executorScroll();
        click(actividad_eco);
        click(estudiante);
        click(ingresos_mensuales);
        click(ingresos);
        click(banco_sele);
        click(banco);
        click(dinero);
        click(educacion);
        executorScroll();
        executor(script1).executeScript("arguments[0].click();");
        executor(siguiente).executeScript("arguments[0].click();");
        click(virtual_pass);
        type("1", virtual_pass);
        click(virtual_pass1);
        type("1", virtual_pass1);
        click(virtual_pass2);
        type("1", virtual_pass2);
        click(virtual_pass3);
        type("1", virtual_pass3);
        click(seguridad);
        click(luna_miel);
        click(pregunta_seguridad);
        type("colombia", pregunta_seguridad);
        executor(seguridad_Selec).executeScript("arguments[0].click();");
        capture("laboral.png");
    }


    public InformacionLaboralPage(WebDriver driver) {
        super(driver);
    }
}
