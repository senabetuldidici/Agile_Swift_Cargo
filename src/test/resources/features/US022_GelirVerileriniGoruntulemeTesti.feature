Feature: US022 Gelir verilerinin görüntülenmesi testi

  Scenario: TC01 Sol taraftaki menude 'Accounts' altindaki 'Payment Received' baglantisi gorunur ve tiklanabilir olmalidir.

    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan Payment Received baglantisinin gorunur ve tiklanabilir oldugunu test eder
    And 2 saniye bekler
    And  sayfayi kapatir

  Scenario: TC02 Payment Received baglantisina tiklandiktan sonra yonlendirilen sayfa dogrulanmalidir.

    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And  Accounts basligi altinda yer alan Payment Received baglantisina gider
    And Payment Received basligina tiklar ve yonlendirilen sitenin Url'sinin dogrulugunu test eder
    And Payment Received listesinin gorunebilirliğini dogrular
    And 2 saniye bekler
    And  sayfayi kapatir

