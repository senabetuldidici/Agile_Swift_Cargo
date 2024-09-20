package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import pages.SenaPage;
import pages.SumeyraPage2;
import utilities.ReusableMethods;

public class ScenarioStepDefinition {

    SumeyraPage2 sumeyraPage = new SumeyraPage2();
    SenaPage senaPage = new SenaPage();

    @And("Sidebar menüden Ticket baslıgına tıklanır")
    public void sidebarMenüdenTicketBaslıgınaTıklar() {
        sumeyraPage.ticketBaslıgı.click();
    }


    @Then("Sag üstteki + butonuna tıklanır")
    public void sagÜsttekiButonunaTıklar() {
        sumeyraPage.artıButonu.click();

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

    @Then("Formdaki boş alanlar doldurulur ve Kaydet butonuna tıklanır")
    public void formdakiBoşAlanlarDoldurulurVeKaydetButonunaTıklanır() {
        ScenarioStepDefinition.ticketAdd("20/09/2024 tarihli kargom hakkinda;","Kargom teslim edilmedi");
    }

    @Then("Click on the Save button")
    public void click_on_the_button() {
        senaPage.saveButton.click();

    }


}
