package tests;

import actions.DataActions;
import actions.LoginActions;
import actions.WaitActions;
import constants.SheetConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Estimate.SubmitAnEstimateServiceManager;
import pages.LoginPage;
import pages.administration.CreateCustomerPage;
import pages.administration.CreateVendorPage;
import pages.estimating.ApproveanEstimateDMSPage;
import pages.estimating.PerformTheWorkOnAnEstimateTech;
import pages.fleet.CreateRedTagDMS;
import pages.fleet.CreateUnitPage;
import pages.fleet.SetUpWorkRequired;


import pages.parts.*;
//import pages.pmWorkFlow.WorkOrderWorkflowPage;
import pages.parts.CounterSalePage;
import pages.pmWorkFlow.cGVTechPerformPM;
import pages.service.*;

import pages.tech.IssuePartToTech;
import pages.techRo.*;
import pages.tech.EC_Tech_WoLabor;
import pages.tech.EC_Tech_WoParts;


import pages.ticket.*;
import pages.ticket_august.*;
import pages.ticket_july.*;
import tests.ticket.hideshopsuppliesonwoinvoiceparameternotworking;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static actions.LoginActions.getAppUrl1;
import static org.apache.xalan.xsltc.runtime.CallFunction.className;

public class TestDriverActions {

    public static WebDriver driver;

    public LoginPage loginPage;
    public CreateUnitPage createUnitPage;
    public CreateRoPage createRoPage;
    public CreateVendorPage vendorsPage;
    public CreateCustomerPage customerPage;
    public CounterSalePage counter;
    public CreatePart relatedItem;
    // public SpotOrderParts order;
    public SetUpWorkRequired setUp;
    public ECServiceManager_ChangeCustomerPOafterInvoicing update;
    public InquireFXG_UnitHistory unit;
    public JournalizePartsInvoice journalize;
    public EC_Tech_WoLabor labor;
    public EC_Tech_WoParts part;
    public ECServiceManager_AddRemoveLabor addRemove;
    public ServiceManagerWoLabor servicelabor;
    public CreateNonRepairBill_ServiceManager nonrepairbills;
    public cGVTech_WoCompliance wocompliance;
    public ECService_Manager_Invoice completeropage;
    public DAFServiceManagerPartsRelatedTasks servicemanagerpartsrelatedtasks;
    public pages.nonrepair.ApproveNonRepairBill_DMS approveNonRepairBill;
    public CreateRedTagDMS redtag;
    public ECServiceManager_Journalize journalizepage;
    public pages.cGVUnitFunctionality.InquireFXG_UnitHistory unithistorypage;
    public ApproveanEstimateDMSPage approveanestimatedmspage;
    public cGVTechPerformPM pmworkorderworkflowpage;
    public PerformTheWorkOnAnEstimateTech performtheworkonanestimatepage;
    public Spotorderpart spotorderparts;
    public ReceivePart receivepart;
    public JournalizePartsInvoice_konaEU journalizepartinvoice;
    public SubmitAnEstimateServiceManager submitanestimateservicemanager;
    public IssuePartToTech issueparttotech;
    public CounterSaleInvoiceCharacterLimit countersaleinvoicecharacterlimit;
    public Add_a_fabricatedpart_to_a_closed_workorder  addafabricatedparttoaclosedworkorder;

