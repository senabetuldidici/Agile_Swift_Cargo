Feature: US006 Basliklardaki yazilarin ve resimlerin görünür olmasi

  Scenario: TC01 Menü başlıklarının yazilari görünür olmali

    Given kullanici "toUrl" sitesine erisim saglar
    When neden Çevik Hızlı Kargo' bölümüne gider
    Then zamanında Teslimat' başlığının görünür olup olmadığını kontrol eder
    And  sınırsız Alım' başlığının görünür olup olmadığını kontrol eder
    When Teslimatta ödeme (COD)' başlığının görünüp görünmediğini kontrol eder
    And  İstediğiniz Zaman Ödeme Alın' başlığının görünür olup olmadığını kontrol eder
    Then Güvenli İşleme' başlığının görünür olup olmadığını kontrol eder
    And  Canlı Takip Güncellemesi' başlığının görünür olup olmadığını kontrol eder


  Scenario: TC02 görsellerin görünürlüğünü kontrol etme

    Given kullanici "toUrl" sitesine erisim saglar
    When neden Çevik Hızlı Kargo' bölümüne gider
    Then zamanında Teslimat resminin görünür olup olmadığını kontrol eder
    And  sınırsız Toplama başlığıyla ilişkili görselin görünür olduğunu kontrol eder
    When teslimatta ödeme (COD) başlığıyla ilişkili görselin görünür olduğunu kontrol eder
    And  istediğiniz Zaman Ödeme Alın' başlığıyla ilişkili görselin görünür olduğunu kontrol eder
    Then güvenli İşleme' başlığıyla ilişkili görselin görünür olduğunu kontrol eder
    And  canlı İzleme Güncelleme başlığıyla ilişkili görselin görünür olduğunu kontrol eder









