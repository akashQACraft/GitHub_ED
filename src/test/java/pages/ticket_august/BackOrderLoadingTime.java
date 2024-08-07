package pages.ticket_august;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class BackOrderLoadingTime extends TestDriverActions {

    @FindBy(xpath = "//span[contains(text(),'Counter Sale Manager')]")
    WebElement title_CounterSaleManager;

    @FindBy(xpath = "//h1[contains(.,'To Be Invoiced')]")
    WebElement ToBeInvoiced;

    @FindBy(xpath = "(//a[contains(.,'Back Orders')])[2]")
    WebElement btn_BackOrders;

   @FindBy(xpath = "//td[contains(.,'Back Orders Not Yet Fulfilled')]")
    WebElement title_BackOrderNotyet;

   @FindBy(xpath = "//label[contains(.,'Original Sale Date From:')]")
    WebElement OriginalsaleDatefrom;

   @FindBy(xpath = "//label[contains(.,'Original Sale Date From:')]/parent::td/following-sibling::td/child::input")
    WebElement OriginalSaleDateFrom_textArea;

   @FindBy(xpath = "//label[contains(text(),'Show Parts with On-hands Only')]")
    WebElement ShowPartsWithOnhandsOnly;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**click on counter sale manager*/
    public static void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Counter Sale Manager");
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify Title_Counter Sale Manager */
    public void varifyCounterSaleManager() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_CounterSaleManager);
        Assert.assertTrue(title_CounterSaleManager.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ToBeInvoiced);
        Assert.assertTrue(ToBeInvoiced.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Back Order */
    public void clickOnBackOrder () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_BackOrders);
        WebElementActions.getActions().clickElement(btn_BackOrders);
        TestListener.saveScreenshotPNG(driver);


    }
    /**varify Title Back Order Not yet Fufilled*/
    public void varifyBackOrderNotYetFufilled () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_BackOrderNotyet);
        Assert.assertTrue(title_BackOrderNotyet.isDisplayed()) ;

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OriginalsaleDatefrom);
        Assert.assertTrue(OriginalsaleDatefrom.isDisplayed()) ;

    }
    /**enter The Original sale Date From */
    public void enterTheOriginalDateFrom () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(OriginalSaleDateFrom_textArea);
        WebElementActions.getActions().inputText(OriginalSaleDateFrom_textArea,appProp.getProperty("datefrom"));
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**varify show parts with on -hands only */
    public void showPartsWithOnhandsOnly () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ShowPartsWithOnhandsOnly);
        Assert.assertTrue(ShowPartsWithOnhandsOnly.isDisplayed()) ;
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

}
