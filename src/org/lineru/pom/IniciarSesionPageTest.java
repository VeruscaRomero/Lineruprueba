package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class IniciarSesionPageTest {
    private WebDriver driver;
    IniciarSesionPage iniciarSesionPage;

    @Before
    public void setUp() throws Exception {
        iniciarSesionPage = new IniciarSesionPage(driver);
        driver = iniciarSesionPage.chromedriverconnection();
        driver.get("https://www.lineru.com/iniciar-sesion");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        iniciarSesionPage.iniciar_sesion();
        System.out.println("Paso");
    }

}