package dataDriven;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngFiles.TestBase;

public class DDT extends TestBase {
	@Test(dataProvider = "getData")
	public void fedByDataProviderAnnotatedMethod(String username, String password, Integer id) throws IOException {
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		UsingProperties up = new UsingProperties();
		up.testProperties();
	}
	
	@DataProvider
	public Object[][] getData(){
		/*
		 * Object[][] data = new Object[3][3]; data[0][0] = "1st case username";
		 * data[0][1] = "1st case password"; data[0][2] = 1; data[1][0] =
		 * "2nd case username"; data[1][1] = "2nd case password"; data[1][2] = 2;
		 * data[2][0] = "3rd case username"; data[2][1] = "3rd case password";
		 * data[2][2] = 3; return data;
		 */
		
		//as above so below, interchangeable
		
		return new Object[][] {
			{"1st case name", "1st case pass", 1},
			{"2nd case name", "2nd case pass", 2},
			{"3rd case name", "3rd case pass", 3}
		};
		
	}
	

}
