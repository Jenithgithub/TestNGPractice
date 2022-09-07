package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsuitepractice {
	
	@Test
	public void opengoogle() {
		long starttime=System.currentTimeMillis();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		long endtime= System.currentTimeMillis();
		
		long totaltime=endtime-starttime;
		System.out.print("Total time taken"+totaltime);
	}
	
	@Test
	public void openyoutube() {
		long starttime=System.currentTimeMillis();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();
		long endtime= System.currentTimeMillis();
		
		long totaltime=endtime-starttime;
		System.out.print("Total time taken"+totaltime);
	}
	
	@Test
	public void openbing() {
		long starttime=System.currentTimeMillis();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endtime= System.currentTimeMillis();
		
		long totaltime=endtime-starttime;
		System.out.print("Total time taken"+totaltime);
	}
	

}
