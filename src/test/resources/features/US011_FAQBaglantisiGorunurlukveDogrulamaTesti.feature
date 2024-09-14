Feature: US011 Anasayfa "FAQ" sayfasi gorunurluk testi

  Scenario: TC01 'FAQ' Bağlantısının görünür ve tiklanabilir olmasi

      Given kullanici "toUrl" sitesine gider
      And FAQ menü başlıgının görünür oldugunu test eder,
      And 1 saniye bekler
      When FAQ menü başlıgının tiklanabilir oldugunu test eder,
      And 1 saniye bekler
      And sayfayi kapatir


  Scenario: TC01 'FAQ' Bağlantısına tiklandiginda dogru sayfaya yonlendirilmesi

      Given kullanici "toUrl" sitesine gider
      And 1 saniye bekler
      When FAQ menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
      And 1 saniye bekler
      And sayfayi kapatir

