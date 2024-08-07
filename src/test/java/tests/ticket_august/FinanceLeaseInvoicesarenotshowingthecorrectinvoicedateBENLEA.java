package tests.ticket_august;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA extends TestDriverActions {


    @Test(priority = 0, description = "T_001_Login the page and go to Unit Master Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Unit Master Screen")
    public void T_001_gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        financeLeaseInvoice.gotoUnitMasterScreen();

    }

    @Test(priority = 1, description = "T_002_click On New Unit  ", enabled = true)
    @Description("Test Description : click On New Unit ")
    public void T_002_clickOnNewUnit() throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.clickOnNewUnit();
        financeLeaseInvoice.enterTheOwnerName();
        financeLeaseInvoice.clickOnSelectButton();
        financeLeaseInvoice.varifyUnitName();
        financeLeaseInvoice.enterTheRandomUnitNumber();
        financeLeaseInvoice.varifyDescription();
        financeLeaseInvoice.enterTheRandomDescription();
        financeLeaseInvoice.varifyVIN();
        financeLeaseInvoice.varifyVINNumber();

    }

    @Test(priority = 2, description = "T_003_varify Year  ", enabled = true)
    @Description("Test Description : varify Year ")
    public void T_003_varifyYear() throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.varifyYear();
        financeLeaseInvoice.enterTheYear();
        financeLeaseInvoice.TrackandTrailer();
        financeLeaseInvoice.clickOnSelect();
        financeLeaseInvoice.clickOnSaveAndExit();
        financeLeaseInvoice.clickOnUnitNumber();
        financeLeaseInvoice.clickOnMoreInfo();

    }

    @Test(priority = 3, description = "T_004_click On Domicile Location   ", enabled = true)
    @Description("Test Description : click On Domicile Location ")
    public void T_004_clickOnDomicileLocation () throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.clickOnDomicileLocation();
        financeLeaseInvoice.clickOnAddDomicileLocation();
        financeLeaseInvoice.varifyLocation();
        financeLeaseInvoice.enterTheLocationValue();
        financeLeaseInvoice.varifyeffectiveDate();
        financeLeaseInvoice.clickOnAdd();
        financeLeaseInvoice.clickOnCorporateDevision();
        financeLeaseInvoice.clickOnAddCorporateDevision();
        financeLeaseInvoice.enterTheEffectiveDate();
        financeLeaseInvoice.varifyDevision();
        financeLeaseInvoice.selectDevision();
    }

    @Test(priority = 4, description = "T_005_click On Domicile Location   ", enabled = true)
    @Description("Test Description : click On Domicile Location ")
    public void T_005_clickOnDomicileLocation () throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.varifyRentalandLeaseType ();
        financeLeaseInvoice.selectRentalLeaseType ();
        financeLeaseInvoice.clickOnSaveAndExitTwo ();
        financeLeaseInvoice.clickOnSaveAndExitThree ();
        financeLeaseInvoice.clickOnSaveAndExitFour ();

    }
    @Test(priority = 5, description = "T_006_go to Rental Manager   ", enabled = true)
    @Description("Test Description : go to Rental Manager")
    public void T_006_gotoRentalManager() throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.gotoRentalManager();
        financeLeaseInvoice.clickOnAgreement();
        financeLeaseInvoice.clickOnFinanceLease();
        financeLeaseInvoice.clickOnCreateFinanceAgrement();
        financeLeaseInvoice.clickOnCusromerIcon();
        financeLeaseInvoice.clickOnSelectCustomer();
        financeLeaseInvoice.varifyFinanceAccount();
        financeLeaseInvoice.enterFinanceAccount();
        financeLeaseInvoice.varifyMonthText();
    }
    @Test(priority = 6, description = "T_007_enter The Months   ", enabled = true)
    @Description("Test Description : enter The Months")
    public void T_007_enterTheMonth() throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.enterTheMonth();
        financeLeaseInvoice.varifyInterestRate();
        financeLeaseInvoice.enterTheIntrestRateTextArea();
        financeLeaseInvoice.clickOnNextButton();
        financeLeaseInvoice.clickOnAddButton();
        financeLeaseInvoice.FinanceUnit();
        financeLeaseInvoice.clickOnSaveAndExitfour();
    }
    @Test(priority = 7, description = "T_008_enter The Finance Amount   ", enabled = true)
    @Description("Test Description : enter The Finance Amount")
    public void T_008_enterTheFinanceAmount() throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.enterTheFinanceAmount();
        financeLeaseInvoice.varifyFinanceLeaseAgreement();
        financeLeaseInvoice.RequiredDfferedRevance();
        financeLeaseInvoice.selectDeferredRevenue();
        financeLeaseInvoice.varifyIntrestRevenue();
        financeLeaseInvoice.selectIntrestRevenue();
        financeLeaseInvoice.varifyFinanceLeaseReceivable();
        financeLeaseInvoice.selectFinanceLeaseRecceivable();
        financeLeaseInvoice.varifyReceiptAccount();
    }
    @Test(priority = 8, description = "T_009_click On Finalize     ", enabled = true)
    @Description("Test Description : click On Finalize ")
    public void T_009_clickOnFinalize  ()  throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.ReceiptAccount ();
        financeLeaseInvoice.clickOnFinalize  ();
        financeLeaseInvoice. clickOnTOBeInvoiced ();
        financeLeaseInvoice.clickOnTabFinanceLease ();
        financeLeaseInvoice.enterCutOfDate ();
        financeLeaseInvoice.enterTheAgreement ();
        financeLeaseInvoice.clickOnCalulate ();
        financeLeaseInvoice.clickOnGenerateinvoice ();


    }
    @Test(priority = 9, description = "T_010_click On Generate invoice Button     ", enabled = true)
    @Description("Test Description : click On Generate invoice Button  ")
    public void T_010_clickOnGenerateinvoiceButton ()  throws FileNotFoundException, InterruptedException {
        financeLeaseInvoice.clickOnGenerateinvoiceButton ();
        financeLeaseInvoice.clickOnPrint ();
        financeLeaseInvoice.clickOnclose ();
        financeLeaseInvoice.clickOnSignOut();

    }

}