package com.boaglio.minhasmoedas.teste.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.boaglio.minhasmoedas.teste.core.SeleniumTest;
import com.boaglio.minhasmoedas.teste.core.SeleniumUtils;
import com.boaglio.minhasmoedas.teste.core.Site;

public class AcessaHomeIT extends SeleniumTest {

	@Test
	public void testaTitle() {

		WebDriver driver = getDriver();
		driver.get(Site.host.value());

		Assert.assertTrue(driver.getPageSource().contains(
				Site.homeTitle.value()));

		SeleniumUtils.tiraScreenshot(this.getClass().getSimpleName(), driver);

		driver.quit();
	}
}