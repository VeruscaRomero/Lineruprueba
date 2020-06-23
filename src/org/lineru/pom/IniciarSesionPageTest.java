package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class IniciarSesionPageTest {
    private WebDriver driver;
    IniciarSesionPage iniciarSesionPage;

    @Before
    public void setUp() throws Exception {
        iniciarSesionPage = new IniciarSesionPage(driver);
        driver = iniciarSesionPage.chromedriverconnection();
        driver.get("https://www.lineru.com/");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        iniciarSesionPage.iniciar_sesion();
    }

}