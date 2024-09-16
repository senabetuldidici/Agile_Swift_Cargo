package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.UlviPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UlviStepdefinitions {
    UlviPage ulviPage = new UlviPage();
    Actions actions = new Actions(Driver.getDriver());


    @And("Our Partners  başlıgının görünür oldugunu test eder")
    public void ourPartnersBaşlıgınınGörünürOldugunuTestEder() {
        actions.moveToElement(ulviPage.BlogsText).perform();
        ulviPage.OurPartnersText.isDisplayed();
    }

    @When("Our Partners bolumdeki logoların tiklanabilir oldugunu test eder")
    public void ourPartnersBolumdekiLogolarınTiklanabilirOldugunuTestEder() {
        ulviPage.ShopifyLogo.isEnabled();
    }

    @When("login butonuna basar")
    public void loginButonunaBasar() {
        ulviPage.MenuLoginButton.click();
    }

    @And("email olarak {string} girer")
    public void emailOlarakGirer(String merchantEmail) {
        ulviPage.loginEmail.sendKeys(ConfigReader.getProperty(merchantEmail));
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String merchantPassword) {
        ulviPage.loginPassword.sendKeys(ConfigReader.getProperty(merchantPassword));
    }

    @And("signIn butonuna basar")
    public void signinButonunaBasar() {
        ulviPage.SignIn.click();
    }

    @When("menuden account butonuna tiklar")
    public void menudenAccountButonunaTiklar() {
        ulviPage.merchantAccountButton.click();
    }

    @Then("invoice linkinin gorunurlugunu dogrular")
    public void invoiceLinkininGorunurlugunuDogrular() {
        ulviPage.invoiceButtonOnMerchantProfile.isDisplayed();
    }

    @When("acilir menuden invoice linkine tiklar")
    public void acilirMenudenInvoiceLinkineTiklar() {
        ulviPage.invoiceButtonOnMerchantProfile.click();
    }

    @Then("Invoice List sayfasina gidebildigini dogrular")
    public void invoiceListSayfasinaGidebildiginiDogrular() {
        ulviPage.InvoiceListText.isDisplayed();
    }
}
