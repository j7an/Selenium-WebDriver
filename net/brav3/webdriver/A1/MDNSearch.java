// Locating WebElements
package net.brav3.webdriver.A1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MDNSearch {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://developer.mozilla.org");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("html5");
		searchBox.submit();
	}
}
