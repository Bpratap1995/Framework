package biocube_Truntrance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Vivir {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Url
		
		driver.get("https://wavecabtest.com:8443/viviroom_assets/login");
		driver.findElement(By.id("username")).sendKeys("abs");
		driver.findElement(By.id("pass")).sendKeys("654");
		driver.switchTo().frame(0);
	WebElement ele=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-borderAnimation']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);
		
	
		

	}

}
