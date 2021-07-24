import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.irctc.co.in/nget/train-search");

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) alert;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();

        // driver.switchTo().window() for alert window
    }
}
