package testHooq;
import hooq.SignIn;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestMain {
	@Test
	public void verifyLogInValid() throws InterruptedException {
		SignIn signIn = new SignIn(webDriver);
		Thread.sleep(3000);
		//signIn.inputEmail(email);
		//signIn.inputPassword(password);
		signIn.takeScreenshot();
		signIn.clickLogIn();
		signIn.takeScreenshot();
		//Assert.assertEquals(webDriver.findElement(By.cssSelector(".account")).getText(), firstname+" "+lastname);
	}
}


