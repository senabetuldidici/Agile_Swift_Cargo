package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CimenPage {

    public CimenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[@class='banner-hilight display-1 text-uppercase ']")
    public WebElement hometextLine;

    @FindBy(xpath = "//*[@class='nav-link auth-btn']")
    public WebElement login;


    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;


    public void loginMethodu(String email,String password){
        emailBox.sendKeys(ConfigReader.getProperty("email"));
        passwordBox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.scrollWithUiScrollableAndClick("Sign in");

    }


    @FindBy(xpath = "//*[@id='navbarDropdownMenuLink2'][1]")
    public WebElement profileImage;


    @FindBy(xpath = "//*[text()='Profile'][1]")
    public WebElement profileText;

    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement profileHeader;

    @FindBy(xpath = "//*[text()='Change password'][1]")
    public WebElement changeInfo;


    @FindBy(xpath = "//*[text()='Payment Information'][2]")
    public WebElement paymentInfo;

    @FindBy(xpath = " //h2[@class='pageheader-title']")
    public WebElement changePasswordLabel;

    @FindBy(xpath = " //*[@class='fas fa-power-off mr-2'][1]")
    public WebElement logoutLabel;

    @FindBy(xpath = "  //div[@class='col-xl-8 col-lg-8 col-md-8']// div[@class='list-group']")
    public WebElement profileTable;

    @FindBy(xpath = "//*[text()=' Edit']")
    public WebElement Editbutton;


    @FindBy(xpath = " //*[@class='card-body']")
    public WebElement profileForm;


    @FindBy(xpath = "//div[@class='form-group'] //*[@name='name']")
    public WebElement nameBox;


//    @FindBy(xpath = " //*[@id='email']")
//    public WebElement emailTextBox;

//    @FindBy(xpath = " //*[@id='mobile']")
//    public WebElement mobileBox;


    @FindBy(xpath = " //*[@id='business_name']")
    public WebElement businessNameBox;

    @FindBy(xpath = " //*[@id='address']")
    public WebElement addressBox;

    @FindBy(xpath = " //*[@id='image_id']")
    public WebElement imagefoto;

    @FindBy(xpath = "//*[text()='Save Change']")
    public WebElement saveButton;



    public void Clear() {
        nameBox.clear();
        addressBox.clear();
    }


    public void hesabimYeniBilgiDogrulama(String Name,String Address){
        Clear();
        nameBox.sendKeys(ConfigReader.getProperty("name"));
        addressBox.sendKeys(ConfigReader.getProperty("address"));


        ReusableMethods.bekle(2);

//        imagefoto.click();
//
//        imagefoto.sendKeys(yuklenecekDosyaYolu);
//
//        ReusableMethods.bekle(4);

        saveButton.click();

        String actualTumBody = profileTable.getText();

        Assertions.assertTrue(actualTumBody.contains(ConfigReader.getProperty("name")));

        Assertions.assertTrue(actualTumBody.contains(ConfigReader.getProperty("address")));

        ReusableMethods.bekle(2);



    }

    @FindBy(xpath ="//*[@id='settings']")
    public WebElement settingsButton;


    @FindBy(xpath = "//*[text()='Delivery Charges']")
    public WebElement deliverycharges;


    @FindBy(xpath = "/html/body/div/main/div/div[1]/div[2]/div/div/div[1]/div/p")
    public WebElement deliverychargeText;

    @FindBy(xpath = " //*[@class='table-responsive']//th[2]")
    public WebElement weight;



}
