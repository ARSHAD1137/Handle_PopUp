import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChildBrowserPopup
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);
        for (String windowHandle : allWindowHandles)
        {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
            driver.close();
        }
    }
}
