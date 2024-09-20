Feature: US036 Branch Manage sayfasının test edilmesi

  Scenario: TC01 Filter butonunun calistiginin test edilmesi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And Branch Manage sayfasına gider
    And Filter butonunun çalıştığını test eder
    And 2 saniye bekler
    And  sayfayi kapatir

  Scenario: TC02 Clear butonunun calistiginin test edilmesi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And Branch Manage sayfasına gider
    And Clear butonunun çalıştığını test eder
    And 2 saniye bekler
    And  sayfayi kapatir

  Scenario: TC03 Plus butonunun calistiginin test edilmesi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And Branch Manage sayfasına gider
    And Plus butonunun çalıştığını test eder
    And 2 saniye bekler
    And  sayfayi kapatir


  Scenario: TC04 Action butonunun calistiginin test edilmesi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And Branch Manage sayfasına gider
    And Action butonunun çalıştığını test eder
    And 2 saniye bekler
    And  sayfayi kapatir