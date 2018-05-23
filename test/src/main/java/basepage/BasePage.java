package basepage;


import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class BasePage {
	protected WebDriver webDriver;

	public BasePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void takeScreenshot() {
		try (InputStream is = new ByteArrayInputStream(
				((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES))) {
			Allure.addAttachment("Screenshot", is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
