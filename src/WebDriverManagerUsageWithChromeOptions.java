import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerUsageWithChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Below are the list of available and most commonly used arguments for
		 * ChromeOptions class
		 * start-maximized: Opens Chrome in maximize mode incognito: Opens Chrome in
		 * incognito mode headless: Opens Chrome in headless mode disable-extensions:
		 * Disables existing extensions on Chrome browser disable-popup-blocking:
		 * Disables pop-ups displayed on Chrome browser make-default-browser: Makes
		 * Chrome default browser version: Prints chrome browser version
		 * disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is
		 * being controlled by automated software
		 */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "incognito", "version");
		//
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(options);
		// WebDriver driver = new ChromeDriver(options);
		// Navigate to URL https://www.demoqa.com
		driver.get("https:www.google.com");
		System.out.println("Hello");
		driver.quit();

	}

}
