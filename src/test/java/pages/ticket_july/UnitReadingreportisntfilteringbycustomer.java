package pages.ticket_july;

import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class UnitReadingreportisntfilteringbycustomer extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;

    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[text()='Report Parameters']")
    WebElement reportParameters;

    @FindBy(xpath = "//td[contains(.,'Shop Management')]/span")
    WebElement ShopManagement;

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[6]")
    WebElement Reportstwo;

    @FindBy(xpath = "(//td[contains(.,'Unit Reading')]/span)[1]")
    WebElement UnitReading;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
    WebElement view;

    @FindBy(xpath = "(//label[contains(.,'Customer:')])[1]")
    WebElement Customer;

    @FindBy(xpath = "//label[contains(.,'Customer:')]/preceding-sibling::input")
    WebElement Customer_TextArea;

    @FindBy(xpath = "//a[contains(@id,':0:cilV')]/img")
    WebElement Search_Icon;

    @FindBy(xpath = "//label[text()='Name']/preceding-sibling::input")
    WebElement customerSearch;

    @FindBy(xpath = "//span[text()='Search']")
    WebElement btn_search;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_Select;



    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /*go to Report**/
    public void gotoReport() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions().clickElement(Reports);

        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().loadingWait(loder);


    }
    /**
     * verify Report categories
     */
    public void verifyReportCategories() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportParameters);
        Assert.assertTrue(reportParameters.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


   /**click On Shop Managment */
   public void clickOnShopManagement () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ShopManagement);
       WebElementActions.getActions().clickElement(ShopManagement);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**click On Unit Reading */
   public void clickOnUnitReading() throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitReading);
       WebElementActions.getActions().clickElement(UnitReading);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**varify schedule Report*/
   public void clickOnScheduleReport () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(scheduleReport);
       Assert.assertTrue(scheduleReport.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(runReport);
       Assert.assertTrue(runReport.isDisplayed());


       TestListener.saveScreenshotPNG(driver);
   }
   /**varify Customer ,Customer TextArea*/
   public void varifyOnCustomer () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer);
       Assert.assertTrue(Customer.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer_TextArea);
       Assert.assertTrue(Customer_TextArea.isDisplayed());

   }
    /**click on Run Report */
    public void clickOnRunReport () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
        WebElementActions.getActions().clickElement(runReport);
        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

        int count = 0;
        while (count < 20) {
            //           System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {


                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportHistory_btn);
                WebElementActions.getActions().clickElement(reportHistory_btn);

                for (int i = 0; i < 13; i++) {
                    //               System.out.println("Iteration :"+i);

                    try {
                        // Use FluentWait to define custom conditions and polling intervals
                        new FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(120))
                                .pollingEvery(Duration.ofSeconds(30))
                                .ignoring(Exception.class)
                                .until(drv -> refresh_btn.isEnabled());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (refresh_btn.isEnabled()) {
                        //           System.out.println("Button is ENABLED in iteration " + i);
                        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(refresh_btn);
                        WebElementActions.getActions().clickElement(refresh_btn);
                        Thread.sleep(2000);
                        if (view.isEnabled()) {
                            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
                            WebElementActions.getActions().clickElement(view);

                            TestListener.saveScreenshotPNG(driver);

                            break;

                        }

                    } else {
                        System.out.println("Button is DISABLED in iteration " + i);
                    }
                }

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
                WebElementActions.getActions().clickElement(view);

                TestListener.saveScreenshotPNG(driver);

                break;
            }
        }

    }
    /**click On Reports*/
    public void clickOnReports () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reportstwo);
        WebElementActions.getActions().clickElement(Reportstwo);
        WaitActions.getWaits().loadingWait(loder);

    }

        /**varify Shop Managment and unit Reading */
        public void varifyOnShopManagement () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ShopManagement);
            Assert.assertTrue(ShopManagement.isDisplayed());

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitReading);
            Assert.assertTrue(UnitReading.isDisplayed());

            WaitActions.getWaits().loadingWait(loder);
        }

       /**click On Search Icon */
       public void clickOnSearchIcon() throws InterruptedException {

           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_Icon);
           WebElementActions.getActions().clickElement(Search_Icon);
           WaitActions.getWaits().loadingWait(loder);
       }
       /**enter the Customer Search*/
       public void enterTHeCustomerSearch () throws InterruptedException {
           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(customerSearch);
           WebElementActions.getActions().inputText(customerSearch, appProp.getProperty("905"));

       }
       /**click on Search*/
       public void clickOnSearch () throws InterruptedException {
           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_search);
           WebElementActions.getActions().clickElement(btn_search);
           WaitActions.getWaits().loadingWait(loder);

       }
       /**click on Select */
       public void clickOnSelect () throws InterruptedException {

           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
           WebElementActions.getActions().clickElement(btn_Select);
           WaitActions.getWaits().loadingWait(loder);

       }
    /**
     *  verify taxes on PDF
     */
    public void VerifyTaxesonPDF() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
            //       System.out.println(pdfFullText);

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("Total Cost and Total On-Hand not included on the Non-Stock Parts with On-Hand Report");

            }

            fis.close();

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




