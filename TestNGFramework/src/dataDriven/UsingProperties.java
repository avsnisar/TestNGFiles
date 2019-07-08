package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class UsingProperties {

	WebDriver driver = null;

	@Test
	public void testProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Администратор\\eclipse-workspace\\TestNGFramework\\src\\dataDriven\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("internetexplorer")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));		
		driver.close();
	}

}
