package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AliPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

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

    @And("Faq, About Us, Contact us, Privacy & Policy.Term of Use baglantilarinin gorunurlugunu test eder")
    public void linkVisible() {
        Assertions.assertTrue(aliPage.FaqLink.isDisplayed());
        Assertions.assertTrue(aliPage.AboutLink.isDisplayed());
        Assertions.assertTrue(aliPage.ContactLink.isDisplayed());
        Assertions.assertTrue(aliPage.PolicyLink.isDisplayed());
        Assertions.assertTrue(aliPage.TermLink.isDisplayed());
    }


    @And("Faq, About Us, Contact us, Privacy & Policy.Term of Use baglantilarinin tiklanabilirligini test eder")
    public void linkEnabled() {
        Assertions.assertTrue(aliPage.FaqLink.isEnabled());
        Assertions.assertTrue(aliPage.AboutLink.isEnabled());
        Assertions.assertTrue(aliPage.ContactLink.isEnabled());
        Assertions.assertTrue(aliPage.PolicyLink.isEnabled());
        Assertions.assertTrue(aliPage.TermLink.isEnabled());
    }

    @When("Faq menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void faqLinkClick() {
        WebElement faqLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/faq-list']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", faqLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/faq-list";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @When("About Us menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void aboutLinkClick() {
        WebElement aboutLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/about-us']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", aboutLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/about-us";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @When("Contact us menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void contactLinkClick() {
        WebElement contactLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/contact-send']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", contactLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/contact-send";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @When("Privacy & Policy menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void policyLinkClick() {
        WebElement policyLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/privacy-and-policy']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", policyLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/privacy-and-policy";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @When("Term of Use menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void termLinkClick() {
        WebElement termLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/terms-of-condition']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", termLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/terms-of-condition";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Then("Accounts basligi altinda yer alan Payment Received baglantisinin gorunur ve tiklanabilir oldugunu test eder")
    public void paymentReceivedEnable() {
        WebElement termLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/merchant/payment/received']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", termLink);
    }

    @Then("Accounts basligi altinda yer alan Payment Received baglantisina gider")
    public void paymentReceivedClick() {
        aliPage.AccountsTitle.click();
        WebElement termLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/merchant/payment/received']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", termLink);
    }

    @When("Payment Received basligina tiklar ve yonlendirilen sitenin Url'sinin dogrulugunu test eder")
    public void paymentReceivedUrlAssert() {
        WebElement termLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/merchant/payment/received']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", termLink);
        String expectedUrl = "https://qa.agileswiftcargo.com/merchant/payment/received";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Then("Payment Received listesinin gorunebilirliğini dogrular")
    public void PaymentReceivedListEnable() {
        aliPage.PaymentReceivedText.isDisplayed();
    }

    @Then("Dashbord' daki bilgilendirme başlıklarının görüntülendiğini doğrular")
    public void DashboardTitlesVisible() {
        aliPage.TotalParcel.isDisplayed();
        aliPage.TotalUser.isDisplayed();
        aliPage.TotalMerchant.isDisplayed();
        aliPage.TotalDeliveryMan.isDisplayed();
        aliPage.TotalBranch.isDisplayed();
        aliPage.TotalAccounts.isDisplayed();
        aliPage.TotalPartialDelivered.isDisplayed();
        aliPage.TotalParcelsDeliverd.isDisplayed();
        aliPage.DeliveryManStatements.isDisplayed();
        aliPage.MerchantStatements.isDisplayed();
        aliPage.BranchStatements.isDisplayed();
    }

    @Then("IncomeExpense' alanıdaki grafiğin görünürlugunu test eder")
    public void DashboardChartVisible() {
        aliPage.IncomeExpense.isDisplayed();
    }

    @Then("Takvimin görünürlugunu test eder")
    public void DateTimePickerVisible() {
        aliPage.DateTimePicker.isDisplayed();
    }

    @When("Branch Manage sayfasına gider")
    public void BranchManagePage() {
        aliPage.BranchManageTitle.click();
        WebElement termLink = driver.findElement(By.xpath("//*[@href='https://qa.agileswiftcargo.com/admin/hubs']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", termLink);
    }

    @When("Filter butonunun çalıştığını test eder")
    public void FilterButtonTest() {
        aliPage.HubNameTextBox.sendKeys(ConfigReader.getProperty("yeni"));
        aliPage.FilterButton.click();
    }

    @When("Clear butonunun çalıştığını test eder")
    public void ClearButtonTest() {
        aliPage.HubNameTextBox.sendKeys(ConfigReader.getProperty("yeni"));
        aliPage.FilterButton.click();
        aliPage.ClearButton.click();
    }

    @When("Plus butonunun çalıştığını test eder")
    public void PlusButtonTest() {
        aliPage.PlusButton.click();
    }

    @When("Action butonunun çalıştığını test eder")
    public void ActionButtonTest() {
        aliPage.ActionButton.click();
    }

}