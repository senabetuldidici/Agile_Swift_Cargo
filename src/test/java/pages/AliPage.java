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


}

