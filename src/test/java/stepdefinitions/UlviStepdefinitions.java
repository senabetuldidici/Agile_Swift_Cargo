package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.UlviPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

    @When("acilan sayfadaki menuden reports butonuna tiklar")
    public void acilanSayfadakiMenudenReportsButonunaTiklar() {
        ulviPage.ReportsButtonOnMerchant.click();
    }

    @And("acilir menuden parcel status reports linkine tiklar")
    public void acilirMenudenParcelStatusReportsLinkineTiklar() {
        ulviPage.parcelStatusReportsButtonOnMerchant.click();
    }

    @And("date bolumunden  Last {int} Days klikler")
    public void dateBolumundenLastDaysKlikler(int arg0) {
        ulviPage.dateLast7Days.click();
    }

    @And("Status bolumunden Pending klikler")
    public void statusBolumundenPendingKlikler() {
        ulviPage.statusPending.click();
    }

    @And("Filter butonuna klikler")
    public void filterButonunaKlikler() {
        ulviPage.ReportsFilterButton.click();
    }

    @Then("Export butonunun görünürlüğünü doğrular")
    public void exportButonununGörünürlüğünüDoğrular() {
        ulviPage.exportButton.isDisplayed();
    }

    @And("Print butonunun görünürlüğünü doğrular")
    public void printButonununGörünürlüğünüDoğrular() {
        ulviPage.printtButton.isDisplayed();
    }

    @And("Date inputuna kilkler")
    public void dateInputunaKilkler() {
        ulviPage.parcelStatusReportsDateInput.click();
    }

    @And("Status inputuna klikler")
    public void statusInputunaKlikler() {
        ulviPage.getParcelStatusReportsStatusInput.click();
    }

    @And("Parcel Status Reports linkinin görünürlüğünü doğrular")
    public void parcelStatusReportsLinkininGörünürlüğünüDoğrular() {
        ulviPage.parcelStatusReportsButtonOnMerchant.isDisplayed();
    }

    @And("Parcel Status Reports linkinin tiklanabilirliyini doğrular")
    public void parcelStatusReportsLinkininTiklanabilirliyiniDoğrular() {
        ulviPage.parcelStatusReportsButtonOnMerchant.isEnabled();
    }

    @And("Parcel Status Reports linkine tiklayinca ilgili sayfaya gidebildigini onaylar")
    public void parcelStatusReportsLinkineTiklayincaIlgiliSayfayaGidebildiginiOnaylar() {
        actions.click(ulviPage.parcelStatusReportsButtonOnMerchant).perform();
        ReusableMethods.bekle(1);
        ulviPage.ReportsFilterButton.isDisplayed();
    }

    @And("Date bolumunun gorunur oldugunu onaylar")
    public void dateBolumununGorunurOldugunuOnaylar() {
        ulviPage.parcelStatusReportsDateInput.isDisplayed();
    }

    @And("Status bolumunun gorunur oldugunu onaylar")
    public void statusBolumununGorunurOldugunuOnaylar() {
        ulviPage.getParcelStatusReportsStatusInput.isDisplayed();
    }

    @Then("Filtre butonunun işlevselliğini doğrular")
    public void filtreButonununIşlevselliğiniDoğrular() {
        ulviPage.AfterFilterValidationText.isDisplayed();
    }

    @When("Report butonuna klikler")
    public void reportButonunaKlikler() {
        ulviPage.ReportsButtonOnMerchant.click();
    }

    @Then("Parcel Status Reports linkine klikler")
    public void parcelStatusReportsLinkineKlikler() {
        ulviPage.parcelStatusReportsButtonOnMerchant.click();
    }
}
