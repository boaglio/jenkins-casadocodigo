package com.boaglio.minhasmoedas.teste.core;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {

	private static final String PARAMETRO_WEB_BROWSER = "webBrowser";

	private static final String INTERNET_EXPLORER = "ie";

	private static boolean isInternetExplorer;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String webBrowser = System.getProperty(PARAMETRO_WEB_BROWSER);

		if (webBrowser==null) {
			webBrowser="N/A";
		}
		System.out.println("web browser especificado : " + webBrowser);

		if (webBrowser != null
				&& webBrowser.equalsIgnoreCase(INTERNET_EXPLORER)) {
			isInternetExplorer = true;
		} else {
			isInternetExplorer = false;
		}
	}

	protected WebDriver getDriver() {
		if (isInternetExplorer)
			return new InternetExplorerDriver();
		else
			return new FirefoxDriver();
	}

}
