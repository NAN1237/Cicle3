import com.google.common.annotations.VisibleForTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class midtranstest {
    @Test
    public void mttest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate WEB

        driver.get("https://demo.midtrans.com/");

        // Element Locator

//      WebElement Name = driver.findElement(By.cssSelector("elemennya apa"));
        WebElement Name = driver.findElement(By.cssSelector("input[value='Budi']"));
        WebElement Email = driver.findElement(By.cssSelector("input[value='budi@utomo.com']"));
        WebElement Phone = driver.findElement(By.cssSelector("input[data-reactid='.0.0.1.0.3.0.0.2.1.0']"));
//      String strtext = Name.getAttribute("value");

        WebElement buyBtn = driver.findElement(By.cssSelector(".btn.buy"));

        // strText = "Budi"

        //Function / Methods
        buyBtn.click();
        Name.sendKeys(Keys.DELETE);

        // cara 1

//        for (int i = 0; i < strtext.length(); i++) {
//            Name.sendKeys(Keys.DELETE);
//            Thread.sleep(1000);
//        }

//        Name.sendKeys("INI TESTING");
//        Thread.sleep(3000);

        // cara 2
        Name.clear();
        Name.sendKeys("Nanda coy");
        Thread.sleep(2000);

        Email.clear();
        Email.sendKeys("nanda@mail.com");
        Thread.sleep(2000);

        Phone.clear();
        Phone.sendKeys("080989999");
        Thread.sleep(2000);

//        Assert.assertEquals(strtext, "Budi");

        driver.quit();

    }
}
