Feature: US017 Merchant Paneli Login Testi

  Scenario: TC01  Kayıtlı bilgilerle merchant paneline basarılı bir sekilde login olabilmeli

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna  basar
    And email kutusunun görünür oldugunu test eder
    And email olarak  "merchantGecerliEmail" girer
    And password kutusunun görünür oldugunu test eder
    And password olarak  "merchantGecerliPassword" girer
    And Sing in butonuna tıklar
    Then basarılı bir giris yapabildiğini test eder




  Scenario: TC02 Yönetim panelinin den basarılı bir sekilde Sing Up olabilme

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna  basar
    And Sing Up here baglantısına tıklar
    And Business name kutusuna tıklanır ve faker name girilir
    And Full name kutusuna tıklanır ve  faker name girilir
    And Mobile kutusuna tıklanır ve numara girilir
    And Password kutusuna tıklanır ve sifre girilir
    And Adress kutusuna tıklanır ve adres girilir
    And I agree checkbox kutusu isaretlenir
    And Register my account butonuna tıklanır,yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And sayfayı kapatir


  Scenario: TC03 Login sayfasında ki Forgot Password linki görünürlüğü

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna  basar
    And Forgot Password linkine tıklanır,yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And Email Address metin kutusu görünür oldugunu test eder
    And Send Password Reset Link butonunun görünür oldugunu test eder
    And sayfayı kapatir




  Scenario: TC04 Login sayfasında ki Forgot Password linki işlevsel olabilmesi

    Given kullanici "toUrl" sitesine gider
    And 2 saniye bekleme
    When login butonuna  basar
    And Forgot Password linkine tıklar
    And email olarak  "merchantGecerliEmail" girer
    And Send Password reset butonuna tıklanır
    And Basarılı bir sekilde girilen email adresine bir email gönderildiği doğrulanır
    And sayfayı kapatir









