Feature: US005 Our Services altındaki başlıkların görünürlüğünün ve tıklanabilirliğini doğrulama

  Scenario: TC01 Our Services baslıgı ve alt baslıkların görünürlüğünün doğrulama testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When Our Services baslıgının görünür oldugunu test eder
    Then "E-Commerce delivery","Pick & Drop","Packageing","Warehousing" baslıklarının görünür oldugunu test eder
    And  Hizmetlerin altında görünür ve tıklanabilir bir ok olduğunu test eder


  Scenario: TC02 'Service Details' sayfasına yönlendirme testi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme


