package tests.ticket;

//#32736 PM Inspection Reading - AGTFLEET---[E3-I1696]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PMInspectionReading extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRo", enabled = true)
    @Description("Test Description : Login the page and go to complete Ro Screen")
    public void T_001_gotoCompleteRO() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        agtfleet.gotoCompleteRO();

    }

    @Test(priority = 1, description = "T_001_click OnNew Ro", enabled = true)
    @Description("Test Description :click On New RO ")
    public void T_002_clickOnNewRo() throws FileNotFoundException, InterruptedException {
        agtfleet.clickOnNewRo();
        agtfleet.verifyOnNewRepairOrder();
        agtfleet.enterSearchTextArea();
        agtfleet.clickOnSelectButton();
        agtfleet.verifyUnitValue();

    }

    @Test(priority = 2, description = "T_003_go to PM Inspector Manager ", enabled = true)
    @Description("Test Description :go to PM Inspector Manager ")
    public void T_003_gotoPMInspectorManager() throws FileNotFoundException, InterruptedException {
        agtfleet.gotoPMInspectorManager();
        agtfleet.clickOnPmInspectionSetUp();
        agtfleet.clickOnAdd();
        agtfleet.varifySetupTaskAndReson();
        agtfleet.varifyRequiredCode();
        agtfleet.enterTheCodeTextArea();
        agtfleet.varifyRequiredTital();
        agtfleet.entertheTitalTextArea();
        agtfleet.clickOnNextOne ();
        agtfleet.clickOnAddNewSection();


    }

    @Test(priority = 3, description = "T_004_varify On Inspection Report Section  ", enabled = true)
    @Description("Test Description :varify On Inspection Report Section   ")
    public void T_004_varifyOnInspectionReportSection() throws FileNotFoundException, InterruptedException {
        agtfleet.varifyOnInspectionReportSection();
        agtfleet.enterTheDescription();
        agtfleet.varifyOnCancel();
        agtfleet.clickOnOk();
        agtfleet.clickOnAdd1();
        agtfleet.clickOnAccerioesGroup();
        agtfleet.clickOnPlusIcon();
        agtfleet.clickOnAdd2();
        agtfleet.clickOnArrow();
        agtfleet.clickOnAdd1();
        agtfleet.enterSearchTextAreaTWo();
    }
    @Test(priority = 4, description = "T_005_click On Annual DOT Inspection ", enabled = true)
    @Description("Test Description :click On Annual DOT Inspection   ")
    public void T_005_clickOnAnnualDOTInspection () throws FileNotFoundException, InterruptedException {
        agtfleet.clickOnAnnualDOTInspection();
        agtfleet.clickOnPlusIcon();
        agtfleet.clickOnAdd2();
        agtfleet.entertheTextName();
        agtfleet.selectDropdrown();
        agtfleet.selectOdeometerConfigure();
        agtfleet.clickOnNextTwo();
        agtfleet.clickOnNextThree();
        agtfleet.clickOnActivateInspection();
    }
        @Test(priority = 5, description = "T_006_click  On TechRo ", enabled = true)
        @Description("Test Description :click On TechRo ")
        public void T_006_clickOnTechRo () throws FileNotFoundException, InterruptedException {
            agtfleet.clickOnTechRo();
            agtfleet.enterTechRo();
            agtfleet.clickOnGO();

        }
    @Test(priority = 6, description = "T_007_click On MoreWork ", enabled = true)
    @Description("Test Description :click On More Work   ")
    public void T_007_clickOnMoreWork () throws FileNotFoundException, InterruptedException  {
        agtfleet.clickOnMoreWork ();
        agtfleet.clickOnVMRS ();
        agtfleet.enterTheLabour ();
        agtfleet.clickOnAnnualDOTInspectionOne ();
        agtfleet.clickOnPlusIcon();
        agtfleet.clickOnAddButton();
        agtfleet.clickOnAnnualDOTInspectionIMG ();
        agtfleet.clickOnCancel();
        agtfleet.clickOnYes ();
        agtfleet.clickOnSelectOne ();
        agtfleet.clickOnAnnualDoTInspection ();
        agtfleet.clickOnTires ();
        agtfleet.enterTheFrontTiredDepth ();
        agtfleet.enterTheFrontLeftTiredDepth ();
        agtfleet.varifyOdeometerReading ();
        agtfleet.clickOnDoneAndValidate ();
        agtfleet.clickOnBreaks ();
        agtfleet.clickOnDoneAndValidate ();
        agtfleet.clickOnFluids ();
        agtfleet.clickOnDoneAndValidate ();
        agtfleet. clickOnLights ();
        agtfleet.clickOnDoneAndValidate ();

    }
    @Test(priority = 7, description = "T_008_click On Defect Summary  ", enabled = true)
    @Description("Test Description :click On Defect Summary")
    public void T_008_clickOnDefectSummary () throws IOException, InterruptedException {
        agtfleet.clickOnDefectSummary();
        agtfleet.varifyDefectSummary();
        agtfleet.clickOnSign();
        agtfleet.varifyOnTechnicianSignature ();
        agtfleet.handleSignature();
        agtfleet.clickOnContinue();
        agtfleet.gotoUnitHistory();
        agtfleet.clickOnPrint ();
        agtfleet.VerifyTaxesonPDF();
        agtfleet.clickOnInspectedBy();
        agtfleet.varifyOnUnitHash();
        agtfleet. clickOnUnit();
        agtfleet.clickOnReadingsTwo();
        agtfleet.varifyReadingValue();
        agtfleet.clickOnSaveAndExitTwo ();
        agtfleet.clickOnBackTOInspectionHistory ();

    }
    @Test(priority = 8, description = "T_009_click On Summary Tab ", enabled = true)
    @Description("Test Description :click On Summary Tab")
    public void T_009_clickOnSummaryTab () throws IOException, InterruptedException {
        agtfleet.clickOnTechRO();
        agtfleet.enterTechRo();
        agtfleet.clickOnGO();
        agtfleet.clickOnSummaryTab();
        agtfleet. varifyOnOdometerValue ();
        agtfleet.gotoCompleteRO();
        agtfleet.varifyOdometerValue();
        agtfleet.clickOnUnit();
        agtfleet.clickOnReadingsTwo();
        agtfleet.varifyReadingValue();
        agtfleet.clickOnSaveAndExitTwo();
    }
    @Test(priority = 9, description = "T_010_click on Sign Out", enabled = true)
    @Description("Test Description :click on Sign Out")
    public void T_010_clickonSignOut() throws IOException, InterruptedException {
        agtfleet.clickonSignOut();
        agtfleet.clickonUsername();






    }
}