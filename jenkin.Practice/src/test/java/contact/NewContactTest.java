package contact;

import org.testng.annotations.Test;

public class NewContactTest {
	@Test(groups = "SmokeTest")
	public void CreateContactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("Execute CreateContactTest ");
	}
	@Test(groups = "RegressionTest")
	public void modifyContactTest() {
		System.out.println("Execute the modifyContactTest ");
	}

}
