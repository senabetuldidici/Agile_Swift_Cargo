Feature: US009 Anasayfa "Our Partners" bölümünü testi

  Scenario: TC01 Anasayfada Our Partners başlığının görünürlüğü, logoların tıklanabilirliği ve yonlendirilmesi

    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekler
    And Our Partners  başlıgının görünür oldugunu test eder
    And 2 saniye bekler
    When Our Partners bolumdeki logoların tiklanabilir oldugunu test eder
    And sayfayi kapatir