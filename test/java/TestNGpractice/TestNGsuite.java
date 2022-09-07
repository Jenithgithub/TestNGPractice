package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGsuite {
	WebDriver driver;
	long starttime;
    long endtime;
	@BeforeSuite
	public void openbrowser() {
		starttime=System.currentTimeMillis();
        driver= new ChromeDriver();

	}
		
		@Test
		public void opengoogle() {
		driver.get("https://www.youtube.com/");
		}
		
		@Test
		public void openyoutube() {
		driver.get("https://www.bing.com/");
		}
		
		@Test
		public void openbing() {
        driver.get("https://www.google.co.in/");
		}
		
		@AfterSuite
		public void closebrowser() {
	    driver.quit();
        endtime= System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.print("Total time taken"+totaltime);
		}
		

	}
