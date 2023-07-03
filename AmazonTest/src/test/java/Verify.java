package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {
	
			@Test
	public void confi() throws IOException{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			WebElement search=driver.findElement(By.id("twotabsearchtextbox")).click();
			search.sendKeys("wrist watches").ENTER;

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#p_89\\/Titan .a-icon")).click();
  			js.executeScript("window.scrollTo(0,467.20001220703125)");
    			driver.findElement(By.cssSelector("#p_n_feature_seven_browse-bin\\/1480900031 .a-icon")).click();
    			driver.findElement(By.cssSelector("#p_n_material_browse\\/1480907031 .a-icon")).click();
    			driver.findElement(By.cssSelector("#p_n_feature_seven_browse-bin\\/1480900031 .a-icon")).click();
    			js.executeScript("window.scrollTo(0,44)");
    			js.executeScript("window.scrollTo(0,548.7999877929688)");
    			driver.findElement(By.cssSelector("#p_n_material_browse\\/1480907031 .a-icon")).click();
    
      WebElement element = driver.findElement(By.linkText("Clear"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
js.executeScript("window.scrollTo(0,800)");
    driver.findElement(By.cssSelector("#p_n_pct-off-with-tax\\/2665400031 .a-size-base")).click();
    js.executeScript("window.scrollTo(0,0)");

      WebElement element = driver.findElement(By.cssSelector("#p_72\\/1318479031 .a-size-small"));

WebElement element = driver.findElement(By.cssSelector("#p_72\\/1318479031 section"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
			
			element.click();
			
			
			
			
			
			driver.findElement(By.xpath("//div[@data-cel-widget="search_result_5"]")).click();			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.quit();
			
		}
	}
	


