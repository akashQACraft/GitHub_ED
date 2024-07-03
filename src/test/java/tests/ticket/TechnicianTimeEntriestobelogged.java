package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TechnicianTimeEntriestobelogged extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRO Screen ", enabled = true)
    @Description("Test Description : Login the page and go to CompleteRO Screen")
    public void T_001_goToCompleteROScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        nonrepairbilllineitems.goToCompleteROScreen();

    }

    @Test(priority = 1, description = "T_002 click on Non-Repair Bills  ", enabled = true)
    @Description("Test Description : click on Non-Repair Bills")
    public void T_002_clickOnNonRepairBills() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.clickOnNonRepairBills();
        nonrepairbilllineitems.verifyRequiredLcoation();
        nonrepairbilllineitems.verifyRequiredInvoiceDate();
        nonrepairbilllineitems.verifyRequiredCstomer();

    }

    @Test(priority = 2, description = "T_003 verify Customer PO ", enabled = true)
    @Description("Test Description :  verify Customer PO")
    public void T_003_verifyCustomerPO() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.verifyCustomerPO();
        nonrepairbilllineitems.verifyDescription();
        nonrepairbilllineitems.verifySubtotal();
        nonrepairbilllineitems.verifySeq();
        nonrepairbilllineitems.verifyQuantity();

    }

    @Test(priority = 3, description = "T_004 enter the Customer TextArea  ", enabled = true)
    @Description("Test Description :  enter the Customer TextArea")
    public void T_004_entertheCustomerTextArea() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.entertheCustomerTextArea();
        nonrepairbilllineitems.addTimesheetEntries();
        nonrepairbilllineitems.verifyTechanican();
        nonrepairbilllineitems.clickOnAddTechnican();
        nonrepairbilllineitems.TechnicianIsRequired();
        nonrepairbilllineitems.clickOnOk();

    }

    @Test(priority = 4, description = "T_005 Enter the Techanician  ", enabled = true)
    @Description("Test Description :  enter the Customer TextArea")
    public void T_005_enterTechanican() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.enterTechanician();
        nonrepairbilllineitems.clickOnAddTechnican();
        nonrepairbilllineitems.verifyCreateTimeSheetEntry();
      //  nonrepairbilllineitems.enterChargeHourstextarea();
      // nonrepairbilllineitems.verifyTheNumberMustbeZerotoFiftynign();
        nonrepairbilllineitems.enterChargeHours();
        nonrepairbilllineitems.clickOnAddTechnican();
    }
    @Test(priority = 5, description = "T_006 Enter the Techanican two  ", enabled = true)
    @Description("Test Description :  enter the Techanican Two ")
    public void T_006_entertheTechanican2() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.entertheTechanican2();
        nonrepairbilllineitems.enterChargeHours2();
        nonrepairbilllineitems.clickOnAddTechnican();
        nonrepairbilllineitems.clickOnCancel();
        nonrepairbilllineitems.verifyCancelImg();
        nonrepairbilllineitems.clickOnClose();
    }
    @Test(priority = 6, description = "T_007 Everify Close  ", enabled = true)
    @Description("Test Description :  enter the Techanican Two ")
    public void T_007_verifyclose() throws FileNotFoundException, InterruptedException {
        nonrepairbilllineitems.verifyclose();
        nonrepairbilllineitems.clickOnOkButton();
        nonrepairbilllineitems.verifyEitherincreasetheQuantity();
        nonrepairbilllineitems.enterUnitChargeTextArea();
        nonrepairbilllineitems.editQuantity();
        nonrepairbilllineitems.verifySubTotalValue();
        nonrepairbilllineitems.clickOnOkButton();

    }
    @Test(priority = 7, description = "T_008 click on Referance  ", enabled = true)
    @Description("Test Description :   click on Referance ")
    public void T_008_clickOnReference() throws IOException, InterruptedException {
        nonrepairbilllineitems.clickOnReference();
        nonrepairbilllineitems.clickOnInvoice();
        nonrepairbilllineitems.verifyReceiptstoApply();
        nonrepairbilllineitems.verifyTendor();
        nonrepairbilllineitems.SelectAccount();
        nonrepairbilllineitems.SelectAccount2();
        nonrepairbilllineitems.SelectAccount3();
        nonrepairbilllineitems.clickOnInvoice2();
        nonrepairbilllineitems.VerifyTaxesonPDF();
    }
    @Test(priority = 8, description = "T_009 click on Report  ", enabled = true)
    @Description("Test Description :   click on Report ")
    public void T_009_clickOnReport () throws IOException, InterruptedException {
        nonrepairbilllineitems.clickOnReport ();
        nonrepairbilllineitems.clickOnEmployee ();
        nonrepairbilllineitems.clickOnEmployeeTimeSheetExport  ();
        nonrepairbilllineitems.clickOnRunReport ();
        nonrepairbilllineitems.readExcel();
        nonrepairbilllineitems.clickOnHideNon_ROTimes ();
        nonrepairbilllineitems. clickOnUsername ();

    }
}