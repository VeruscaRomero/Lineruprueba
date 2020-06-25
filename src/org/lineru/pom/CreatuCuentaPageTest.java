package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatuCuentaPageTest {
    private WebDriver driver;
    CreatuCuentaPage creatuCuentaPage;

    @Before
    public void setUp() throws Exception {
        creatuCuentaPage = new CreatuCuentaPage(driver);
        driver = creatuCuentaPage.chromedriverconnection();
        driver.get("https://www.lineru.com/registro");
        driver.manage().window().maximize();
        Thread.sleep(2000);
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