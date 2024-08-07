package pages.ticket_august;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
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

public class WorkinProgressReportLocationParameterGIST extends TestDriverActions {
    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    WebElement Reports;
    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[contains(text(),'Available Reports For Work in Progress Report')]")
    WebElement availableReportForWorkInProgressReport;

    @FindBy(xpath = "//h1[contains(text(),'Report Parameters')]")
    WebElement Report_Parameter;

    @FindBy(xpath = "(//td[contains(.,'Work in Progress Report')]/span)[1]")
    WebElement wrokinCategory_WorkInParameterReport;

    @FindBy(xpath = "(//td[contains(.,'Work in Progress Report')]/span)[2]")
    WebElement AvailableReports_WorkInProgress;

    @FindBy(xpath = "(//label[contains(.,'Location:')])[1]")
    WebElement Location;

    @FindBy(xpath = "//input[contains(@id,':itSearchFacilitySelect::content')]")
    WebElement Search_TextArea;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "(//a[contains(.,'Reports')])[1]")
    WebElement ReportTwo;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//span[contains(text(),'Unit Master')]")
     WebElement title_UnitMaster;

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
    /**varify Report Categories */
    public void varifyReportCategories () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
   /**click On Work In progress Report Category */
   public void clickOnWorkInProgress () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(wrokinCategory_WorkInParameterReport);
       WebElementActions.getActions().clickElement(wrokinCategory_WorkInParameterReport);
       WaitActions.getWaits().loadingWait(loder);
       TestListener.saveScreenshotPNG(driver);

   }
     /**varify available Report for Work In Proress Report */
     public void varifyAvalableReportForWorkInProgressReport () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(availableReportForWorkInProgressReport);
         Assert.assertTrue(availableReportForWorkInProgressReport.isDisplayed());
         WaitActions.getWaits().loadingWait(loder);

     }


   /**click On Work In progress Available Reports For AP */
   public void clickOnWorkInProgressTwo () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AvailableReports_WorkInProgress);
       WebElementActions.getActions().clickElement(AvailableReports_WorkInProgress);
       WaitActions.getWaits().loadingWait(loder);
       TestListener.saveScreenshotPNG(driver);

   }
   /**varify Reports Parameter */
   public void varifyReportsParameter () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Report_Parameter);
       Assert.assertTrue(Report_Parameter.isDisplayed());
       WaitActions.getWaits().loadingWait(loder);

   }
   /**clear The Lcoation Value*/
   public void clearTheLocationValue () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_TextArea);
       Search_TextArea.clear();
       TestListener.saveScreenshotPNG(driver);

   }
   /**go to Unit master */
   public void gotoUnitMaster () throws FileNotFoundException, InterruptedException {
       WaitActions.getWaits().loadingWait(loder);
       Thread.sleep(3000);
       ReusableActions.getActions().clickParentMenu("Fleet");
       ReusableActions.getActions().clickChildMenu("Unit Master");
       TestListener.saveScreenshotPNG(driver);

   }

   /**varify Unit Master*/
   public void varifyUnitMaster () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_UnitMaster);
       Assert.assertTrue(title_UnitMaster.isDisplayed());
       WaitActions.getWaits().loadingWait(loder);
   }

   /**click On Report Two*/
   public void clickOnReportTwo () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ReportTwo);
       WebElementActions.getActions().clickElement(ReportTwo);
       WaitActions.getWaits().loadingWait(loder);

   }
  /**click On Run Report */
  public void clickOnRunReport () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
      WebElementActions.getActions().clickElement(runReport);
      WaitActions.getWaits().loadingWait(loder);

  }
    /**
     * verify taxes on PDF
     */
    public void TaxesonPDF() throws InterruptedException, IOException {
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
            System.out.println(pdfFullText);

              String Keyword = "SHOP-Thame 2";
            if (pdfFullText.contains(Keyword)) {
                System.out.println("Wrok In progress :"+ Keyword);

            } else {

                System.out.println("Not Contains in this keyword :"+ Keyword);
            }
            fis.close();
            WaitActions.getWaits().loadingWait(loder);
            Thread.sleep(5000);

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
