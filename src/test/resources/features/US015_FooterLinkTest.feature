Feature: US015 Firmaya ait bilgilerin olduğu kolay erişim için anasayfada linklerinin olması testi

  Scenario: TC01 Anasayfa footer kisminda About basligi altindaki 'FAQ, About Us, Contact us, Privacy & Policy.Term of Use' baglantilarinin gorunur ve tiklanabilir olmasi testi

    Given kullanici "toUrl" adresine gider
    And Faq, About Us, Contact us, Privacy & Policy.Term of Use baglantilarinin gorunurlugunu test eder
    And Faq, About Us, Contact us, Privacy & Policy.Term of Use baglantilarinin tiklanabilirligini test eder
    And 2 saniye bekleme
    And sayfayi kapatir

  Scenario: TC02 Anasayfa footer kisminda About basligi altindaki 'FAQ, About Us, Contact us, Privacy & Policy.Term of Use' baglantilarinin yonlendirilmesi testi

    Given kullanici "toUrl" adresine gider
    And Faq menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And About Us menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And Contact us menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And Privacy & Policy menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And Term of Use menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder
    And 2 saniye bekleme
    And sayfayi kapatir

