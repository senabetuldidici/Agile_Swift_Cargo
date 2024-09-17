Feature: US001 Home top bar elements test

  Scenario: TC01 Visibility of menu titles

    Given kullanıcı "toUrl" sitesine gider
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



  Scenario: TC02 Menu headings are clickable

    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekler
    When Home menü başlıgının tiklanabilir oldugunu test eder,
    And Pricing menü başlıgının tiklanabilir oldugunu test eder,
    When Tracking menü başlıgının tiklanabilir oldugunu test eder,
    And Blogs menü başlıgının tiklanabilir oldugunu test eder,
    And About menü başlıgının tiklanabilir oldugunu test eder,
    And FAQ menü başlıgının tiklanabilir oldugunu test eder,
    And Contact menü başlıgının tiklanabilir oldugunu test eder,


  Scenario: TC03 Correct orientation of menu headings
    Given kullanıcı "toUrl" sitesine gider
    And 2 saniye bekler
    When Home menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Pricing menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    When Tracking menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Blogs menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And About menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And FAQ menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And Contact menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And sayfayi kapatir

