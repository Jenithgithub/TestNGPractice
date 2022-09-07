package TestNGpractice;

import org.testng.annotations.Test;

public class Skiptestcase {

	@Test(priority = 0)
	public void Drivemotocycle() {
		System.out.print("Going to drive motorcycle");
	}
	
	@Test(priority = 1)
	public void Sitonbike() {
		System.out.print("First sit on a motorcycle");
	}
	
	@Test(priority = 2,enabled = false)
	public void takesidestand() {
		System.out.print("Second take the side stand");
	}
	
	@Test(priority = 3)
	public void ignitionon() {
		System.out.print("Turn on ignition");
	}
	
	@Test(priority = 4)
	public void ensureneutral() {
		System.out.print("Ensure motocycle is in neutral");
	}
	
    @Test(priority = 5)
	public void clutch() {
		System.out.print("Engage the clutch and put first gear");
	}
	
	@Test(priority = 6,enabled = false)
	public void move() {
		System.out.print("Slowly release the clutch and move the motorcycle");
	}

}