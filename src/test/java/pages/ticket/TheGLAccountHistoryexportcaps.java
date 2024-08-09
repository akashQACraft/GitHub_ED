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

public class TheGLAccountHistoryexportcaps extends TestDriverActions {

    @FindBy(xpath = "(//td[contains(text(),'History')])[3]")
    WebElement History;

    @FindBy(xpath = "(//td[contains(.,'RO History')])[1]")
    WebElement ROHistory;

    @FindBy(xpath = "//td[text()='Repair Order']")
    WebElement RepairOrder;

    @FindBy(xpath = "//label[contains(.,'From RO Date:')]/preceding-sibling::span")
    WebElement ReuiredFromRODate;

    @FindBy(xpath = "//label[contains(.,'From RO Date:')]")
    WebElement FormRODate;

    @FindBy(xpath = "//input[contains(@id,':id1::content')]")
    WebElement FromRODate_TextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]/span")
    WebElement Refresh;

    @FindBy(xpath = "//a[contains(.,'Export')]/span")
    WebElement Export;

    @FindBy(xpath = "(//td[contains(text(),'Labor')])[4]")
    WebElement Labor;

    @FindBy(xpath = "(//td[contains(text(),'Parts')])[5]")
    WebElement Parts;


    @FindBy(xpath = "//td[contains(text(),'Repair Estimate')]")
    WebElement RepairEstimate;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to History  Screen
     */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("History");
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify RO  History
     */
    public void varifyROHistory() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ROHistory);
        Assert.assertTrue(ROHistory.isDisplayed());
    }

    /**
     * click On history
     */
    public void clickOnHistory() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairOrder);
        WebElementActions.getActions().clickElement(RepairOrder);
    }

    /**
     * varify From RO Date
     */
    public void varifyFromRODate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ReuiredFromRODate);
        WebElementActions.getActions().clickElement(ReuiredFromRODate);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FormRODate);
        WebElementActions.getActions().clickElement(FormRODate);

    }

    /**
     * enter the RO From Date
     */
    public void enterTheROfromDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
        WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate1"));

    }

    /**
     * click On Refresh
     */
    public void clickOnRefresh() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);

    }

    /**
     * click On Export
     */
    public void clickOnExport() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Export);
        WebElementActions.getActions().clickElement(Export);

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

    /**
     * click on Labour
     */
    public void clickOnLobur() throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Labor);
        WebElementActions.getActions().clickElement(Labor);

    }

    /**
     * enter From RO Date
     */
    public void enterTheFromRODateTwo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
        WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate2"));

    }

    /* verify Read Excel **/
    public void readExceltwo() throws InterruptedException, IOException {

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

    /**
     * click On Parts
     */
    public void clickOnParts() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions().clickElement(Parts);


    }

    /**
     * enter the From RO Date
     */
    public void enterTheFromROdate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
        WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate3"));

    }

    /* verify Read Excel **/
    public void readExcelthree() throws InterruptedException, IOException {

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

    /**
     * click On Repair Estimate
     */
    public void enterTheRepairEstimate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairEstimate);
        WebElementActions.getActions().clickElement(RepairEstimate);


    }

    /**
     * enter the From RO Date
     */
    public void enterTheFromRODate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
        WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate4"));

    }

    /* verify Read Excel **/
    public void readExcelfour() throws InterruptedException, IOException {

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

    /*click on Singout **/
    public void clickOnsignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click on UserName **/
    public void clickOnUserName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);


    }
}