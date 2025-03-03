package Organisation;

import org.testng.annotations.Test;

public class NewOrganisationTest {
	
	@Test(groups = "SmokeTest")
	public void CreateOrgTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("Execute Create Org");
	}
	@Test(groups = "RegressionTest")
	public void modifyOrgTest() {
		System.out.println("Execute the modifyOrgTest ");
	}

}
