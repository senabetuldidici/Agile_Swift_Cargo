Feature: US005 Merchant Paneli Login Testi

  Scenario: TC01  Kayıtlı bilgilerle merchant paneline basarılı bir sekilde login olabilmeli

    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna  basar
    And email kutusunun görünür oldugunu test eder
    And email olarak  "merchantGecerliEmail" girer
    And password kutusunun görünür oldugunu test eder
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    Then basarılı bir giris yapabildiğini test eder
    And sayfayı kapatir


