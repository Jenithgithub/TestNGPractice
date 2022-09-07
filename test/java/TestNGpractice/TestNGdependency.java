package TestNGpractice;

import org.testng.annotations.Test;

public class TestNGdependency {

	@Test(enabled = true)
	public void Creategoogleaccount() {
		System.out.print("Create a google Account");
	}
	
	@Test(dependsOnMethods = "Creategoogleaccount" )
	public void firstgmail() {
		System.out.print("First go to gmail");
	}
	
	@Test(dependsOnMethods = "firstgmail" )
	public void userdetails() {
		System.out.print("Give valid user details to create account");
	}
	
	@Test(dependsOnMethods = "userdetails")
	public void inbox() {
		System.out.print("After creating account, check your inbox");
	}

}
