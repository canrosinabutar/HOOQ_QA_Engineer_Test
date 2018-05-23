package testHooq;

import hooq.SignIn;
import hooq.SignUp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSignUp extends TestMain {

	private Random random = new Random();
	private String email, password, firstname, lastname;

	@Test(priority = 1)
	public void testingSignUp() throws InterruptedException {
		email = "qatester" + getEpoch().substring(6, 10) + "@mailnesia.com";
		password = "Pargabus#888"+getEpoch();
		firstname = "Denniyaa" + rndChar();
		lastname = "Sianak" + rndChar();
		SignUp signUp = new SignUp(webDriver);
		Thread.sleep(3000);
		signUp.selectSignIn();
		Thread.sleep(3000);
		signUp.inputEmailCreate(email);
		Thread.sleep(3000);
		signUp.clickSubmit();
		Thread.sleep(3000);
		signUp.inputCustomerFirstName(firstname);
		Thread.sleep(3000);
		signUp.selectGenderM();
		Thread.sleep(3000);
		signUp.inputCustomerLastname(lastname);
		Thread.sleep(3000);
		signUp.inputPasswords(password);
		signUp.selectGenderF();
		Thread.sleep(2000);
		signUp.SelectDate();
		Thread.sleep(3500);
		signUp.SelectMonths();
		Thread.sleep(3000);
		signUp.SelectYear();
		Thread.sleep(3000);
		signUp.checkNewsletter();
		Thread.sleep(3000);
		signUp.checkOffers();
		signUp.inputCompany("PT.Jarumasuwara");
		signUp.inputAddress("Jalan Danau Mentawai Barat 10");
		signUp.inputAddress2("Jalan Jalanan ke 2");
		signUp.inputCity("Jakarta Selatan");
		signUp.inputState("Indonesia");
		signUp.inputPostcode("53682");
		//signUp.selectIDCountry();
		signUp.inputOther("Additional Data New Account");
		signUp.inputPhone("02008374838484");
		signUp.inputPhone_mobile("08001234598765");
		signUp.inputAlias("Alamat Aliasnya This is it");
		signUp.selectSubmitAccount();
		signUp.takeScreenshot();
		Thread.sleep(3000);
		signUp.selectSignOut();
		signUp.takeScreenshot();
	}
	@Test(priority = 2)
	public void TestSignIn() throws InterruptedException {
		SignIn signIn = new SignIn(webDriver);
		Thread.sleep(3000);
		signIn.inputEmail(email);
		signIn.inputPassword(password);
		signIn.takeScreenshot();
		signIn.clickLogIn();
		signIn.takeScreenshot();
		Assert.assertEquals(webDriver.findElement(By.cssSelector(".account")).getText(), firstname+" "+lastname);
		System.out.println(webDriver.findElement(By.cssSelector(".info-account")).getText());
	}
}