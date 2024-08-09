package pages.ticket;

import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class RentalEquipmentUtilizationParameternotworking extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;

    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;


    @FindBy(xpath = "//h1[text()='Report Parameters']")
    WebElement reportParameters;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "(//td[contains(.,'Rental and Lease')])[1]")
    WebElement RentalandLease;

    @FindBy(xpath = "//td[contains(.,'Rental Equipment Utilization')]")
    WebElement RentalEquipmentUtilization;

    @FindBy(xpath = "//label[contains(.,'Available Units Only')]/preceding-sibling::input")
    WebElement btn_RadioAvailableUnitsOnly;

    @FindBy(xpath = "//label[contains(.,'Available Units Only')]")
    WebElement label_AvailableUnitsOnly;

    @FindBy(xpath = "//label[contains(text(),'Not Rented Only')]/preceding-sibling::input")
    WebElement btn_RadioNotRentedOnly;

    @FindBy(xpath = "//label[contains(text(),'Not Rented Only')]")
    WebElement label_NotRentedOnly;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**
     * gotoReports
     */
    public void gotoReports() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions().clickElement(Reports);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify Report categories ,reportParameters
     */
    public void verifyReportCategories() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportParameters);
        Assert.assertTrue(reportParameters.isDisplayed());

    }
    /**click On  Rental and Lease*/
    public void clickOnRentalAndLease () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RentalandLease);
        WebElementActions.getActions().clickElement(RentalandLease);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Rental Equipment Utilization */
    public void clickOnRentalEquipmentUtilization () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RentalEquipmentUtilization);
        WebElementActions.getActions().clickElement(RentalEquipmentUtilization);
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify scheduleReport And RUN Report */
    public void varifyOnShedulReport () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(scheduleReport);
        Assert.assertTrue(scheduleReport.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(runReport);
        Assert.assertTrue(runReport.isDisplayed());


    }
    /**click On Run Report ,Run Report with Available Units Only unchecked  */
   public void clickOnRunReport () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
       WebElementActions.getActions().clickElement(runReport);
       WaitActions.getWaits().loadingWait(loder);
       TestListener.saveScreenshotPNG(driver);

   }

    /**
     * verify taxes on PDF
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

            if (pdfFullText.contains("Available Units Only unchecked")) {
                System.out.println("Rental Equipment Utilization Parameter is working");

            }

            fis.close();

        }
        }
    /** varify Available Units Only */
    public  void varifyAvailableUnitsOnly () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AvailableUnitsOnly);
        Assert.assertTrue(label_AvailableUnitsOnly.isDisplayed());

    }
   /**click On Available Units Only */
   public void clickOnAvailableUnitsOnly () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RadioAvailableUnitsOnly);
       WebElementActions.getActions().clickElement(btn_RadioAvailableUnitsOnly);
       TestListener.saveScreenshotPNG(driver);

   }
    /**
     * verify taxes on PDF ONE
     */
    public void VerifyTaxesonPDFOne() throws InterruptedException, IOException {

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

            if (pdfFullText.contains("Report with Available Units Only checked ")) {
                System.out.println("Rental Equipment Utilization Parameter is working");

            }

            fis.close();

        }
    }

    /**varify on Not Rented Only*/
    public void varifyOnNotRentedOnly () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NotRentedOnly);
        Assert.assertTrue(label_NotRentedOnly.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Not Rented Only*/
    public void clickOnNotRentedOnly () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RadioNotRentedOnly);
        WebElementActions.getActions().clickElement(btn_RadioNotRentedOnly);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify taxes on PDF Three
     */
    public void VerifyTaxesonPDFThree() throws InterruptedException, IOException {

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

            if (pdfFullText.contains("Report with Available Units Only checked ")) {
                System.out.println("Rental Equipment Utilization Parameter is working");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

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


