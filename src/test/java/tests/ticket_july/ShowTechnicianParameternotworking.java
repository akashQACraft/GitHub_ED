package tests.ticket_july;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowTechnicianParameternotworking extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to SecuritySetup", enabled = true)
    @Description("Test Description : Login the page and go to SecuritySetup ")
    public void T_001_gotoSecuritySetup() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        showtechnicianparameterworking.gotoSecuritySetup();

    }

    @Test(priority = 1, description = "T_002_click On Global System Parameter ", enabled = true)
    @Description("Test Description : click On Global System Parameter ")
    public void T_002_clickOnGlobalSystemParameter() throws FileNotFoundException, InterruptedException {
        showtechnicianparameterworking.clickOnGlobalSystemParameter();
        showtechnicianparameterworking.searchSystemParameter();
        showtechnicianparameterworking.variyfyOnParameter();
        showtechnicianparameterworking.varifyOnCorporationOnthisParamter();
        showtechnicianparameterworking.clickOnName();
        showtechnicianparameterworking.varifyRequiredsystemValue();
        showtechnicianparameterworking.enterTheSystemValue();
        showtechnicianparameterworking.varifyCancel();
        showtechnicianparameterworking.clickOnSaveAndExit();


    }

    @Test(priority = 2, description = "T_003_go to Complete RO ", enabled = true)
    @Description("Test Description : go to Complete RO ")
    public void T_003_gotoCompleteRO() throws FileNotFoundException, InterruptedException {
        showtechnicianparameterworking.gotoCompleteRO();
        showtechnicianparameterworking.clickOnNewRo();
        showtechnicianparameterworking.entertheSearchunit();
        showtechnicianparameterworking.clickOnSelect();
        showtechnicianparameterworking.clickOnAddLabour();
        showtechnicianparameterworking.clickOnVMRS();
        showtechnicianparameterworking.clickOnAcessoriesGroup();
        showtechnicianparameterworking.clickOnPlusIcon();
        showtechnicianparameterworking.clickOnAdd();
        showtechnicianparameterworking.clickOnActalValue();


    }

    @Test(priority = 3, description = "T_004_click On Add Technician Time ", enabled = true)
    @Description("Test Description : click On Add Technician Time ")
    public void T_004_clickOnAddTechnicianTime() throws FileNotFoundException, InterruptedException {
        showtechnicianparameterworking.clickOnAddTechnicianTime();
        showtechnicianparameterworking.varifyRequiredTechanican();
        showtechnicianparameterworking.enterTheTechnician();
        showtechnicianparameterworking.varifyRequiredStart();
        showtechnicianparameterworking.enterTheStartDate();
        showtechnicianparameterworking.varifyFinish();
        showtechnicianparameterworking.enterTheFinish();
        showtechnicianparameterworking.varifyActualhours();
        showtechnicianparameterworking.clickOnAddTechnicianTimeButton();
        showtechnicianparameterworking.clickOnClose();

    }

    @Test(priority = 4, description = "T_005_enter The Cutomer PO ", enabled = true)
    @Description("Test Description : enter The Cutomer PO ")
    public void T_005_enterTheCutomerPO() throws IOException, InterruptedException {
        showtechnicianparameterworking.enterTheCutomerPO();
        showtechnicianparameterworking.clickOnInvoice();
        showtechnicianparameterworking.selectFirstTendor();
        showtechnicianparameterworking.selectSecondTendor();
        showtechnicianparameterworking.selectThirdTendor();
        showtechnicianparameterworking.varifyOnInvoiceButton();
        showtechnicianparameterworking.clickOnInvoicebtn();
        showtechnicianparameterworking.VerifyTaxesonPDF();



    }

    @Test(priority = 5, description = "T_006_enter The Parameter Yes ", enabled = true)
    @Description("Test Description : enter The Parameter Yes ")
    public void T_006_enterTheParameterYes() throws IOException, InterruptedException {
        showtechnicianparameterworking.gotoSecuritySetUpTwo();
        showtechnicianparameterworking.clickOnGlobalSystemParameter();
        showtechnicianparameterworking.searchSystemParameter();
        showtechnicianparameterworking.variyfyOnParameter();
        showtechnicianparameterworking.varifyOnCorporationOnthisParamter();
        showtechnicianparameterworking.clickOnName();
        showtechnicianparameterworking.varifyRequiredsystemValue();
        showtechnicianparameterworking.enterTheSystemValuey() ;
        showtechnicianparameterworking.clickOnSaveAndExit();

    }

    @Test(priority = 6, description = "T_007_click On New Ro", enabled = true)
    @Description("Test Description :click On New Ro ")
    public void T_007_clickOnNewRo() throws IOException, InterruptedException {
        showtechnicianparameterworking.gotoCompleteRO();
        showtechnicianparameterworking.clickOnBackCompleteOrderRO();
        showtechnicianparameterworking.clickOnNewRo();
        showtechnicianparameterworking.entertheSearchunit();
        showtechnicianparameterworking.clickOnSelect();
        showtechnicianparameterworking.clickOnAddLabour();
        showtechnicianparameterworking.clickOnVMRS();
        showtechnicianparameterworking.clickOnAcessoriesGroup();
        showtechnicianparameterworking.clickOnPlusIcon();
        showtechnicianparameterworking.clickOnAdd();
        showtechnicianparameterworking.clickOnActalValue();

    }

    @Test(priority = 7, description = "T_008_enter The Technician", enabled = true)
    @Description("Test Description : enter The Technician ")
    public void T_008_enterTheTechnician() throws FileNotFoundException, InterruptedException {
        showtechnicianparameterworking.clickOnAddTechnicianTime();
        showtechnicianparameterworking.varifyRequiredTechanican();
        showtechnicianparameterworking.enterTheTechnician();
        showtechnicianparameterworking.varifyRequiredStart();
        showtechnicianparameterworking.enterTheStartDate();
        showtechnicianparameterworking.varifyFinish();
        showtechnicianparameterworking.enterTheFinish();
        showtechnicianparameterworking.varifyActualhours();
        showtechnicianparameterworking.clickOnAddTechnicianTimeButton();
        showtechnicianparameterworking.clickOnClose();

    }

    @Test(priority = 8, description = "T_005_click On SignOut ", enabled = true)
    @Description("Test Description : click On SignOut ")
    public void T_009_clickOnSignOut() throws IOException, InterruptedException {
        showtechnicianparameterworking.enterTheCutomerPO();
        showtechnicianparameterworking.clickOnInvoice();
        showtechnicianparameterworking.selectFirstTendor();
        showtechnicianparameterworking.selectSecondTendor();
        showtechnicianparameterworking.selectThirdTendor();
        showtechnicianparameterworking.varifyOnInvoiceButton();
        showtechnicianparameterworking.clickOnInvoicebtn();
        showtechnicianparameterworking.VerifyTaxesonPDF();
        showtechnicianparameterworking.clickOnSignOut();

    }
}