package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YildirayPage {

    public YildirayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Why Agile Swift Cargo']")
    public WebElement NedenSwiftCargo;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Timely Delivery']")
    public WebElement TimelyDeliveryText;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Limitless Pickup']")
    public WebElement LimitlessPickupText;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Cash on delivery (COD)']")
    public WebElement CashonDeliveryText;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Get Payment Any Time']")
    public WebElement GetPaymentAnyTime;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Secure Handling']")
    public WebElement SecureHandling;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold' and text()='Live Tracking Update']")
    public WebElement LiveTrackingUpdate;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812201407.png']")
    public WebElement TimelyDeliverpic;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812201520.png']")
    public WebElement LimitlessPickpic;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812201721.png']")
    public WebElement CODpic;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812201810.png']")
    public WebElement GPATpic;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812201917.png']")
    public WebElement SecureHandlingpic;

    @FindBy(xpath = "//img[@src='https://qa.agileswiftcargo.com/public/uploads/whycourier/20230812202018.png']")
    public WebElement LTUpic;


}


