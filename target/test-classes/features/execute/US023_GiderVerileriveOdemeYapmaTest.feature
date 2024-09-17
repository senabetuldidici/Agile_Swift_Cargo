Feature: US023 Gider verilerine erisim ve odeme yapma testi

  Scenario: TC01 Payout bağlantısının görünür ve tıklanabilir olmasi

    Given kullanici "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And 2 saniye bekler
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    And  sayfayi kapatir


  Scenario: TC02 Payout bağlantısına tıklandıktan sonra yönlendirme

    Given kullanici "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    When Payout basligina tiklar ve yonlendirilen sitenin Url'sinin dogrulugunu test eder
    And  sayfayi kapatir