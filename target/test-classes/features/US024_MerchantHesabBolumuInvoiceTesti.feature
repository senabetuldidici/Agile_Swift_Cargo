Feature: US024 Merchant hesabında invoices görüntülenme testi

  Scenario: TC01 Merchant hesabinda invoices linkinin görünürlüğü, tıklanabilirliği ve yönlendirilmesi
    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekler
    When login butonuna basar
    And email olarak "toMerchantGecerliEmail" girer
    And password olarak "toMerchantGecerliPassword" girer
    And 1 saniye bekler
    And signIn butonuna basar
    When menuden account butonuna tiklar
    Then invoice linkinin gorunurlugunu dogrular
    When acilir menuden invoice linkine tiklar
    Then Invoice List sayfasina gidebildigini dogrular
    And 3 saniye bekler
    And sayfayi kapatir
