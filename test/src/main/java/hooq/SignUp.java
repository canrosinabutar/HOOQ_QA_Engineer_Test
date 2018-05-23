package hooq;

import basepage.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BasePage {
	public SignUp(WebDriver webDriver) {
		super(webDriver);
	}

	@Step("Sign Up by Select Sign In Button")
	public void selectSignIn() {
		WebElement webElement = webDriver.findElement(By.cssSelector(".login"));
		webElement.getText();
		webElement.click();
	}
	public void selectSignOut() {
		WebElement webElement = webDriver.findElement(By.cssSelector(".logout"));
		webElement.getText();
		webElement.click();
	}


	@Step("Input email create: {email}")
	public void inputEmailCreate(String email) {
		WebElement webElement = webDriver.findElement(By.id("email_create"));
		webElement.clear();
		webElement.sendKeys(email);
	}

	//@Step("Click Submit")
	public void clickSubmit() {
		webDriver.findElement(By.id("SubmitCreate")).click();
	}

	//	@Step("Select Gender")
	public void selectGenderM() {
		webDriver.findElement(By.cssSelector(".page-subheading")).getText();
		webDriver.findElement(By.id("id_gender1")).click();
		//System.out.println(webDriver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).toString());
	}

	//	@Step("Select Gender")
	public void selectGenderF() {
		webDriver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	}

	//	@Step("Input First Name : {firstName}")
	public void inputCustomerFirstName(String firstName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		webElement.clear();
		webElement.sendKeys(firstName);
	}

	//	@Step("Input First Name : {customerLastname}")
	public void inputCustomerLastname(String customerLastname) {
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		webElement.clear();
		webElement.sendKeys(customerLastname);
	}

	//	@Step("Input First Name : {password}")
	public void inputPasswords(String password) {
		WebElement webElement = webDriver.findElement(By.id("passwd"));
		webElement.clear();
		webElement.sendKeys(password);
	}

	//	@Step("Input Select Date")
	public void SelectDate() {
		Select dropdownDay = new Select(webDriver.findElement(By.id("days")));
		dropdownDay.selectByValue("12");
	}

	public void SelectMonths() {
		Select dropdownMonth = new Select(webDriver.findElement(By.xpath("//*[@id=\"months\"]")));
		dropdownMonth.selectByIndex(2);
	}

	public void SelectYear() {
		Select dropdownYear = new Select(webDriver.findElement(By.id("years")));
		dropdownYear.selectByValue("2000");
	}

	public void checkNewsletter() {
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		webElement.click();
	}

	public void checkOffers() {
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"optin\"]"));
		webElement.click();
	}

	public void inputCompany(String Company) {
		WebElement webElement = webDriver.findElement(By.id("company"));
		webElement.clear();
		webElement.sendKeys(Company);
	}

	public void inputAddress(String Address) {
		WebElement webElement = webDriver.findElement(By.id("address1"));
		webElement.clear();
		webElement.sendKeys(Address);
	}

	public void inputAddress2(String Address2) {
		WebElement webElement = webDriver.findElement(By.id("address2"));
		webElement.clear();
		webElement.sendKeys(Address2);
	}

	public void inputCity(String City) {
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"city\"]"));
		webElement.clear();
		webElement.sendKeys(City);
	}

	public void inputState(String State) {
		Select dropdownState = new Select(webDriver.findElement(By.id("id_state")));
		dropdownState.selectByIndex(4);
	}

	public void inputPostcode(String postcode) {
		WebElement webElement = webDriver.findElement(By.id("postcode"));
		webElement.clear();
		webElement.sendKeys(postcode);
	}

	public void selectIDCountry() {
		Select dropdownState = new Select(webDriver.findElement(By.id("id_country")));
		dropdownState.selectByIndex(5);
	}

	public void inputOther(String Other) {
		WebElement webElement = webDriver.findElement(By.id("other"));
		webElement.clear();
		webElement.sendKeys(Other);
	}

	public void inputPhone(String phone) {
		WebElement webElement = webDriver.findElement(By.id("phone"));
		webElement.clear();
		webElement.sendKeys(phone);
	}

	public void inputPhone_mobile(String phone_mobile) {
		WebElement webElement = webDriver.findElement(By.id("phone_mobile"));
		webElement.clear();
		webElement.sendKeys(phone_mobile);
	}

	public void inputAlias(String alias) {
		WebElement webElement = webDriver.findElement(By.id("alias"));
		webElement.clear();
		webElement.sendKeys(alias);
	}

	public void selectSubmitAccount(){
		WebElement webElement = webDriver.findElement(By.id("submitAccount"));
		webElement.click();
	}
}
