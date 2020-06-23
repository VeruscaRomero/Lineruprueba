package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class CreatuCuentaPageTest {
    private WebDriver driver;
    CreatuCuentaPage creatuCuentaPage;

    @Before
    public void setUp() throws Exception {
        creatuCuentaPage = new CreatuCuentaPage(driver);
        driver = creatuCuentaPage.chromedriverconnection();
        driver.get("https://www.lineru.com/");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        creatuCuentaPage.crea_cuenta();
    }
}