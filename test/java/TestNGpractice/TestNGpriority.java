package TestNGpractice;

import org.testng.annotations.Test;

public class TestNGpriority {

	@Test(priority = 1)
	public void Learnautomation() {
		System.out.print("First Learn Selenium basics");
	}
	
	@Test(priority = 2)
	public void practice() {
		System.out.print("Hands on Practice each day for selenium basics");
	}
	
	@Test(priority = 5)
	public void Learnframework() {
		System.out.print(" Third Learm frame work after learning testNG");
	}
	
	@Test(priority = 6)
	public void TestNGpractice() {
		System.out.print("Hands on practice for framework");
	}
	
	@Test(priority = 3)
	public void Learntestng() {
		System.out.print("Second Learn TestNG after selenium basics");
	}
	
	@Test(priority = 4)
	public void Framework() {
		System.out.print("Hands on practice for testNG");
	}

}
