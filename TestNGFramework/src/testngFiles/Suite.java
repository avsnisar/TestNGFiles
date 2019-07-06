package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suite {
	
	@BeforeSuite
	public void setupWholeSuite() {
		System.out.println("Run before all test cases in the package or project, even from multiple different files.");
	}

	@AfterSuite
	public void teardownWholeSuite() {
		System.out.println("Run after all test cases in all files.");
	}
}
