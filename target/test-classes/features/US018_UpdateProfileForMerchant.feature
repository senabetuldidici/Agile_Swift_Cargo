Feature: US018 As a merchant, I want to view and update my profile information.

  Scenario: TC01 Accessing the merchant and view my profile information.

    Given As the user opens the browsers and enters the URL
    When As the user clicks on the 'Login' button in the home page header section and enter mail and password
    Then As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to 'Profile and view  it.
    Then As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Change password and view it.
    Then As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Payment Information and clicking this.
    And As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to Logout and view it.



  Scenario: TC02 Clicking Profile button and view general information.

    Given As the user opens the browsers and enters the URL
    When As the user clicks on the 'Login' button in the home page header section and enter mail and password
    Then As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to 'Profile and view  it.
    Then As the user displays the name.
    Then As the user displays the Email
    And As the user displays the Phone.
    And As the user displays the Business Name.
    And As the user displays the Address section.


  Scenario: TC03 Clicking "Edit" Button to update the information in the 'Name', 'Address' text boxes and the 'Image' field

    Given As the user opens the browsers and enters the URL
    When As the user clicks on the 'Login' button in the home page header section and enter mail and password
    Then As the user verifies that clicking the profile icon in the top bar of the Merchant page Verifies that clicking the profile icon in the top bar of the Merchant page opens a menu with links to 'Profile and view  it.
    Then As the user clicks Edit Button,the user views Name', 'Address' 'Image'.
    Then As the user views  Button,the user views "<Name>" "<Address>".