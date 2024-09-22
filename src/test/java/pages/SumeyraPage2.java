package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SumeyraPage2 {

    public SumeyraPage2(){
        PageFactory.initElements(Driver.getDriver(),this);}


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

    @FindBy(xpath = "//*[@class='footer-link']")
    public WebElement SingUphere;

    @FindBy(id ="business_name")
    public WebElement businessnameKutusu;

    @FindBy(id ="full_name")
    public WebElement fullNameKutusu;

    @FindBy(id ="mobile")
    public WebElement mobileText;

    @FindBy(id ="password")
    public WebElement passwordKutusu;

    @FindBy(id ="address")
    public WebElement addressKutusu;

    @FindBy(id ="merchant_registration_checkbox")
    public WebElement registrationCheckbox;

    @FindBy(id ="merchant_registration_submit")
    public WebElement registerButton;


    @FindBy(xpath = "//*[text()='Forgot Password']")
    public WebElement ForgotPasswordLink;


    @FindBy(xpath = "//*[@class='form-control form-control-lg ']")
    public WebElement EmailAdressKutusu;


    @FindBy(xpath = "//*[@class='btn btn-block btn-primary btn-xl']")
    public WebElement PasswordResetLinkButonu;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement basarılıResetLinkyazısı;


// Merchant Dashboard locates
    @FindBy(xpath = "//*[@class=\"nav-link \"][1]")
    public WebElement dashboardBaslıgı ;

    @FindBy(xpath = "/html/body/div/div[4]/ul/li[3]/a")
    public WebElement ticketBaslıgı ;


    @FindBy (xpath = "//*[@aria-controls='accounts']")
    public WebElement accountsBasligi;

    @FindBy (xpath = "/html/body/div/div[4]/ul/li[5]/a")
    public WebElement parcelsBasligi;


    @FindBy (xpath = "//*[@aria-controls=\"settings\"]")
    public WebElement settingsBaslıgı;


    @FindBy (xpath = "//*[@placeholder=\"Enter date\"]")
    public WebElement enterDateText;

    @FindBy (xpath = "//*[@id='date']")
    public WebElement enterDateTextBox;


    @FindBy (xpath = "//*[@class=\"btn btn-sm btn-primary group-btn\"]")
    public WebElement filterButonu;


    @FindBy(xpath = "//*[text()='Opps ! Something went wrong.']")
    public WebElement OppsText;

    @FindBy(xpath = "//*[text()='All Reports']")
    public static WebElement allReports;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/p\n")
    public static WebElement allReportsText;

    //Social ikonlar

    @FindBy(xpath = "//*[@class='icon  fab fa-linkedin']")
    public WebElement Linkedinikonu;

    @FindBy(xpath = "//*[@class='icon  fab fa-facebook-square']")
    public WebElement Facebookikonu;

    @FindBy(xpath = "//*[@class='icon  fab fa-instagram']")
    public WebElement Instagramikonu;

    @FindBy(xpath = "//*[@class='icon  fab fa-youtube']")
    public WebElement Youtubeikonu;

    @FindBy(xpath = "//*[@class='icon  fab fa-youtube']")
    public WebElement Skypeikonu;


    //Our Services

    @FindBy(xpath = "//*[text()='Our Services']")
    public WebElement ourServicesBaslıgı;

    public void serviceHeadersVisibilty(String text) {

        WebDriver driver =  Driver.getDriver();

        Assertions.assertTrue(driver.findElement(By.xpath("(//*[text()='" + text + "'])[1]")).isDisplayed());
    }

    @FindBy(xpath = "//*[@class='text-primary']")
    private List<WebElement> navigationArrows;


    public void navigationArrowsVisibility() {

        for (int i = 0; i < navigationArrows.size(); i++) {
            Assertions.assertTrue(navigationArrows.get(i).isDisplayed());
        }

    }




    // Senaryo


    @FindBy(xpath = "(//*[@class=\"fa fa-plus\"])[3]")
    public WebElement artıButonu;

    @FindBy(xpath = "//*[@id=\"basicform\"]/div[3]/div/button")
    public WebElement saveButonu;

    @FindBy(xpath = "(//*[@tabindex=\"-1\"])[3]")
    public WebElement actionButonu;


    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div/a[2]/i")
    public WebElement editButonu;


    @FindBy(xpath = "//*[@class=\"btn btn-space btn-primary\"]")
    public WebElement saveChangeButonu;



}
