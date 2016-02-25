package com.boaglio.minhasmoedas.teste.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.boaglio.minhasmoedas.teste.core.SeleniumTest;
import com.boaglio.minhasmoedas.teste.core.SeleniumUtils;
import com.boaglio.minhasmoedas.teste.core.Site;

public class LoginBoaglioHomeIT  extends SeleniumTest  {

	@Test
	public void testaTitle() {

		WebDriver driver = getDriver();
		driver.get(Site.host.value()+Site.login.value());

		Assert.assertTrue(driver.getPageSource().contains(
				Site.homeTitle.value()));

	    driver.findElement(By.id("username")).sendKeys(Site.user.value());
		driver.findElement(By.id("password")).sendKeys(Site.password.value());
		driver.findElement(By.className("btn")).submit();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Assert.assertTrue(driver.getPageSource().contains(
				Site.loginWelcome .value()));

		SeleniumUtils.tiraScreenshot(this.getClass().getSimpleName(), driver);

		driver.quit();
	}
}