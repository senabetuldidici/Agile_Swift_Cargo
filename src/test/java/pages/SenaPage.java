package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SenaPage {

     public SenaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='container flgit bex-lg-row flex-nowrap align-items-center']")
    public WebElement ustBar;

    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement Home;

    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement Pricing;

    @FindBy(xpath = "(//*[@class='nav-item'])[3]")
    public WebElement Tracking;

    @FindBy(xpath = "(//*[@class='nav-item'])[4]")
    public WebElement Blogs;

    @FindBy(xpath = "(//*[@class='nav-item'])[5]")
    public WebElement About;

    @FindBy(xpath = "(//*[@class='nav-item'])[6]")
    public WebElement FAQ;

    @FindBy(xpath = "(//*[@class='nav-item'])[7]")
    public WebElement Contact;

    @FindBy (xpath = "(//*[@class='card-body'])[1]")
    public WebElement ilkBlogYazisiBasligi;

    @FindBy (xpath = "(//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  '])[1]")
    public WebElement yonlendirilenBlogSayfasiBlogYazisiBasligi;

    @FindBy (xpath = "(//*[@class='text-body-secondary me-2'])[1]")
    public WebElement blogYazisiIlkGorunurlukSayisi;

    @FindBy (xpath = "//*[@class='text-body-secondary me-2']")
    public WebElement blogYazisiGuncelGorunurlukSayisi;

    @FindBy (xpath = "(//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  '])[2]")
    public WebElement latestBlogsBasligi;

    @FindBy (xpath = "(//*[@class=\"card-title mt-2\"])[2]")
    public WebElement latestBlogsYazisiBasligi;

    @FindBy (xpath = "(//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  '])[1]")
    public WebElement acilanLatestBlogsYazisiBasligi;

    @FindBy (xpath = "(//*[@class='img-fluid rounded-start'])[2]")
    public WebElement latestBlogsYazisi;

    @FindBy (xpath = "//*[@class='nav-link auth-btn']")
    public WebElement loginButonu;

    @FindBy (xpath = "(//*[@class='form-control form-control-lg '])[1]")
    public WebElement emailKutusu;

    @FindBy (xpath = "(//*[@class='form-control form-control-lg '])[2]")
    public WebElement sifreKutusu;

    @FindBy (xpath = "//*[@class='btn btn-primary btn-lg btn-block']")
    public WebElement signInButonu;

    @FindBy (xpath = "//*[@class='h3 d-inline']")
    public WebElement marchantDashboardAnasayfaBasligi;

    @FindBy (xpath = "//*[@aria-controls='accounts']")
    public WebElement accountsBasligi;

    @FindBy (xpath = "(//a[@href='https://qa.agileswiftcargo.com/merchant/online-payment'])[2]")
    public WebElement payoutButonu;

    @FindBy (xpath = "(//*[@class='h3'])[2]")
    public WebElement payoutListBasligi;

    @FindBy (xpath = "//*[@alt='stripe.png']")
    public WebElement stripeButonu;

    @FindBy (xpath = "//*[@for='accountId']")
    public WebElement toAccountBasligi;

    @FindBy(xpath = "//*[@id='accountId']")
    public WebElement toAccountSecenekBox;

    @FindBy(xpath = "//option[@value='201']")
    public WebElement toAccountIlkSecenek;

    @FindBy (xpath = "(//label)[13]")
    public WebElement amountBasligi;

    @FindBy (xpath = "//*[@id='stripe_amount']")
    public WebElement amountTextBox;

    @FindBy (xpath = "//*[@class = 'btn btn-primary btn-block']")
    public WebElement payNowButonu;

    @FindBy (xpath = "//h2[text()='Merchant Payment']")
    public WebElement merchantPaymentEkrani;
    //h2[text()='Merchant Payment']

}

