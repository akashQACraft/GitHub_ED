package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class UnableToRemoveCoreLink_CONVOY extends TestDriverActions {

    @Test(priority = 0, description = "Test_001_verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void Test_001_gotoPartMaster() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        unabletoremovecorelink.gotoPartMaster();
        unabletoremovecorelink.verifyPartList();

    }

    @Test(priority = 1, description = "Test_002_click on part number")
    @Description("Test Description - click on part number ")
    public void Test_002_clickonPartNumber() throws InterruptedException, IOException {
        unabletoremovecorelink.clickonPartNumber();
        unabletoremovecorelink.clickmoreinfo();
        unabletoremovecorelink.verifytitle();
      //  unabletoremovecorelink.verfyDefaultpreferredValue();
       // unabletoremovecorelink.enterPartNumber();
    }

    @Test(priority = 2, description = "Test_003_click on part number")
    @Description("Test Description - click on part number ")
    public void Test_003_verifyName() throws InterruptedException, IOException {
     //  unabletoremovecorelink.verifyName();
     //  unabletoremovecorelink.typenameTextArea();
     //  unabletoremovecorelink.verifyRequiredPaymentTerm();
     //  unabletoremovecorelink.verifyCurrancy();
      // unabletoremovecorelink.verifyCountry();
      // unabletoremovecorelink.clicknOk();

    }

    @Test(priority = 3, description = "Test_004_verify required product group")
    @Description("Test Description -verify required product group ")
    public void Test_004_RequiredproductGroup() throws InterruptedException, IOException {
        unabletoremovecorelink.RequiredproductGroup();
        unabletoremovecorelink.verifyCorePart();
        unabletoremovecorelink.clickOnCorePart();
        unabletoremovecorelink.clickOnCancelButton();
    }

    @Test(priority = 4, description = "Test_005_go to Inventory Adjustment")
    @Description("Test Description -go to Inventory Adjustment ")
    public void Test_005_gotoInventoryAdjustment() throws InterruptedException, IOException {
        unabletoremovecorelink.gotoInventoryAdjustment();
        unabletoremovecorelink.clickonNewAdjustment();
        unabletoremovecorelink.verifySelectWarehouse();
        unabletoremovecorelink.selectWareHouse();
        unabletoremovecorelink.clickOnOkButton();

    }

    @Test(priority = 5, description = "Test_006_verify Warehouse Name")
    @Description("Test Description -verify Warehouse Name ")
    public void Test_006_verifyWarehouseName() throws InterruptedException, IOException {
        unabletoremovecorelink.verifyWarehouseName();
        unabletoremovecorelink.selectAdjustmentvalue();
        unabletoremovecorelink.partValue();
        unabletoremovecorelink.clickonPartValuePopup();
        unabletoremovecorelink.verifyQauantity();
        unabletoremovecorelink.verifypartdescription();
        unabletoremovecorelink.verifyonAddButton();
        unabletoremovecorelink.clickonCancel();

    }

    @Test(priority = 6, description = "Test_007_go to Part Master")
    @Description("Test Description -go to Part Master")
    public void Test_007_gotoPartMaster() throws InterruptedException, IOException {
        unabletoremovecorelink.gotoPartMasterTwo();
        unabletoremovecorelink.clickonPartNumber();
        unabletoremovecorelink.clickmoreinfo();
        unabletoremovecorelink.clickOnCorePartTwo();
        unabletoremovecorelink.clickOnCancelButton();


    }

    @Test(priority = 7, description = "Test_009_click On SignOut () ")
    @Description("Test Description -click On Sign Out")
    public void Test_008_clickOnSignOut() throws InterruptedException, IOException {
        unabletoremovecorelink.clickOnSignOut();
        unabletoremovecorelink.clickOnUserNameTextArea();

    }
}

