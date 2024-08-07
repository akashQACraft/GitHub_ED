package pages.ticket_august;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Counter Sale Manager']")
    WebElement title_CounterSaleManager;

    @FindBy(xpath = "(//a[contains(.,'To Be Invoiced')])[1]")
    WebElement ToBeInvoiced;

    @FindBy(xpath = "(//a[contains(.,'Order Requests')])[1]")
    WebElement OrderRequest;

    @FindBy(xpath = "(//a[contains(.,'Retail Parts')])[1]")
    WebElement Retailparts;

    @FindBy(xpath = "(//a[contains(.,'Back Orders')])[1]")
    WebElement BackOrders;

    @FindBy(xpath = "(//a[contains(.,'Lost Sales')])[1]")
    WebElement LostSale;

    @FindBy(xpath = "(//a[contains(.,'History')])[1]")
    WebElement History;

    @FindBy(xpath = "(//a[contains(.,'To Be Invoiced')])[2]")
    WebElement btn_ToBeInvoiced;

    @FindBy(xpath = "(//a[contains(.,'Order Requests')])[2]")
    WebElement btn_OrderRequest;

    @FindBy(xpath = "(//a[contains(.,'Retail Parts')])[2]")
    WebElement btn_Retailparts;

    @FindBy(xpath = "(//a[contains(.,'Back Orders')])[2]")
    WebElement btn_BackOrders;

    @FindBy(xpath = "(//a[contains(.,'Lost Sales')])[2]")
    WebElement btn_LostSale;

    @FindBy(xpath = "(//a[contains(.,'History')])[2]")
    WebElement btn_History;

    @FindBy(xpath = "//h1[contains(.,'To Be Invoiced')]")
    WebElement title_ToBeinvoiced;

    @FindBy(xpath = "//h1[contains(.,'Order Requests')]")
    WebElement title_OrderRequests;

    @FindBy(xpath = "//h1[contains(.,'Parts Catalog')]")
    WebElement title_PartsCatalog;

    @FindBy(xpath = "//h1[contains(.,'Back Orders Not Yet Fulfilled')]")
    WebElement title_BackOrdersNotYetFulFilled;

    @FindBy(xpath = "//h1[contains(.,'Lost Sales')]")
    WebElement title_Lostsales;

    @FindBy(xpath = "//h1[contains(.,'History')]")
    WebElement title_History;


    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**
     * click on counter sale manager
     */
    public static void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Counter Sale Manager");
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * varify Title Counter sale Manager
     */
    public void varifyOnCounterSaleManager() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_CounterSaleManager);
        Assert.assertTrue(title_CounterSaleManager.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * compare ToBeInvoiced and btn_ToBeInvoiced
     */
    public void compareToBeInvoiced() {
        String ToBeInvoiced1 = ToBeInvoiced.getText();
        String ToBeInvoiced2 = btn_ToBeInvoiced.getText();

        if (ToBeInvoiced1.equals(ToBeInvoiced2)) {
            System.out.println("Both elements have the same text: " + ToBeInvoiced1);
        } else {
            System.out.println("Elements have different texts:  " + ToBeInvoiced1 + "vs" + ToBeInvoiced2);
        }
    }
    /**
     * compare OrderRequest and btn_OrderRequest
     */
    public void comapreOrderRequest() {
        String OrderRequest1 = OrderRequest.getText();
        String OrderRequest2 = btn_OrderRequest.getText();

        if (OrderRequest1.equals(OrderRequest2)) {
            System.out.println("Both elements have the same text:" + OrderRequest1);

        } else {
            System.out.println("Elements have different texts: " + OrderRequest1 + "vs" + OrderRequest2);

        }
    }

    /**
     * compare Retailparts and btn_Retailparts
     */
    public void compareRetailparts() {
        String Retailparts1 = Retailparts.getText();
        String Retailparts2 = btn_Retailparts.getText();

        if (Retailparts1.equals(Retailparts2)) {
            System.out.println("Both elements have the same text:" + Retailparts1);
        } else {
            System.out.println("Elements have different texts both are same :  " + Retailparts1 + "vs" + Retailparts2);
        }
    }

    /**
     * compare BackOrders and btn_BackOrders
     */
    public void compareBackOrders() {
        String BackOrders1 = BackOrders.getText();
        String BackOrders2 = btn_BackOrders.getText();

        if (BackOrders1.equals(BackOrders2)) {
            System.out.println("Both elements have the same text:" + BackOrders1);
        } else {
            System.out.println("Elements have different texts are same : " + BackOrders2 + "vs" + BackOrders2);

        }
    }

    /**
     * compare LostSale and  btn_LostSale
     */
    public void compareLostSale() {
        String LostSale1 = LostSale.getText();
        String LostSale2 = btn_LostSale.getText();

        if (LostSale1.equals(LostSale2)) {
            System.out.println("Both elements have the same text:" + LostSale1);
        } else {
            System.out.println("Elements have different texts:" + LostSale1 + "vs" + LostSale2);

        }
    }

    /**
     * comapre History And btn_History
     */
    public void compareHistory() {
        String History1 = History.getText();
        String History2 = btn_History.getText();

        if (History1.equals(History2)) {
            System.out.println("Both elements have the same text:" + History1);
        } else {
            System.out.println("Elements have different texts:" + History1 + "vs" + History2);

        }
    }

    /**
     * varify title To be invoiced
     */
    public void varifyToBeInvoiced() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_ToBeinvoiced);
        Assert.assertTrue(title_ToBeinvoiced.isDisplayed());

    }

    /**
     * compare title_ToBeinvoiced and btn_ToBeInvoiced
     */
    public void comparetitle_ToBeinvoiced() {
        String title_ToBeinvoiced1 = title_ToBeinvoiced.getText();
        String title_ToBeinvoiced2 = btn_ToBeInvoiced.getText();

        if (title_ToBeinvoiced1.equals(title_ToBeinvoiced2)) {
            System.out.println("Both elements have the same text:" + title_ToBeinvoiced1);
        } else {
            System.out.println("Elements have different texts:  " + title_ToBeinvoiced1 + "vs" + title_ToBeinvoiced2);
        }
    }
    /**click On Title Order Request */
    public void clickOnTitleOrderRequest () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_OrderRequest);
        WebElementActions.getActions().clickElement(btn_OrderRequest);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * varify title_Order Requests
     */
    public void varifyTitleOrderRequest() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_OrderRequests);
        Assert.assertTrue(title_OrderRequests.isDisplayed());
    }

    /**
     * compare title Order Request and btn Order Request
     */
    public void compareTitleOrderRequest() {
        String title_OrderRequests1 = title_OrderRequests.getText();
        String title_OrderRequests2 = btn_OrderRequest.getText();

        if (title_OrderRequests1.equals(title_OrderRequests2)) {
            System.out.println("Both elements have the same text:" + title_OrderRequests1);
        } else {
            System.out.println("Elements have different texts:  " + title_OrderRequests1 + "vs" + title_OrderRequests2);
        }
    }
    /**click On Retail parts */
    public void clickOnRetailparts () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Retailparts);
        WebElementActions.getActions().clickElement(btn_Retailparts);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * varify title_PartsCatalog
     */
    public void varifyTitlePartsCatalog() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_PartsCatalog);
        Assert.assertTrue(title_PartsCatalog.isDisplayed());

    }

    /**
     * compare title_PartsCatalog  and btn_Retailparts
     */
    public void compareTitlePartsCatalog() {
        String title_PartsCatalog1 = title_PartsCatalog.getText();
        String title_PartsCatalog2 = btn_Retailparts.getText();

        if (title_PartsCatalog1.equals(title_PartsCatalog2)) {
            System.out.println("Both elements have the same text: " + title_PartsCatalog1);
        } else {
            System.out.println("Elements have different texts:   " + title_PartsCatalog1 + "vs" + title_PartsCatalog2);

        }
    }
    /**click On Back Orders*/
    public void clickOnBackOrders() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_BackOrders);
        WebElementActions.getActions().clickElement(btn_BackOrders);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


