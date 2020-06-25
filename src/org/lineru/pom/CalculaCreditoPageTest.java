package org.lineru.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CalculaCreditoPageTest {
    private WebDriver driver;
    CalculaCreditoPage calculaCreditoPage;

    @Before
    public void setUp() throws Exception {
        calculaCreditoPage = new CalculaCreditoPage(driver);
        driver = calculaCreditoPage.chromedriverconnection();
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
        calculaCreditoPage.calculacredito();
        System.out.println("paso");
    }
}