Feature: US028_Cargo Report Testi
  Scenario:TC01 Cargo Total Summery kullanima testi.
    Given kullanici "toUrl" sitesine gider
    When 2 saniye bekler
    When login butonuna  basar
    And email kutusunun görünür oldugunu test eder
    And email olarak  "merchantGecerliEmail" girer
    And password kutusunun görünür oldugunu test eder
    And password olarak  "tMSF" girer
    And Sing in butonuna tıklar
    Then basarılı bir giris yapabildiğini test eder
    And report tiklanir
    And total summery tiklanir
    Then total summery sayfasinda oldugu dogrulanir.