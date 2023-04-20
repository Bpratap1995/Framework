package biocube_Truntrance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TruNtranceStandalone {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Url
		
		driver.get(" https://biopasstest.com:8081/");
		
		WebElement dropdown=driver.findElement(By.id("userrole"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		
		driver.findElement(By.id("employee_id")).sendKeys("Super999");
		driver.findElement(By.xpath("//input[@id='digit']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='digit-2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='digit-3']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='digit-4']")).sendKeys("1");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login.getText());
		login.click();
		
		

	}

}
