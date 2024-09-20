package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SumeyraPage2;

public class ScenarioStepDefinition {

    SumeyraPage2 sumeyraPage = new SumeyraPage2();

    @And("Sidebar menüden Ticket baslıgına tıklanır")
    public void sidebarMenüdenTicketBaslıgınaTıklar() {
        sumeyraPage.ticketBaslıgı.click();
    }


    @Then("Sag üstteki + butonuna tıklanır")
    public void sagÜsttekiButonunaTıklar() {
        sumeyraPage.artıButonu.click();

    }


}
