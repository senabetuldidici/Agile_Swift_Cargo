package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SenaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utilities.Driver.driver;

public class SenaStepdefinitons {

    SenaPage senaPage = new SenaPage();
    static String ilkBlogYazisiBasligi;
    static String yonlendirilenSayfaBlogYazisiBasligi;
    static int ilkGorunurlukSayisi;
    static int guncelGorunurlukSayisi;

    static String latestBlogsYazisiBasligi;

    static String acilanLatestBlogsYazisiBasligi;


    @Given("kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("ana sayfa üst barını kontrol eder")
    public void ana_sayfa_ust_barini_kontrol_eder() {
        Assertions.assertTrue(senaPage.ustBar.isDisplayed());
    }

    @When("Home menü başlıgının görünür oldugunu test eder,")
    public void homeMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.Home.isDisplayed());
    }

    @When("Pricing menü başlıgının görünür oldugunu test eder,")
    public void pricingMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.Pricing.isDisplayed());
    }

    @When("Tracking menü başlıgının görünür oldugunu test eder,")
    public void trackingMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.Tracking.isDisplayed());
    }

    @When("Blogs menü başlıgının görünür oldugunu test eder,")
    public void blogsMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.Blogs.isDisplayed());
    }

    @When("About menü başlıgının görünür oldugunu test eder,")
    public void aboutMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.About.isDisplayed());
    }

    @When("FAQ menü başlıgının görünür oldugunu test eder,")
    public void faqMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.FAQ.isDisplayed());
    }

    @When("Contact menü başlıgının görünür oldugunu test eder,")
    public void contactMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(senaPage.Contact.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();  // Tarayıcı kapanır
    }


    @And("{int} saniye bekler")
    public void saniyeBekler(int sn) {
        ReusableMethods.bekle(sn);
    }


    @When("Home menü başlıgının tiklanabilir oldugunu test eder,")
    public void homeMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.Home.isDisplayed() &&
                senaPage.Home.isEnabled(), "Home menü tıklanabilir değil.");
    }

    @When("Pricing menü başlıgının tiklanabilir oldugunu test eder,")
    public void pricingMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.Pricing.isDisplayed() &&
                senaPage.Pricing.isEnabled(), "Pricing menü tıklanabilir değil.");
    }

    @When("Tracking menü başlıgının tiklanabilir oldugunu test eder,")
    public void trackingMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.Tracking.isDisplayed() &&
                senaPage.Tracking.isEnabled(), "Tracking menü tıklanabilir değil.");    }

    @When("Blogs menü başlıgının tiklanabilir oldugunu test eder,")
    public void blogsMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.Blogs.isDisplayed() &&
                senaPage.Blogs.isEnabled(), "Blogs menü tıklanabilir değil.");    }

    @When("About menü başlıgının tiklanabilir oldugunu test eder,")
    public void aboutMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.About.isDisplayed() &&
                senaPage.About.isEnabled(), "About menü tıklanabilir değil.");    }

    @When("FAQ menü başlıgının tiklanabilir oldugunu test eder,")
    public void faqMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.FAQ.isDisplayed() &&
                senaPage.FAQ.isEnabled(), "FAQ menü tıklanabilir değil.");
    }

    @When("Contact menü başlıgının tiklanabilir oldugunu test eder,")
    public void contactMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(senaPage.Contact.isDisplayed() &&
                senaPage.Contact.isEnabled(), "Contact menü tıklanabilir değil.");    }


    @When("Home menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void homeMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.Home.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Pricing menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void pricingMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.Pricing.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/#pricing"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Tracking menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void trackingMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.Tracking.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/tracking"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Blogs menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void blogsMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.Blogs.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/get-blogs"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("About menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void aboutMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.About.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/about-us"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("FAQ menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void faqMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.FAQ.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/faq-list"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Contact menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void contactMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        senaPage.Contact.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/contact-send"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @Given("Blogs menü başlığına tıklar,")
    public void blogs_menü_başlığına_tıklar() {
        senaPage.Blogs.click();
    }
    @When("Acilan sayfada bulunan ilk blog yazisinin basligini kaydeder ve basliga tiklar,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_basligini_kaydeder_ve_basliga_tiklar() {
        ilkBlogYazisiBasligi = senaPage.ilkBlogYazisiBasligi.getText();
        System.out.println(ilkBlogYazisiBasligi);
        senaPage.ilkBlogYazisiBasligi.click();
    }
    @Then("Yönlendirildiği sayfadaki blog yazısının başlığı ile kaydettigi basligin ayni oldugunu test eder,")
    public void yönlendirildiği_sayfadaki_blog_yazısının_başlığı_ile_kaydettigi_basligin_ayni_oldugunu_test_eder() {
        yonlendirilenSayfaBlogYazisiBasligi = senaPage.yonlendirilenBlogSayfasiBlogYazisiBasligi.getText();
        System.out.println(yonlendirilenSayfaBlogYazisiBasligi);

        Assertions.assertEquals(ilkBlogYazisiBasligi,yonlendirilenSayfaBlogYazisiBasligi);
    }

    @When("Acilan sayfada bulunan ilk blog yazisinin gorunurluk sayisini kaydeder,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_gorunurluk_sayisini_kaydeder() {
        ilkGorunurlukSayisi = Integer.parseInt(senaPage.blogYazisiIlkGorunurlukSayisi.getText());
    }
    @When("Blog yazisina tiklar ve acilan sayfadaki gorunurluk sayisini kaydeder,")
    public void blog_yazisina_tiklar_ve_acilan_sayfadaki_gorunurluk_sayisini_kaydeder() {
        senaPage.ilkBlogYazisiBasligi.click();
        guncelGorunurlukSayisi =Integer.parseInt(senaPage.blogYazisiGuncelGorunurlukSayisi.getText());
    }
    @Then("Blog yazisina tikladiktan sonra kaydedilen gorunurluk sayisinin, ilk gorunurluk sayisindan buyuk oldugunu test eder,")
    public void blog_yazisina_tikladiktan_sonra_kaydedilen_gorunurluk_sayisinin_ilk_gorunurluk_sayisindan_buyuk_oldugunu_test_eder() {
        Assertions.assertTrue(ilkGorunurlukSayisi<guncelGorunurlukSayisi);
    }

    @When("Acilan sayfada bulunan ilk blog yazisinin basligina tiklar,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_basligina_tiklar() {
        senaPage.ilkBlogYazisiBasligi.click();
    }
    @When("Acilan sayfada Latest Blogs basliginin gorunur oldugunu test eder,")
    public void acilan_sayfada_latest_blogs_basliginin_gorunur_oldugunu_test_eder(){
        senaPage.latestBlogsBasligi.isDisplayed();
    }
    @Then("Latest Blogs basligi altinda bulunan bir blog yazisinin basligini kaydeder,")
    public void latest_blogs_basligi_altinda_bulunan_bir_blog_yazisinin_basligini_kaydeder() {
       latestBlogsYazisiBasligi = senaPage.latestBlogsYazisiBasligi.getText().replaceAll("[^a-zA]", "");
       System.out.println(latestBlogsYazisiBasligi);

    }
    @When("Basligi kaydedilen blog yazisina tiklar,")
    public void basligiKaydedilenBlogYazisinaTiklar() {
        senaPage.latestBlogsYazisi.click();
    }
    @Then("Yonlendirilen sayfada bulunan basligi kaydeder ve tiklanilan blog yazisi basligi ile ayni oldugunu test eder,")
    public void yonlendirilen_sayfada_bulunan_basligi_kaydeder_ve_tiklanilan_blog_yazisi_basligi_ile_ayni_oldugunu_test_eder() {
        acilanLatestBlogsYazisiBasligi = senaPage.acilanLatestBlogsYazisiBasligi.getText().replaceAll("[^a-zA]", "");
        Assertions.assertTrue((acilanLatestBlogsYazisiBasligi).contains(latestBlogsYazisiBasligi));
    }

    @When("login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar")
    public void login_butonuna_tiklar_ve_gecerli_bilgiler_ile_siteye_giris_yapar() {
        senaPage.loginButonu.click();
        senaPage.emailKutusu.sendKeys(ConfigReader.getProperty("toMerchantGecerliEmail"));
        senaPage.sifreKutusu.sendKeys(ConfigReader.getProperty("toMerchantGecerliPassword"));
        senaPage.signInButonu.click();
    }
    @Then("marchant dashboard sayfasina erisim saglar")
    public void marchant_dashboard_sayfasina_erisim_saglar() {
        senaPage.marchantDashboardAnasayfaBasligi.isDisplayed();
    }
    @Then("sol tarafta bulunan menude {string} basliginin gorunur ve tiklanabilir oldugunu test eder")
    public void sol_tarafta_bulunan_menude_basliginin_gorunur_ve_tiklanabilir_oldugunu_test_eder(String string) {
        senaPage.accountsBasligi.isDisplayed();
        senaPage.accountsBasligi.click();
    }
    @Then("Accounts basligi altinda yer alan {string} baglantisinin gorunur ve tiklanabilir oldugunu test eder")
    public void accounts_basligi_altinda_yer_alan_baglantisinin_gorunur_ve_tiklanabilir_oldugunu_test_eder(String string) {
        senaPage.payoutButonu.isDisplayed();
        senaPage.payoutButonu.click();
    }

    @When("Payout basligina tiklar ve yonlendirilen sitenin Url'sinin dogrulugunu test eder")
    public void payoutBasliginaTiklarVeYonlendirilenSiteninUrlSininDogrulugunuTestEder() {
        senaPage.payoutButonu.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/merchant/online-payment"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);
    }
}