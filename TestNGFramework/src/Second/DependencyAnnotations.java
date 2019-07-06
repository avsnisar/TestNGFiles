package Second;

import org.testng.annotations.Test;

public class DependencyAnnotations {

	@Test
	public void openBrowser() {
		System.out.println("opening a browser");
	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void bookFlight() {
		System.out.println("booking a flight");
	}

	@Test(enabled = false)
	public void removeFlight() {
		System.out.println("Removing booked flight");
	}

	@Test(timeOut = 5000, dependsOnMethods = {"bookFlight"})
	public void changeFlight() {
		System.out.println("Changing booked flight");
	}

	@Test(dependsOnMethods = { "openBrowser", "bookFlight" }, alwaysRun = true)
	public void closeBrowser() {
		System.out.println("closing the browser");
	}

}
