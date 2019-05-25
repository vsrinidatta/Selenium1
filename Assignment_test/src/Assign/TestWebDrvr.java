/**
 * 
 */
package Assign;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author vsriniva
 *
 */

public class TestWebDrvr {

	Properties prop = null;
	WebDriver driver = null;
	
	@BeforeTest
	public void initConfig () throws IOException {
		prop = new Properties();
		FileInputStream input = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Assign\\config.properties"));
        prop.load(input);
	}

	@BeforeMethod
	public void initBrowser() {
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverlocation"));
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		if (driver != null)
			Thread.sleep(1000);
			driver.quit();
	}
	
	@Test(enabled = false)
	public void test1() throws InterruptedException, IOException {
		
		// removing hardcoded values
		// create config.properties file
		// add values like URL, browser type, username, password, driverlocation
		// create locator.properties and store element locators in it
		// read values from file
		// pass the values instead of default hardcoded values from the properties files
		
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath("//a[contains(text(),'getVenueDimKey(long,long)')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("iriStoreNo8")).sendKeys("0");
		driver.findElement(By.name("addressId10")).sendKeys("690009");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test(enabled = false)
	public void test2() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath("//a[contains(text(),'getVenueDimKeyWithLSK(long,long,long,int)')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("iriStoreNo15")).sendKeys("0");
		driver.findElement(By.name("legacySqeKey17")).sendKeys("690009");
		driver.findElement(By.name("addressId19")).sendKeys("388761");
		driver.findElement(By.name("sourceId21")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test(enabled = false)
	public void test3() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(
				By.xpath("//a[contains(text(),'getVenueDimKeyWithCtry(long,long,long,int,java.lang.String')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("iriStoreNo26")).sendKeys("0");
		driver.findElement(By.name("legacySqeKey28")).sendKeys("689201");
		driver.findElement(By.name("addressId30")).sendKeys("116541");
		driver.findElement(By.name("sourceId32")).sendKeys("1");
		driver.findElement(By.name("ctryCode34")).sendKeys("US");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		//Thread.sleep(1000);
		//driver.quit();
	}

	@Test(enabled = false)
	public void test4() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getVenueDimKeyWithCUT(long,long,long,java.lang.String,int,int,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("iriStoreNo71")).sendKeys("91891");
		driver.findElement(By.name("legacySqeKey73")).sendKeys("1199482");
		driver.findElement(By.name("addressId75")).sendKeys("519476");
		driver.findElement(By.name("ctryCode77")).sendKeys("US");
		driver.findElement(By.name("sourceId79")).sendKeys("1");
		driver.findElement(By.name("clientId81")).sendKeys("0");
		driver.findElement(By.name("altKeyTx83")).sendKeys("GROCERY~QUALITY FOOD CENTER~883");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test(enabled = false)
	public void test5() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAddressKey(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("legacySeqKey88")).sendKeys("970276");
		driver.findElement(By.name("addressLine190")).sendKeys("101 N CLINTON ST");
		driver.findElement(By.name("city92")).sendKeys("CHICAGO");
		driver.findElement(By.name("state94")).sendKeys("IL");
		driver.findElement(By.name("zipCode96")).sendKeys("60661");
		driver.findElement(By.name("sourceId98")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test(enabled = false)
	public void test6() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAddressKey(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("legacySeqKey88")).sendKeys("970276");
		driver.findElement(By.name("addressLine190")).sendKeys("101 N CLINTON ST");
		driver.findElement(By.name("city92")).sendKeys("CHICAGO");
		driver.findElement(By.name("state94")).sendKeys("IL");
		driver.findElement(By.name("zipCode96")).sendKeys("60661");
		driver.findElement(By.name("sourceId98")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(enabled = false)
	public void test7() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAddressKeyWithStzd(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,boolean')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("legacySeqKey103")).sendKeys("970276");
		driver.findElement(By.name("addressLine1105")).sendKeys("101 N CLINTON ST");
		driver.findElement(By.name("addressLine2107")).sendKeys("test");
		driver.findElement(By.name("city109")).sendKeys("CHICAGO");
		driver.findElement(By.name("state111")).sendKeys("IL");
		driver.findElement(By.name("zipCode113")).sendKeys("60661");
		driver.findElement(By.name("zipPlus4115")).sendKeys("3615");
		driver.findElement(By.name("sourceId117")).sendKeys("1");
		driver.findElement(By.name("ctryCode119")).sendKeys("US");
		driver.findElement(By.name("isStandardized121")).sendKeys("true");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		//Thread.sleep(1000);
		//driver.quit();
}
	@Test(enabled = false)
	public void test8() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAddressKeyWithCtry(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("legacySeqKey126")).sendKeys("970276");
		driver.findElement(By.name("addressLine1128")).sendKeys("101 N CLINTON ST");
		driver.findElement(By.name("city130")).sendKeys("CHICAGO");
		driver.findElement(By.name("state132")).sendKeys("IL");
		driver.findElement(By.name("zipCode134")).sendKeys("60661");
		driver.findElement(By.name("sourceId136")).sendKeys("1");
		driver.findElement(By.name("ctryCode138")).sendKeys("US");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(enabled = false)
	public void test9() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getTimeKey(java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("timeDescription143")).sendKeys("P-444_Current Quad to Date");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
}
	@Test(enabled = false)
	public void test10() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getTimeDualKey(long,int,short')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("timeKey148")).sendKeys("1756");
		driver.findElement(By.name("hierarchyId150")).sendKeys("2");
		driver.findElement(By.name("scheduleId152")).sendKeys("0");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		//Thread.sleep(1000);
		//driver.quit();
}
	@Test(enabled = false)
	public void test11() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getVenueGroupKey(long,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,int')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("geoCode157")).sendKeys("1756");
		driver.findElement(By.name("geoListName159")).sendKeys("2");
		driver.findElement(By.name("projLabel161")).sendKeys("0");
		driver.findElement(By.name("outlet163")).sendKeys("0");
		driver.findElement(By.name("geoLevel165")).sendKeys("0");
		driver.findElement(By.name("posType167")).sendKeys("0");
		driver.findElement(By.name("vgType169")).sendKeys("0");
		driver.findElement(By.name("sourceId171")).sendKeys("0");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
}
	@Test(enabled = false)
	public void test12() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getVGKeyWithCtry(long,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,int,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("geoCode176")).sendKeys("994");
		driver.findElement(By.name("geoListName178")).sendKeys("D105");
		driver.findElement(By.name("projLabel180")).sendKeys("D7RC0001");
		driver.findElement(By.name("outlet182")).sendKeys("DRUG");
		driver.findElement(By.name("geoLevel184")).sendKeys("2");
		driver.findElement(By.name("posType186")).sendKeys("LEGACY");
		driver.findElement(By.name("vgType188")).sendKeys("STD");
		driver.findElement(By.name("sourceId190")).sendKeys("2");
		driver.findElement(By.name("ctryCode192")).sendKeys("US");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(enabled = false)
	public void test13() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getCustomVenueGroupKey(int,java.lang.String,int')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("customerId197")).sendKeys("1");
		driver.findElement(By.name("vgDescription199")).sendKeys("72_CLUB_3_0_US");
		driver.findElement(By.name("sourceId201")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
		}
	
	@Test(enabled = false)
	public void test14() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getCustomVGKeyWithCtry(int,java.lang.String,int,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("customerId206")).sendKeys("0");
		driver.findElement(By.name("vgDescription208")).sendKeys("LOS ANGELES");
		driver.findElement(By.name("sourceId210")).sendKeys("1");
		driver.findElement(By.name("ctryCode212")).sendKeys("US");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(enabled = false)
	public void test15() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getClusterDimKey(int,java.lang.String,int,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("customerId217")).sendKeys("66");
		driver.findElement(By.name("clusterDesc219")).sendKeys("TEST_CLSTR");
		driver.findElement(By.name("sourceId221")).sendKeys("5");
		driver.findElement(By.name("ctryCode223")).sendKeys("FR");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(enabled = true)
	public void test16() throws InterruptedException, IOException {
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getClonedVGKey(int,java.lang.String,int,java.lang.String,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId228")).sendKeys("0");
		driver.findElement(By.name("venueGroupName230")).sendKeys("11_FOOD_5_0_US");
		driver.findElement(By.name("sourceId232")).sendKeys("2");
		driver.findElement(By.name("ctryCode234")).sendKeys("US");
		driver.findElement(By.name("vgDisplayName236")).sendKeys("LOS ANGELES");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("result")));
		
		String key = driver.findElement(By.xpath("//body")).getAttribute("innerText");
		
		Thread.sleep(5000);
		System.out.println("K:"+key);
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);
		//driver.quit();
	
}
	
	@Test(enabled = false)
	public void test17() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getClonedVGKey(int,java.lang.String,int,java.lang.String,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId228")).sendKeys("0");
		driver.findElement(By.name("venueGroupName230")).sendKeys("11_FOOD_5_0_US");
		driver.findElement(By.name("sourceId232")).sendKeys("2");
		driver.findElement(By.name("ctryCode234")).sendKeys("US");
		driver.findElement(By.name("vgDisplayName236")).sendKeys("LOS ANGELES");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
}
