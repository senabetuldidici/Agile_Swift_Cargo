package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AnasayfaUstBarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utilities.Driver.driver;

public class AnasayfaUstBar {

    AnasayfaUstBarPage anasayfaUstBarPage = new AnasayfaUstBarPage();
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
        Assertions.assertTrue(anasayfaUstBarPage.ustBar.isDisplayed());
    }

    @When("Home menü başlıgının görünür oldugunu test eder,")
    public void homeMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.Home.isDisplayed());
    }

    @When("Pricing menü başlıgının görünür oldugunu test eder,")
    public void pricingMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.Pricing.isDisplayed());
    }

    @When("Tracking menü başlıgının görünür oldugunu test eder,")
    public void trackingMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.Tracking.isDisplayed());
    }

    @When("Blogs menü başlıgının görünür oldugunu test eder,")
    public void blogsMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.Blogs.isDisplayed());
    }

    @When("About menü başlıgının görünür oldugunu test eder,")
    public void aboutMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.About.isDisplayed());
    }

    @When("FAQ menü başlıgının görünür oldugunu test eder,")
    public void faqMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.FAQ.isDisplayed());
    }

    @When("Contact menü başlıgının görünür oldugunu test eder,")
    public void contactMenüBaşlıgınınGörünürOldugunuTestEder() {
        Assertions.assertTrue(anasayfaUstBarPage.Contact.isDisplayed());
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

        Assertions.assertTrue(anasayfaUstBarPage.Home.isDisplayed() &&
                anasayfaUstBarPage.Home.isEnabled(), "Home menü tıklanabilir değil.");
    }

    @When("Pricing menü başlıgının tiklanabilir oldugunu test eder,")
    public void pricingMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.Pricing.isDisplayed() &&
                anasayfaUstBarPage.Pricing.isEnabled(), "Pricing menü tıklanabilir değil.");
    }

    @When("Tracking menü başlıgının tiklanabilir oldugunu test eder,")
    public void trackingMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.Tracking.isDisplayed() &&
                anasayfaUstBarPage.Tracking.isEnabled(), "Tracking menü tıklanabilir değil.");    }

    @When("Blogs menü başlıgının tiklanabilir oldugunu test eder,")
    public void blogsMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.Blogs.isDisplayed() &&
                anasayfaUstBarPage.Blogs.isEnabled(), "Blogs menü tıklanabilir değil.");    }

    @When("About menü başlıgının tiklanabilir oldugunu test eder,")
    public void aboutMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.About.isDisplayed() &&
                anasayfaUstBarPage.About.isEnabled(), "About menü tıklanabilir değil.");    }

    @When("FAQ menü başlıgının tiklanabilir oldugunu test eder,")
    public void faqMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.FAQ.isDisplayed() &&
                anasayfaUstBarPage.FAQ.isEnabled(), "FAQ menü tıklanabilir değil.");
    }

    @When("Contact menü başlıgının tiklanabilir oldugunu test eder,")
    public void contactMenüBaşlıgınınTiklanabilirOldugunuTestEder() {

        Assertions.assertTrue(anasayfaUstBarPage.Contact.isDisplayed() &&
                anasayfaUstBarPage.Contact.isEnabled(), "Contact menü tıklanabilir değil.");    }


    @When("Home menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void homeMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.Home.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Pricing menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void pricingMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.Pricing.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/#pricing"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Tracking menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void trackingMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.Tracking.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/tracking"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Blogs menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void blogsMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.Blogs.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/get-blogs"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("About menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void aboutMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.About.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/about-us"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("FAQ menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void faqMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.FAQ.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/faq-list"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @When("Contact menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,")
    public void contactMenüBaşlığınaTıklarYönlendirilenSayfanınURLSininDogrulugunuTestEder() {

        anasayfaUstBarPage.Contact.click();
        String expectedUrl = "https://qa.agileswiftcargo.com/contact-send"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @Given("Blogs menü başlığına tıklar,")
    public void blogs_menü_başlığına_tıklar() {
        anasayfaUstBarPage.Blogs.click();
    }
    @When("Acilan sayfada bulunan ilk blog yazisinin basligini kaydeder ve basliga tiklar,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_basligini_kaydeder_ve_basliga_tiklar() {
        ilkBlogYazisiBasligi = anasayfaUstBarPage.ilkBlogYazisiBasligi.getText();
        System.out.println(ilkBlogYazisiBasligi);
        anasayfaUstBarPage.ilkBlogYazisiBasligi.click();
    }
    @Then("Yönlendirildiği sayfadaki blog yazısının başlığı ile kaydettigi basligin ayni oldugunu test eder,")
    public void yönlendirildiği_sayfadaki_blog_yazısının_başlığı_ile_kaydettigi_basligin_ayni_oldugunu_test_eder() {
        yonlendirilenSayfaBlogYazisiBasligi = anasayfaUstBarPage.yonlendirilenBlogSayfasiBlogYazisiBasligi.getText();
        System.out.println(yonlendirilenSayfaBlogYazisiBasligi);

        Assertions.assertEquals(ilkBlogYazisiBasligi,yonlendirilenSayfaBlogYazisiBasligi);
    }

    @When("Acilan sayfada bulunan ilk blog yazisinin gorunurluk sayisini kaydeder,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_gorunurluk_sayisini_kaydeder() {
        ilkGorunurlukSayisi = Integer.parseInt(anasayfaUstBarPage.blogYazisiIlkGorunurlukSayisi.getText());
    }
    @When("Blog yazisina tiklar ve acilan sayfadaki gorunurluk sayisini kaydeder,")
    public void blog_yazisina_tiklar_ve_acilan_sayfadaki_gorunurluk_sayisini_kaydeder() {
        anasayfaUstBarPage.ilkBlogYazisiBasligi.click();
        guncelGorunurlukSayisi =Integer.parseInt(anasayfaUstBarPage.blogYazisiGuncelGorunurlukSayisi.getText());
    }
    @Then("Blog yazisina tikladiktan sonra kaydedilen gorunurluk sayisinin, ilk gorunurluk sayisindan buyuk oldugunu test eder,")
    public void blog_yazisina_tikladiktan_sonra_kaydedilen_gorunurluk_sayisinin_ilk_gorunurluk_sayisindan_buyuk_oldugunu_test_eder() {
        Assertions.assertTrue(ilkGorunurlukSayisi<guncelGorunurlukSayisi);
    }

    @When("Acilan sayfada bulunan ilk blog yazisinin basligina tiklar,")
    public void acilan_sayfada_bulunan_ilk_blog_yazisinin_basligina_tiklar() {
        anasayfaUstBarPage.ilkBlogYazisiBasligi.click();
    }
    @When("Acilan sayfada Latest Blogs basliginin gorunur oldugunu test eder,")
    public void acilan_sayfada_latest_blogs_basliginin_gorunur_oldugunu_test_eder(){
        anasayfaUstBarPage.latestBlogsBasligi.isDisplayed();
    }
    @Then("Latest Blogs basligi altinda bulunan bir blog yazisinin basligini kaydeder,")
    public void latest_blogs_basligi_altinda_bulunan_bir_blog_yazisinin_basligini_kaydeder() {
       latestBlogsYazisiBasligi = anasayfaUstBarPage.latestBlogsYazisiBasligi.getText().replaceAll("[^a-zA]", "");
       System.out.println(latestBlogsYazisiBasligi);

    }
    @When("Basligi kaydedilen blog yazisina tiklar,")
    public void basligiKaydedilenBlogYazisinaTiklar() {
        anasayfaUstBarPage.latestBlogsYazisi.click();
    }
    @Then("Yonlendirilen sayfada bulunan basligi kaydeder ve tiklanilan blog yazisi basligi ile ayni oldugunu test eder,")
    public void yonlendirilen_sayfada_bulunan_basligi_kaydeder_ve_tiklanilan_blog_yazisi_basligi_ile_ayni_oldugunu_test_eder() {
        acilanLatestBlogsYazisiBasligi = anasayfaUstBarPage.acilanLatestBlogsYazisiBasligi.getText().replaceAll("[^a-zA]", "");
        Assertions.assertTrue((acilanLatestBlogsYazisiBasligi).contains(latestBlogsYazisiBasligi));
    }


}