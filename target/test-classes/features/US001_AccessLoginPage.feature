Feature: As a visitor, I should be able to access the website in order to use it.

  Scenario: [TC01 -> US001] Accessing the home page by URL from a device with an internet connection

    Given As the user opens the browser and enters the URL
    Then As the user verifies that the homepage is fully loaded successfully and 'THE CONFIDENCE WE CARRY AROUND THE WORLD' sees this title and logo
    Then As the user closes the home page