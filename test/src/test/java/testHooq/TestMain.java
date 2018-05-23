package testHooq;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class TestMain {
	static WebDriver webDriver;
	@BeforeSuite
	public void setConfig() throws InterruptedException {
		FirefoxOptions options = new FirefoxOptions()
				.addPreference("browser.startup.page", 1)
				.addPreference("browser.startup.homepage", "http://automationpractice.com/index.php");
		options.setAcceptInsecureCerts(Boolean.TRUE);
		//options.setHeadless(Boolean.TRUE);
		 webDriver = new FirefoxDriver(options);
		 webDriver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		webDriver.manage().window().setSize(new Dimension(800, 1092));

		Thread.sleep(10000);
	}


	@AfterSuite
	public void tearDown() {
		webDriver.close();
	}

	public static String getEpoch() {
		return Long.toString(Instant.now().getEpochSecond());
	}

	public static char rndChar () {
		int rnd = (int) (Math.random() * 52); // or use Random or whatever
		char base = (rnd < 26) ? 'A' : 'a';
		return (char) (base + rnd % 26);

	}

}
