Feature: Scenario Test

  Scenario: 20/09/2024

    Given kullanici "toUrl" sitesine gider
    When login butonuna  basar
    And email olarak  "merchantGecerliEmail" girer
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    And Sidebar menüden Ticket baslıgına tıklanır
    Then Sag üstteki + butonuna tıklanır
    Then Formdaki boş alanlar doldurulur
    And 1 saniye bekleme
    And Kaydet butonuna tıklanır
    And Ticket list alanındaki action butonuna tıklanır
    And Edit'e tıklayır
    Then Gerekli bilgiler düzenlenir
    And 3 saniye bekleme
    And  Save Change butonuna tıklanır
    And sayfayı kapatir







