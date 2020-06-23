package org.lineru.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class Pagina1 {
    String baseURL="https://www.lineru.com/";
    WebDriver driver;
    String expectedResult="";
    String actualResult= "";
    String ChromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    @BeforeTest
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

   @Test(priority = 1)
    public void calcula_credito() throws InterruptedException, IOException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement dinero  = this.webElement("mat-input-0", true);
        dinero.click();
        dinero.clear();
        dinero.sendKeys("300000");
        Thread.sleep(2000);
        this.webElement("//*[@id=\"mat-input-1\"]", false).click();
        this.webElement("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[4]/td[2]/div", false).click();
        this.webElement("/html/body/div[3]/div/div/button", false).click();
        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("(//button[@role='button'])[4]", false));
        executor.executeScript("arguments[0].click();", this.webElement("(//button[@role='button'])[9]", false));
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void crea_tu_cuenta() throws InterruptedException, IOException {
        calcula_credito();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        WebElement primer_nombre  = this.webElement("mat-input-2", true);
        primer_nombre.click();
        primer_nombre.sendKeys("Verusca");
        Thread.sleep(20000);
        WebElement cedula  = this.webElement("//*[@id=\"mat-select-0\"]/div/div[2]", false);
        cedula.click();
        WebElement documento = this.webElement("//*[@id=\"mat-option-1\"]", false);
        documento.click();
        Thread.sleep(20000);
        WebElement numero  = this.webElement("mat-input-3", true);
        numero.click();
        numero.sendKeys("1048460298");
        executor.executeScript("window.scrollBy(0,400)");
        WebElement numero_telefono  = this.webElement("mat-input-4", true);
        numero_telefono.click();
        numero_telefono.sendKeys("3057352282");
        executor.executeScript("window.scrollBy(0,200)");
        WebElement correo  = this.webElement("mat-input-5", true);
        correo.click();
        correo.sendKeys("pruebaverusca@prueba.com");
        WebElement pass  = this.webElement("mat-input-6", true);
        pass.click();
        pass.sendKeys("12345678");
        executor.executeScript("arguments[0].click();", this.webElement("//label[contains(@for,'terms-0')]", false));
        executor.executeScript("arguments[0].click();", this.webElement("//label[contains(@for,'copyright-0')]", false));
        executor.executeScript("arguments[0].click();", this.webElement("//button[@type='submit'][contains(.,'Siguiente')]", false));
        Thread.sleep(20000);
    }

    @Test(priority = 3)
    public void iniciar_sesion() throws InterruptedException, IOException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        this.webElement("/html/body/div[3]/div/div/button/span", false).click();
        WebElement cuenta  = this.webElement("//a[@role='button'][contains(.,'Mi cuenta')]", false);
        cuenta.click();
        WebElement documento = this.webElement("mat-input-2", true);
        documento.click();
        documento.sendKeys("1048460298");
        WebElement pass = this.webElement("mat-input-3", true);
        pass.click();
        pass.sendKeys("12345678");
        executor.executeScript("arguments[0].click();", this.webElement("//button[@type='submit'][contains(.,'Iniciar sesión')]", false));
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"onesignal-popover-cancel-button\"]", false));
    }

    @Test(priority = 4)
    public void informacion_personal() throws InterruptedException, IOException {
        iniciar_sesion();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement segundo_nombre = this.webElement("mat-input-5", true);
        segundo_nombre.click();
        segundo_nombre.sendKeys("prueba");
        WebElement primer_ape = this.webElement("mat-input-6", true);
        primer_ape.click();
        primer_ape.sendKeys("romero");
        WebElement segund_ape = this.webElement("mat-input-7", true);
        segund_ape.click();
        segund_ape.sendKeys("prueba");
        executor.executeScript("window.scrollBy(0,200)");
        WebElement fecha_nacimiento = this.webElement("mat-input-8", true);
        fecha_nacimiento.click();
        fecha_nacimiento.sendKeys("12/9/1989");
        WebElement exp_documento = this.webElement("mat-input-10", true);
        exp_documento.click();
        exp_documento.sendKeys("11/7/2019");
        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[1]/form-radio[1]/div/div/div[1]/label/div", false));
        WebElement estado_civil  = this.webElement("//*[@id=\"mat-select-2\"]/div", false);
        estado_civil.click();
        executor.executeScript("window.scrollBy(0,200)");
        WebElement uni_libre = this.webElement("//*[@id=\"mat-option-26\"]", false);
        uni_libre.click();
        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"live_with-Hijos\"]", false));
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[1]/form-radio[2]/div/div/div[2]/label", false));
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[1]/form-radio[3]/div/div/div[2]/label", false));

        executor.executeScript("window.scrollBy(0,200)");

        WebElement estudios  = this.webElement("//*[@id=\"mat-select-3\"]/div", false);
        estudios.click();
        WebElement profesional = this.webElement("//*[@id=\"mat-option-33\"]", false);
        profesional.click();

        executor.executeScript("window.scrollBy(0,200)");
        WebElement ciudad_depart = this.webElement("mat-input-11", true);
        ciudad_depart.click();
        WebElement ciudad = this.webElement("mat-option-1005", true);
        ciudad.click();

        WebElement direccion = this.webElement("mat-input-12", true);
        direccion.click();
        direccion.sendKeys("direccion prueba");

        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[2]/form-radio/div/div/div[3]/label", false));

        WebElement tiempo  = this.webElement("//*[@id=\"mat-select-4\"]/div", false);
        tiempo.click();
        WebElement anos = this.webElement("//*[@id=\"mat-option-39\"]", false);
        anos.click();

        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[3]/form-radio/div/div/div[1]/label", false));
        executor.executeScript("window.scrollBy(0,200)");

        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[4]/form-radio/div/div/div[3]/label", false));

        WebElement nosotros  = this.webElement("//*[@id=\"mat-select-5\"]", false);
        nosotros.click();
        WebElement google = this.webElement("//*[@id=\"mat-option-46\"]", false);
        google.click();

        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step1\"]/div[2]/div[2]/form/div[7]/button", false));

        driver.close();

    }

    @Test(priority = 5)
    public void informacion_laboral() throws InterruptedException, IOException {
        iniciar_sesion();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        WebElement actividad_eco  = this.webElement("mat-select-6", true);
        actividad_eco.click();
        WebElement estudiante = this.webElement("mat-option-52", true);
        estudiante.click();

        WebElement ingresos_mensuales  = this.webElement("mat-select-7", true);
        ingresos_mensuales.click();
        WebElement ingreso = this.webElement("mat-option-60", true);
        ingreso.click();
        WebElement banco_sele  = this.webElement("mat-select-8", true);
        banco_sele.click();
        WebElement banco = this.webElement("mat-option-72", true);
        banco.click();

        WebElement dinero  = this.webElement("mat-select-9", true);
        dinero.click();
        WebElement educacion = this.webElement("mat-option-93", true);
        educacion.click();
        executor.executeScript("window.scrollBy(0,200)");
        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step2\"]/div[2]/div[2]/form/div[3]/button", false));

        executor.executeScript("arguments[0].click();", this.webElement("//*[@id=\"step3\"]/div[2]/div[2]/app-request-detail/form/button", false));

        WebElement virtual_password = this.webElement("virtual_password_0", true);
        virtual_password.click();
        virtual_password.sendKeys("1");

        WebElement virtual_password1 = this.webElement("virtual_password_1", true);
        virtual_password1.click();
        virtual_password1.sendKeys("1");

        WebElement virtual_password2 = this.webElement("virtual_password_2", true);
        virtual_password2.click();
        virtual_password2.sendKeys("1");

        WebElement virtual_password3 = this.webElement("virtual_password_3", true);
        virtual_password3.click();
        virtual_password3.sendKeys("1");

        WebElement seguridad  = this.webElement("mat-select-0", true);
        seguridad.click();
        WebElement luna_miel = this.webElement("mat-option-1", true);
        luna_miel.click();

        WebElement pregunta_seguridad  = this.webElement("mat-input-0", true);
        pregunta_seguridad.click();
        pregunta_seguridad.sendKeys("colombia");

        executor.executeScript("arguments[0].click();", this.webElement("/html/body/app-root/app-account/app-request/account-security-question/div/div/div/div[2]/form/button", false));
        driver.close();
    }

    private WebElement webElement(String xpath, boolean isId)
    {
        if (isId)
        {
        return driver.findElement(By.id(xpath));
        }
        else
            {
                return driver.findElement(By.xpath(xpath));
            }
    }
}