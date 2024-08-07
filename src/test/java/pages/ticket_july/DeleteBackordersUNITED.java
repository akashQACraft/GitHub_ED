package pages.ticket_july;

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
import java.util.List;

public class DeleteBackordersUNITED extends TestDriverActions {

    public static String C_sale;
    @FindBy(xpath = "(//span[contains(.,'Add New Counter Sale')])[2]")
    WebElement AddNewCounterSale;
    @FindBy(xpath = "(//label[contains(text(),'Location:')]/preceding-sibling::span)[2]")
    WebElement Required_Location;
    @FindBy(xpath = "(//label[contains(text(),'Location:')])[2]")
    WebElement Location;
    @FindBy(xpath = "(//input[contains(@id,':itSearchFacilitySelect::content')])[2]")
    WebElement Location_TextArea;
    @FindBy(xpath = "//label[contains(text(),'Customer:')]/preceding-sibling::span")
    WebElement Required_Customer;
    @FindBy(xpath = "(//label[contains(text(),'Customer:')])[1]")
    WebElement Customer;
    @FindBy(xpath = "//span[contains(@id,':itSearchCustomerSelect')]/child::input")
    WebElement Customer_TextArea;
    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;
    @FindBy(xpath = "(//a[contains(.,'OK')]/child::span)[1]")
    WebElement btn_OK;
    @FindBy(xpath = "(//label[contains(text(),'Location:')])[2]")
    WebElement label_Location;
    @FindBy(xpath = "(//a[contains(.,'905 Truck and Trailer Repair')])[1]")
    WebElement Locaton_value;
    @FindBy(xpath = "//label[contains(text(),'Customer:')]")
    WebElement label_Customer;
    @FindBy(xpath = "//label[contains(text(),'Customer:')]/parent::td/following-sibling::td//table")
    WebElement Customer_Value;
    @FindBy(xpath = "(//label[contains(text(),'Part')])[1]")
    WebElement Part_hash;
    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    WebElement part_TextArea;
    @FindBy(xpath = "//a[contains(.,'Add Part')]/child::span")
    WebElement btn_Add_Part;
    @FindBy(xpath = "//span[contains(text(),'BEARINGKIT [wheel bearing kit]')]")
    WebElement label_Bearingkit;

    @FindBy(xpath = "//input[contains(@id,':it1::content')]")
    WebElement Charge;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveAndExit;
    @FindBy(xpath = "(//span[contains(@id,':cl5::text')])[1]")
    WebElement Cs_Sale;
    @FindBy(xpath = "(//a[contains(.,'Back Orders')])[2]")
    WebElement BackOrders;

    @FindBy(xpath = "//img[contains(@id,':cilV::icon')]")
    WebElement icon_Search;

    @FindBy(xpath = "//label[contains(.,'Name')]/preceding-sibling::input")
    WebElement NameCustomer;

    @FindBy(xpath = "(//a[contains(.,'Search')])[2]")
    WebElement btn_Search;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement btn_Select;

    @FindBy(xpath = "//a[contains(.,'Create CS')]/span")
    WebElement Created_Cs;

    @FindBy(xpath = "//a[contains(.,'Yes')]")
    WebElement btn_Yes;

    @FindBy(xpath = "//a[contains(.,'Order Parts')]/span")
    WebElement OrderParts;

    @FindBy(xpath = "(//img[contains(@id,':cilV::icon')])[3]")
    WebElement SearchIcon;


    @FindBy(xpath = "//input[contains(@id,':val00::content')]")
    WebElement Search_Name;

    @FindBy(xpath = "(//input[contains(@id,':it31::content')])[2]")
    WebElement Order_Qty;

    @FindBy(xpath = "(//span[text()='Select'])[2]")
    WebElement Select_Button;

    @FindBy(xpath = "//input[contains(@id,':selCb::content')]")
    WebElement btn_RadioSelect;


    @FindBy(xpath = "//a[contains(.,'Submit / Print PO')]/span")
    WebElement btn_Submit_PrintPO;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveAndExitTwo;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signout;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    /**
     * go to Counter sale  Manager
     */
    public void gotoCounterSaleManaer() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Counter Sale Manager");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add New Counter Sale
     */
    public void clickOnAddNewCountersale() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AddNewCounterSale);
        WebElementActions.getActions().clickElement(AddNewCounterSale);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify on Required location.Location,Location TextArea
     */
    public void varifyOnRequiredLocation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Location);
        Assert.assertTrue(Required_Location.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location_TextArea);
        Assert.assertTrue(Location_TextArea.isDisplayed());

    }

    /**
     * varify On Required Customer ,customer
     */
    public void varifyOnRequiredCustomer() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Customer);
        Assert.assertTrue(Required_Customer.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer);
        Assert.assertTrue(Customer.isDisplayed());

    }

    /**
     * enter the Customer Name
     */
    public void enterTheCustomerName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Customer_TextArea);
        WebElementActions.getActions().inputText(Customer_TextArea, appProp.getProperty("TruckAndTrailer"));
        Customer_TextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * varify cancel and Ok Button
     */
    public void varifyOnCancel() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Cancel);
        Assert.assertTrue(btn_Cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_OK);
        Assert.assertTrue(btn_OK.isDisplayed());

    }

    /**
     * click On ok Button
     */
    public void clickOnOK() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_OK);
        WebElementActions.getActions().clickElement(btn_OK);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify On Location and Location Value
     */
    public void varifyOnLocation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Location);
        Assert.assertTrue(label_Location.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Locaton_value);
        Assert.assertTrue(Locaton_value.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify customer and customer value
     */
    public void varifyOnCustomer() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Customer);
        Assert.assertTrue(label_Customer.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Customer_Value);
        Assert.assertTrue(Customer_Value.isDisplayed());
    }

    /**
     * varify Part #
     */
    public void varifyOnPart() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Part_hash);
        Assert.assertTrue(Part_hash.isDisplayed());

