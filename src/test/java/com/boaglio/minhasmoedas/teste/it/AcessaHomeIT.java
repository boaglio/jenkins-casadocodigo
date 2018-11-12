package com.boaglio.minhasmoedas.teste.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.boaglio.minhasmoedas.teste.core.AbstractSelenium;
import com.boaglio.minhasmoedas.teste.core.SeleniumUtils;
import com.boaglio.minhasmoedas.teste.core.Site;

public class AcessaHomeIT extends AbstractSelenium {

	@Test
	public void testaTitle() {

		WebDriver driver = getDriver();

		System.out.println("Testando "+SeleniumUtils.site);
		driver.get(SeleniumUtils.site);

		Assert.assertTrue(driver.getPageSource().contains(Site.homeTitle.value()));

		System.out.println("Tirando screenshot...");
		SeleniumUtils.tiraScreenshot(this.getClass().getSimpleName(), driver);

		driver.quit();
	}
}