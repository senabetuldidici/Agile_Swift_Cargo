package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import pages.AliPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AliStepdefinitons {

    AliPage aliPage = new AliPage();

    @Given("kullanici {string} adresine gider")
    public void goToUrl(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @Given("Contact başlığına tıklar,")
    public void contactClick() {
        aliPage.Contact.click();
    }

    @And("Name, Email, Subject, Message kutusunun görünür oldugunu test eder")
    public void textboxVisible() {
        Assertions.assertTrue(aliPage.NameTextbox.isDisplayed());
        Assertions.assertTrue(aliPage.EmailTextbox.isDisplayed());
        Assertions.assertTrue(aliPage.SubjectTextbox.isDisplayed());
        Assertions.assertTrue(aliPage.MessageTextbox.isDisplayed());
    }

    @And("Name kutusuna {string} verisinin girilebilirliğini test eder")
    public void nameTextboxEntry(String string) {
        aliPage.NameTextboxbox.sendKeys(ConfigReader.getProperty(string));
    }

    @And("Email kutusuna {string} verisinin girilebilirliğini test eder")
    public void emailTextboxEntry(String string) {
        aliPage.EmailTextbox.sendKeys(ConfigReader.getProperty(string));
    }

    @And("Subject kutusuna {string} verisinin girilebilirliğini test eder")
    public void subjectTextboxEntry(String string) {
        aliPage.SubjectTextbox.sendKeys(ConfigReader.getProperty(string));
    }

    @And("Message kutusuna {string} verisinin girilebilirliğini test eder")
    public void mesaageTextboxEntry(String string) {
        aliPage.MessageTextbox.sendKeys(ConfigReader.getProperty(string));
    }

    @And("Submit butonuna tıklar")
    public void submitClick() {
        aliPage.SubmitButton.click();
    }

    @And("Email, Phone, Address bilgilerinin görünür oldugunu test eder")
    public void textVisible() {
        Assertions.assertTrue(aliPage.EmailText.isDisplayed());
        Assertions.assertTrue(aliPage.PhoneText.isDisplayed());
        Assertions.assertTrue(aliPage.AddressText.isDisplayed());
    }

}