package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/");
		
		//Click Used
		driver.findElement(By.xpath("//span[text()='Used']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys("Chennai");
		
		Thread.sleep(4000);
		WebElement place=driver.findElement(By.xpath("//ul[@class='o-eEgygU o-eZTujG o-eemiLE o-fzpihY o-fzoTzh  ']/li"));
		place.click();
		
		
		 WebElement slider1 = driver.findElement(By.xpath("//button[@role='slider' and @data-handle-key='0']"));
		 Actions moveRight = new Actions(driver);
		    
		    //move.dragAndDropBy(slider,60,20).build().perform();
		    
		 moveRight.moveToElement(slider1).clickAndHold().moveByOffset(60,0).release().perform();
		 
		 WebElement slider2 = driver.findElement(By.xpath("//button[@role='slider' and @data-handle-key='1']"));
		 Actions moveLeft = new Actions(driver);
		    
		    //move.dragAndDropBy(slider,60,20).build().perform();
		    
		 moveLeft.moveToElement(slider2).clickAndHold().moveByOffset(-125,0).release().perform();
		    
		 
		    
		   
		
		/*
		 * driver.findElement(By.
		 * xpath("//button[@class='o-bXKmQE o-fuiuOo o-OisZk o-bJruGr o-foCBAZ o-cjsCNH o-cRSqer m0JNTw o-frwuxB']"
		 * )).getAttribute("style");
		 * 
		 * 
		 * driver.findElement(By.xpath(null))
		 */
		//Click Search
		driver.findElement(By.xpath("//button[text()='Search']"));

	}

}
