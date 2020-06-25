package org.lineru.pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver= driver;
    }

    public WebDriver chromedriverconnection(){
        String ChromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void clear(By locator){
        driver.findElement(locator).clear();
    }

    public JavascriptExecutor executor (By locator){
         return (JavascriptExecutor) driver;
    }

    public JavascriptExecutor ClickByJS (By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", locator);
        return (JavascriptExecutor) driver;
    }

    public void executorScroll (){
        JavascriptExecutor executer = (JavascriptExecutor) driver;
        executer.executeScript("window.scrollBy(0,200)");
    }

    public void capture(String nombre) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        String fileWithPath = "C:/Imagenes/"+nombre;
        File destFile = new File(fileWithPath);
        FileUtils.copyFile(scrFile, destFile);
    }

}
