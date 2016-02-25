package com.boaglio.minhasmoedas.teste.core;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_hhmmssaa");

	private static String workingDir = getDir();

	static {
		 workingDir = getDir();
	}

	public static void tiraScreenshot(String fileName, WebDriver driver) {

   	    String destFile = fileName + "_" + dateFormat.format(new Date()) + ".png";

		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File(workingDir + File.separator+ destFile));

			System.out.println("Gravando screenshot em " + workingDir + File.separator+ destFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getDir() {

		String workingDir = System.getProperty("user.dir") + File.separator + "target" +File.separator + "shots" ;

		new File(workingDir).mkdirs();

		System.out.println("Diretorio das imagens: " + workingDir);

		return workingDir;

	}
}
