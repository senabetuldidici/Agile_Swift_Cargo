package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AliPage {

    public AliPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='nav-item'])[7]")
    public WebElement Contact;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement NameTextbox;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement EmailTextbox;

    @FindBy(xpath = "//*[@name='subject']")
    public WebElement SubjectTextbox;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement MessageTextbox;

    @FindBy(xpath = "//*[@id='exampleFormControlInput1']")
    public WebElement NameTextboxbox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//*[@class='fa fa-envelope me-2 ']")
    public WebElement EmailText;

    @FindBy(xpath = "//*[@class='fa fa-phone me-2 ']")
    public WebElement PhoneText;

    @FindBy(xpath = "//*[@class='fa fa-location-dot me-2']")
    public WebElement AddressText;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/faq-list']")
    public WebElement FaqLink;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/about-us']")
    public WebElement AboutLink;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/contact-send']")
    public WebElement ContactLink;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/privacy-and-policy']")
    public WebElement PolicyLink;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/terms-of-condition']")
    public WebElement TermLink;

    @FindBy (xpath = "//*[@aria-controls='accounts']")
    public WebElement AccountsTitle;

    @FindBy(xpath = "//*[text()='Payment Received List']")
    public WebElement PaymentReceivedText;

    @FindBy(xpath = "//*[text()='Total Parcel']")
    public WebElement TotalParcel;

    @FindBy(xpath = "//*[text()='Total User ']")
    public WebElement TotalUser ;

    @FindBy(xpath = "//*[text()='Total Merchant']")
    public WebElement TotalMerchant;

    @FindBy(xpath = "//*[text()='Total Delivery Man']")
    public WebElement TotalDeliveryMan;

    @FindBy(xpath = "//*[text()='Total Branch']")
    public WebElement TotalBranch;

    @FindBy(xpath = "//*[text()='Total Accounts']")
    public WebElement TotalAccounts;

    @FindBy(xpath = "//*[text()='Total Partial Delivered ']")
    public WebElement TotalPartialDelivered;

    @FindBy(xpath = "//*[text()='Total parcels deliverd']")
    public WebElement TotalParcelsDeliverd;

    @FindBy(xpath = "//*[text()=' Delivery Man  Statements']")
    public WebElement DeliveryManStatements;

    @FindBy(xpath = "//*[text()=' Merchant  Statements ']")
    public WebElement  MerchantStatements;

    @FindBy(xpath = "//*[text()='Branch  Statements']")
    public WebElement BranchStatements;

    @FindBy(xpath = "//*[@id='apexincomeexpense']")
    public WebElement  IncomeExpense;

    @FindBy(xpath = "//*[@id='datetimepicker12']")
    public WebElement  DateTimePicker;

    @FindBy (xpath = "//*[@id='name']")
    public WebElement HubNameTextBox;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary']")
    public WebElement FilterButton;

    @FindBy(xpath = "//*[@class='btn btn-space btn-secondary']")
    public WebElement ClearButton;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm float-right']")
    public WebElement PlusButton;

    @FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle dropdown-toggle-split']")
    public WebElement ActionButton;

    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement BranchManageTitle;
}

