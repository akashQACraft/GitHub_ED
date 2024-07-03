package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PartResequencing extends TestDriverActions {

    @FindBy(xpath = "//a[contains(.,'WO002504')]")
    WebElement Referance;

    @FindBy(xpath = "//a[contains(.,'New RO')]")
    WebElement NewRO;

    @FindBy(xpath = "//a[contains(.,'New Unit')]")
    WebElement NewUnit;

    @FindBy(xpath = "//label[contains(.,'Search and Select ')]")
    WebElement SearchAndSelect;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    WebElement SeachTextArea;

    @FindBy(xpath = "//td[contains(@id,':tCus:0:c1')]//a/child::span[text()='Select']")
    WebElement btn_Select;

    @FindBy(xpath = "//label[text()='Unit #:']/preceding-sibling::span")
    WebElement Required_Unit;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement UnitHash;

    @FindBy(xpath = "//input[contains(@id,':itEQN::content')]")
    WebElement UnitTextArea;

    @FindBy(xpath = "//label[contains(.,'Description:')]/preceding-sibling::span")
    WebElement Required_Description;

    @FindBy(xpath = "//label[contains(.,'Description:')]")
    WebElement Description;

    @FindBy(xpath = "//input[contains(@id,':itEQD::content')]")
    WebElement Description_TextArea;

    @FindBy(xpath = "//label[text()='VIN #:']/preceding-sibling::span")
    WebElement Required_VIN;

    @FindBy(xpath = "//label[text()='VIN #:']")
    WebElement VINHash;

    @FindBy(xpath = "//input[contains(@id,':it1::content')]")
    WebElement VIN_Description;

    @FindBy(xpath = "//label[text()='Year:']/preceding-sibling::span")
    WebElement Required_Year;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement year;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement yearTextArea;


    @FindBy(xpath = "//label[text()='Truck/Trailer:']/preceding-sibling::span")
    WebElement Required_TruckAndTrailer;

    @FindBy(xpath = "//label[text()='Truck/Trailer:']")
    WebElement TruckAndTrailer;

    @FindBy(xpath = "(//a[contains(@id,':0:cilH')]/img)[1]")
    WebElement Search_Icon;

    @FindBy(xpath = "(//div[@title='DUAL AXLE']/a/span)[1]")
    WebElement Select_btn;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveAndExit;

    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement NewRepairOrder;

    @FindBy(xpath = "//div[contains(@id,':cbSelectUnitLocal')]//a/span[text()='Select']")
    WebElement Select;

    @FindBy(xpath = "//label[text()='RO#:']")
    WebElement RO;

    @FindBy(xpath = "(//label[text()='RO#:']/following::div)[1]")
    WebElement ROValue;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    WebElement label_AccessoriesGroup;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement label_AddButton;

    @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement label_AddPart;

    @FindBy(xpath = "//label[contains(.,'Part #:')]")
    WebElement label_PartHash;

    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    WebElement txt_PartTextArea;

    @FindBy(xpath = "//a[contains(.,'Core Return')]")
    WebElement CoreReturn;

    @FindBy(xpath = "//a[contains(.,'Issue Part')]")
    WebElement IssuePart;

    @FindBy(xpath = "//div[contains(@id,':ocb1:ctbClose')]//child::a/span[text()='Close']")
    WebElement btn_Close;

   @FindBy(xpath = "//a[contains(@id,':cl3')]/span")
   List< WebElement> PartNumberRow;



    @FindBy(xpath = "//a[contains(.,'BOLT1')]")
    WebElement BOLT1;

    @FindBy(xpath = "//a[contains(.,'0220')]")
    WebElement Test;

    @FindBy(xpath = "//a[contains(.,'1229300')]")
    WebElement Exhasutpipe;

    @FindBy(xpath = "//a[contains(.,'ACME-J18')]")
    WebElement JreqEq;

    @FindBy(xpath = "(//a[contains(.,'Re-Sequence')]/span)[2]")
    WebElement ReSequence;

    //@FindBy(xpath = "//td[contains(@id,':citemc')]/span")
    @FindBy(xpath = "//td[contains(@id,':citemc')]/child::span")
    List<WebElement> list2;

    @FindBy(xpath = "(//td[contains(.,'BOLT1')]/span)[2]")
    WebElement Part_BOLT1;

    @FindBy(xpath = "(//td[contains(.,'0220')]/span)[2]")
    WebElement Part_0220;

    @FindBy(xpath = "(//td[contains(.,'1229300')]/span)[2]")
    WebElement Part_1229300;

    @FindBy(xpath = "(//td[contains(.,'ACME-J18')]/span)[2]")
    WebElement Part_ACME;

    @FindBy(xpath = "(//a[contains(.,'Close')])[3]")
    WebElement Close_Btn;

    @FindBy(xpath = "//a[contains(.,'Cost Proof')]/span")
    WebElement CostProof;

    @FindBy(xpath = "//a[contains(.,'Customer Proof')]/span")
    WebElement CustomerProof;

    @FindBy(xpath = "//a[contains(.,'Quick Estimate')]/span")
    WebElement QuickEstimate;

    @FindBy(xpath = "//a[contains(.,'Pick List')]/span")
    WebElement PickList;

    @FindBy(xpath = "//a[contains(.,'Repair Order')]/span")
    WebElement RepairOrder;


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to complete RO Screen
     */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click On New RO**/
    public void clickOnNewRO() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewRO);
          WebElementActions.getActions().clickElement(NewRO);

