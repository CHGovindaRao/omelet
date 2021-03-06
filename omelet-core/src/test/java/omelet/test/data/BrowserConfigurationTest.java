package omelet.test.data;

import omelet.data.DriverConfigurations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserConfigurationTest {
	static final String REMOEFLAG = "false";
	static final String DRIVERTIMEOUT = "30";
	static final String RETRYFAILEDTESTCASE = "0";
	static final String HIGHLIGHTELEMENTFLAG = "false";
	static final String SCREENSHOTFLAG = "true";

	static final String BSSWITCH = "false";
	static final String BSLOCALTESTING = "false";
	static final String MOBILETEST = "false";
	static final String BSUSERNAME = "";
	static final String BSKEY = "";
	static final String BSURLS = "";
	static final String DEVICE = "";
	static final String BROWSERNAME = "FireFox";
	static final String BROWSERVERSION = "";
	static final String OS = "";
	static final String OSVERSION = "";
	static final String PLATFORM = "";

	static final String BROWSERNAMELOCAL = "FireFox";
	static final String IESERVERPATH = "";
	static final String CHROMESERVERPATH = "";

	static final String REMOTEURL = "localhost";

	@Test
	public void verifyFrameworkConfigDefaults() {
		Assert.assertEquals(DriverConfigurations.FrameworkConfig.remoteflag.get(), REMOEFLAG);
		Assert.assertEquals(DriverConfigurations.FrameworkConfig.drivertimeOut.get(),
				DRIVERTIMEOUT);
		Assert.assertEquals(DriverConfigurations.FrameworkConfig.retryfailedtestcase.get(),
				RETRYFAILEDTESTCASE);
		Assert.assertEquals(DriverConfigurations.FrameworkConfig.highlightelementflag.get(),
				HIGHLIGHTELEMENTFLAG);
		Assert.assertEquals(DriverConfigurations.FrameworkConfig.screenshotflag.get(),
				SCREENSHOTFLAG);
	}
	
	@Test
	public void verifyBrowserStackConfigDefaults() {
	
		Assert.assertEquals(
				DriverConfigurations.CloudConfig.username.get(),
				BSUSERNAME);
		Assert.assertEquals(
				DriverConfigurations.CloudConfig.key.get(), BSKEY);
		Assert.assertEquals(
				DriverConfigurations.LocalEnvironmentConfig.browsername.get(),
				BROWSERNAME);
	}

	@Test
	public void verifyLocalConfigDefaults() {
		Assert.assertEquals(DriverConfigurations.LocalEnvironmentConfig.browsername.get(),
				BROWSERNAMELOCAL);
		Assert.assertEquals(DriverConfigurations.LocalEnvironmentConfig.ieserverpath.get(),
				IESERVERPATH);
		Assert.assertEquals(DriverConfigurations.LocalEnvironmentConfig.chromeserverpath.get(),
				CHROMESERVERPATH);
	}
	
	@Test
	public void verifyHubConfigDefaults() {
		Assert.assertEquals(DriverConfigurations.HubConfig.host.get(),
				REMOTEURL);
	}
}
