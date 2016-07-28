package net.brav3.webdriver.A1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToAUrl {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://developer.mozilla.org");
	}
}
