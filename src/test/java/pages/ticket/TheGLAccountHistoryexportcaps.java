package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
<<<<<<< HEAD
import java.util.List;

public class TheGLAccountHistoryexportcaps extends TestDriverActions {

=======
import java.time.Duration;
import java.util.List;

import static actions.WaitActions.waitForElementToBeRefreshedAndClickable;

public class TheGLAccountHistoryexportcaps extends TestDriverActions {

  @FindBy(xpath = "//div[contains(@id,'id43::ScrollDown')]")
  WebElement ScrollDown;

  @FindBy(xpath = "(//a[contains(text(),'Fleet')]/parent::td/following::td/div)[1]")
  WebElement Fleet;
  @FindBy(xpath = "//td[contains(text(),'Rental Manager')]")
  WebElement RentalManager;


>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
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

<<<<<<< HEAD
=======
    @FindBy(xpath = "//input[contains(@id,':0:pt1:idFrom::content')]")
    WebElement FromEstimateDate;

    @FindBy(xpath = "//input[@role='combobox']/parent::span/following::span[10]/child::a")
    WebElement Estimate_Status;

    @FindBy(xpath = "//input[contains(@id,':smc3::saId')]")
    WebElement Radio_All;

    @FindBy(xpath = "//a[contains(.,'Search')]/child::span")
    WebElement btn_Search;


>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
    @FindBy(xpath = "//a[contains(.,'Refresh')]/span")
    WebElement Refresh;

    @FindBy(xpath = "//a[contains(.,'Export')]/span")
    WebElement Export;

<<<<<<< HEAD
    @FindBy(xpath = "(//td[contains(text(),'Labor')])[4]")
    WebElement Labor;

    @FindBy(xpath = "(//td[contains(text(),'Parts')])[5]")
=======
    //@FindBy(xpath = "(//td[contains(.,'Lab')])[3]")
    @FindBy(xpath = "//td[text()='Repair Order']/parent::tr/following-sibling::tr[1]/td[2]")
    WebElement Labor;

   // @FindBy(xpath = "(//td[contains(text(),'Parts')])[5]")
   @FindBy(xpath = "(//td[text()='Repair Order']/parent::tr/following-sibling::tr[2]/child::td/following::td[1])[1]")
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
    WebElement Parts;


    @FindBy(xpath = "//td[contains(text(),'Repair Estimate')]")
    WebElement RepairEstimate;

<<<<<<< HEAD
=======
    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
    WebElement view;

>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to History  Screen
     */
<<<<<<< HEAD
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("History");
=======
    public void goToHistory() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        TestListener.saveScreenshotPNG(driver);
    }
    /**click  On Down Arrow */
    public void clickOnDownArrow () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RentalManager);
        Assert.assertTrue(RentalManager.isDisplayed());
        System.out.println("varify the data :"+RentalManager.getText());

         JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",RentalManager);

    }

    /**click On History */
    public void clickOnHistory () throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickChildMenu("History");
        WaitActions.getWaits().loadingWait(loder);
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
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
<<<<<<< HEAD
    public void clickOnHistory() throws InterruptedException {
=======
    public void clickOnRepairOrder() throws InterruptedException {
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
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
<<<<<<< HEAD
=======
        WaitActions.getWaits().loadingWait(loder);
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd

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
<<<<<<< HEAD
=======
        WaitActions.getWaits().loadingWait(loder);
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd

    }

    /**
     * click On Export
     */
    public void clickOnExport() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Export);
        WebElementActions.getActions().clickElement(Export);

<<<<<<< HEAD
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
=======
        WaitActions.getWaits().loadingWait(loder);


        int count = 0;
        while (count < 20) {
//            System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Export);
                WebElementActions.getActions().clickElement(Export);

                for (int i = 0; i < 13; i++) {
                    //               System.out.println("Iteration :"+i);

                    try {
                        // Use FluentWait to define custom conditions and polling intervals
                        new FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(120))
                                .pollingEvery(Duration.ofSeconds(30))
                                .ignoring(Exception.class)
                                .until(drv -> Export.isEnabled());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    TestListener.saveScreenshotPNG(driver);
                }
                }
            }
        }

            /**
             * click on Labour
             */
            public void clickOnLobur () throws InterruptedException {


                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Labor);
                WebElementActions.getActions().clickElement(Labor);

            }

            /**
             * enter From RO Date
             */
            public void enterTheFromRODateTwo () throws InterruptedException {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
                WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate2"));

            }

            /**
             * click On Parts
             */
            public void clickOnParts () throws InterruptedException {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Parts);
                WebElementActions.getActions().clickElement(Parts);


            }
            /**click On export */
            public void clickOnExport2 () throws InterruptedException {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Export);
                WebElementActions.getActions().clickElement(Export);

                int count = 0;
                while (count < 20) {
                    System.out.println("Size of queue is :" + queue.size());
                    Thread.sleep(1000);
                    count++;
                }
            }

            /**
             * enter the From RO Date*/
            public void enterTheFromROdate () throws InterruptedException {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromRODate_TextArea);
                WebElementActions.getActions().inputText(FromRODate_TextArea, appProp.getProperty("FromRODate3"));
                WaitActions.getWaits().loadingWait(loder);

            }
            /**
             * click On Repair Estimate
             */
            public void clickOnRepairEstimate () throws InterruptedException {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairEstimate);
                WebElementActions.getActions().clickElement(RepairEstimate);

            }
            /**
             * enter the From RO Date
             */
            public void enterTheFromRODate () throws InterruptedException {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromEstimateDate);
                WebElementActions.getActions().inputText(FromEstimateDate, appProp.getProperty("FromRODate4"));
                WaitActions.getWaits().loadingWait(loder);
            }
            /* Select Repair Estimate **/
            public void SelectRepairEstimate () throws InterruptedException {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Estimate_Status);
                WebElementActions.getActions().clickElement(Estimate_Status);

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Radio_All);
                WebElementActions.getActions().clickElement(Radio_All);

                WaitActions.getWaits().loadingWait(loder);

            }
            /**click on Serch button */
            public void clickOnSearchButton () throws InterruptedException {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Search);
                WebElementActions.getActions().clickElement(btn_Search);
                WaitActions.getWaits().loadingWait(loder);
            }
            /*click on Singout **/
            public void clickOnsignOut () throws InterruptedException {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
                WebElementActions.getActions().clickElement(btn_signOut);
                WaitActions.getWaits().loadingWait(loder);
            }
            /*click on UserName **/
            public void clickOnUserName () throws InterruptedException {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
                WebElementActions.getActions().clickElement(inputbox_Username);
            }
        }
>>>>>>> 9ae90571ea1a724c32aa4df46f7d1f3dd514d9fd
