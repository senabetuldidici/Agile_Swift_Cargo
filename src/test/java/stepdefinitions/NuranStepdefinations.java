package stepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Nuranpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.security.auth.kerberos.KeyTab;

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
    public void email_olarak_girer(String merchantGecerliEmail) {
        nuranpage.emailKutusu.sendKeys(ConfigReader.getProperty("toMerchantGecerliEmail"));

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
    ///bunu sil
    @Then("sayfayı kapatir")
    public void sayfayı_kapatir() {
        Driver.quitDriver();

    }

    ///bunu sil
    @When("{int} saniye bekler")
    public void saniyeBekler(int sn) {
        ReusableMethods.bekle(sn);
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

    @And("pricing tiklanir.")
    public void pricingTiklanir() {
        nuranpage.Pricing.click();
    }

    @Then("Agile Swift Cargo Pricing yazisinin gorunurlugu test edilir")
    public void agileSwiftCargoPricingYazisininGorunurluguTestEdilir() {
        String expectedPricingyazisi=nuranpage.AgileSwiftCargoPricingYazisi.getText();
        String actualPricingyazisi="Agile Swift Cargo Pricing";
        Assertions.assertEquals(expectedPricingyazisi,actualPricingyazisi);
    }

    @And("report tiklanir")
    public void reportTiklanir() {
        nuranpage.Report.click();

    }

    @And("total summery tiklanir")
    public void totalSummeryTiklanir() {
        nuranpage.TotalSummery.click();

    }

    @Then("total summery sayfasinda oldugu dogrulanir.")
    public void totalSummerySayfasindaOlduguDogrulanir() {
        nuranpage.TotalSummery.isDisplayed();

    }

    @Given("admin {string} sitesine gider")
    public void adminSitesineGider(String AdminLogin) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));


    }

    @When("admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar")
    public void adminLoginButonunaTiklarVeGecerliBilgilerIleSiteyeGirisYapar() {
        nuranpage.AdminloginLinki.click();
        nuranpage.AdminemailTextBox.sendKeys(ConfigReader.getProperty("toAdminEmail"));
        nuranpage.AdminpasswordTextbox.sendKeys(ConfigReader.getProperty("toAdminPassword"));
        nuranpage.AdminSıgnInbutonu.click();
    }

    @Then("deliver man`s tiklanir")
    public void deliverManSTiklanir() {
        nuranpage.DeliverMans.click();

    }

    @Then("deliver man`s + tiklanir")
    public void deliverMansTiklanir() {
        nuranpage.DeliverMansKisiEkleme.click();
    }

    @And("form doldurulur.")
    public void formDoldurulur() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        nuranpage.DeliverMansForm.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).click().perform();
















    }
}
