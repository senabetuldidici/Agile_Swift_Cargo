
Feature: US020 Merchant olarak 'Dashboard' daki bilgilerin görüntülenmesi Testi

  Scenario: TC01 'Merchant Dashboard' daki bilgilendirme başlıklarının görüntüleme

    Given kullanıci "loginpageUrl" sitesine gider
    And 2 saniye bekleme
    And email olarak  "merchantGecerliEmail" girer
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    And Dashboard baslıgının görünür oldugunu test eder
    And Ticket baslıgının görünür oldugunu test eder
    And Account baslıgının görünür oldugunu test eder
    And Parcels baslıgının görünür oldugunu test eder
    And 2 saniye bekleme
    And Parcels Bank baslıgının görünür oldugunu test eder
    And Setting baslıgının görünür oldugunu test eder
    And Dashbord baslıgına tıklanır ve yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC02  'Enter date' textbox'nı görüntüleme ve doğrulama

    Given kullanıci "loginpageUrl" sitesine gider
    And 2 saniye bekleme
    And email olarak  "merchantGecerliEmail" girer
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    And Enter date textbox'nın görünür oldugunu test eder
    And Textbox'a veri girilebilir oldugunu test eder
    And 2 saniye bekleme
    And Filter butonuna tıklar
    And Filtreleme isleminin calıstığı test eder
    And sayfayı kapatir



  Scenario: TC03 'All Reports' alanındaki rapor görünürlüğü doğrulanmalı

    Given kullanıci "loginpageUrl" sitesine gider
    And 2 saniye bekleme
    And email olarak  "merchantGecerliEmail" girer
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    And sayfayı asagı kaydırır
    And 3 saniye bekleme
    And All Reports alanı görünür oldugunu test eder
    And sayfayı kapatir





