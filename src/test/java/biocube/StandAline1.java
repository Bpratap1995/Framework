 package biocube;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAline1 {

	public static void main(String[] args) {
		String productName = "ZARA COAT 3";
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions cp1 = new ChromeOptions();
	cp1.addArguments("--remote-allow-origins=*"); 
	WebDriver driver = new ChromeDriver(cp1);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/client");
	
	driver.findElement(By.id("userEmail")).sendKeys("bpratap924@gmail.com");
	driver.findElement(By.id("userPassword")).sendKeys("Biocube@123");
	driver.findElement(By.id("login")).click();
	
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	 
	 List<WebElement>Products = driver.findElements(By.cssSelector(".mb-3"));
     WebElement prod = Products.stream().filter(product ->product.findElement(By.cssSelector("b"))
	.getText().equals("ZARA COAT 3")).findFirst().orElse(null);
     
     prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
     
     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
     
     
     driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
     
     List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
     boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
     Assert.assertTrue(match);
     driver.findElement(By.cssSelector(".totalRow button")).click();
     
     Actions action = new Actions(driver);
     action.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
     driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
    
    WebElement element = driver.findElement(By.cssSelector(".action__submit"));
    // driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
    // JavascriptExecutor js = (JavascriptExecutor) driver;
     //js.executeScript("arguments[0].click();", element);
     
      String confirmMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
      System.out.println(confirmMessage);
     Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
     driver.close();
	}


}
