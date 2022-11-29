package Base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hook.driver;


public class Function {

    public Function(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));



    @FindBy (css ="CLASS A")
    private WebElement TeamBtn;

    public void clickTeamBtn() {TeamBtn.click();}

    @FindBy (xpath ="//*[@id='root']/div[3]/div[1]/div[1]/a/div/div[1]/h1")
    WebElement GroupChatBtn;

//    public void clickGroupChatBtn() {GroupChatBtn.click();}

    public void clickwaitGroupChatBtn() {
    WebElement clickgroupchat = wait.until(ExpectedConditions.visibilityOf(GroupChatBtn));
    clickgroupchat.click();
    }



    @FindBy (xpath ="//*[@id='root']/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p")
    private WebElement TypeChatColumn;

    public void clickTypeChatColumn() {TypeChatColumn.click();}

    public void setChatColumn(String Chat) {TypeChatColumn.sendKeys(Chat);}

    public void clearText() {TypeChatColumn.clear();}

    @FindBy (xpath ="//*[@id='root']/div[3]/div[1]/div[2]/div/div[3]/div/div")
    private WebElement SendChat;

    public void clickSendChat() {SendChat.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement SelectChat;

    public void cursortochat() {SelectChat.click();}


    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
//  @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
    private WebElement ChatOption;

    public void clickchatoption() {ChatOption.click();}

    public void MovetoChatOption() {
        Actions action = new Actions(driver);
        action.moveToElement(ChatOption).perform();
        ChatOption.click();
    }

    @FindBy (xpath = "//html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/div[1]")
    private WebElement DeleteConfirm;

//    public void ClickDeleteConfirm() {
//        Actions action = new Actions(driver);
//        action.moveToElement(DeleteConfirm).perform();
//        DeleteConfirm.click();
//    }
    public void ClickDeleteConfirm() {DeleteConfirm.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/p[1]")
    private WebElement DeleteChat;

    public void clickDeleteChat() {DeleteChat.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/div[1]")
    private WebElement ConfirmDeleteChat;

    public void clickConfirmDeleteChat() {ConfirmDeleteChat.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/a[1]/div[1]/div[1]/h1[1]")
    private WebElement Board;

    public void clickBoard() {Board.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
    private WebElement ClickMoveBoard;
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")
    private WebElement TargetMove;

    public void clickMoveBoardAction() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(ClickMoveBoard, TargetMove).perform();
    }

    @FindBy (xpath = "//*[@id='notistack-snackbar']/text()")
    private WebElement SuccessPopUp;

    public void SuccessPopUpAssertion() {
    String x = SuccessPopUp.getText();
    System.out.println(x);
    Assert.assertEquals(x, "Success!");

    }

    @FindBy (xpath = "//*[@id='root']/div/div[3]/div/div/div[last()]")
    private WebElement AddListElement;

    public void AddList() {AddListElement.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement iii;
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement ooo;
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[last()]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement InputListElement;

    public void InputList(String List) {InputListElement.sendKeys(List);}

        //    //*[@id="root"]/div/div[3]/div/div/div[last()] List Board

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]/div[1]")
    private WebElement ii;
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]/div[1]")
    private WebElement oo;
    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[last()]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]/div[1]")
    private WebElement CreateBtnElement;

    public void ClickCreateBtn() {CreateBtnElement.click();}


    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]")
    private WebElement AddCardElement;

    public void ClickAddCard() {AddCardElement.click();}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/input[1]")
    private WebElement CardNameElement;

    public void InputCardName(String InputCardName) {CardNameElement.sendKeys(InputCardName);}

    @FindBy (xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]")
    private WebElement SubmitCardElement;

    public void SubmitAddCard() {SubmitCardElement.click();}

//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"

//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]"
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]"
//
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/p[1]"
//    "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/p[1]"

//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]"
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/input[1]"
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]"
//
//
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]"
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/input[1]"
//    "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]"

}
