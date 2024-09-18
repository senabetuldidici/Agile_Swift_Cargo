Feature: US012 İletişim bilgilerinin olduğu "Contact" sayfasının görüntülenmesi

  Scenario: TC01 Contact sayfasinin goruntulenebiliyor olmasi
    Given kullanici "toUrl" adresine gider
    And Contact başlığına tıklar,
    And 2 saniye bekler
    And sayfayi kapatir

  Scenario: TC02 Textbox'larin gorunurlugunun test edilmesi, bilgilerin kutulara girilebilir olmasi ve mesajin gonderilebilir oldugunun test edilmesi

    Given kullanici "toUrl" adresine gider
    And Contact başlığına tıklar,
    And Name, Email, Subject, Message kutusunun görünür oldugunu test eder
    And Name kutusuna "name" verisinin girilebilirliğini test eder
    And Email kutusuna "email" verisinin girilebilirliğini test eder
    And Subject kutusuna "subject" verisinin girilebilirliğini test eder
    And Message kutusuna "message" verisinin girilebilirliğini test eder
    And Submit butonuna tıklar
    And 2 saniye bekleme
    And sayfayi kapatir


  Scenario: TC03 Email, Phone, Address bilgilerinin gorunu r oldugunu test eder

    Given kullanici "toUrl" adresine gider
    And Contact başlığına tıklar,
    And Email, Phone, Address bilgilerinin görünür oldugunu test eder
    And 2 saniye bekleme
    And sayfayi kapatir

