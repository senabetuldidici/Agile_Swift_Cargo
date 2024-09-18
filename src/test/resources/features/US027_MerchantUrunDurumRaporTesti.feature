Feature: US024 Merchant hesabında durum rapor  testi
  Background:
    Given kullanıcı "toUrl" sitesine gider
    And 1 saniye bekler
    When login butonuna basar
    And email olarak "toMerchantGecerliEmail" girer
    And password olarak "toMerchantGecerliPassword" girer
    And signIn butonuna basar
    And 1 saniye bekler



  Scenario: TC01 Merchant hesabinda Reports acilir menude Parcel Status Reports linkinin gorunurlugu, tiklanildigi ve ilgili sayfaya yonlenmesi
    When acilan sayfadaki menuden reports butonuna tiklar
    And 2 saniye bekler
    And Parcel Status Reports linkinin görünürlüğünü doğrular
    And Parcel Status Reports linkinin tiklanabilirliyini doğrular
    And Parcel Status Reports linkine tiklayinca ilgili sayfaya gidebildigini onaylar
    And sayfayi kapatir

  Scenario: TC02 Parcel Status Reports sayfasinda Date - Status alanlarinin filtresinin gorunurlugu ve filtreleme fonksiyonu
    When Report butonuna klikler
    Then Parcel Status Reports linkine klikler
    And Date bolumunun gorunur oldugunu onaylar
    And  Status bolumunun gorunur oldugunu onaylar
    When Date inputuna kilkler
    And 1 saniye bekler
    Then date bolumunden  Last 7 Days klikler
    And 2 saniye bekler
    When Status inputuna klikler
    And 1 saniye bekler
    And Status bolumunden Pending klikler
    And 1 saniye bekler
    And Filter butonuna klikler
    And 2 saniye bekler
    Then Filtre butonunun işlevselliğini doğrular
    And sayfayi kapatir

  Scenario: TC03 Filtre sonuc bolumu Export ve Print butonlarının görünürlüğü, işlevselliği
    When Report butonuna klikler
    Then Parcel Status Reports linkine klikler
    When Date inputuna kilkler
    And 1 saniye bekler
    Then date bolumunden  Last 7 Days klikler
    And 2 saniye bekler
    When Status inputuna klikler
    And 1 saniye bekler
    And Status bolumunden Pending klikler
    And 1 saniye bekler
    And Filter butonuna klikler
    And 2 saniye bekler
    Then Export butonunun görünürlüğünü doğrular
    Then Print butonunun görünürlüğünü doğrular
    And sayfayi kapatir