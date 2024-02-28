package com.ext;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsTest {
public static ChromeDriver driver;
public static int i=0;
public static ExtentReports report;
public static ExtentTest test;
/*
@BeforeSuite
public void begin()
{
	ExtentReports report=new ExtentReports(".//reports//RaviReport.html");
	report.addSystemInfo("Environment", "QA");
	report.addSystemInfo("Author", "Ravi");
	test=report.startTest("TO verify orangehrmhome page menus");
}

	@Test
	public void report() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		ReportsTest  rt=new ReportsTest();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		test.log(LogStatus.PASS,"Entered UserName"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		test.log(LogStatus.PASS,"Entered Password"+test.addScreenCapture(snap()));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		test.log(LogStatus.PASS,"Navigated to Home Page"+test.addScreenCapture(snap()));
		
  given()
  .when()
 .get("https://reqres.in/api/users?page=2")
 .then()
 .statusCode(200)
 .log().all();
	}
	
	public String snap() throws IOException {
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File(".//images//pic"+i+".png");
	FileUtils.copyFile(src, dest);
	dummy=dest.getAbsolutePath();
		}
		return dummy;
	}
	
	@AfterSuite
	public void finish()
	{
		report.endTest(test);
		report.flush();
	}
	*/
}
