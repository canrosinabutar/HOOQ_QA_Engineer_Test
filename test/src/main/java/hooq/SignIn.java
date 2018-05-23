package hooq;

import basepage.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn extends BasePage {
	public SignIn(WebDriver webDriver) {
		super(webDriver);
	}

	//@Step("Input email: {email}")
	public void inputEmail(String email) {
		WebElement webElement = webDriver.findElement(By.id("email"));
		webElement.clear();
		webElement.sendKeys(email);
	}

	//@Step("Input password: {password}")
	public void inputPassword(String password) {
		WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		webElement.clear();
		webElement.sendKeys(password);
	}

	//@Step("Click Log In")
	public void clickLogIn() {
		webDriver.findElement(By.id("SubmitLogin")).click();
	}

	public void getTestLogin(){
		webDriver.findElement(By.cssSelector(".account")).getText();
	}
}
