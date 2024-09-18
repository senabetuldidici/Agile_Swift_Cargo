package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.CimenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_CimenStepdefinitions {



        CimenPage cimenPage=new CimenPage();


        static String hometextLine;

        static  String  emailBox;

        static String  passwordBox;

        static String login;


        @Given("As the user opens the browser and enters the URL")
        public void as_the_user_opens_the_browser_and_enters_the_url() {
            Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        }
        @Then("As the user verifies that the homepage is fully loaded successfully and {string} sees this title and logo")
        public void as_the_user_verifies_that_the_homepage_is_fully_loaded_successfully_and_sees_this_title_and_logo(String hometextLine) {
            String exceptedAramaSonucu="THE CONFIDENCE WE CARRY AROUND THE WORLD";

            Assertions.assertEquals(exceptedAramaSonucu,hometextLine);
            ReusableMethods.bekle(3);

        }
        @Then("As the user closes the home page")
        public void as_the_user_closes_the_home_page() {

            Driver.quitDriver();

        }



        }