//        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible();
//        Assert.assertTrue(.isDisplayed());
    }

    /**
     * enter The Part
     */
    public void enterThePart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(part_TextArea);
        WebElementActions.getActions().inputText(part_TextArea, appProp.getProperty("BEARINGKIT"));
        part_TextArea.sendKeys(Keys.ENTER);
    }
    /***clickOn Add Button*/
    public void clickOnAddButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Add_Part);
        WebElementActions.getActions().clickElement(btn_Add_Part);

    }
    /**varify Part iteam*/
    public void varifyPartIteam () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Bearingkit);
        Assert.assertTrue(label_Bearingkit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Charge);
        Assert.assertTrue(Charge.isDisplayed());

    }


    /**
     * click On save /Exit
     */
    public void clickOnSaveAndExit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaveAndExit);
        WebElementActions.getActions().clickElement(SaveAndExit);

    }

    /**
     * varify On Iteam
     */
    public void varifyOnIteam() throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Cs_Sale);
        Assert.assertTrue(Cs_Sale.isDisplayed());

        C_sale = Cs_Sale.getText();
        System.out.println("Print the count_sale :" + C_sale);

    }

    /**
     * click On Back Orders
     */
    public void clickOnBackOrders() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(BackOrders);
        WebElementActions.getActions().clickElement(BackOrders);
        WaitActions.getWaits().loadingWait(loder);

    }
     /**enter the */
        public void clickOnsearchIcon () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(icon_Search);
            WebElementActions.getActions().clickElement(icon_Search);
            WaitActions.getWaits().loadingWait(loder);

        }
        /**enter the Search Customer */
        public void enterTheSearchCustomer () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NameCustomer);
            WebElementActions.getActions().inputText(NameCustomer, appProp.getProperty("905Truck"));
            WaitActions.getWaits().loadingWait(loder);

        }
        /**click On Search Customer  */
        public void clickOnSearch () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Search);
            WebElementActions.getActions().clickElement(btn_Search);
            WaitActions.getWaits().loadingWait(loder);

        }
        /**click On Select */
        public void clickOnSelect () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Select);
            WebElementActions.getActions().clickElement(btn_Select);
            WaitActions.getWaits().loadingWait(loder);

        }
        /**click On Cus_Invoice */
        public void clickOnCreated_Cs () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Created_Cs);
            WebElementActions.getActions().clickElement(Created_Cs);


            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Yes);
            WebElementActions.getActions().clickElement(btn_Yes);
            WaitActions.getWaits().loadingWait(loder);


        }
        /**click On Order Parts*/
        public void clickOnOrderParts () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OrderParts);
            WebElementActions.getActions().clickElement(OrderParts);
            WaitActions.getWaits().loadingWait(loder);

        }
        /**click On Search icon */
        public void clickOnSearchIcon () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SearchIcon);
            WebElementActions.getActions().clickElement(SearchIcon);
            WaitActions.getWaits().loadingWait(loder);

        }

        /**enter vendor name**/
        public void enterVendorName () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_Name);
            WebElementActions.getActions().inputText(Search_Name, appProp.getProperty("905"));
            WaitActions.getWaits().loadingWait(loder);

        }
        /**enter The Order Qty*/
        public void enterTheOrderQty () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Order_Qty);
            WebElementActions.getActions().inputText(Order_Qty,appProp.getProperty("OrderQty"));
            Search_Name.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            WaitActions.getWaits().loadingWait(loder);

        }
        /**click on Select Button */
        public void clickOnSelectButton () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select_Button);
            WebElementActions.getActions().clickElement(Select_Button);
            WaitActions.getWaits().loadingWait(loder);
        }


       /**select the Part And Description */
       public void selectThePartandDscriptRadio () throws InterruptedException {

           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RadioSelect);
           WebElementActions.getActions().clickElement(btn_RadioSelect);
           Thread.sleep(3000);
           WaitActions.getWaits().loadingWait(loder);

       }
       /**click On Submit and PO*/
       public void clickOnSubmitAndPO () throws InterruptedException {

           WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Submit_PrintPO);
           WebElementActions.getActions().clickElement(btn_Submit_PrintPO);
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

            if(pdfFullText.contains("Purches Order:"))
            {
                System.out.println("Order Quantity:");

            }

            fis.close();

        }
    }
    /**click Save /Exit*/
    public void clickOnSaveANdExit () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveAndExitTwo);
        WebElementActions.getActions().clickElement(SaveAndExitTwo);
        WaitActions.getWaits().loadingWait(loder);
    }




    /*click on Singout **/
    public void clickOnsignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signout);
        WebElementActions.getActions().clickElement(btn_signout);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click on UserName **/
    public void clickOnUserName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);

    }
}