Feature: US033 Admin Şifre Değiştirme Testi

  Scenario: TC01 Admin Dashboarddan şifre değiştirme ve değiştiğini kontrol edebilme testi

    Given admin "toUrl" sitesine gider
    When admin login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    And ikii saniye bekler
    Then profile ikonundan change passworda tıklar
    And sifre degistirmek icin gerekli bilgileri tıkladıktan sonra save change butonuna basar
    And Succesfully change password uyarisini alir
