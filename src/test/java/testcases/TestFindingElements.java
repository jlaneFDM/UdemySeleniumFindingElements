package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {

	public static void main(String[] args) {
		//instantiate web driver object
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//grab the url in full screen mode
		driver.get("http://gmail.com");
		driver.manage().window().fullscreen();
		//grab and manipulate web elements
		WebElement username =  driver.findElement(By.id("identifierId"));
		username.sendKeys("lanejohn1712@gmail.com");
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		nextButton.click();
	}

}
