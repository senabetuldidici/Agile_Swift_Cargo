package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UlviPage {
    public UlviPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Our Partners']")
    public WebElement OurPartnersText;

    @FindBy(xpath = "(//*[@class='d-inline-block'])[7]")
    public WebElement ShopifyLogo;

    @FindBy(xpath = "//*[@id='swiper-wrapper-e2823fe717e6fdab']")
    public WebElement LogoContainer;

    @FindBy (xpath = "(//*[text()='Blogs'])[2]")
    public WebElement BlogsText;

    //Menu Login Button
    @FindBy(xpath = "//*[@class='nav-link auth-btn']")
    public WebElement MenuLoginButton;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement loginEmail;

    @FindBy (xpath="//*[@id='password']")
    public WebElement  loginPassword;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement SignIn;

    @FindBy(xpath = "(//*[text()=' Accounts'])[2]")
    public WebElement merchantAccountButton;

    @FindBy(xpath = "(//*[text()='Invoice'])[3]")
    public WebElement invoiceButtonOnMerchantProfile;

    @FindBy(xpath = "//*[text()='  Invoice List ']")
    public WebElement InvoiceListText;

    //--- US_027 TC
    @FindBy(xpath = "//*[@class='dropdown-toggle nav-link auth-btn show']")
    public WebElement MerchantFirstNameLastAfterLogin;

    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement dropDownHomeIcon;
    @FindBy(xpath = "(//*[text()='Reports'])[2]")
    public WebElement ReportsButtonOnMerchant;

    @FindBy(xpath = "(//*[text()='Parcel Status Reports'])[2]")
    public WebElement parcelStatusReportsButtonOnMerchant;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement parcelStatusReportsDateInput;

    @FindBy(xpath = "//*[text()='Last 7 Days']")
    public WebElement dateLast7Days;

    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement getParcelStatusReportsStatusInput;
    @FindBy(xpath = "(//*[text()='Pending'])[2]")
    public WebElement statusPending;

    @FindBy(xpath = "//*[text()=' Filter']")
    public WebElement ReportsFilterButton;

    @FindBy(xpath = "//*[text()='Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//*[text()='Print']")
    public WebElement printtButton;

    @FindBy(xpath = "//h3[text()='Parcel Status Reports']")
    public WebElement AfterFilterValidationText;


}
