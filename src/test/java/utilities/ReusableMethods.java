package utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> stringListesineDonustur(List<WebElement> webelementListesi){

        List<String> istenenStringList = new ArrayList<>();

        for (WebElement eachElement : webelementListesi
        ) {
            istenenStringList.add(eachElement.getText());
        }

        return istenenStringList;
    }

    public static void windowaGec(String hedefUrl, WebDriver driver){
        Set<String> tumWindowlarWHDleriSeti = driver.getWindowHandles();

        for (String eachWhd : tumWindowlarWHDleriSeti
        ) {
            driver.switchTo().window(eachWhd);

            if (driver.getCurrentUrl().equals(hedefUrl)){
                break;
            }
        }
    }

    public static void tumSayfaScreenshot(WebDriver driver){
        // ekran resmi ismini dinamik hale getirebilmek icin
        // tarih muhru ekleyelim ekranResmi240529202344
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihMuhru = ldt.format(tarihFormati);

        // 1.adim TakeScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim cektigimiz screenshot'i kaydedecegimiz dosyayi olusturalim
        //   dosya uzantisi jpg, jpeg, png olabilir
        //   dosya yeri  target/screenshots olsun

        File tumSayfaScreenshot = new File("target/screenshots/ekranResmi"+tarihMuhru+".png");

        // 3.adim sayfa fotografini cekip gecici bir dosyaya yukleyelim

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil olusturdugumuz dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaScreenshot(WebDriver driver, String raporIsmi) {
        // 1.adim TakeScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim cektigimiz screenshot'i kaydedecegimiz dosyayi olusturalim
        File tumSayfaScreenshot = new File("target/screenshots/"+raporIsmi+".png");

        // 3.adim sayfa fotografini cekip gecici bir dosyaya yukleyelim
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil olusturdugumuz dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webElementScreenshot(WebElement fotografCekilecekWebelement){
        // dinamik hale getirmek icin tarih muhru ekleyelim
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihMuhru = ldt.format(tarihFormati);

        // 1.adim : fotograf cekecegimiz webelementi locate edelim

        // 2.adim : resmi kaydedecegimiz File'i olusturalim
        File webElementSS = new File("target/screenshots/webElementSS"+tarihMuhru+".png");

        // 3.adim : screenshot alip gecici dosyaya kaydedelim
        File geciciDosya = fotografCekilecekWebelement.getScreenshotAs(OutputType.FILE);

        // 4.adim : gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,webElementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    // ========================= Scrolling Methods =========================//

    /**
     * Scrolls the page until the given element is in view
     * @param element the WebElement to scroll to
     */
    public static void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Scrolls vertically by a specified amount
     * @param scrollY the amount to scroll in the Y-axis
     */
    public static void scrollByAmount(int scrollY) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + scrollY + ")");
    }

    // ========================= Utility Methods =========================//

    /**
     * Converts a date string from "dd-MM-yyyy" to "yyyy-MM-dd" format
     * @param date the original date string
     * @return the formatted date string
     */
    public static String formatDateString(String date) {
        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        String year = date.substring(6);
        return year + "-" + month + "-" + day;
    }

    /**
     * Simple hard wait method using Thread.sleep
     * @param seconds the number of seconds to wait
     */
    public static void hardWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Clicks on an element with a retry mechanism for a specified timeout
     * @param element the WebElement to click on
     * @param timeout the maximum time to keep retrying
     */
    public static void clickWithTimeout(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            }
            catch (WebDriverException e) {
                hardWait(1); // wait 1 second and retry
            }
        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue(element.isDisplayed());
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    // ========================= Click Methods =========================//

    public static void clickRandomlyOnScreen(WebDriver driver) {
        // Tarayıcı penceresinin genişliği ve yüksekliğini alın
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        // Rastgele x ve y koordinatları oluşturun
        Random random = new Random();
        int x = random.nextInt(width);
        int y = random.nextInt(height);

        // Rastgele bir koordinata tıklama işlemi gerçekleştirin
        Actions actions = new Actions(driver);
        actions.moveByOffset(x, y).doubleClick().perform();
    }

    public static void clickWithText(String text) {

        Driver.getDriver().findElement(By.xpath("//*[text()='" + text + "']")).click();
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitAndClick(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            }
            catch (WebDriverException e) {
                hardWait(2);
            }
        }
    }

    // ========================= Sort Methods =========================//

    public static void sortingLowToHighVerification(List<WebElement> priceElements) {
        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {

            String priceText = priceElement.getText().replaceAll("\\D", "");

            try {
                int price = Integer.parseInt(priceText);
                price = price / 100;
                prices.add(price);
            }
            catch (NumberFormatException e) {
                System.out.println("Could not parse price: " + priceText);
            }

        }
        prices.sort(Integer::compareTo);

        List<Integer> originalPrices = new ArrayList<>(prices);
        Assert.assertEquals(prices, originalPrices);
    }

    public static void sortingHighToLowVerification(List<WebElement> priceElements) {

        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {

            String priceText = priceElement.getText().replaceAll("\\D", "");
            try {
                int price = Integer.parseInt(priceText);
                price = price / 100;
                prices.add(price);

            }
            catch (NumberFormatException e) {
                System.out.println("Could not parse price: " + priceText);
            }

        }
        prices.sort(Comparator.reverseOrder());

        List<Integer> originalPrices = new ArrayList<>(prices);
        Assert.assertEquals(prices, originalPrices);
    }

    // ========================= Select Methods =========================//

    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        }
        else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void selectAnItemFromDropdown(WebElement item, String selectItem) {
        hardWait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }

    public static void selectByVisibleText(WebElement elements, String text) {
        Select select = new Select(elements);
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement elements, int index) {
        Select select = new Select(elements);
        select.selectByIndex(index);
    }

    public static void selectByValue(WebElement elements, String value) {
        Select select = new Select(elements);
        List<WebElement> elementCount = select.getOptions();
        select.selectByValue(value);
    }

}