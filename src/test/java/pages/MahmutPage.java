package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MahmutPage {

    public MahmutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/login']")
    public WebElement loginLinki;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordTextbox;


    @FindBy (xpath = "//*[@type='submit']")
    public WebElement SıgnInbutonu;

    @FindBy(xpath = "(//*[@src='https://qa.agileswiftcargo.com/public/uploads/users/20240911104400.png'])[3]")
    public WebElement profileButonu;

    @FindBy(xpath = "(//*[@href='https://qa.agileswiftcargo.com/admin/profile/change-password/927'])[1]")
    public WebElement changePasswordButonu;

    @FindBy(xpath = "//*[@id='old_password']")
    public WebElement oldPasswordTextbox;

    @FindBy(xpath = "//*[@id='new_password']")
    public WebElement newPasswordButonu;

    @FindBy (xpath = "//*[@id='confirm_password']")
    public WebElement confırmPasswordButonu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveChangeButonu;

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement passwordSuccessfullyUpdatedYazisi;



}
