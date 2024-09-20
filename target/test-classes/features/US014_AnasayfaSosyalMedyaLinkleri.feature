Feature: US014 'linkedin,Facebook, X, instagram, Youtube, Skype' simgeleri görünürlüğünün ve tıklanabilirliğini doğrulama

  Scenario: TC01 'linkedin' simgesinin görünürlüğünün ve tıklanabilirliğini doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    And  Simgeleri görebilecek sekilde sayfayı asagı kaydırır
    And 2 saniye bekleme
    When linkedin simgesinin görünür oldugunu test eder
    And linkedin simgesine tıklanır, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC02 'Facebook' simgesinin görünürlüğünün ve tıklanabilirliğini doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    And  Simgeleri görebilecek sekilde sayfayı asagı kaydırır
    And 2 saniye bekleme
    When Facebook simgesinin görünür oldugunu test eder
    And Facebook simgesine tıklanır, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC03 'instagram' simgesinin görünürlüğünün ve tıklanabilirliğini doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    And  Simgeleri görebilecek sekilde sayfayı asagı kaydırır
    And 2 saniye bekleme
    When instagram simgesinin görünür oldugunu test eder
    And instagram simgesine tıklanır, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC04 'Youtube' simgesinin görünürlüğünün ve tıklanabilirliğini doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    And  Simgeleri görebilecek sekilde sayfayı asagı kaydırır
    And 2 saniye bekleme
    When Youtube simgesinin görünür oldugunu test eder
    And Youtube simgesine tıklanır, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC05 'Skype' simgesinin görünürlüğünün ve tıklanabilirliğini doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    And  Simgeleri görebilecek sekilde sayfayı asagı kaydırır
    And 2 saniye bekleme
    When Skype simgesinin görünür oldugunu test eder
    And Skype simgesine tıklanır, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir
