Feature: US035 Deliver Man`s

  Scenario: TC01 Admin Deliver Man`s

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And 2 saniye bekler
    Then deliver man`s tiklanir
    Then deliver man`s + tiklanir
    And form doldurulur.


