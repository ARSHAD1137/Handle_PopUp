import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadPopUp
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","X:\\Selenium jar and drivers\\drivers\\geckodriver-v0.29.1-win64 (1)\\geckodriver.exe");
        driver = new FirefoxDriver();

        FirefoxProfile profile = new FirefoxProfile();
        String key = "browser.helperApps.neverAsk.saveToDisk";
        String value = "application/zip";
        profile.setPreference(key, value);
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "C:\\Users\\Arshad\\Desktop\\Custom Batch QA");
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, profile);
        driver = new FirefoxDriver(cap);
        driver.get("http://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
        Thread.sleep(3000);
    }
}
