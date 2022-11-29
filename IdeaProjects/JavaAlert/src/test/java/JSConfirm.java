import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConfirm {

    WebDriver driver;

    @Given("User Buka Websitenya")
    public void userBukaWebsitenyaTheInternetHerokuappComJavascript_alerts_Confirm() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//    @Test
//    //Buat Function
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


        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert1.accept();
        Thread.sleep(3000);

        //Cara Assertion 1
//        if (driver.getPageSource().contains("You successfully clicked an alert"));
//        System.out.println("You successfully clicked an alert");
//        System.out.println("=================================");

        //Cara Assertion 2
        String x = ResultAlert1.getText();
        System.out.println(x);
        Assert.assertEquals(x, "You successfully clicked an alert");
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
        Assert.assertEquals(alert2.getText(),"I am a JS Confirm");
    }
}
