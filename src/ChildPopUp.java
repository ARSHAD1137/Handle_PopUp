import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.do");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
    }
}