//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Referance);
//        WebElementActions.getActions().clickElement(Referance);

    }


    /*click On New Unit **/
    public void clickOnNewUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewUnit);
        WebElementActions.getActions().clickElement(NewUnit);

    }

    /*verify Search and Select Unit Owner**/
    public void verifySearchAndSelectUnitOwner() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SearchAndSelect);
        Assert.assertTrue(SearchAndSelect.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SeachTextArea);
        Assert.assertTrue(SeachTextArea.isDisplayed());

    }

    /*enter Unit Owner **/
    public void enterUnitOwner() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SeachTextArea);
        WebElementActions.getActions().inputText(SeachTextArea, appProp.getProperty("UnitOwner"));


    }

    /*click on Select Button**/
    public void clickOnSelect1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);

    }

    /*verify Unit #**/
    public void verifyUnitHash() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Unit);
        Assert.assertTrue(Required_Unit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitHash);
        Assert.assertTrue(UnitHash.isDisplayed());

    }

    /*enter the Unit Number **/
    public void enterTheUnitNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitTextArea);
        WebElementActions.getActions().clickElement(UnitTextArea);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        UnitTextArea.sendKeys("U" + randomInt);


    }

    /*verify Description **/
    public void verifyOnDescription() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Description);
        Assert.assertTrue(Required_Description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());


    }

    /*enter the Description **/
    public void enterTheDescription() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description_TextArea);
        WebElementActions.getActions().inputText(Description_TextArea, appProp.getProperty("Description"));

    }

    /*verify VIN**/
    public void verifyOnVIN() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_VIN);
        Assert.assertTrue(Required_VIN.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VINHash);
        Assert.assertTrue(VINHash.isDisplayed());

    }

    /*enter the VIN **/
    public void entertheVIN() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VIN_Description);
        WebElementActions.getActions().inputText(VIN_Description, appProp.getProperty("VIN"));

    }

    /*verify On Year **/
    public void verifyYear() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Year);
        Assert.assertTrue(Required_Year.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(year);
        Assert.assertTrue(year.isDisplayed());


    }

    /*enter the year **/
    public void entertheyear() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(yearTextArea);
        WebElementActions.getActions().inputText(yearTextArea, appProp.getProperty("year"));

    }

    /*verify Truck and Trailer**/
    public void verifyTruckAndTrailer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_TruckAndTrailer);
        Assert.assertTrue(Required_TruckAndTrailer.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TruckAndTrailer);
        Assert.assertTrue(TruckAndTrailer.isDisplayed());

    }

    /*click On Search Icon **/
    public void clickOnSearchIcon() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Search_Icon);
        WebElementActions.getActions().clickElement(Search_Icon);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Select **/
    public void clickOnSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select_btn);
        WebElementActions.getActions().clickElement(Select_btn);

    }

    /*click On Save /Exit **/
    public void clickOnSaveAndExit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaveAndExit);
        WebElementActions.getActions().clickElement(SaveAndExit);


    }

    /*verify New Repair Order Tital **/
    public void verifyNewRepairOrder() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewRepairOrder);
        Assert.assertTrue(NewRepairOrder.isDisplayed());

    }

    /*click on Select Button **/
    public void clickOnSelectButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions().clickElement(Select);


    }

    /*verify RO #**/
    public void verifyRO() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RO);
        Assert.assertTrue(RO.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ROValue);
        Assert.assertTrue(ROValue.isDisplayed());
    }

    /**
     * click on Add Labour
     */
    public void clickOnAddLabour() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions().clickElement(label_AddLabor);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AccessoriesGroup);
        WebElementActions.getActions().clickElement(label_AccessoriesGroup);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions().clickElement(label_Add);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * click On Add Button
     */
    public void clickOnAddButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);
        WaitActions.getWaits().loadingWait(loder);
    }


    /**
     * click On Add Parts
     */
    public void clickOnAddParts1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddPart);
        WebElementActions.getActions().clickElement(label_AddPart);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        Thread.sleep(3000);
        WebElementActions.getActions().inputText(txt_PartTextArea, appProp.getProperty("PartValue1"));
        txt_PartTextArea.sendKeys(Keys.ENTER);
    }

    /*click On Core Return**/
    public void clickOnCoreRetrun() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CoreReturn);
        WebElementActions.getActions().clickElement(CoreReturn);

    }

    /*click On Add Part_2**/
    public void clickOnAddPart2() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        Thread.sleep(3000);
        WebElementActions.getActions().inputText(txt_PartTextArea, appProp.getProperty("PartValue2"));
        txt_PartTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Issue Part **/
    public void clickOnIssuePart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(IssuePart);
        WebElementActions.getActions().clickElement(IssuePart);
        Thread.sleep(2000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Add Part_3**/
    public void clickOnAddPart3() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        WebElementActions.getActions().inputText(txt_PartTextArea, appProp.getProperty("PartValue3"));
        Thread.sleep(3000);
        txt_PartTextArea.sendKeys(Keys.ENTER);

    }

    /*click On Add Part_4**/
    public void clickOnAddPart4() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        WebElementActions.getActions().inputText(txt_PartTextArea, appProp.getProperty("PartValue4"));
        Thread.sleep(3000);
        txt_PartTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Add Part_5**/
    public void clickOnAddPart5() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        WebElementActions.getActions().inputText(txt_PartTextArea, appProp.getProperty("PartValue5"));
        Thread.sleep(3000);
        txt_PartTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Close**/
    public void clickOnClose() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Close);
        WebElementActions.getActions().clickElement(btn_Close);
        WaitActions.getWaits().loadingWait(loder);
