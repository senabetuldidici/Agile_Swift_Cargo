Feature: US010 Anasayfa "Blog" yazilarinin goruntulenme testi

  Scenario: TC01/TC02 Blogs bağlantısının görünürlüğü, tıklanabilirliği ve yonlendirilmesi

    Given kullanıcı "toUrl" sitesine gider
    And Blogs menü başlıgının görünür oldugunu test eder,
    And 2 saniye bekler
    When Blogs menü başlıgının tiklanabilir oldugunu test eder,
    And Blogs menü başlığına tıklar, yönlendirilen sayfanın URL'sinin dogrulugunu test eder,
    And sayfayi kapatir

  Scenario: TC03  Blog yazısı tıklama ve doğrulama
    Given kullanıcı "toUrl" sitesine gider
    And Blogs menü başlığına tıklar,
    When Acilan sayfada bulunan ilk blog yazisinin basligini kaydeder ve basliga tiklar,
    Then Yönlendirildiği sayfadaki blog yazısının başlığı ile kaydettigi basligin ayni oldugunu test eder,
    And sayfayi kapatir

  Scenario: TC04 Blog yazisinin gorunurluk sayisinin artisini dogrulama
    Given kullanıcı "toUrl" sitesine gider
    And Blogs menü başlığına tıklar,
    When Acilan sayfada bulunan ilk blog yazisinin gorunurluk sayisini kaydeder,
    And 2 saniye bekler
    And Blog yazisina tiklar ve acilan sayfadaki gorunurluk sayisini kaydeder,
    Then Blog yazisina tikladiktan sonra kaydedilen gorunurluk sayisinin, ilk gorunurluk sayisindan buyuk oldugunu test eder,
    And sayfayi kapatir

  Scenario: TC05 Lastest Blogs alanında diğer blog yazıları görünür ve tıklanabilir oldugunu dogrulama
    Given kullanıcı "toUrl" sitesine gider
    And Blogs menü başlığına tıklar,
    When Acilan sayfada bulunan ilk blog yazisinin basligina tiklar,
    And Acilan sayfada Latest Blogs basliginin gorunur oldugunu test eder,
    Then Latest Blogs basligi altinda bulunan bir blog yazisinin basligini kaydeder,
    And 1 saniye bekler
    When Basligi kaydedilen blog yazisina tiklar,
    And 1 saniye bekler
    And Yonlendirilen sayfada bulunan basligi kaydeder ve tiklanilan blog yazisi basligi ile ayni oldugunu test eder,
    And sayfayi kapatir
