package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.Nuranpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NuranStepdefinations {
    Nuranpage nuranpage=new Nuranpage();
    String TrackingID="";

    @Given("kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

    }
    @Given("{int} saniye bekleme")
    public void saniye_bekleme(Integer int1) {

    }
    @Given("login butonuna  basar")
    public void login_butonuna_basar() {nuranpage.loginButonu.click();

    }
    @Given("email kutusunun görünür oldugunu test eder")
    public void email_kutusunun_görünür_oldugunu_test_eder() {nuranpage.emailKutusu.isDisplayed();

    }
    @Given("email olarak  {string} girer")
    public void email_olarak_girer(String MerchantEmail) {
        nuranpage.emailKutusu.sendKeys(ConfigReader.getProperty("MerchantEmail"));

    }
    @When("password kutusunun görünür oldugunu test eder")
    public void password_kutusunun_görünür_oldugunu_test_eder() {
        Assertions.assertTrue(nuranpage.sifreKutusu.isDisplayed());

    }
    @When("password olarak  {string} girer")
    public void password_olarak_girer(String tMSF) {
        nuranpage.sifreKutusu.sendKeys(ConfigReader.getProperty("tMSF"));



    }
    @When("Sing in butonuna tıklar")
    public void sing_in_butonuna_tıklar() {
        nuranpage.signInButonu.click();

    }
    @Then("basarılı bir giris yapabildiğini test eder")
    public void basarılı_bir_giris_yapabildiğini_test_eder() {
        Assertions.assertTrue(nuranpage.marchantDashboard.isDisplayed());

    }



    @And("parsel butonuna tiklar")
    public void parselButonunaTiklar() {
        nuranpage.parselButonu.click();

    }

    @And("ilk sirada ki TrackingID numarasini kopyalar")
    public void ilkSiradaKiTrackingIDNumarasiniKopyalar() {
        TrackingID=nuranpage.parselId.getText();
    }

    @Then("Anasayfa Logosuna tiklar")
    public void anasayfaLogosunaTiklar() {
        nuranpage.AnasayfaLogosu.click();
    }

    @And("Enter tracking id tiklar")
    public void enterTrackingIdTiklar() {
        nuranpage.TrackingId.click();
    }

    @Then("kopyalana tracking id yapistirilir.")
    public void kopyalanaTrackingIdYapistirilir() {
        nuranpage.TrackingId.sendKeys(TrackingID);
    }

    @And("Track Now butonuna tiklanir")
    public void trackNowButonunaTiklanir() {
        nuranpage.TrackNowButonu.click();
    }

    @And("Tracking Id ile Parcel Tracking No ayni oldugu dogrulanir.")
    public void trackingIdIleParcelTrackingNoAyniOlduguDogrulanir() {
        String expectedTrackingNo=TrackingID;
        String actualTrackingNo=nuranpage.ParcelTrackingNo.getText();
        String actualTrackingNor=actualTrackingNo.replace("#", "").trim();
        Assertions.assertEquals(expectedTrackingNo,actualTrackingNor);



    }
}
