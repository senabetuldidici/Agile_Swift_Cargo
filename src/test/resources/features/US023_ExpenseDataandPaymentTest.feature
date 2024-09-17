Feature: US023 Gider verilerine erisim ve odeme yapma testi

  Scenario: TC01 Payout bağlantısının görünür ve tıklanabilir olmasi

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And 2 saniye bekler
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    And  sayfayi kapatir


  Scenario: TC02 Payout bağlantısına tıklandıktan sonra yönlendirme

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    When Payout basligina tiklar ve yonlendirilen sitenin Url'sinin dogrulugunu test eder
    And  sayfayi kapatir

  Scenario: TC03 Payout List görüntülenmesi

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    Then Payout sayfasinda Payout List bolumunun gorunur oldugunu test eder
    And  sayfayi kapatir

  Scenario: TC04 Stripe bağlantısının görünür ve tıklanabilir olmasi

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    Then Payout sayfasinda Stripe bolumunun gorunur ve tiklanabilir oldugunu test eder
    And  sayfayi kapatir

  Scenario: TC05 Stripe Payout Details alanında textbox'ların görüntülenmesi ve veri girilebilmesi

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    Then Payout sayfasinda Stripe bolumunun gorunur ve tiklanabilir oldugunu test eder
    When Stripe bolumunde var olan To Account ve Amount (USD) textboxlarinin gorunur olmasini testeder
    Then To Account textboxta cikan ilk secenegin secilebilir oldugunu test eder
    And  Amount (USD) textboxa integer veri girilebildigini test eder
    And  sayfayi kapatir


  Scenario: TC06 Pay Now butonu ve Merchant Payment penceresinin açılması

    Given kullanıcı "toUrl" sitesine gider
    When login butonuna tiklar ve gecerli bilgiler ile siteye giris yapar
    Then marchant dashboard sayfasina erisim saglar
    And  sol tarafta bulunan menude 'Accounts' basliginin gorunur ve tiklanabilir oldugunu test eder
    And  Accounts basligi altinda yer alan 'Payout' baglantisinin gorunur ve tiklanabilir oldugunu test eder
    Then Payout sayfasinda Stripe bolumunun gorunur ve tiklanabilir oldugunu test eder
    When Stripe bolumunde var olan To Account ve Amount (USD) textboxlarinin gorunur olmasini testeder
    Then To Account textboxta cikan ilk secenegin secilebilir oldugunu test eder
    And  Amount (USD) textboxa integer veri girilebildigini test eder
    Then PayNow butonuna tiklanabildigini test eder
    And  5 saniye bekler
    And  Merchant Payment penceresinin açıldığını test eder
    And  sayfayi kapatir