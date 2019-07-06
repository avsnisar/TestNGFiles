package testngFiles;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnotations extends TestBase {
	
	public DependencyAnnotations da = new DependencyAnnotations();

	@Test
	public void openingBrowser() throws IOException {
		System.out.println("opening a browser");
	}

	@Test(dependsOnMethods = { "openingBrowser" })
	public void bookingFlight() {
		System.out.println("booking a flight");
	}

	@Test(enabled = false)
	public void removingFlight() {
		System.out.println("Removing booked flight");
	}

	@Test(timeOut = 5000, dependsOnMethods = {"bookingFlight"})
	public void changingFlight() {
		System.out.println("Changing booked flight");
	}

	@Test(dependsOnMethods = { "openingBrowser", "bookingFlight" }, alwaysRun = true)
	public void closingBrowser() {
		System.out.println("closing the browser");
	}

}
