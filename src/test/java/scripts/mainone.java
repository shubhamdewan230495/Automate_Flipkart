package scripts;

import org.testng.annotations.Test;

import Base.LaunchBrowser;
import features.LoginFeatures;

public class mainone extends LaunchBrowser{
	
		@Test
		public void invalidlogin()
		{
			LoginFeatures ll=new LoginFeatures();
			ll.login(driver, "", "");
		}
		
		@Test
		public void validLogin()
		{
			LoginFeatures ll=new LoginFeatures();
			ll.login(driver, "", "");
			
		}

}
