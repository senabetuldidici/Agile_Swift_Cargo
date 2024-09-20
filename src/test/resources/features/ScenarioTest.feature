Feature: Scenario Test

  Scenario: 20/09/2024

    Given kullanici "toUrl" sitesine gider
    When login butonuna  basar
    And email olarak  "merchantGecerliEmail" girer
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    And Sidebar menüden Ticket baslıgına tıklanır
    Then Sag üstteki + butonuna tıklanır
    Then Formdaki boş alanlar doldurulur ve Kaydet butonuna tıklanır




