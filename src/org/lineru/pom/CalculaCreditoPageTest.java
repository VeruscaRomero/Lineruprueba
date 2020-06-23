package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class CalculaCreditoPageTest {
    private WebDriver driver;
    CalculaCreditoPage calculaCreditoPage;

    @Before
    public void setUp() throws Exception {
        calculaCreditoPage = new CalculaCreditoPage(driver);
        driver = calculaCreditoPage.chromedriverconnection();
        driver.get("https://www.lineru.com/");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws Exception{
        calculaCreditoPage.calculacredito();
    }
}