import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSpecificVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "incognito", "version");
		//Browser Version
		WebDriverManager.chromedriver().browserVersion("85.0.4183.38").setup();
		//Driver Version
		//WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
        driver.quit(); 
        
	}

}
