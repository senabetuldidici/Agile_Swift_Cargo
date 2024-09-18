package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SumeyraPage2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class sumeyraStepDefinitions {

    SumeyraPage2 sumeyraPage = new SumeyraPage2();

    Faker faker = new Faker();

    @Given("kullanici {string} sitesine gider")
    public void kullaniciSitesineGider(String arg0) {Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("login butonuna  basar")
    public void loginButonunaBasar() {
        sumeyraPage.loginButonu.click();
    }

    @And("email kutusunun görünür oldugunu test eder")
    public void emailKutusununGörünürOldugunuTestEder() {
        Assertions.assertTrue(sumeyraPage.emailKutusu.isDisplayed());

    }

    @And("email olarak  {string} girer")
    public void emailOlarakGirer(String merchantGecerliEmail) {
        sumeyraPage.emailKutusu.sendKeys(ConfigReader.getProperty("merchantGecerliEmail"));
    }

    @And("password kutusunun görünür oldugunu test eder")
    public void passwordKutusununGörünürOldugunuTestEder() {
        Assertions.assertTrue(sumeyraPage.sifreKutusu.isDisplayed());
    }
    @And("password olarak  {string} girer")
    public void passwordOlarakGirer(String merchantGecerliPassword) {
        sumeyraPage.sifreKutusu.sendKeys(ConfigReader.getProperty("merchantGecerliPassword"));

    }
    @And("Sing in butonuna tıklar")
    public void singInButonunaTıklar() {
        sumeyraPage.signInButonu.click();
    }


    @And("sayfayı kapatir")
    public void sayfayıKapatir() { Driver.quitDriver();  // Tarayıcı kapanır
    }

    @And("{int} saniye bekleme")
    public void saniyeBekleme(int sn) {
        ReusableMethods.bekle(sn);
    }

    @Then("basarılı bir giris yapabildiğini test eder")
    public void basarılıBirGirisYapabildiğiniTestEder() {
        Assertions.assertTrue(sumeyraPage.marchantDashboard.isDisplayed());
    }


    @And("Sing Up here baglantısına tıklar")
    public void singUpHereBaglantısınaTıklar() {
        sumeyraPage.SingUphere.click();
    }


    @And("Business name kutusuna tıklanır ve faker name girilir")
    public void businessNameKutusunaTıklanırVeFakerNameGirilir() {
        sumeyraPage.businessnameKutusu.click();
        sumeyraPage.businessnameKutusu.sendKeys(faker.company().name());

    }

    @And("Full name kutusuna tıklanır ve  faker name girilir")
    public void fullNameKutusunaTıklanırVeFakerNameGirilir() {
        sumeyraPage.fullNameKutusu.click();
        sumeyraPage.fullNameKutusu.sendKeys(faker.name().fullName());

    }

    @And("Mobile kutusuna tıklanır ve numara girilir")
    public void mobileKutusunaTıklanırVeNumaraGirilir() {
        sumeyraPage.mobileText.click();
        sumeyraPage.mobileText.sendKeys(faker.phoneNumber().subscriberNumber(12));
    }

    @And("Password kutusuna tıklanır ve sifre girilir")
    public void passwordKutusunaTıklanırVeSifreGirilir() {
        sumeyraPage.passwordKutusu.click();
        sumeyraPage.passwordKutusu.sendKeys(faker.internet().password());

    }

    @And("Adress kutusuna tıklanır ve adres girilir")
    public void adressKutusunaTıklanırVeAdresGirilir() {
        sumeyraPage.addressKutusu.click();
        sumeyraPage.addressKutusu.sendKeys(faker.address().cityName());
    }

    @And("I agree checkbox kutusu isaretlenir")
    public void ıAgreeCheckboxKutusuIsaretlenir() {
        sumeyraPage.registrationCheckbox.click();
    }

    @And("Register my account butonuna tıklanır,yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void registerMyAccountButonunaTıklanırYönlendirilenSayfanınURLSininDogrulugunuTestEder() {
        sumeyraPage.registerButton.click();

        String expectedUrl = "https://qa.agileswiftcargo.com/login"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);

    }

    @And("Send Password reset butonuna tıklanır")
    public void sendPasswordResetButonunaTıklanır() {
        sumeyraPage.PasswordResetLinkButonu.click();
    }


    @And("Basarılı bir sekilde girilen email adresine bir email gönderildiği doğrulanır")
    public void basarılıBirSekildeGirilenEmailAdresineBirEmailGönderildiğiDoğrulanır() {
        Assertions.assertTrue(sumeyraPage.basarılıResetLinkyazısı.isDisplayed());

    }

    @And("Forgot Password linkine tıklar")
    public void forgotPasswordLinkineTıklar() {
        sumeyraPage.ForgotPasswordLink.click();

    }

    @And("Forgot Password linkine tıklanır,yönlendirilen sayfanın URL'sinin dogrulugunu test eder")
    public void forgotPasswordLinkineTıklanırYönlendirilenSayfanınURLSininDogrulugunuTestEder() {
        sumeyraPage.ForgotPasswordLink.click();

        String expectedUrl = "https://qa.agileswiftcargo.com/password/reset"; // Beklenen URL
        String actualUrl = driver.getCurrentUrl(); // Geçerli URL
        Assertions.assertTrue(actualUrl.contains(expectedUrl),
                "URL beklenen URL ile eşleşmiyor. Beklenen: " + expectedUrl + ", Mevcut: " + actualUrl);
    }

    @And("Email Address metin kutusu görünür oldugunu test eder")
    public void emailAddressMetinKutusuGörünürOldugunuTestEder() {
        Assertions.assertTrue(sumeyraPage.EmailAdressKutusu.isDisplayed());

    }

    @And("Send Password Reset Link butonunun görünür oldugunu test eder")
    public void sendPasswordResetLinkButonununGörünürOldugunuTestEder() {
        Assertions.assertTrue(sumeyraPage.PasswordResetLinkButonu.isDisplayed());

    }






}