    public TransitonedPaccar location;
    public UOMforpressureonInspectionInformation_ALLOWED unitinspectioninformation;
    public OverRideTaxesCauseOtherTaxDisappear overRideTaxes;
    public UnableToRemoveCoreLink_CONVOY unabletoremovecorelink;
    public SugestedOrderReporttrucatePartNumber reportrestockorreorder;
   public OrganizeFavoritesArrowsNotWorking americanbody;
   public EstimateFormatMissingLaborNotesDescription  estimateformatmissinglabor;
   public NonStockPartswithOnhandsReportCorrections nonstockparts;
   public TechnicianTimeEntriestobelogged nonrepairbilllineitems;
   public TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat Superstition;
   public APManagerOutstandingInvoiceTotal  smithys;
   public EstimateFormatTaxIssue estimateformattaxissue;
   public  CustomerProofPartOrder  unitedtruck;
   public MakeandModelsbecominginactive  lotsventures;
   public HideShopSuppliesonWOInvoiceParameternotworking abco;
   public ContactEmailfielddatarequest  datarequest;
   public FixedPMRegularReadingbasedPMSchedules fixedpm;
   public  PartResequencing partresequesencing;
   public TheServiceBoardrefreshesandlosestheusersposition workrequiredpopup;
   public  LabelExceptionError caledon;
   public PMInspectionReading  agtfleet;
   public RentalEquipmentUtilizationParameternotworking triton;
   public QuantumFinancialExportIsShowingaPSTvalueForInvoices financialexport;
   public  TheGLAccountHistoryexportcaps theglaccounthistory;
   public DeleteBackordersUNITED deletebackorders;
   public ShowTechnicianParameternotworking showtechnicianparameterworking;
   public DispatchGLMappingExceptionError dispatchglmapping;
   public ConvertNonDedicatedreportstofullXLSXformat convertnondeticatedreports;
   public GLAccountHistoryScreentoincludeBillingLocation glaccounthistoryscrren;
   public BackOrderLoadingTime backorderloadingtime;
   public HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow historylinksunderthings;
   public UnitReadingreportisntfilteringbycustomer unitreadingreport;
   public AddtheoptiontoexcludedefectlabourlinesontheFleet addtheoptiontoexcludedefectlabourlines;
   public WorkinProgressReportLocationParameterGIST workinprogressreportlocation;
   public PartUsageExportInvestigationWALLER partusageexportinvestion;
   public FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA financeLeaseInvoice;








    LoginActions loginActions;


    String folderPath, cmd, filePath;

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    /*  @BeforeSuite
      public void logSuite() {
          System.getProperty(("user.dir") + "\\log4j.xml");
          //DOMConfigurator.configure("log4j.xml");
      } */
    public String allurePathWin = System.getProperty("user.dir") + "\\allure-2.13.6\\bin\\allure.bat";

    public static Properties prop, configProp, appProp;

