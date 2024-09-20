package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import pages.CimenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class CimenStepdefinitions {

    CimenPage cimenPage=new CimenPage();
    JavascriptExecutor jse=(JavascriptExecutor) driver;


    static String hometextLine;

    static  String  emailBox;

    static String  passwordBox;

    static String login;

    static String profileText;

    @Given("As the user opens the browsers and enters the URL")
    public void as_the_user_opens_the_browsers_and_enters_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("As the user clicks on the {string} button in the home page header section and enter mail and password")
    public void as_the_user_clicks_on_the_button_in_the_home_page_header_section_and_enter_mail_and_password(String string) {
        cimenPage.login.click();


        cimenPage.loginMethodu(emailBox,passwordBox);
    }
    @Then("As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to 'Profile and view  it.")
    public void as_the_user_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_opens_a_menu_with_links_to_profile_and_view_it() {
        cimenPage.profileImage.click();
        ReusableMethods.bekle(3);
        cimenPage.profileText.click();
        ReusableMethods.bekle(3);
        Assertions.assertTrue(cimenPage.profileHeader.isEnabled());


    }

    @Then("As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Change password and view it.")
    public void as_the_user_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_opens_a_menu_with_links_to_change_password_and_view_it() {

        cimenPage.profileImage.click();
        ReusableMethods.bekle(3);
        cimenPage.changeInfo.click();;
        ReusableMethods.bekle(3);
        Assertions.assertTrue(cimenPage.changePasswordLabel.isDisplayed());

    }

    @Then("As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Payment Information and clicking this.")
    public void as_the_user_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_opens_a_menu_with_links_to_payment_ınformation_and_clicking_this() {
        cimenPage.profileImage.click();
        ReusableMethods.bekle(3);
        cimenPage.paymentInfo.click();;
        ReusableMethods.bekle(3);


    }
    @Then("As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Logout and view it.")
    public void as_the_user_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_verifies_that_clicking_the_profile_icon_in_the_top_bar_of_the_merchant_page_opens_a_menu_with_links_to_logout_and_view_it() {

        ReusableMethods.bekle(2);
        cimenPage.profileImage.click();
        ReusableMethods.bekle(3);
        cimenPage.logoutLabel.click();;
        ReusableMethods.bekle(3);
        Assertions.assertTrue(cimenPage.hometextLine.isDisplayed());
    }



    @Then("As the user displays the name.")
    public void as_the_user_displays_the_name() {

        String expectedTabloIcerik = "Name";
        String actualTumBody =  cimenPage.profileTable.getText();
        Assertions.assertTrue(actualTumBody.contains(expectedTabloIcerik));



    }
    @Then("As the user displays the Email")
    public void as_the_user_displays_the_email() {
        String expectedTabloIcerik = "Email";
        String actualTumBody =  cimenPage.profileTable.getText();
        Assertions.assertTrue(actualTumBody.contains(expectedTabloIcerik));

    }
    @Then("As the user displays the Phone.")
    public void as_the_user_displays_the_phone() {

        String expectedTabloIcerik = "Phone";
        String actualTumBody =  cimenPage.profileTable.getText();
        Assertions.assertTrue(actualTumBody.contains(expectedTabloIcerik));

    }
    @Then("As the user displays the Business Name.")
    public void as_the_user_displays_the_business_name() {
        String expectedTabloIcerik = "Business Name";
        String actualTumBody =  cimenPage.profileTable.getText();
        Assertions.assertTrue(actualTumBody.contains(expectedTabloIcerik));

    }
    @Then("As the user displays the Address section.")
    public void as_the_user_displays_the_address_section() {
        String expectedTabloIcerik = "Address";
        String actualTumBody =  cimenPage.profileTable.getText();
        Assertions.assertTrue(actualTumBody.contains(expectedTabloIcerik));
        //  System.out.println(actualTumBody.toString());

    }


    @Then("As the user clicks Edit Button,the user views Name', 'Address' 'Image'.")
    public void as_the_user_clicks_edit_button_the_user_views_name_address_ımage() {
        cimenPage.Editbutton.click();
        Assertions.assertTrue(cimenPage.profileForm.isEnabled());
        //  System.out.println(merchantpage.profileForm.getText());

    }
    @Then("As the user views  Button,the user views {string} {string}.")
    public void as_the_user_views_button_the_user_views(String name, String address) {
        cimenPage.Clear();
        ReusableMethods.bekle(4);

        cimenPage.hesabimYeniBilgiDogrulama(name,address);




    }


    @Then("As the user clicks the {string} heading in the menu on the left.")
    public void as_the_user_clicks_the_heading_in_the_menu_on_the_left(String string) {
        cimenPage.settingsButton.click();
    }
    @Then("As the user checks that the {string} link is visible and clickable under {string}.")
    public void as_the_user_checks_that_the_link_is_visible_and_clickable_under(String string, String string2) {
        Assertions.assertTrue(cimenPage.deliverycharges.isDisplayed());
        Assertions.assertTrue(cimenPage.deliverycharges.isSelected());
    }


    @Then("As the user clicks the {string} link in the left menu.")
    public void as_the_user_clicks_the_link_in_the_left_menu(String string) {
        cimenPage.deliverycharges.click();
    }
    @Then("As the user checks whether the redirected page is loaded correctly \\(title and URL check).")
    public void as_the_user_checks_whether_the_redirected_page_is_loaded_correctly_title_and_url_check() {
        String exceptedUrl="https://qa.agileswiftcargo.com/merchant/settings/delivery-charges";
        String actualUrl=Driver.driver.getCurrentUrl();
        Assertions.assertEquals(exceptedUrl,actualUrl);
        String exceptedTitle="Delivery Charge";
        String actualTitle=Driver.driver.getTitle();
    }
    @Then("As the user checks whether the data in the list")
    public void as_the_user_checks_whether_the_data_in_the_list_category() {

        Assertions.assertTrue(cimenPage.deliverycharges.isDisplayed());
    }

    @When("As the user click on the AGILESWIFT CARGO logo")
    public void as_the_user_click_on_the_agıleswıft_cargo_logo() {
        cimenPage.loginAdminButton.click();
        ReusableMethods.bekle(2);
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("toUrl"));
    }

    @When("As the user clicks Login")
    public void as_the_user_clicks_login() {
        cimenPage.login.click();
    }
    @Then("As the user checks whether the Enter Email or Mobile")
    public void as_the_user_checks_whether_the_enter_email_or_mobile()  {

        Assertions.assertTrue(cimenPage.emailText.isDisplayed());
        Assertions.assertTrue(cimenPage.passwordText.isDisplayed());
        Assertions.assertTrue(cimenPage.signUpHere.isDisplayed());
        Assertions.assertTrue(cimenPage.signInButton.isDisplayed());



        Assertions.assertTrue(cimenPage.emailText.isEnabled());
        Assertions.assertTrue(cimenPage.passwordText.isEnabled());
        Assertions.assertTrue(cimenPage.signUpHere.isEnabled());
        Assertions.assertTrue(cimenPage.signInButton.isEnabled());




    }
    @Then("As the user enter valid password and email adddress and clicks Sign in.")
    public void as_the_user_enter_valid_password_and_email_adddress_and_clicks_sign_in() {

        cimenPage.loginMethodu(emailBox,passwordBox);

    }

    @When("As the user finds and clicks the Facebook button on the login page")
    public void as_the_user_finds_and_clicks_the_facebook_button_on_the_login_page() {

        Assertions.assertTrue(cimenPage.facebookLink.isDisplayed());
        Assertions.assertTrue(cimenPage.facebookLink.isEnabled());
        jse.executeScript("arguments[0].click();",cimenPage.facebookLink);



    }
    @Then("As the user sees facebook page when click the Facebook button.")
    public void as_the_user_sees_facebook_page_when_click_the_facebook_button() {
        String expectedLink="https://www.facebook.com/";
        Assertions.assertEquals(expectedLink,Driver.getDriver().getCurrentUrl());
    }

    @When("As the user finds and clicks the Google button on the login page")
    public void as_the_user_finds_and_clicks_the_google_button_on_the_login_page() {
        Assertions.assertTrue(cimenPage.googleLink.isDisplayed());
        Assertions.assertTrue(cimenPage.googleLink.isEnabled());
        jse.executeScript("arguments[0].click();",cimenPage.googleLink);
    }
    @Then("As the user sees google page when click the google button.")
    public void as_the_user_sees_google_page_when_click_the_google_button() {
        String expectedLink="https://www.google.com/app-store/";
        Assertions.assertEquals(expectedLink,Driver.getDriver().getCurrentUrl());
    }


    @When("As the user clicks Login and {string}")
    public void as_the_user_clicks_login_and(String signup) {
        cimenPage.login.click();
        cimenPage.signUpHere.click();
    }
    @Then("As the user checks that the {string} ,{string}, {string}, {string}, {string}, {string}, {string}")
    public void as_the_user_checks_that_the(String business, String full, String hub, String mobile, String password, String address, String register) {

        Assertions.assertTrue(cimenPage.businessName.isDisplayed());
        Assertions.assertTrue(cimenPage.fullName.isDisplayed());
        Assertions.assertTrue(cimenPage.editHub.isDisplayed());
        Assertions.assertTrue(cimenPage.mobile.isDisplayed());
        Assertions.assertTrue(cimenPage.passwordBox.isDisplayed());
        Assertions.assertTrue(cimenPage.addressBox.isDisplayed());
        Assertions.assertTrue(cimenPage.registerButton.isDisplayed());



    }

    @Then("As the user checks that the {string} text box and the {string} button are visible.")
    public void as_the_user_checks_that_the_text_box_and_the_button_are_visible(String string, String string2) {

        Assertions.assertTrue(cimenPage.forgotButton.isDisplayed());
        cimenPage.forgotButton.click();
        Assertions.assertTrue(cimenPage.resetButton.isDisplayed());

    }

    @When("As the user clicks Login and <Forgot Password>")
    public void as_the_user_clicks_login_and_forgot_password() {
        cimenPage.login.click();
        cimenPage.forgotButton.click();


    }


    @Then("As the user enters the valid email and clicks Send Password Reset Link' button.")
    public void as_the_user_enters_the_valid_email_and_clicks_send_password_reset_link_button() {
        cimenPage.emailEnter(emailBox);
        String exceptedAlertYazisi=" We have emailed your password reset link! ";


        Assertions.assertEquals(cimenPage.alertText.getText(),exceptedAlertYazisi);
    }

    @When("As the user clicks Login and enters the valid mail and password")
    public void as_the_user_clicks_login_and_enters_the_valid_mail_and_password() {
        cimenPage.login.click();
        cimenPage.loginAdminMethodu(emailBox,passwordBox);
    }
    @Then("As the user access admin panel")
    public void as_the_user_access_admin_panel() {

        String excaptedURl="https://qa.agileswiftcargo.com/dashboard";
        Assertions.assertEquals(driver.getCurrentUrl(),excaptedURl);

    }







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