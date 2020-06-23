package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class InformacionPersonalPageTest {
    private WebDriver driver;
    InformacionPersonalPage informacionPersonalPage;

    @Before
    public void setUp() throws Exception {
        informacionPersonalPage = new InformacionPersonalPage(driver);
        driver = informacionPersonalPage.chromedriverconnection();
        driver.get("https://www.lineru.com/");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        informacionPersonalPage.informacion_personal();
    }
}