package utilities;

import com.github.javafaker.Options;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.swing.text.html.Option;
import java.time.Duration;

public class Driver {

    static ChromeOptions options = new ChromeOptions();

    // Driver class'i WebDriver objesini olusturacagimiz
    // ve gerkeli ayarlari yapacagimiz class olacak

    // Hedef configuration properties'den hangi browser secilirse
    // bize o browser'i uretecek bir class olusturmak

    // Driver class'inda bize driver objesi dondurecek getDriver() olusturacagiz

    private Driver(){



    }

    public static WebDriver driver;

    public static WebDriver getDriver(){


        options.addArguments("--disable-search-engine-choice-screen");

        if (driver == null){
            String istenenBrowser = ConfigReader.getProperty("browser"); // firefox

            switch (istenenBrowser){

                case "firefox" :
                    driver = new FirefoxDriver();
                    break;

                case "edge" :
                    driver = new EdgeDriver();
                    break;

                case "safari" :
                    driver = new SafariDriver();
                    break;

                default:
                    driver = new ChromeDriver(options);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;

    }


    public static void quitDriver(){
        driver.quit();
        driver =null;
    }
}