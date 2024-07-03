package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'Suggested Orders')])[1]")
    public WebElement txt_SuggestedOrders;

    @FindBy(xpath = "//h1[contains(.,'Suggested Orders')]")
    public WebElement text_SuggestedOrders;

    @FindBy(xpath = "//h1[contains(text(),'Restocks')]")
    public WebElement txt_Restocks;

    @FindBy(xpath = "//a[contains(.,'Generate Orders')]")
    public WebElement btn_GenerateOrders;

   @FindBy(xpath = "//a[contains(.,'Print List')]")
    public WebElement btn_PrintList;

   @FindBy(xpath = "//a[contains(.,'Export List')]")
    public WebElement btn_ExportList;

   @FindBy(xpath = "(//span[text()='Vendor'])[1]")
    public WebElement txt_vendor;

   @FindBy(xpath = "(//span[text()='Address'])[1]")
    public WebElement txt_Address;

   @FindBy(xpath = "(//span[text()='Phone'])[1]")
   public WebElement txt_Phone;

   @FindBy(xpath = "(//span[text()='Email'])[1]")
   public WebElement txt_Email;

   @FindBy(xpath = "(//span[text()='Amount'])[1]")
   public WebElement txt_Amount;

   @FindBy(xpath = "//h1[text()='Returns']")
   public WebElement txt_Returns;

   @FindBy(xpath = "//span[text()='Generate Returns']")
   public WebElement txt_GenerateReturns;

   @FindBy(xpath = "(//a[contains(.,'Print List')])[2]")
    public WebElement txt_PrintList;

    @FindBy(xpath = "(//a[contains(.,'Reports')])[2]")
    public WebElement Reports;

    @FindBy(xpath = "//span[text()='Employees']")
    public WebElement Employees;

    @FindBy(xpath = "//td[contains(.,'Time Sheet Export')]")
    public WebElement TimeSheetExport;

    @FindBy(xpath = "(//a[contains(.,'Run Report')])[2]")
    public WebElement RunReport;


    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    public WebElement SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement UserNameTextArea;

   /*go to Order parts **/
   public void gotoOrderParts() throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions().clickParentMenu("Parts");
       ReusableActions.getActions().clickChildMenu("Order Parts");

   }
   /*click On Suggested Orders**/
    public void clickonSuggestedOrder () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_SuggestedOrders);
        WebElementActions.getActions().clickElement(txt_SuggestedOrders);
        TestListener.saveScreenshotPNG(driver);
    }
    /*verify  Suggested Orders **/
    public void verifySuggestedOrders () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(text_SuggestedOrders);
        Assert.assertTrue(text_SuggestedOrders.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Restocks);
        Assert.assertTrue(txt_Restocks.isDisplayed());

    }
    /*verify Generate Orders,PrintList,ExportList **/
    public void verifyGenerateOrders() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_GenerateOrders);
        Assert.assertTrue(btn_GenerateOrders.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_PrintList);
        Assert.assertTrue(btn_PrintList.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_ExportList);
        Assert.assertTrue(btn_ExportList.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }
    /*verify vendor,Address,Phone,Email,Amount**/
    public void  verifyVendor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_vendor);
        Assert.assertTrue(txt_vendor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Address);
        Assert.assertTrue(txt_Address.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Phone);
        Assert.assertTrue(txt_Phone.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Email);
        Assert.assertTrue(txt_Email.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Amount);
        Assert.assertTrue(txt_Amount.isDisplayed());

    }
    /*verify Returns**/
    public void verifyReturns () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Returns);
        Assert.assertTrue(txt_Returns.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_GenerateReturns);
        Assert.assertTrue(txt_GenerateReturns.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PrintList);
        Assert.assertTrue(txt_PrintList.isDisplayed());

    }
   /*click On Export List**/
    public void clickOnExportList () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ExportList);
        WebElementActions.getActions().clickElement(btn_ExportList);
        WaitActions.getWaits().loadingWait(loder);
    }
    /* verify Read Excel **/
    public void readExcel() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);

        TestListener.saveScreenshotPNG(driver);

    }
    /*click on Report**/
    public void clickOnReport () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions().clickElement(Reports);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click on Employee**/
    public void clickOnEmployee () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Employees);
        WebElementActions.getActions().clickElement(Employees);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click on Employee TimeSheet Export**/
    public void clickOnEmployeeTimeSheetExport  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TimeSheetExport);
        WebElementActions.getActions().clickElement(TimeSheetExport);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click On RunReport **/
    public void clickOnRunReport () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RunReport);
        WebElementActions.getActions().clickElement(RunReport);

    }


    /*click On Sign Out **/
    public void clickOnSignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SignOut);
        WebElementActions.getActions().clickElement(SignOut);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UserNameTextArea);
        WebElementActions.getActions().clickElement(UserNameTextArea);

    }

}

