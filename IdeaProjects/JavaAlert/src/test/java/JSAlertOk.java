//import org.junit.After;
//import org.junit.Assert;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JSAlertOk {

    WebDriver driver;
    @Given("Tampilan PopUp JS Alert")
    public void tampilanPopUpJSAlert() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//    @Test
    //Buat Function
//    public void JavaAlerts() throws InterruptedException {

        //Open Browser
        driver.get("https://google.com");

        //Open URL
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);

        //Element Locator
        WebElement JSAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
        WebElement JSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement JSPrompt = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button"));

        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
        WebElement ResultAlert2 = driver.findElement(By.id("result"));
        WebElement ResultAlert3 = driver.findElement(By.xpath("//*[@id='result']"));

        //Function / Method
        // 1
        JSAlert.click();
        Thread.sleep(3000);

        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert1.getText(),"I am a JS Alert");


    }

    @When("Klik Tombol Ok JS Alert")
    public void klikTombolOkJSAlert() throws InterruptedException {
        Alert alert1 = driver.switchTo().alert();

        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert1.accept();
        Thread.sleep(3000);
    }

    @Then("Asersi kalimat yang muncul")
    public void asersiKalimatYangMuncul() {

        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));

        //Cara Assertion 2
        String x = ResultAlert1.getText();
        System.out.println(x);
        Assert.assertEquals(x, "You successfully clicked an alert");
    }
}