;
    }


    /* * click On Re-Sequence*/
    public void clickOnReSequence() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReSequence);
        WebElementActions.getActions().clickUsingJS(ReSequence);


    }


    public void compareWebElementLists() throws InterruptedException {
        Thread.sleep(7000);
        WaitActions.getWaits().WaitUntilWebElementIsVisible(PartNumberRow);
        System.out.println("size of list :" + PartNumberRow.size());
        for (int i = 0; i <= PartNumberRow.size(); i++) {
            String ele = PartNumberRow.get(i).getText();
            System.out.println("line :" + ele);
        }

    }
    public void compareWebElementLists2() throws InterruptedException {
        Thread.sleep(7000);
        WaitActions.getWaits().WaitUntilWebElementIsVisible(list2);
        System.out.println("size of list :" + list2.size());
        for (int i = 0; i <= list2.size()-1; i++) {
            if (!PartNumberRow.get(i).equals(list2.get(i + 1))) {
                System.out.println("Elements at index " + i + " and " + (i + 1) );
                String ele2 = list2.get(i).getText();
                System.out.println("line :" + ele2);
            }
        }
    }


    /*click On Close **/
    public void clickOnClose2() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Close_Btn);
        WebElementActions.getActions().clickElement(Close_Btn);
        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * click On  cost proof
     */
    public void clickOnCostProof() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CostProof);
        WebElementActions.getActions().clickElement(CostProof);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * Verify PDF data
     */
    public void verifyPDF() throws InterruptedException, IOException {
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
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if (pdfFullText.contains("123 ")) {
                System.out.println("GREASE");

                if (pdfFullText.contains("BOLT1")) {
                    System.out.println("Bolt One");
                }
                if (pdfFullText.contains("0220")) {
                    System.out.println("Test");
                }
                if (pdfFullText.contains("1229300")) {
                    System.out.println("EXHAUST PIPE");
                }


                fis.close();
            }
            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();
        }

    }

    /**
     * click On CustomerProof
     */
    public void clickOnCustomerProof() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerProof);
        WebElementActions.getActions().clickElement(CustomerProof);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * Verify PDF data
     */
    public void verifyPDF1() throws InterruptedException, IOException {
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
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if (pdfFullText.contains("123 ")) {
                System.out.println("GREASE");

                if (pdfFullText.contains("BOLT1")) {
                    System.out.println("Bolt One");
                }
                if (pdfFullText.contains("0220")) {
                    System.out.println("Test");
                }
                if (pdfFullText.contains("1229300")) {
                    System.out.println("EXHAUST PIPE");
                }


                fis.close();
            }
            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();
        }

    }
    /**
     * click On QuickEstimate
     */
    public void clickOnQuickEstimate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(QuickEstimate);
        WebElementActions.getActions().clickElement(QuickEstimate);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * Verify PDF data
     */
    public void verifyPDF2() throws InterruptedException, IOException {
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
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if (pdfFullText.contains("123 ")) {
                System.out.println("GREASE");

                if (pdfFullText.contains("BOLT1")) {
                    System.out.println("Bolt One");
                }
                if (pdfFullText.contains("0220")) {
                    System.out.println("Test");
                }
                if (pdfFullText.contains("1229300")) {
                    System.out.println("EXHAUST PIPE");
                }


                fis.close();
            }
            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();
        }

    }
    /**
     * click On QuickEstimate
     */
    public void clickOnPickList() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PickList);
        WebElementActions.getActions().clickElement(PickList);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * Verify PDF data
     */
    public void verifyPDF3() throws InterruptedException, IOException {
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
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if (pdfFullText.contains("123 ")) {
                System.out.println("GREASE");

                if (pdfFullText.contains("BOLT1")) {
                    System.out.println("Bolt One");
                }
                if (pdfFullText.contains("0220")) {
                    System.out.println("Test");
                }
                if (pdfFullText.contains("1229300")) {
                    System.out.println("EXHAUST PIPE");
                }


                fis.close();
            }
            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();
        }

    }
    /**
     * click On QuickEstimate
     */
    public void clickOnRepairOrder() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RepairOrder);
        WebElementActions.getActions().clickElement(RepairOrder);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * Verify PDF data
     */
    public void verifyPDF4() throws InterruptedException, IOException {
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
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if (pdfFullText.contains("123 ")) {
                System.out.println("GREASE");

                if (pdfFullText.contains("BOLT1")) {
                    System.out.println("Bolt One");
                }
                if (pdfFullText.contains("0220")) {
                    System.out.println("Test");
                }
                if (pdfFullText.contains("1229300")) {
                    System.out.println("EXHAUST PIPE");
                }


                fis.close();
            }
            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();
        }

    }

    /**
     * click On Sign Out
     */

    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions().clickUsingJS(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on UserName
     */
    public void clickOnUsername() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
        WebElementActions.getActions().clickElement(label_UserName);

    }

}


