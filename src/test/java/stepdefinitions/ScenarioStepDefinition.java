package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.SenaPage;
import pages.SumeyraPage2;
import utilities.Driver;
import utilities.ReusableMethods;

public class ScenarioStepDefinition {

    SumeyraPage2 sumeyraPage = new SumeyraPage2();
    SenaPage senaPage = new SenaPage();

    @And("Sidebar menüden Ticket baslıgına tıklanır")
    public void sidebarMenüdenTicketBaslıgınaTıklar() {
        sumeyraPage.ticketBaslıgı.click();

        ReusableMethods.bekle(2);

    }


    @Then("Sag üstteki + butonuna tıklanır")
    public void sagÜsttekiButonunaTıklar() {
        sumeyraPage.artıButonu.click();

        ReusableMethods.bekle(2);



    }

    public static void ticketAdd(String subjectText, String description){

        SenaPage senaPage = new SenaPage();
        senaPage.selectServiceButton.click();
        ReusableMethods.bekle(2);
        senaPage.selectPickUp.click();
        senaPage.selectPriorityButton.click();
        senaPage.selectPriorityLow.click();
        ReusableMethods.bekle(2);
        senaPage.departmanButton.click();
        senaPage.financeText.click();
        senaPage.subjectBox.sendKeys(subjectText);
        senaPage.descriptionBox.sendKeys(description);
        ReusableMethods.bekle(3);

    }

    @Then("Formdaki boş alanlar doldurulur")
    public void formdakiBoşAlanlarDoldurulurVeKaydetButonunaTıklanır() {
        ScenarioStepDefinition.ticketAdd("20/09/2024 tarihli kargom hakkinda;","Kargom teslim edilmedi");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", sumeyraPage.saveButonu);

    }


    @And("Kaydet butonuna tıklanır")
    public void veKaydetButonunaTıklanır() {

        sumeyraPage.saveButonu.click();

        ReusableMethods.bekle(2);


    }

    @And("Ticket list alanındaki action butonuna tıklanır")
    public void ticketListAlanındakiActionButonunaTıklanır() {
        sumeyraPage.actionButonu.click();

        ReusableMethods.bekle(2);

    }

    @And("Edit'e tıklayır")
    public void editETıklayır() {
        sumeyraPage.editButonu.click();

        ReusableMethods.bekle(2);


    }


    public static void ticketEdit(String descriptionEdit){

        SenaPage senaPage = new SenaPage();

        senaPage.descriptionBox.sendKeys(descriptionEdit);

    }

    @Then("Gerekli bilgiler düzenlenir")
    public void gerekliBilgilerDüzenlenir() {

        senaPage.descriptionBox.clear();

        ScenarioStepDefinition.ticketEdit("Tarafıma 20/09/2024 tarihinde teslim edildigi bildirimi aldıgım kolim teslim edilmedi.");


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", sumeyraPage.saveChangeButonu);

        ReusableMethods.bekle(2);

    }

    @And("Save Change butonuna tıklanır")
    public void saveChangeButonunaTıklanır() {

        sumeyraPage.saveChangeButonu.click();

        ReusableMethods.bekle(2);


    }
}
