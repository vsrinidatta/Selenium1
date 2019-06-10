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
 * @author vsriniva  test1234
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
	
	@Test(enabled = false)
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
				"//a[contains(text(),'getCustomVGKeyWithDispNm(int,java.lang.String,int,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("customerId264")).sendKeys("0");
		driver.findElement(By.name("vgDescription266")).sendKeys("LOS ANGELES - VONS(C)");
		driver.findElement(By.name("sourceId268")).sendKeys("2");
		driver.findElement(By.name("ctryCode270")).sendKeys("US");
		driver.findElement(By.name("vgDisplayNm272")).sendKeys("LOS ANGELES - VONS(C)");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	
	@Test(enabled = false)
	public void test18() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKey(java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName277")).sendKeys("BRAND");
		driver.findElement(By.name("attrValue279")).sendKeys("PEPSICO");
		driver.findElement(By.name("serviceType281")).sendKeys("R");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	
	@Test(enabled = false)
	public void test19() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKeyWithUomNumTx(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName286")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue288")).sendKeys("10 OZ");
		driver.findElement(By.name("numericTxt290")).sendKeys("10");
		driver.findElement(By.name("uom292")).sendKeys("OZ");
		driver.findElement(By.name("serviceType294")).sendKeys("R");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test20() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKeyWithUomNumTxLocale(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName299")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue301")).sendKeys("5 OZ");
		driver.findElement(By.name("numericTxt303")).sendKeys("5");
		driver.findElement(By.name("uom305")).sendKeys("OZ");
		driver.findElement(By.name("serviceType307")).sendKeys("R");
		driver.findElement(By.name("localeId309")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test21() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getItemKey(short,int,int,short,java.lang.String,int)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("system314")).sendKeys("80");
		driver.findElement(By.name("vendor316")).sendKeys("11688");
		driver.findElement(By.name("item318")).sendKeys("28733");
		driver.findElement(By.name("generation320")).sendKeys("1");
		driver.findElement(By.name("ctryCode322")).sendKeys("IT");
		driver.findElement(By.name("sourceId324")).sendKeys("7");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test22() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getItemKeywithCUT(short,int,int,short,java.lang.String,int,short,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("system329")).sendKeys("0");
		driver.findElement(By.name("vendor331")).sendKeys("0");
		driver.findElement(By.name("item333")).sendKeys("0");
		driver.findElement(By.name("generation335")).sendKeys("0");
		driver.findElement(By.name("ctryCode337")).sendKeys("US");
		driver.findElement(By.name("sourceId339")).sendKeys("22");
		driver.findElement(By.name("clientId341")).sendKeys("7145");
		driver.findElement(By.name("altKeyTx343")).sendKeys("WYF078277466499");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test23() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getItemKeywithSLIN(long,java.lang.String,java.lang.String,int)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("system329")).sendKeys("0");
		driver.findElement(By.name("vendor331")).sendKeys("0");
		driver.findElement(By.name("item333")).sendKeys("0");
		driver.findElement(By.name("generation335")).sendKeys("0");
		driver.findElement(By.name("ctryCode337")).sendKeys("US");
		driver.findElement(By.name("sourceId339")).sendKeys("22");
		driver.findElement(By.name("clientId341")).sendKeys("7145");
		driver.findElement(By.name("altKeyTx343")).sendKeys("WYF078277466499~STAPLES~011");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test24() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getBasketAttrKey(long,long,long,long,long)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("tripTypeKey370")).sendKeys("10970431");
		driver.findElement(By.name("tripMissionKey372")).sendKeys("10970288");
		driver.findElement(By.name("hourKey374")).sendKeys("10989235");
		driver.findElement(By.name("grossValueSegmentKey376")).sendKeys("15819803");
		driver.findElement(By.name("netValueSegmentKey378")).sendKeys("15826434");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test25() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKeyWithDim(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName433")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue435")).sendKeys("10.012345");
		driver.findElement(By.name("serviceType437")).sendKeys("RW");
		driver.findElement(By.name("dimension439")).sendKeys("ITEM");
		driver.findElement(By.name("attrValueType441")).sendKeys("NUMERIC");
		driver.findElement(By.name("uom443")).sendKeys("OZ");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	@Test(enabled = false)
	public void test26() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKeyWithLocale(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName448")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue450")).sendKeys("100.023");
		driver.findElement(By.name("serviceType452")).sendKeys("RW");
		driver.findElement(By.name("dimension454")).sendKeys("ITEM");
		driver.findElement(By.name("attrValueType456")).sendKeys("NUMERIC");
		driver.findElement(By.name("uom458")).sendKeys("OZ");
		driver.findElement(By.name("localeId460")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	
	@Test(enabled = false)
	public void test27() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAVPKeyWithAttrValue(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName465")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue467")).sendKeys("99");
		driver.findElement(By.name("smAttrValue469")).sendKeys("99");
		driver.findElement(By.name("mdAttrValue471")).sendKeys("99");
		driver.findElement(By.name("lgAttrValue473")).sendKeys("99");
		driver.findElement(By.name("attrValueType475")).sendKeys("NUMERIC");
		driver.findElement(By.name("uom477")).sendKeys("ML");
		driver.findElement(By.name("dimension479")).sendKeys("ITEM");
		driver.findElement(By.name("countryCd481")).sendKeys("US");
		driver.findElement(By.name("serviceType483")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}

	@Test(enabled = true)
	public void test28() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getVenueDualKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("venueDualDescription488")).sendKeys("4|80113|20275|80113|10|VGHF");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	
}
