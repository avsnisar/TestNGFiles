package dataDriven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {

	@Parameters({"adminUserId"})
	@Test
	public void gettingAdmin(String adminUserId) {
		System.out.println(adminUserId);
	}
	

}
