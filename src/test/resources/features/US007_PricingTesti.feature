Feature: US007_PricingTesti
  Scenario:TC01 Agile Swift Cargo Pricing yazisinin gorunurlugu
    Given kullanici "toUrl" sitesine gider
    When 2 saniye bekler
    When login butonuna  basar
    And email kutusunun görünür oldugunu test eder
    And email olarak  "merchantGecerliEmail" girer
    And password kutusunun görünür oldugunu test eder
    And password olarak  "tMSF" girer
    And Sing in butonuna tıklar
    Then basarılı bir giris yapabildiğini test eder
    Then Anasayfa Logosuna tiklar
    And pricing tiklanir.
    Then Agile Swift Cargo Pricing yazisinin gorunurlugu test edilir
    And sayfayı kapatir


