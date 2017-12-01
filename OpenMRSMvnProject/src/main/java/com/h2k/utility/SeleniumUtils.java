package com.h2k.utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

 

public class SeleniumUtils {

	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tsh = (TakesScreenshot) driver;//Interface type casting
		File srcFile = tsh.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile.getAbsolutePath());//temp location
		FileUtils.copyFile(srcFile,new File("C:\\SeleniumDocs\\"+Calendar.getInstance().getTimeInMillis() +"OpenMrs.jpg"));
		
	}
}
