Feature: US005 Our Services altındaki başlıkların görünürlüğünün ve tıklanabilirliğini doğrulama

  Scenario: TC01 Our Services baslıgı ve alt baslıkların görünürlüğünün doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When Our Services baslıgının görünür oldugunu test eder
    And E-Commerce delivery alt baslıgının görünür oldugunu test eder
    And Pick & Drop alt baslıgının görünür oldugunu test eder
    And Packageing alt baslıgının görünür oldugunu test eder
    And Warehousing alt baslıgının görünür oldugunu test eder