    public void property() throws IOException, InterruptedException {
        if (this.getClass().getCanonicalName().contains("LoginTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/login.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateUnit")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createunitQA.properties";
        } else if (this.getClass().getCanonicalName().contains("CounterSaleTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/countersale.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateCustomerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customer.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateVendorTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/vendors.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/config.properties";
        } else if (this.getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/submitanestimateservicemanagerQA.properties";
        } else if (this.getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/setupworkrequired.properties";
        } else if (this.getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerchangecustomerpoafterinvoicingQA.properties";
        } else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unitfunctionality.properties";
        } else if (this.getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizepartsinvoiceQA.properties";
        } else if (this.getClass().getCanonicalName().contains("TechWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwolaborQA.properties";
        } else if (this.getClass().getCanonicalName().contains("TechWoParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwopartsQA.properties";
        } else if (this.getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addremove.properties";
        } else if (this.getClass().getCanonicalName().contains("EC_ServiceManager_WoLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicelabor.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/NonRepairBills.properties";
        } else if (this.getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerinvoiceQA.properties";
        } else if (this.getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerpartsrelatedtasksQA.properties";
        } else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approvenonrepair.properties";
        } else if (this.getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/wocompliance.properties";
        } else if (this.getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerjournalizeQA.properties";
        } else if (this.getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/redtag.properties";
        } else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unithistory.properties";
        } else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approveanestimatedms.properties";
        } else if (this.getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/cgvtechperformpmQA.properties";
        } else if (this.getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/performtheworkonanestimate.properties";
        } else if (this.getClass().getCanonicalName().contains("ReceiveParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receivepartsQA.properties";
        } else if (this.getClass().getCanonicalName().contains("Spotorderparts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/spotorderpartsQA.properties";
        } else if (this.getClass().getCanonicalName().contains("CreatePart")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createpartQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ReceiveParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receivepartsEU.properties";
        }




    /*    try

    {
        prop = new Properties();
        FileInputStream fip = new FileInputStream(filePath);
        try {
            prop.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch(
    FileNotFoundException e)

    {
        e.printStackTrace();
    }

     */

}

    /**
     * Initialization of Framework
     */

    @BeforeClass(alwaysRun = true)
    public void initialization() throws IOException, InterruptedException {

         String browserName = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForBrowser,SheetConstants.browserRowNumber);

//        System.getProperty(("user.dir") +"\\log4j.xml");
//        DOMConfigurator.configure("D:\\intellij\\latest_OfficeWork\\WorkingProject\\Emdecs_Test_Automation\\log4j.xml");
         if (browserName.equalsIgnoreCase(browserName)) {
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            ChromeOptions options = new ChromeOptions();
            chromePrefs.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
            chromePrefs.put("plugins.always_open_pdf_externally", true);
            chromePrefs.put("download.prompt_for_download", false);
            chromePrefs.put("download.default_directory", System.getProperty("user.dir")+"\\downloadFiles");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs",chromePrefs);
            WebDriverManager.chromedriver().setup();
            options.addArguments("--start-maximized");
        //    options.addArguments("--headless=new");
            options.addArguments("--window-size=1366,768");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("enable-automation");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
            options.addArguments("--allow-running-insecure-content");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(options);
            //  driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().maximize();


       } else if (browserName.equalsIgnoreCase("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
         LoginActions loginActions = new LoginActions();
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU") || LoginActions.environmentName.contains("EC") || LoginActions.environmentName.contains("NA")) {

            driver.get(getAppUrl1(getMyClassName()));    //new method Akash kadam
        } else {
          driver.get(loginActions.getAppUrl());      //old method

        }

        //      loginPage.selectCountryFromDropDown();

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        createRoPage = PageFactory.initElements(driver, CreateRoPage.class);
        createUnitPage = PageFactory.initElements(driver, CreateUnitPage.class);
        vendorsPage = PageFactory.initElements(driver, CreateVendorPage.class);
        customerPage = PageFactory.initElements(driver, CreateCustomerPage.class);
        counter = PageFactory.initElements(driver, CounterSalePage.class);
        relatedItem = PageFactory.initElements(driver, CreatePart.class);
        // order = PageFactory.initElements(driver, SpotOrderParts.class);
        setUp = PageFactory.initElements(driver, SetUpWorkRequired.class);
        update = PageFactory.initElements(driver, ECServiceManager_ChangeCustomerPOafterInvoicing.class);
        unit = PageFactory.initElements(driver, InquireFXG_UnitHistory.class);
        journalize = PageFactory.initElements(driver, JournalizePartsInvoice.class);
        labor = PageFactory.initElements(driver, EC_Tech_WoLabor.class);
        part = PageFactory.initElements(driver, EC_Tech_WoParts.class);
        addRemove = PageFactory.initElements(driver, ECServiceManager_AddRemoveLabor.class);
        servicelabor = PageFactory.initElements(driver,ServiceManagerWoLabor.class);
        nonrepairbills = PageFactory.initElements(driver, CreateNonRepairBill_ServiceManager.class);
        wocompliance = PageFactory.initElements(driver, cGVTech_WoCompliance.class);
        completeropage = PageFactory.initElements(driver, ECService_Manager_Invoice.class);
        servicemanagerpartsrelatedtasks = PageFactory.initElements(driver, DAFServiceManagerPartsRelatedTasks.class);
        approveNonRepairBill = PageFactory.initElements(driver, pages.nonrepair.ApproveNonRepairBill_DMS.class);
        journalizepage = PageFactory.initElements(driver, ECServiceManager_Journalize.class);
        redtag = PageFactory.initElements(driver, CreateRedTagDMS.class);
        unithistorypage = PageFactory.initElements(driver, pages.cGVUnitFunctionality.InquireFXG_UnitHistory.class);
        approveanestimatedmspage = PageFactory.initElements(driver, ApproveanEstimateDMSPage.class);
        pmworkorderworkflowpage = PageFactory.initElements(driver, cGVTechPerformPM.class);
        performtheworkonanestimatepage = PageFactory.initElements(driver, PerformTheWorkOnAnEstimateTech.class);
        spotorderparts = PageFactory.initElements(driver,Spotorderpart.class);
        journalizepartinvoice = PageFactory.initElements(driver,JournalizePartsInvoice_konaEU.class);
        receivepart = PageFactory.initElements(driver, ReceivePart.class);
        submitanestimateservicemanager = PageFactory.initElements(driver,SubmitAnEstimateServiceManager.class);
        issueparttotech=PageFactory.initElements(driver,IssuePartToTech.class);
        countersaleinvoicecharacterlimit=PageFactory.initElements(driver,CounterSaleInvoiceCharacterLimit.class);
        addafabricatedparttoaclosedworkorder=PageFactory.initElements(driver,Add_a_fabricatedpart_to_a_closed_workorder.class);
        location=PageFactory.initElements(driver,TransitonedPaccar.class);
        unitinspectioninformation=PageFactory.initElements(driver,UOMforpressureonInspectionInformation_ALLOWED.class);
        overRideTaxes=PageFactory.initElements(driver,OverRideTaxesCauseOtherTaxDisappear.class);
        unabletoremovecorelink=PageFactory.initElements(driver,UnableToRemoveCoreLink_CONVOY.class);
        reportrestockorreorder= PageFactory.initElements(driver,SugestedOrderReporttrucatePartNumber.class);
        americanbody= PageFactory.initElements(driver,OrganizeFavoritesArrowsNotWorking.class);
        estimateformatmissinglabor=PageFactory.initElements(driver,EstimateFormatMissingLaborNotesDescription.class);
        nonstockparts=PageFactory.initElements(driver,NonStockPartswithOnhandsReportCorrections.class);
        nonrepairbilllineitems=PageFactory.initElements(driver,TechnicianTimeEntriestobelogged.class);
        Superstition=PageFactory.initElements(driver,TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat.class);
        smithys=PageFactory.initElements(driver,APManagerOutstandingInvoiceTotal.class);
        estimateformattaxissue=PageFactory.initElements(driver,EstimateFormatTaxIssue.class);
        unitedtruck=PageFactory.initElements(driver,CustomerProofPartOrder.class);
        abco= PageFactory.initElements(driver,HideShopSuppliesonWOInvoiceParameternotworking.class);
        lotsventures=PageFactory.initElements(driver,MakeandModelsbecominginactive.class);
        datarequest=PageFactory.initElements(driver,ContactEmailfielddatarequest.class);
        fixedpm=PageFactory.initElements(driver,FixedPMRegularReadingbasedPMSchedules .class);
        partresequesencing=PageFactory.initElements(driver,PartResequencing.class);
        workrequiredpopup=PageFactory.initElements(driver,TheServiceBoardrefreshesandlosestheusersposition.class);
        caledon=PageFactory.initElements(driver,LabelExceptionError.class);
        agtfleet=PageFactory.initElements(driver,PMInspectionReading.class);
        triton=PageFactory.initElements(driver,RentalEquipmentUtilizationParameternotworking.class);
        financialexport=PageFactory.initElements(driver,QuantumFinancialExportIsShowingaPSTvalueForInvoices.class);
        theglaccounthistory=PageFactory.initElements(driver,TheGLAccountHistoryexportcaps.class);
        deletebackorders=PageFactory.initElements(driver,DeleteBackordersUNITED.class);
        showtechnicianparameterworking=PageFactory.initElements(driver,ShowTechnicianParameternotworking.class);
        dispatchglmapping=PageFactory.initElements(driver,DispatchGLMappingExceptionError.class);
        convertnondeticatedreports=PageFactory.initElements(driver,ConvertNonDedicatedreportstofullXLSXformat.class);
        glaccounthistoryscrren=PageFactory.initElements(driver,GLAccountHistoryScreentoincludeBillingLocation.class);
        backorderloadingtime=PageFactory.initElements(driver,BackOrderLoadingTime.class);
        historylinksunderthings=PageFactory.initElements(driver, HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow.class);
        unitreadingreport=PageFactory.initElements(driver,UnitReadingreportisntfilteringbycustomer.class);
        addtheoptiontoexcludedefectlabourlines=PageFactory.initElements(driver,AddtheoptiontoexcludedefectlabourlinesontheFleet.class);
        workinprogressreportlocation=PageFactory.initElements(driver, WorkinProgressReportLocationParameterGIST.class);
        partusageexportinvestion=PageFactory.initElements(driver,PartUsageExportInvestigationWALLER.class);
        financeLeaseInvoice=PageFactory.initElements(driver,FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA.class);

        loginPage.selectCountryFromDropDown();

        property();

        configProp  = new Properties();
        FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/utils/config.properties");
        try {
            configProp.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }


 /*       if(getClass().getCanonicalName().contains("LoginTest")){
            LoginActions loginActions = new LoginActions();
            driver.get(loginActions.getAppUrl());
            loginPage.selectCountryFromDropDown();
        }
        else{
         //   loginToSystem();
        }  */



    }


 /*   public void loginToSystem() throws InterruptedException, IOException {
        LoginActions loginActions = new LoginActions();

        driver.get(loginActions.getAppUrl());

//        loginPage.enterUserName(loginActions.getUserCredentials()[0]);
//        loginPage.enterPassword(loginActions.getUserCredentials()[1]);

        loginPage.selectCountryFromDropDown();
//        loginPage.enterUserName("c2357service2");
//        loginPage.enterPassword("Password");

         loginPage.enterUserName(username);
         loginPage.enterPassword(password);

//        loginPage.enterUserName((configProp.getProperty("username")));
//        loginPage.enterPassword((configProp.getProperty("password")));

        loginPage.clickLoginButton();
        Thread.sleep(8000);


    }   */


    /**
     * It generates test execution report in Html Format (Including Test steps, Screenshots and Pass/Fail Status)
     */
    public void generateHtmlReport() {


    }

    /**
     * Quit Browser after all execution completed
     */

    public void emptyResults() {
        try {
            for (File file : new java.io.File(System.getProperty("user.dir") + "/allure-results").listFiles())
                if (!file.isDirectory()) {
                    file.delete();
                }
        } catch (Exception E) {

        }
    }

    @AfterSuite(alwaysRun = true)
    public void generateAllure() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");
        String currentDateTime = format.format(date);
      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        } */
        if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateUnit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateUnitReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateVendorTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateVendorTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateCustomerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateCustomerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSale")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LoginTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/LoginTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimate_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SetUpWorkRequiredTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerChangeCustomerPOafterInvoicingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InquireFXG_UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoiceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoiceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoPartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ECServiceManager_AddRemoveLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateNonRepairBill_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTech_WoComplianceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBillTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitMasterTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerJournalizeReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRedTagDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBill_DMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTechPerformPMReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PerformTheWorkOnAnEstimateTechTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoice_konaEUTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimateServiceManagerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Spotorderparts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreatePart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreatePartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("IssuePartToTech")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/IssuePartToTechReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSaleInvoiceCharacterLimit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleInvoiceCharacterLimitReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Addafabricatedparttoaclosedworkorder")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddafabricatedparttoaclosedworkorderReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TransitonedPaccarReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UomforpressureonInspectionInformationAllowedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OverRideTaxesCauseOtherTaxDisappearReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnableToRemoveCoreLink_CONVOY")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnableToRemoveCoreLink_CONVOYReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SuggestedOrderReporttrucatePartNumber")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/SuggestedOrderReporttrucatePartNumber/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OrganizeFavoritesArrowsNotWorking")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/OrganizeFavoritesArrowsNotWorkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("EstimateFormatMissingLaborNotesDescription")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/EstimateFormatMissingLaborNotesDescriptionReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("NonStockPartswithOnhandsReportCorrections")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/NonStockPartswithOnhandsReportCorrectionsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechnicianTimeEntriestobelogged")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TechnicianTimeEntriestobeloggedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Twelvemonthactualcountonrestockeorderreportinexcelformat")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TwelvemonthactualcountonrestockeorderreportinexcelformatReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Apmanageroutstandinginvoicetotal")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/ApmanageroutstandinginvoicetotalReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Estimateformattaxissue")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/EstimateformattaxissueReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Customerproofpartorder")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/CustomerproofpartorderReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("hideshopsuppliesonwoinvoiceparameternotworking")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/hideshopsuppliesonwoinvoiceparameternotworkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Makeanmodelsbecominginactive")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/MakeanmodelsbecominginactiveReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Contactemailfielddatarequest")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/ContactemailfielddatarequestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Fixedpmregularreadingbasedpmschedules")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/FixedpmregularreadingbasedpmschedulesReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Partresequencing")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/PartresequencingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Theserviceboardrefreshesandlosestheusersposition")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TheserviceboardrefreshesandlosestheuserspositionReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Labelexceptionerror")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/LabelexceptionerrorReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PMInspectionReading")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/PMInspectionReadingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("RentalEquipmentUtilizationParameternotworking")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/RentalEquipmentUtilizationParameternotworkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("QuantumFinancialExportIsShowingaPSTvalueForInvoices")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/QuantumFinancialExportIsShowingaPSTvalueForInvoicesReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TheGLAccountHistoryexportcaps")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TheGLAccountHistoryexportcapsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("DeleteBackordersUNITED")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/DeleteBackordersUNITEDReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ShowTechnicianParameternotworking")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/ShowTechnicianParameternotworkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("DispatchGLMappingExceptionError")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/DispatchGLMappingExceptionErrorReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ConvertNonDedicatedreportstofullXLSXformat")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/ConvertNonDedicatedreportstofullXLSXformatReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("GLAccountHistoryScreentoincludeBillingLocation")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/GLAccountHistoryScreentoincludeBillingLocationReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("BackOrderLoadingTime")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/BackOrderLoadingTimeReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflowReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitReadingreportisntfilteringbycustomer")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/UnitReadingreportisntfilteringbycustomerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddtheoptiontoexcludedefectlabourlinesontheFleet")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/AddtheoptiontoexcludedefectlabourlinesontheFleetReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("WorkinProgressReportLocationParameterGIST")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/WorkinProgressReportLocationParameterGISTReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PartUsageExportInvestigationWALLER")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/PartUsageExportInvestigationWALLERReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEAReports/" + "__" + currentDateTime;
        }



        File theDir = new File(folderPath);

            // if the directory does not exist, create it

            if (!theDir.exists()) {
                System.out.println("creating directory: " + theDir.getName());
                boolean result = false;
                try {
                    theDir.mkdirs();
                    result = true;
                } catch (SecurityException se) {
                    // handle it
                    System.out.println(se.getMessage());
                }
                if (result) {
                    System.out.println("Folder created");
                }
            } else if (theDir.exists()) {
                System.out.println("Folder exist");
            }

      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
        } */
            if (getClass().getCanonicalName().contains("CreateRoTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateUnit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateUnitReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateVendorTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateVendorTestReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateCustomerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateCustomerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSale")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LoginTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LoginTestReports\\" +theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimate_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SetUpWorkRequiredTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerChangeCustomerPOafterInvoicingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoiceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoiceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoPartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ECServiceManager_AddRemoveLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateNonRepairBill_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBillTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitMasterTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTech_WoComplianceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerJournalizeReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRedTagDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBill_DMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTechPerformPMReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PerformTheWorkOnAnEstimateTechTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoice_konaEUTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoice_konaEUTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimateServiceManagerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Spotorderparts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreatePart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreatePartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("IssuePartToTech ")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\IssuePartToTechReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSaleInvoiceCharacterLimit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleInvoiceCharacterLimitReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Addafabricatedparttoaclosedworkorder")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddafabricatedparttoaclosedworkorderReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TransitonedPaccarReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UomforpressureonInspectionInformationAllowedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OverRideTaxesCauseOtherTaxDisappearReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnableToRemoveCoreLink_CONVOY")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnableToRemoveCoreLink_CONVOYReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SuggestedOrderReporttrucatePartNumber")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SuggestedOrderReporttrucatePartNumber\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OrganizeFavoritesArrowsNotWorking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OrganizeFavoritesArrowsNotWorkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("EstimateFormatMissingLaborNotesDescription")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EstimateFormatMissingLaborNotesDescriptionReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("NonStockPartswithOnhandsReportCorrections")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\NonStockPartswithOnhandsReportCorrectionsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechnicianTimeEntriestobelogged")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechnicianTimeEntriestobeloggedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Twelvemonthactualcountonrestockeorderreportinexcelformat")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TwelvemonthactualcountonrestockeorderreportinexcelformatReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Apmanageroutstandinginvoicetotal")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApmanageroutstandinginvoicetotalReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Estimateformattaxissue")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EstimateformattaxissueReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Customerproofpartorder")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CustomerproofpartorderReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("hideshopsuppliesonwoinvoiceparameternotworking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\hideshopsuppliesonwoinvoiceparameternotworkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Makeanmodelsbecominginactive")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\MakeanmodelsbecominginactiveReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Contactemailfielddatarequest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ContactemailfielddatarequestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Fixedpmregularreadingbasedpmschedules")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\FixedpmregularreadingbasedpmschedulesReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Partresequencing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PartresequencingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Theserviceboardrefreshesandlosestheusersposition")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TheserviceboardrefreshesandlosestheuserspositionReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Labelexceptionerror")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LabelexceptionerrorReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PMInspectionReading")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PMInspectionReadingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("RentalEquipmentUtilizationParameternotworking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\RentalEquipmentUtilizationParameternotworkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("QuantumFinancialExportIsShowingaPSTvalueForInvoices")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\QuantumFinancialExportIsShowingaPSTvalueForInvoicesReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TheGLAccountHistoryexportcaps")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TheGLAccountHistoryexportcapsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("DeleteBackordersUNITED")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\DeleteBackordersUNITEDReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ShowTechnicianParameternotworking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ShowTechnicianParameternotworkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("DispatchGLMappingExceptionError")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\DispatchGLMappingExceptionErrorReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ConvertNonDedicatedreportstofullXLSXformat")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ConvertNonDedicatedreportstofullXLSXformatReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("GLAccountHistoryScreentoincludeBillingLocation")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\GLAccountHistoryScreentoincludeBillingLocationReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("BackOrderLoadingTime")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\BackOrderLoadingTimeReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflowReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitReadingreportisntfilteringbycustomer")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitReadingreportisntfilteringbycustomerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddtheoptiontoexcludedefectlabourlinesontheFleet")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddtheoptiontoexcludedefectlabourlinesontheFleetReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("WorkinProgressReportLocationParameterGIST")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\WorkinProgressReportLocationParameterGISTReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PartUsageExportInvestigationWALLER")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PartUsageExportInvestigationWALLERReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEAReports\\" + theDir.getName();
            }



        System.out.println("Before Report Process");
                System.out.println("This is CMD : " + cmd);
                Process process = Runtime.getRuntime().exec(cmd);
                Thread.sleep(5000);
                System.out.println("Generating Report");
                process.waitFor(60, TimeUnit.SECONDS);
                System.out.println("After Report Process");
                Thread.sleep(5000);
                System.out.println("End Time: " + WaitActions.getWaits().getDateTime());
                emptyResults();

            }

    /** new method Akash */
    public  String  getMyClassName() {

        return this.getClass().getSimpleName();  //To get  Current className
    }


           @AfterMethod(alwaysRun = true)
           public void afterMethodTakeScreenShot(ITestResult result) {
           TestListener.saveScreenshotPNG(driver);

           }


 /*   public static class Log {
        //Initialize Log4j instance
        private static Logger Log = Logger.getLogger(TestDriverActions.Log.class.getName());

        //Info Level Logs
        public static void info(String message) {
            Log.info(message);
        }

        //Error Level Logs
        public static void error(String message) {
            Log.error(message);
        }
    }     */



        /*   @AfterTest(alwaysRun = true)
            public void tearDown () {
                   driver.quit();
            }  */
        }
