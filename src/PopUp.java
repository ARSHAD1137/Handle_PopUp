import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");*/
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[4]/input[1]")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        //alert.sendKeys("Jack");
        alert.dismiss();
        alert.accept();
    }
}
