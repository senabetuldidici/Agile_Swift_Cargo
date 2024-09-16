package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.jupiter.api.Assertions;
import pages.MahmutPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MahmutStepddefinitions {

    MahmutPage mahmutPage = new MahmutPage();

    @Given("admin {string} sitesine gider")
    public void admin_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar")
    public void admin_login_butonuna_tiklar_ve_gecerli_bilgiler_ile_siteye_giris_yapar() {
        mahmutPage.loginLinki.click();
        mahmutPage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMkkGecerliEmail"));
        mahmutPage.passwordTextbox.sendKeys(ConfigReader.getProperty("adminMkkGecerliPassword"));
        mahmutPage.SıgnInbutonu.click();
    }

    @And("ikii saniye bekler")
    public void ikiiSaniyeBekler() {
        ReusableMethods.bekle(3);
    }


    @Then("profile ikonundan change passworda tıklar")
    public void profile_ikonundan_change_passworda_tıklar() {
        mahmutPage.profileButonu.click();
        mahmutPage.changePasswordButonu.click();

    }


    @Then("sifre degistirmek icin gerekli bilgileri tıkladıktan sonra save change butonuna basar")
    public void sifre_degistirmek_icin_gerekli_bilgileri_tıkladıktan_sonra_save_change_butonuna_basar() {
        ReusableMethods.bekle(2);

        mahmutPage.oldPasswordTextbox.sendKeys(ConfigReader.getProperty("adminMkkGecerliPassword"));
        mahmutPage.newPasswordButonu.sendKeys(ConfigReader.getProperty("adminMkkGecerliPassword"));
        mahmutPage.confırmPasswordButonu.sendKeys(ConfigReader.getProperty("adminMkkGecerliPassword"));
        mahmutPage.saveChangeButonu.click();
    }

    @Then("Succesfully change password uyarisini alir")
    public void succesfully_change_password_uyarisini_alir() {
        ReusableMethods.bekle(1);
        Assertions.assertTrue(mahmutPage.passwordSuccessfullyUpdatedYazisi.isDisplayed());

    }
}


