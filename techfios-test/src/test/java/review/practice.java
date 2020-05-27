package review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	@Test


		public void variousLocatorsAndElements() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://objectspy.space/");
		Thread.sleep(3000);
		//Clear the search field
		 driver.findElement(By.className("search")).clear();
		 Thread.sleep(3000);
	 
		// //Type techfios into search field
		 driver.findElement(By.className("search")).sendKeys("Techfios");
		 Thread.sleep(3000);
		
		// //Examples of cssSelector
		driver.findElement(By.cssSelector("input[title='Search']")).click();
		//Click on a linked Text (Display in different different color)
		//Will always have a tagname "a" and url
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Link Test : New Page")).click();
		//Partial Link Text
		 driver.findElement(By.partialLinkText("OS-API")).click();
		//Absolute xpath example
		// driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[4]/a")).click();
		//Relative xpath example for radio button Male
		// driver.findElement(By.xpath("//input[@value='Male']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@value='Female']")).click();
		
	
	
}
}
