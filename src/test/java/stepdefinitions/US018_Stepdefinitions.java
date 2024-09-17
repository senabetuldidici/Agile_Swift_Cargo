package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CimenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_Stepdefinitions {

    CimenPage cimenPage=new CimenPage();


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

    }






}




