import io.cucumber.java.en.And;
import org.junit.After;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JSAlert {

    WebDriver driver;

//    @Before
//    //Buat Function
//    public void AlertsJava() {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

//    @Test
//
//    //Element Locator
//    WebElement JSAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
//    WebElement JSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//    WebElement JSPrompt = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button"));
//
//    WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
//    WebElement ResultAlert2 = driver.findElement(By.id("result"));
//    WebElement ResultAlert3 = driver.findElement(By.xpath("//*[@id='result']"));

    @Given("User Buka Websitenya1")
    public void ccc() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open Browser
        driver.get("https://google.com");

        //Open URL
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
    }

//    @And("Kilk Tombol OK Pada Pop UP JS Alert")
//    public void www() throws InterruptedException {
//        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
//        Alert alert1 = driver.switchTo().alert();
//        alert1.accept();
//        Thread.sleep(3000);
//    }

    @When("User Klik Tombol JS Alert")
    public void zzz() throws InterruptedException {
        //Function / Method
        // 1
        WebElement JSAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
        JSAlert.click();
        Thread.sleep(3000);

    }

//    @And("Asersi kalimat yang muncul")
//    public void iii(){
//        //Cara Assertion 2
//        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
//        String x = ResultAlert1.getText();
//
//    }

    @Then("User melihat Pop Up muncul dan melakukan asersi")
    public void yyy() {
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert1.getText(),"I am a JS Alert");
    }
//    @And("Println JS Alert")
//    public void ooo(){
//        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
//        String x = ResultAlert1.getText();
//        System.out.println(x);
//    }

//    @Given("Tampilan PopUp JS Alert")
//    public void tampilanPopUpJSAlert() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
////    @Test
//        //Buat Function
////    public void JavaAlerts() throws InterruptedException {
//
//        //Open Browser
//        driver.get("https://google.com");
//
//        //Open URL
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        Thread.sleep(3000);
//
//        //Element Locator
//        WebElement JSAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
//        WebElement JSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//        WebElement JSPrompt = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button"));
//
//        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
//        WebElement ResultAlert2 = driver.findElement(By.id("result"));
//        WebElement ResultAlert3 = driver.findElement(By.xpath("//*[@id='result']"));
//
//        //Function / Method
//        // 1
//        JSAlert.click();
//        Thread.sleep(3000);
//
//        Alert alert1 = driver.switchTo().alert();
//        System.out.println(alert1.getText());
//
//        //Tambahan di luar youtube
//        Assert.assertEquals(alert1.getText(),"I am a JS Alert");
//
//
//    }
//
//    @When("Klik Tombol Ok JS Alert")
//    public void klikTombolOkJSAlert() throws InterruptedException {
//        Alert alert1 = driver.switchTo().alert();
//
//        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
//        alert1.accept();
//        Thread.sleep(3000);
//    }
//
//    @Then("Asersi kalimat yang muncul")
//    public void asersiKalimatYangMuncul() {
//
//        WebElement ResultAlert1 = driver.findElement(By.xpath("//*[@id='result']"));
//
//        //Cara Assertion 2
//        String x = ResultAlert1.getText();
//        System.out.println(x);
//        Assert.assertEquals(x, "You successfully clicked an alert");
//    }


}


