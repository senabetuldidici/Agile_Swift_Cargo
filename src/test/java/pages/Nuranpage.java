package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Nuranpage {
    public Nuranpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement Home;

    @FindBy(xpath = "//*[@class='nav-link auth-btn']")
    public WebElement loginButonu;


    @FindBy (xpath = "(//*[@class='form-control form-control-lg '])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//*[@class='form-control form-control-lg '])[2]")
    public WebElement sifreKutusu;

    @FindBy (xpath = "//*[@class='btn btn-primary btn-lg btn-block']")
    public WebElement signInButonu;

    @FindBy (xpath = "//*[@class='h3 d-inline']")
    public WebElement marchantDashboard;

    @FindBy (xpath = "/html/body/div[1]/div[4]/ul/li[5]/a")
    public WebElement parselButonu;
    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr/td[3]")
    public WebElement parselId;

    @FindBy (xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/div/nav/a")
    public WebElement AnasayfaLogosu;
    @FindBy (xpath = "/html/body/section[2]/div/div/div[1]/form/div/input")
    public WebElement TrackingId;
    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/form/div/div/button")
    public WebElement TrackNowButonu;
    @FindBy(xpath = "/html/body/section[2]/div/div[1]/div/h3/span")
    public WebElement ParcelTrackingNo;
    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[2]/a")
    public WebElement Pricing;

    @FindBy(xpath = "//*[@id=\"pricing\"]/div/div[1]/div/h3/span")
    public WebElement AgileSwiftCargoPricingYazisi;

    @FindBy(xpath = "/html/body/div[1]/div[4]/ul/li[7]/a")
    public WebElement Report;


    @FindBy(xpath = "//*[@id=\"reports\"]/ul/li[2]/a")
    public WebElement TotalSummery;
    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/login']")
    public WebElement AdminloginLinki;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement AdminemailTextBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement AdminpasswordTextbox;


    @FindBy (xpath = "//*[@type='submit']")
    public WebElement AdminSıgnInbutonu;

    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[3]/a")
    public WebElement DeliverMans;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/a")
    public WebElement DeliverMansKisiEkleme;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement DeliverMansForm;

    @FindBy(xpath = "//*[@id=\"input-select\"]")
    public WebElement HugSelect;

    @FindBy(xpath = "//*[@id=\"input-select\"]/option[25]")
    public WebElement HugWashinton;



}
