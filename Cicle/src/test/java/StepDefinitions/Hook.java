package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hook {

    public static WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException {

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agents=DN");
        chrome_options.addArguments("--profile-directory=default");
        chrome_options.addArguments("user-data-dir=C:\\Users\\ASUS\\AppData\\Local\\Google\\Chrome\\User Data");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver(chrome_options);
        driver.manage().window().maximize();
        driver.get("https://staging.cicle.app/");
//        Thread.sleep(13000);
//        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[4]/a[2]/div/div[1]/h1")).click();

        // Pengganti Thread Sleep Lebih Cepat
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement xy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div[3]/div[4]/a[2]/div/div[1]/h1")));
        xy.click();
    }

    @After
    public void closeBrowser() {driver.quit(); }
}