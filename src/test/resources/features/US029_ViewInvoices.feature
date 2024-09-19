Feature: US029 As a merchant, I want to view my invoices.


  Scenario: TC01 Delivery Charge Menu Visibility

Given As the user opens the browsers and enters the URL
When As the user clicks on the 'Login' button in the home page header section and enter mail and password
Then As the user clicks the 'Setting' heading in the menu on the left.
And As the user checks that the 'Delivery Charge' link is visible and clickable under 'Setting'.
    Then As the user closes the home page

  Scenario: TC02 Delivery Charge Page Navigation
    Given As the user opens the browsers and enters the URL
    When As the user clicks on the 'Login' button in the home page header section and enter mail and password
    Then As the user clicks the 'Delivery Charge' link in the left menu.
    And As the user checks whether the redirected page is loaded correctly (title and URL check).
    And As the user checks whether the data in the list
    Then As the user closes the home page

