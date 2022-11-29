import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPromptCancel {

    WebDriver driver;

    @Given("Tampilan PopUp JS Promp")

    public void tampilanPopUpJSPromp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


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



        // 2a Cancel
        JSConfirm.click();
        Thread.sleep(3000);

        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert2.getText(),"I am a JS Confirm");

        //Pengganti Function Klik Tombol Cancel Karena gaada Inspect nya
        alert2.dismiss();
        Thread.sleep(3000);

        //Cara Assertion 1
//        if (driver.getPageSource().contains("You clicked: Cancel"));
//        System.out.println("You clicked: Cancel"]");
//        System.out.println("=================================");

        //Cara Assertion 2
        String y = ResultAlert2.getText();
        System.out.println(y);
        Assert.assertEquals(y, "You clicked: Cancel");

        // 2b OK

        JSConfirm.click();
        Thread.sleep(3000);

        Alert alert2b = driver.switchTo().alert();
        System.out.println(alert2b.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert2b.getText(),"I am a JS Confirm");

        //Pengganti Function Klik Tombol OK karena gaada Inspect nya
        alert2b.accept();
        Thread.sleep(3000);

        //Cara Assertion 1
//        if (driver.getPageSource().contains("You clicked: Ok"));
//        System.out.println("You clicked: Ok");
//        System.out.println("=================================");

        //Cara Assertion 2
        String y1 = ResultAlert2.getText();
        System.out.println(y1);
        Assert.assertEquals(y1, "You clicked: Ok");

        // 3 Cancel

        JSPrompt.click();
        Thread.sleep(3000);

        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());

        //Tambahan di luar youtube
        Assert.assertEquals(alert3.getText(),"I am a JS prompt");

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
}
