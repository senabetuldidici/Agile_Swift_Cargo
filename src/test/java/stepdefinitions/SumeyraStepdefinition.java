package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SumeyraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SumeyraStepdefinition {

    SumeyraPage sumeyraPage = new SumeyraPage();

    @Given("kullanıcı {string} sitesine gider")
    public void kullanıcıSitesineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
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
}
