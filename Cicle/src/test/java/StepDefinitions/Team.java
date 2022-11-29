package StepDefinitions;

import Base.Function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Team {
    // Bisa dilihat di Pertemuan 38 A - 22.11.22 - Fahmi 3:03:00

    private WebDriver driver;

    public Team() {
        super();
//        PageFactory.initElements(driver, this);
        this.driver=Hook.driver;
    }
        @Given("User Click Group Chat")
        public void userClickGroupChat() throws InterruptedException{
//            Thread.sleep(7000);
            Function x = new Function(driver);

//            Thread.sleep(7000);
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement xy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div[3]/div[1]/div[1]/a/div/div[1]/h1")));
//            xy.click();
//            x.clickGroupChatBtn();

            x.clickwaitGroupChatBtn();
    }

        @When("Type Chat")
        public void typeClickSubmit() throws InterruptedException{
            Thread.sleep(7000);
            Function y = new Function(driver);

            Thread.sleep(7000);
            y.clickTypeChatColumn();

            Thread.sleep(7000);
            y.setChatColumn("A123");
        }


        @Then("Click Send & Chat is appear")
        public void chatIsAppear() throws InterruptedException{
            Thread.sleep(7000);
            Function z = new Function(driver);

            Thread.sleep(7000);
            z.clickSendChat();
        }


    @Then("Clear chat before submit")
    public void clearChatBeforeSubmit() throws InterruptedException{
        Thread.sleep(7000);
        Function z1 = new Function(driver);

        Thread.sleep(7000);
        z1.clearText();

        Thread.sleep(7000);
    }

    @When("Click Delete Chat Option")
    public void deleteChatOption() throws InterruptedException{
        Thread.sleep(7000);
        Function z2 = new Function(driver);

        Thread.sleep(7000);
        z2.cursortochat();

        Thread.sleep(7000);
        z2.MovetoChatOption();
//        z2.clickchatoption();

    }

    @Then("Click Delete chat After submit")
    public void clearChatAfterSubmit() throws InterruptedException{


        Thread.sleep(7000);
        Function z3 = new Function(driver);

        Thread.sleep(7000);
        z3.clickDeleteChat();

        Thread.sleep(7000);
        z3.ClickDeleteConfirm();

        Thread.sleep(7000);
    }

    @Given("User Click Board")
    public void userClickBoard() throws InterruptedException{

        Function z7 = new Function(driver);

        Thread.sleep(7000);
        z7.clickBoard();
    }

    @When("Click Card & Move Card")
    public void clickCard() throws InterruptedException {

        Function z8 = new Function(driver);

        Thread.sleep(7000);
        z8.clickMoveBoardAction();
    }

    @Then("Assertion")
    public void Assertion() throws InterruptedException {

        Function z9 = new Function(driver);

        Thread.sleep(7000);
        z9.SuccessPopUpAssertion();
    }


    @When("User Click Add List & Input List Name")
    public void inputListName() throws InterruptedException{
        Function z10 = new Function(driver);

        Thread.sleep(7000);
        z10.AddList();

        Thread.sleep(7000);
        z10.InputList("A123");
    }

    @Then("Click Create List")
    public void clickCreateList() throws InterruptedException{
        Function z11 = new Function(driver);

        Thread.sleep(7000);
        z11.ClickCreateBtn();

        Thread.sleep(7000);
    }

    @When("User Click Add Card")
    public void userClickAddCard() throws InterruptedException {
        Function z12 = new Function(driver);

        Thread.sleep(7000);
        z12.ClickAddCard();
        Thread.sleep(7000);
    }

    @And("Input Card Name")
    public void inputCardName() throws InterruptedException {
        Function z13 = new Function(driver);

        z13.InputCardName("A321");
        Thread.sleep(7000);
    }

    @Then("Click Add Card")
    public void clickAddCard() throws InterruptedException {
        Function z16 = new Function(driver);

        z16.SubmitAddCard();
        Thread.sleep(7000);
    }
}
