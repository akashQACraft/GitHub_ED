package tests.ticket_july;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class DispatchGLMappingExceptionError extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to Standard Codes Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Standard Codes Screen")
    public void T_001_gotoStandardCodes()throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        dispatchglmapping.gotoStandardCodes();

    }

    @Test(priority = 1, description = "T_002_click On Dispatch ", enabled = true)
    @Description("Test Description : click On Dispatch ")
    public void T_002_clickOnDispatch() throws FileNotFoundException, InterruptedException {
        dispatchglmapping.clickOnDispatch();
        dispatchglmapping.clickOnBillingCodes();
        //dispatchglmapping.clickOnDeleteGenratedTestCode();//
        //dispatchglmapping.clickOnDelete();//
        dispatchglmapping.clickOnAddBillingCode();

    }

    @Test(priority = 2, description = "T_003_varify On Add Billing ", enabled = true)
    @Description("Test Description : varify On Add Billing ")
    public void T_003_varifyOnAddBilling() throws FileNotFoundException, InterruptedException {
        dispatchglmapping.varifyOnAddBilling();
        dispatchglmapping.enterTheCode();
        dispatchglmapping.varifyOnRequiredDescription();
        dispatchglmapping.enterTheDescriptionTextArea();
        dispatchglmapping.clickOnSaveExit();


    }

    @Test(priority = 3, description = "T_004_go to On Finincial Manager ", enabled = true)
    @Description("Test Description : go to On Finincial Manager  ")
    public void T_004_gotoOnFinincialManager() throws FileNotFoundException, InterruptedException {
        dispatchglmapping.gotoOnFinincialManager();
        dispatchglmapping.clickOnGLMapping();
        dispatchglmapping.clickOnDispatchGL();
        dispatchglmapping.clickOnAddBillingCodeMappings();
        dispatchglmapping.varifyOnLocation();
        dispatchglmapping.varifyOnBillingCode();

    }

    @Test(priority = 4, description = "T_005_select Test Code  ", enabled = true)
    @Description("Test Description : select Test Code  ")
    public void T_005_selectTestCode() throws FileNotFoundException, InterruptedException {
        dispatchglmapping.selectTestCode();
        dispatchglmapping.varifyOnDescription();
        dispatchglmapping.selectDivision();
        dispatchglmapping.varifyAccountNumber();
        dispatchglmapping.selectAccountNumber();
        dispatchglmapping.clickOnSaveExitTwo();
        dispatchglmapping.clickOnAddBillingCodeMappings();
        dispatchglmapping.varifyOnBillingCode();
        dispatchglmapping. SelectDELIVERYGL ();
        dispatchglmapping.varifyOnDescription();
        dispatchglmapping.selectDivsionGL ();

    }

    @Test(priority = 5, description = "T_006_varify Account Number  ", enabled = true)
    @Description("Test Description : varify Account Number  ")
    public void T_006_varifyAccountNumber() throws FileNotFoundException, InterruptedException {
        dispatchglmapping.varifyAccountNumber();
        dispatchglmapping.selectPartsGL() ;
        dispatchglmapping.clickOnSaveExitTwo();
        dispatchglmapping.varifyForBillingCode ();
        dispatchglmapping.varifymappingforLocation ();
        dispatchglmapping. clickOnCrossIcon ();


    }
    @Test(priority = 6, description = "T_007_click On Delete Icon  ", enabled = true)
    @Description("Test Description : click On Delete Icon  ")
    public void T_007_clickOnDeleteIcon() throws FileNotFoundException, InterruptedException {
     //   dispatchglmapping.clickOnDeleteIcon ();
        dispatchglmapping.clickOnSignOut ();

    }

}