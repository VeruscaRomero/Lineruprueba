package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InformacionLaboralPageTest {
    private WebDriver driver;
    InformacionLaboralPage informacionLaboralPage;

    @Before
    public void setUp() throws Exception {
        informacionLaboralPage = new InformacionLaboralPage(driver);
        driver = informacionLaboralPage.chromedriverconnection();
        driver.get("https://www.lineru.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        informacionLaboralPage.informacion_laboral();
    }
}