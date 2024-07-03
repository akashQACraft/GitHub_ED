package tests.ticket;

//#32468 Customer Proof Part Order - UNITEDTRUCK --E3-I1697
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Customerproofpartorder extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRo", enabled = true)
    @Description("Test Description : Login the page and go to CompleteRo ")
    public void T_001_gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        unitedtruck.gotoCompleteRo();
      //  unitedtruck.clickPFCorproID ();
     //   unitedtruck.selectPFUser ();

    }

    @Test(priority = 1, description = "T_002_ente Referance Number ", enabled = true)
    @Description("Test Description : enter Referance Number")
    public void T_002_enterReferanceNumber() throws IOException, InterruptedException {
    //    loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
    //    unitedtruck.gotoCompleteRo();
        unitedtruck.enterReferanceNumber();
        unitedtruck.clickOnRefresh();
        unitedtruck.clickOnReferance();
        unitedtruck.verifyPartNumber();
        unitedtruck.clickcustomerProof();
        unitedtruck.VerifyTaxesonPDF();
    }

    @Test(priority = 2, description = "T_003_verify Labour ", enabled = true)
    @Description("Test Description : verify Labour")
    public void T_003_verifyLabour() throws IOException, InterruptedException {
        unitedtruck.verifyLabour();
        unitedtruck.verifyBodyMoldings();
        unitedtruck.verifyShowPartsDetailes();
        unitedtruck.verifyPartNumber();


    }
    @Test(priority = 3, description = "T_004_click On Resquence ", enabled = true)
    @Description("Test Description : click On Resquence")
    public void T_004_clickOnResquence ()  throws IOException, InterruptedException {
        unitedtruck.clickOnResquence();
        unitedtruck.verifyBodyMoldingsExterior();
        unitedtruck.clickOnSeqNumber();
        unitedtruck.verifyPart();
    }
    @Test(priority = 4, description = "T_005_enter the SeqNumber1  ", enabled = true)
    @Description("Test Description : entertheSeqNumber1 ")
    public void T_005_entertheSeqNumber1 ()  throws IOException, InterruptedException {
        unitedtruck.entertheSeqNumber1 ();
        unitedtruck.clickOnOK ();
        unitedtruck.clickOnSeqNumber2 ();
        unitedtruck.entertheSeqNumber2 ();
        unitedtruck.clickOnOK ();
        unitedtruck.clickOnSequence3 ();
        unitedtruck.entertheSequence3 ();
        unitedtruck.clickOnOK ();
        unitedtruck.clickOnClsoe ();
        unitedtruck.clickcustomerProof();
        unitedtruck.VerifyTaxesonPDF();
      //  unitedtruck.entertheSequence4 ();
        unitedtruck.clickOnsignOut () ;
        unitedtruck.clickOnUserName ();

    }
}