package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	@BeforeTest
	public void setupSuite() {
		System.out.println("Setting up the suite for all test cases below before they stat running.");
	}
	
	@BeforeMethod
	public void generateUserID() {
		System.out.println("Current test setup: clearing all.");
	}
	
	@Test
	public void openBrowser() {
		System.out.println("opening a browser");
	}

	@Test
	public void bookFlight() {
		System.out.println("booking a flight");
	}
	
	@Test
	public void closeBrowser() {
		System.out.println("closing the browser");
	}

	@AfterMethod
	public void clearTest() {
		System.out.println("Deleting cookies after test.");
	}
	
	@AfterTest
	public void teardownSuite() {
		System.out.println("Tearing down the suite after all test cases above have finished running.");
	}
}
