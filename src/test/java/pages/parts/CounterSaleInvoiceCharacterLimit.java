package pages.parts;

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

public class CounterSaleInvoiceCharacterLimit extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'History')])[2]")
    WebElement History;

    @FindBy(xpath = "//span[text()='Invoice #']")
    WebElement Invoice;

    @FindBy(xpath = "//span[text()='Sale #']")
    WebElement sale;

    @FindBy(xpath = "//span[text()='Invoice Date']")
    WebElement InvoiceDate;

    @FindBy(xpath = "//span[text()='Customer']")
    WebElement Customer;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement Location;

    @FindBy(xpath = "//span[text()='Ship To']")
    WebElement ShipTo;

    @FindBy(xpath = "//span[text()='Customer PO#']")
    WebElement CustomerPO;

    @FindBy(xpath = "//span[text()='Internal PO#']")
    WebElement InternalPO;

    @FindBy(xpath = "(//span[text()='Internal PO#']/parent::div/parent::th/following::div/table/colgroup/following::tr/td/span/a)[1]")
    WebElement InvoicePart;

   @FindBy(xpath = "//div[contains(text(),'Counter Sale')]")
   WebElement CounterSale;
    @FindBy(xpath = "(//label[text()='Location:']/preceding-sibling::span)[2]")
    WebElement RequiredLocation;

    @FindBy(xpath ="(//label[text()='Location:'])[2]")
    WebElement Location2;


    @FindBy(xpath = "(//label[text()='Location:']/parent::td/following-sibling::td)[2]")
    WebElement LocationValue;

    @FindBy(xpath = "//label[text()='Sale#:']")
    WebElement SaleHash;

    @FindBy(xpath = "(//label[text()='Sale#:']/parent::td/following::td)[1]")
    WebElement SaleHash2;

    @FindBy(xpath = "(//label[text()='Customer:']/preceding-sibling::span)[2]")
    WebElement CustomerRequired;

    @FindBy(xpath = "(//label[text()='Customer:'])[2]")
    WebElement Customer3;

    @FindBy(xpath = "(//label[text()='Customer:']/parent::td/following::td[1])[2]")
    WebElement CustomerValue;

    @FindBy(xpath = "//a[contains(.,'Reprint')]")
    WebElement Reprint;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**Click on Parts
     *click on counter sale manager
     */
    public static void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Counter Sale Manager");

        TestListener.saveScreenshotPNG(driver);
    }
    /**click On History*/
    public void clickonHistory () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(History);
        WebElementActions.getActions().clickElement(History);
    }
   /**verify On Invoice */
   public void verifyInvoice () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Invoice);
       Assert.assertTrue(Invoice.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(sale);
       Assert.assertTrue(sale.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(InvoiceDate);
       Assert.assertTrue(InvoiceDate.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer);
       Assert.assertTrue(Customer.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
       Assert.assertTrue(Location.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ShipTo);
       Assert.assertTrue(ShipTo.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerPO);
       Assert.assertTrue(CustomerPO.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(InternalPO);
       Assert.assertTrue(InternalPO.isDisplayed());

       TestListener.saveScreenshotPNG(driver);


   }
   /**click on Invoice No.*/
   public void clickonInvoiceNo () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InvoicePart);
       WebElementActions.getActions().clickElement(InvoicePart);
       WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

   }
   /**verify Counter sale*/
   public void verifyCountersale () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CounterSale);
       Assert.assertTrue(CounterSale.isDisplayed());

       TestListener.saveScreenshotPNG(driver);
   }
   /**verify On RequiredLocation,Location */
   public void verifyRequiredLocation () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredLocation);
       Assert.assertTrue(RequiredLocation.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location2);
       Assert.assertTrue(Location2.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LocationValue);

           TestListener.saveScreenshotPNG(driver);

       }

   /***verify sale salevalue*/
   public void verifyonsale () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaleHash);
       Assert.assertTrue(SaleHash.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaleHash2);
       Assert.assertTrue(SaleHash2.isDisplayed());

       String originalWindow=driver.getWindowHandle () ;
       WaitActions.getWaits().loadingWait(loder);


   }
   /**verify on Customer*/
   public void verifyCustomer () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerRequired);
       Assert.assertTrue(CustomerRequired.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer3);
       Assert.assertTrue(Customer3.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerValue);
       Assert.assertTrue(CustomerValue.isDisplayed());

       Thread.sleep(3000);
       String originalWindow=driver.getWindowHandle () ;
       WaitActions.getWaits().loadingWait(loder);
   }
   /**click on Reprint */
   public void clickOnReprint () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reprint);
       WebElementActions.getActions().clickElement(Reprint);
       Thread.sleep(3000);
       WaitActions.getWaits().loadingWait(loder);
       TestListener.saveScreenshotPNG(driver);

   }
   /**click on Signout */
   public void clcikonSignout () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
       WebElementActions.getActions().clickElement(btn_signOut);

   }
   /**click on UserNameTestArea */
   public void clickonUsername () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
       WebElementActions.getActions().clickElement(inputbox_Username);
   }

}
