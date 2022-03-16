import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Prova_Sicred {
private WebDriver navegador;
    @Test

    public void testLogin () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Public/WebDriver/chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(navegador, 60);


        //Selecionar a caixa Switch theme
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("switch-version-select")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("switch-version-select")));
        navegador.findElement(By.id("switch-version-select")).click();


        //Selecionar a caixa “Bootstrap V4 Theme”
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Bootstrap V4 Theme")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Bootstrap V4 Theme")));
        navegador.findElement(By.id("Bootstrap V4 Theme")).click();

// Clicar no botao Add Customer

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnDownload")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btnDownload")));
        navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[1]/a")).click();





// Digitar o CustomerName
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-customerName")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-customerName")));
        navegador.findElement(By.id("field-customerName")).click();
        navegador.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");



// Digitar o ContactLastName
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-contactLastName")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-contactLastName")));
        navegador.findElement(By.id("field-contactLastName")).click();
        navegador.findElement(By.id("field-contactLastName")).sendKeys("Teste");


// Digitar o ContactFirstName
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-contactFirstName")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-contactFirstName")));
        navegador.findElement(By.id("field-contactFirstName")).click();
        navegador.findElement(By.id("field-contactFirstName")).sendKeys("seu nome");




// Digitar o phone
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-phone")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-phone")));
        navegador.findElement(By.id("field-phone")).click();
        navegador.findElement(By.id("field-phone")).sendKeys("51 9999-9999");


// Digitar o addressLine1
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-addressLine2")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-addressLine2")));
        navegador.findElement(By.id("field-addressLine2")).click();
        navegador.findElement(By.id("field-addressLine2")).sendKeys("Av Assis Brasil, 3970");



// Digitar o addressLine2
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-addressLine1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-addressLine1")));
        navegador.findElement(By.id("field-addressLine1")).click();
        navegador.findElement(By.id("field-addressLine1")).sendKeys("Torre D");



// Digitar o city
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-city")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-city")));
        navegador.findElement(By.id("field-city")).click();
        navegador.findElement(By.id("ffield-city")).sendKeys("Porto Alegre");


// Digitar o state
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-state")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-state")));
        navegador.findElement(By.id("field-state")).click();
        navegador.findElement(By.id("field-state")).sendKeys("RS");



// Digitar o postalCode
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-postalCode")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-postalCode")));
        navegador.findElement(By.id("field-postalCode")).click();
        navegador.findElement(By.id("field-postalCode")).sendKeys("91000-000");



// Digitar o country
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-country")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-country")));
        navegador.findElement(By.id("field-country")).click();
        navegador.findElement(By.id("field-country")).sendKeys("Brasil");


// Digitar o salesRepEmployeeNumber
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-salesRepEmployeeNumber")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-salesRepEmployeeNumber")));
        navegador.findElement(By.id("field-salesRepEmployeeNumber")).click();
        navegador.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("Fixter");


// Digitar o creditLimit
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-creditLimit")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-creditLimit")));
        navegador.findElement(By.id("field-creditLimit")).click();
        navegador.findElement(By.id("field-creditLimit")).sendKeys("200");


// Digitar o delete
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-deleted")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("field-deleted")));
        navegador.findElement(By.id("field-deleted")).click();
        navegador.findElement(By.id("field-deleted")).sendKeys("");


// Clicar no botao save

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-button-save")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("form-button-save")));
        navegador.findElement(By.id("form-button-save")).click();



// Valida Mensagem
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[15]/div[2]/p")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[15]/div[2]/p")));

}