Feature: US1004 Login Testi
  Scenario:Track Now butonunun kullanilmasi
    Given kullanici "toUrl" sitesine gider
    When 2 saniye bekler
    When login butonuna  basar
    And email kutusunun görünür oldugunu test eder
    And email olarak  "merchantGecerliEmail" girer
    And password kutusunun görünür oldugunu test eder
    And password olarak  "tMSF" girer
    And Sing in butonuna tıklar
    Then basarılı bir giris yapabildiğini test eder
    And parsel butonuna tiklar
    And ilk sirada ki TrackingID numarasini kopyalar
    Then Anasayfa Logosuna tiklar
    And Enter tracking id tiklar
    Then kopyalana tracking id yapistirilir.
    And Track Now butonuna tiklanir
    And Tracking Id ile Parcel Tracking No ayni oldugu dogrulanir.



