package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.YildirayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YildirayStepdefinitions {

    YildirayPage yildirayPage = new YildirayPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("kullanici {string} sitesine erisim saglar")
    public void kullaniciSitesineErisimSaglar() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }


    @When("neden Çevik Hızlı Kargo' bölümüne gider")
    public void neden_çevik_hızlı_kargo_bölümüne_gider() {
        actions.moveToElement(yildirayPage.NedenSwiftCargo).perform();
        yildirayPage.NedenSwiftCargo.isDisplayed();


    }

    @Then("zamanında Teslimat' başlığının görünür olup olmadığını kontrol eder")
    public void zamanında_teslimat_başlığının_görünür_olup_olmadığını_kontrol_eder() {
        yildirayPage.TimelyDeliveryText.isDisplayed();


    }

    @Then("sınırsız Alım' başlığının görünür olup olmadığını kontrol eder")
    public void sınırsız_alım_başlığının_görünür_olup_olmadığını_kontrol_eder() {
        yildirayPage.LimitlessPickupText.isDisplayed();

    }

    @When("Teslimatta ödeme \\(COD)' başlığının görünüp görünmediğini kontrol eder")
    public void teslimatta_ödeme_cod_başlığının_görünüp_görünmediğini_kontrol_eder() {
        yildirayPage.CashonDeliveryText.isDisplayed();


    }

    @When("İstediğiniz Zaman Ödeme Alın' başlığının görünür olup olmadığını kontrol eder")
    public void i̇stediğiniz_zaman_ödeme_alın_başlığının_görünür_olup_olmadığını_kontrol_eder() {
        yildirayPage.GetPaymentAnyTime.isDisplayed();

    }

    @Then("Güvenli İşleme' başlığının görünür olup olmadığını kontrol eder")
    public void güvenli_i̇şleme_başlığının_görünür_olup_olmadığını_kontrol_eder() {
        yildirayPage.SecureHandling.isDisplayed();
    }

    @And("Canlı Takip Güncellemesi' başlığının görünür olup olmadığını kontrol eder")
    public void canlıTakipGüncellemesiBaşlığınınGörünürOlupOlmadığınıKontrolEder() {
        yildirayPage.LiveTrackingUpdate.isDisplayed();



    }

    @Then("zamanında Teslimat resminin görünür olup olmadığını kontrol eder")
    public void zamanındaTeslimatResmininGörünürOlupOlmadığınıKontrolEder() {
        yildirayPage.TimelyDeliverpic.isEnabled();

    }

    @And("sınırsız Toplama başlığıyla ilişkili görselin görünür olduğunu kontrol eder")
    public void sınırsızToplamaBaşlığıylaIlişkiliGörselinGörünürOlduğunuKontrolEder() {
        yildirayPage.LimitlessPickpic.isEnabled();

    }

    @When("teslimatta ödeme \\(COD) başlığıyla ilişkili görselin görünür olduğunu kontrol eder")
    public void teslimattaÖdemeCODBaşlığıylaIlişkiliGörselinGörünürOlduğunuKontrolEder() {
        yildirayPage.CODpic.isEnabled();


    }

    @And("istediğiniz Zaman Ödeme Alın' başlığıyla ilişkili görselin görünür olduğunu kontrol eder")
    public void istediğinizZamanÖdemeAlınBaşlığıylaIlişkiliGörselinGörünürOlduğunuKontrolEder() {
        yildirayPage.GPATpic.isEnabled();
    }

    @Then("güvenli İşleme' başlığıyla ilişkili görselin görünür olduğunu kontrol eder")
    public void güvenliİşlemeBaşlığıylaIlişkiliGörselinGörünürOlduğunuKontrolEder() {
        yildirayPage.SecureHandlingpic.isEnabled();
    }

    @And("canlı İzleme Güncelleme başlığıyla ilişkili görselin görünür olduğunu kontrol eder")
    public void canlıİzlemeGüncellemeBaşlığıylaIlişkiliGörselinGörünürOlduğunuKontrolEder() {
        yildirayPage.LTUpic.isEnabled();
    }


    }




