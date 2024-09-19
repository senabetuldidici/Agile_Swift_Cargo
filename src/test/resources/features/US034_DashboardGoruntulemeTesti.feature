Feature: US034 'Dashboard' daki bilgilerin görüntülenmesi testi

  Scenario: TC01 Dashbord'daki bilgilendirme basliklarinin goruntulendiginin dogrulanmasi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And Dashbord' daki bilgilendirme başlıklarının görüntülendiğini doğrular
    And 2 saniye bekleme
    And  sayfayi kapatir

  Scenario: TC02 Dashboard sayfasındaki grafigin ve takvimin gorunurlugunu test eder

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And IncomeExpense' alanıdaki grafiğin görünürlugunu test eder
    And Takvimin görünürlugunu test eder
    And 2 saniye bekleme
    And  sayfayi kapatir