//    /**
//     * varify title_PartsCatalog
//     */
//    public void varifyTitlePartsCatalogs() {
//        String title_OrderRequests1 = title_OrderRequests.getText();
//        String title_OrderRequests2 = btn_BackOrders.getText();
//
//        if (title_OrderRequests1.equals(title_OrderRequests2)) {
//            System.out.println("Both are same ");
//        }
//        System.out.println("Both are differant ");
//    }
//

    /**
     * varify title BackOrders Not Yet FulFilled
     */
    public void varifyTitleBackOrdersNotYetFulfilled() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_BackOrdersNotYetFulFilled);
        Assert.assertTrue(title_BackOrdersNotYetFulFilled.isDisplayed());

    }

    /**
     * compare title_BackOrdersNotYetFulFilled and btn_BackOrders
     */
    public void compareTitleBackOrdersNotYetFulFilled() {
        String titlle_BackOrders1 = title_BackOrdersNotYetFulFilled.getText();
        String titlle_BackOrders2 = btn_BackOrders.getText();

        if (titlle_BackOrders1.equals(titlle_BackOrders2)) {
            System.out.println("Both elements have the same text: " + titlle_BackOrders1);
        } else {
            System.out.println("Elements have different texts:   " + titlle_BackOrders1 + "vs" + titlle_BackOrders2);
        }
    }
    /**click On Lost sales*/
    public void clickOnLostsales() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_LostSale);
        WebElementActions.getActions().clickElement(btn_LostSale);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * varify title_Lostsales
     */
    public void varifyTitleLostsale() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_Lostsales);
        Assert.assertTrue(title_Lostsales.isDisplayed());
    }
    /**
     * compare title_Lostsales and btn_LostSale
     */
    public void compareTitleLostsales() {
        String title_Lostsales1 = title_Lostsales.getText();
        String title_Lostsales2 = btn_LostSale.getText();
        if (title_Lostsales1.equals(title_Lostsales2)) {
            System.out.println("Both elements have the same text: " + title_Lostsales1);
        } else {
            System.out.println("Elements have different texts:  " + title_Lostsales1 + "vs" + title_Lostsales2);
        }
    }
    /**click On Hiistory */
    public void clickOnHistory() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_History);
        WebElementActions.getActions().clickElement(btn_History);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * varify  Title History
     */
    public void varifyTitleHistory() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_History);
        Assert.assertTrue(title_History.isDisplayed());

    }

    /**
     * comapre title_History and btn_History
     */
    public void compareTitleHistory() {
        String title_History1 = title_History.getText();
        String title_History2 = btn_History.getText();

        if (title_History1.equals(title_History2)) {
            System.out.println("Both elements have the same text:" + title_History1);
        } else {
            System.out.println("Elements have different texts:" + title_History1 + "vs" + title_History2);
        }
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