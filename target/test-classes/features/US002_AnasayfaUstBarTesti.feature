Feature: US001 Anasayfa ust bar ogeleri testi

  Scenario: TC01 Menü başlıklarının görünür olmasi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekler
    When ana sayfa üst barını kontrol eder
    And 2 saniye bekler
    When Home menü başlıgının görünür oldugunu test eder,
    And Pricing menü başlıgının görünür oldugunu test eder,
    When Tracking menü başlıgının görünür oldugunu test eder,
    And Blogs menü başlıgının görünür oldugunu test eder,
    And About menü başlıgının görünür oldugunu test eder,
    And FAQ menü başlıgının görünür oldugunu test eder,
    And Contact menü başlıgının görünür oldugunu test eder,



  Scenario: TC02 Menü başlıklarının tiklanabilir olmasi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekler
    When Home menü başlıgının tiklanabilir oldugunu test eder,
    And Pricing menü başlıgının tiklanabilir oldugunu test eder,
    When Tracking menü başlıgının tiklanabilir oldugunu test eder,
    And Blogs menü başlıgının tiklanabilir oldugunu test eder,
    And About menü başlıgının tiklanabilir oldugunu test eder,
    And FAQ menü başlıgının tiklanabilir oldugunu test eder,
    And Contact menü başlıgının tiklanabilir oldugunu test eder,


  Scenario: TC02 Menü başlıklarının tiklanabilir olmasi
    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekler
    When Home menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Pricing menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    When Tracking menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Blogs menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And About menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And FAQ menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Contact menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And sayfayi kapatir

