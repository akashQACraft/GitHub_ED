package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CustomerProofPartOrder extends TestDriverActions {


    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;
    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    public WebElement label_ReferenceNumber;

    @FindBy(xpath = "//a[contains(.,'Customer Proof')]")
    WebElement Customerproof;

    @FindBy(xpath = "//a[contains(@id,':0:clPopupWoact')]/child::span")
    WebElement Labour;

    @FindBy(xpath = "//h2[contains(text(),'Body Moldings - Exterior')]")
    WebElement BodyMoldings;

    @FindBy(xpath = "(//a[contains(.,'Re-Sequence')])[2]")
    WebElement Resequence;

    @FindBy(xpath = "//a[contains(.,'Show Parts Details')]/child::span")
    WebElement ShowPartsDetailes;

    @FindBy(xpath = "//th[contains(.,'Part Number')]/child::div[2]/span")
    WebElement partNumber;

    @FindBy(xpath = "//th[contains(.,'Core')]/div/span")
    WebElement core;

    @FindBy(xpath = "//th[contains(.,'Actual Quantity')]/div[2]/span")
    WebElement actualQuantity;

    @FindBy(xpath = "//th[contains(.,'Unit Cost')]/div[2]/span")
    WebElement UnitCost;

    @FindBy(xpath = "(//th[contains(.,'Total Cost')]/div[2]/span)[2]")
    WebElement TotalCost;

    @FindBy(xpath = "//th[contains(.,'Charge Quantity')]/div[2]/span")
    WebElement ChargeQuantity;

    @FindBy(xpath = "//th[contains(.,'Unit Charge')]/div[2]/span")
    WebElement unitcharge;

    @FindBy(xpath = "(//th[contains(.,'Total Charge')]/div[2]/span)[2]")
    WebElement TotalCharge;

    @FindBy(xpath = "//td[contains(@id,':tPartsCItemasCode')]")
    WebElement PartNumber;

    @FindBy(xpath = "(//td[contains(.,'Body Moldings - Exterior')]/div)[2]")
    WebElement BodyMoldingsExterior;


    @FindBy(xpath = "(//img[@title='Change Sequence'])[1]")
    WebElement seq1;

    @FindBy(xpath = "//label[contains(.,'Part #')]")
    WebElement Parthash;

    @FindBy(xpath = "//label[contains(.,'Part #')]/following::td[1]")
    WebElement PartHashValue;

    @FindBy(xpath = "//label[contains(.,'Change Seq# from 1 to')]/preceding-sibling::span")
    WebElement RequiredChangeSeq;

    @FindBy(xpath = "//label[contains(.,'Change Seq# from 1 to')]")
    WebElement ChangeSeq;

    @FindBy(xpath = "//input[contains(@id,':1:it4::content')]")
    WebElement changeSeqTextarea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')]/child::span)[2]")
    WebElement btn_Ok;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[2]")
    WebElement seq2;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[3]")
    WebElement seq3;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[4]")
    WebElement seq4;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[5]")
    WebElement seq5;

    @FindBy(xpath = "(//a[contains(.,'Close')])[3]")
    WebElement btn_close;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /*go to CompleteRo**/
        public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
            ReusableActions.getActions().clickParentMenu("Service");
            ReusableActions.getActions().clickChildMenu("Complete RO");
        }

    /* click PF User in American Body**/
    public void clickPFCorproID () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions().clickElement(CorproId);
        WaitActions.getWaits().loadingWait(loder);

    }
    /* select  PF User in American Body**/
    public void selectPFUser () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions().inputText(searchandSelectCarporation, appProp.getProperty("PFUser"));
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions().clickElement(Select);

    }

    /*enter Referance Number **/
    public void enterReferanceNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea, appProp.getProperty("Referance"));


    }
    /*click on Refresh **/
    public void clickOnRefresh () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click On Referance **/
    public void clickOnReferance () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ReferenceNumber);
        WebElementActions.getActions().clickElement(label_ReferenceNumber);


    }
      /*click On Customer proof**/
    public void clickcustomerProof () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Customerproof);
        WebElementActions.getActions().clickElement(Customerproof);
        WaitActions.getWaits().loadingWait(loder);
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
            //      System.out.println(pdfFullText);

            if (pdfFullText.contains("Shop Charges:")) {
                System.out.println("ALl Part Number Sequence as per Actual Part and PDF Part ");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }
    }
    /*verify labour**/
    public void verifyLabour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Labour);
        Assert.assertTrue(Labour.isDisplayed());

    }
    /*verify Body Moldings**/
    public void verifyBodyMoldings () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(BodyMoldings);
        Assert.assertTrue(BodyMoldings.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Resequence);
        Assert.assertTrue(Resequence.isDisplayed());

    }
    /*click On ShowPartsDetailes**/
    public void verifyShowPartsDetailes () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ShowPartsDetailes);
        Assert.assertTrue(ShowPartsDetailes.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(partNumber);
        Assert.assertTrue(partNumber.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(core);
        Assert.assertTrue(core.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(actualQuantity);
        Assert.assertTrue(actualQuantity.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitCost);
        Assert.assertTrue(UnitCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TotalCost);
        Assert.assertTrue(TotalCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ChargeQuantity);
        Assert.assertTrue(ChargeQuantity.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(unitcharge);
        Assert.assertTrue(unitcharge.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TotalCharge);
        Assert.assertTrue(TotalCharge.isDisplayed());


    }
     /*verify Part Number **/
    public void verifyPartNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartNumber);
        Assert.assertTrue(PartNumber.isDisplayed());

    }
   /*click On Resequence **/
    public void clickOnResquence () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Resequence);
        WebElementActions.getActions().clickElement(Resequence);

    }
    /*verify Tital **/
   public void verifyBodyMoldingsExterior () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(BodyMoldingsExterior);
       Assert.assertTrue(BodyMoldingsExterior.isDisplayed());

   }
   /*  click On Seq Number **/
   public void clickOnSeqNumber () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(seq1);
       WebElementActions.getActions().clickElement(seq1);

   }
   /*verify Part and PartHash**/
    public void verifyPart () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Parthash);
        Assert.assertTrue(Parthash.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartHashValue);
        Assert.assertTrue(PartHashValue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredChangeSeq);
        Assert.assertTrue(RequiredChangeSeq.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ChangeSeq);
        Assert.assertTrue(ChangeSeq.isDisplayed());

    }
  /*Enter the Sequence 1st Number **/
    public void  entertheSeqNumber1 () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions().inputText(changeSeqTextarea, appProp.getProperty("ChangeSeq1"));


    }
    /*click On OK Button**/
    public void clickOnOK () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions().clickElement(btn_Ok);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click On Sequence 2nd Number **/
    public void  clickOnSeqNumber2 () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(seq2);
        WebElementActions.getActions().clickElement(seq2);


    }

    /*Enter the Sequence 2nd Number **/
    public void  entertheSeqNumber2 () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions().inputText(changeSeqTextarea, appProp.getProperty("ChangeSeq2"));


    }
    /*click on Sequence 3**/
    public void clickOnSequence3 () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(seq3);
        WebElementActions.getActions().clickElement(seq3);

    }
   /*Enter the Sequence 3**/
   public void entertheSequence3 () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
       WebElementActions.getActions().inputText(changeSeqTextarea, appProp.getProperty("ChangeSeq3"));

   }
   /*click On seq 4**/
   public void clickOnSeq4 () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(seq4);
       WebElementActions.getActions().clickElement(seq4);

   }
    /*Enter the Sequence 4**/
    public void entertheSequence4 () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions().inputText(changeSeqTextarea, appProp.getProperty("ChangeSeq4"));

    }
  /*click On Close**/
    public void clickOnClsoe () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions().clickElement(btn_close);
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
