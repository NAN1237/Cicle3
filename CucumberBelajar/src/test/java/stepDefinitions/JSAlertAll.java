package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertAll {

    WebDriver driver;


    @Given("User Buka Websitenya")
    public void s() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();


        //Open Browser
        driver.get("https://google.com");

        //Open URL
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);
    }

    @When("User Klik Tombol JS Alert")
    public void userKlikTombolJSAlert() throws InterruptedException {

        //Function / Method
        // 1
        WebElement JSAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
        JSAlert.click();
        Thread.sleep(1000);
    }

    @Then("User melihat Pop Up muncul dan melakukan asersi")
    public void x() {

        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert1.getText(), "I am a JS Alert");
    }


//    @Given("Chrome Driver")
//    public void c2() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
////        driver.manage().window().maximize();
//    }

    @When("Klik Tombol Ok JS Alert")
    public void klikTombolOkJSAlert() throws InterruptedException {
        System.out.println("ini sebelum click");
        Alert alert1 = driver.switchTo().alert();

        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert1.accept();
        System.out.println("ini sesudah click");
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

    @And("Close")
    public void xxx() {

        driver.quit();
    }

    @When("User Klik Tombol JS Confirm")
    public void userKlikTombolJSConfirm() throws InterruptedException {
        WebElement JSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        // 2a Cancel
        JSConfirm.click();
        Thread.sleep(3000);

        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());

    }


    @Then("User melihat Pop Up muncul dan melakukan asersi JS Confirm")
    public void userMelihatPopUpMunculDanMelakukanAsersiJSConfirm() {

        Alert alert2 = driver.switchTo().alert();

        //Tambahan di luar youtube
        Assert.assertEquals(alert2.getText(), "I am a JS Confirm");
    }

    @When("Klik Tombol Cancel Pop Up JS Confirm")
    public void klikTombolCancelPopUpJSConfirm() throws InterruptedException {

        Alert alert2 = driver.switchTo().alert();

        //Pengganti Function Klik Tombol Cancel Karena gaada Inspect nya

        alert2.dismiss();
        Thread.sleep(3000);
    }

    @Then("Asersi kalimat yang muncul setelah klik tombol Cancel JS Confirm")
    public void asersiKalimatYangMunculSetelahKlikTombolCancelJSConfirm() {

        WebElement ResultAlert2 = driver.findElement(By.xpath("//*[@id='result']"));

        //Cara Assertion 2
        String y = ResultAlert2.getText();
        System.out.println(y);
        Assert.assertEquals(y, "You clicked: Cancel");
    }

    @When("Klik Tombol OK Pop Up JS Confirm")
    public void klikTombolOKPopUpJSConfirm() throws InterruptedException {
        Alert alert2b = driver.switchTo().alert();

        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert2b.accept();
        Thread.sleep(3000);

    }

    @Then("Asersi kalimat yang muncul setelah klik tombol OK JS Confirm")
    public void asersiKalimatYangMunculSetelahKlikTombolOKJSConfirm() {

        WebElement ResultAlert2 = driver.findElement(By.id("result"));

        //Cara Assertion 2
        String y1 = ResultAlert2.getText();
        System.out.println(y1);
        Assert.assertEquals(y1, "You clicked: Ok");
    }

    @When("User Klik Tombol JS Prompt")
    public void userKlikTombolJSPrompt() throws InterruptedException {

        WebElement JSPrompt = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button"));

        // 3 Cancel

        JSPrompt.click();
        Thread.sleep(3000);

        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());


    }

    @Then("User melihat Pop Up muncul dan melakukan asersi JS Prompt")
    public void userMelihatPopUpMunculDanMelakukanAsersiJSPrompt() {

        Alert alert3 = driver.switchTo().alert();

        //Tambahan di luar youtube
        Assert.assertEquals(alert3.getText(), "I am a JS prompt");
    }

    @When("Klik Tombol Cancel Pop Up JS Prompt")
    public void klikTombolCancelPopUpJSPrompt() throws InterruptedException {

        Alert alert3 = driver.switchTo().alert();

        //Pengganti Function Klik Tombol Cancel Karena gaada Inspect nya
        alert3.dismiss();
        Thread.sleep(3000);
    }

    @Then("Asersi kalimat yang muncul setelah klik tombol Cancel JS Prompt")
    public void asersiKalimatYangMunculSetelahKlikTombolCancelJSPrompt() {

        WebElement ResultAlert3 = driver.findElement(By.xpath("//*[@id='result']"));

        //Cara Assertion 2
        String z = ResultAlert3.getText();
        System.out.println(z);
        Assert.assertEquals(z, "You entered: null");


    }

    @When("Isi Nama")
    public void isiNama() throws InterruptedException {

        Alert alert3b = driver.switchTo().alert();

        //Isi Sendkeys
        alert3b.sendKeys("MAHEN");
        Thread.sleep(3000);
    }

    @And("Klik Tombol OK Pop Up JS Prompt")
    public void klikTombolOKPopUpJSPrompt() throws InterruptedException {

        Alert alert3 = driver.switchTo().alert();

        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert3.accept();
        Thread.sleep(3000);
    }

    @Then("Asersi kalimat yang muncul setelah klik tombol OK JS Prompt")
    public void asersiKalimatYangMunculSetelahKlikTombolOKJSPrompt() throws InterruptedException {

        WebElement ResultAlert3 = driver.findElement(By.xpath("//*[@id='result']"));

        //Cara Assertion 2
        String z1 = ResultAlert3.getText();
        System.out.println(z1);
        Assert.assertEquals(z1, "You entered: MAHEN");
        Thread.sleep(3000);

        driver.quit();

    }

    @And("User Klik Tombol Ok JS Alert")
    public void userKlikTombolOkJSAlert() throws InterruptedException {
            System.out.println("ini sebelum click");
            Alert alert1 = driver.switchTo().alert();

            //Pengganti Function Klik Tombol OK karena gaada Inspect nya
            alert1.accept();
            System.out.println("ini sesudah click");
            Thread.sleep(3000);
    }
}


