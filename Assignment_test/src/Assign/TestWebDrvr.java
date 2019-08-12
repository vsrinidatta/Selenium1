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
		driver.findElement(By.xpath("//a[contains(text(),'getAddressKey(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int')]")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'getAddressKeyWithStzd(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,boolean)')]")).click();
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
		driver.findElement(By.name("isStandardized121")).sendKeys("false");
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
		driver.findElement(By.xpath("//a[contains(text(),'getAddressKeyWithCtry(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String')]")).click();
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
				"//a[contains(text(),' getCustomVenueGroupKey(int,java.lang.String,int')]"))
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
				"//a[contains(text(),' getItemKeywithCUT(short,int,int,short,java.lang.String,int,short,java.lang.String)')]"))
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
		driver.findElement(By.name("altDimKey348")).sendKeys("0");
		driver.findElement(By.name("slinNum350")).sendKeys("0");
		driver.findElement(By.name("ctryCode352")).sendKeys("0");
		driver.findElement(By.name("sourceId354")).sendKeys("0");
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
				"//a[contains(text(),' getBasketAttrKey(long,long,long,long,long)')]"))
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
				"//a[contains(text(),' getAVPKeyWithDim(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
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
				"//a[contains(text(),' getAVPKeyWithAttrValue(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName465")).sendKeys("VOLUME EQUIVALENCY VALUE");
		driver.findElement(By.name("attrValue467")).sendKeys("32");
		driver.findElement(By.name("smAttrValue469")).sendKeys("32");
		driver.findElement(By.name("mdAttrValue471")).sendKeys("32");
		driver.findElement(By.name("lgAttrValue473")).sendKeys("32");
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

	@Test(enabled = false)
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
	@Test(enabled = false)
	public void test29() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' getFolderKey(java.lang.String,int,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("folderName493")).sendKeys("Milk - FOLDER1");
		driver.findElement(By.name("clientId495")).sendKeys("5099");
		driver.findElement(By.name("countryCode497")).sendKeys("US");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test30() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' getVersionKey(java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("versionCode502")).sendKeys("FR01");
		driver.findElement(By.name("countryCd504")).sendKeys("FR");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test31() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getCountryKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("countryCodeTx509")).sendKeys("DE");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test32() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getOutletKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("outletTypeCd514")).sendKeys("CONV");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test33() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getOutletKeyWithCtry(java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("outletTypeCd519")).sendKeys("HDFR");
		driver.findElement(By.name("ctryCode521")).sendKeys("FR");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test34() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getSubOutletKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("subOutletTypeCode526")).sendKeys("SHR");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test35() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getMethodKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("projectionMethodCd531")).sendKeys("PLAT");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test36() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getProjectSetKey(int,int,int,int,int,int,int,int)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientID536")).sendKeys("0");
		driver.findElement(By.name("versionKey538")).sendKeys("6");
		driver.findElement(By.name("countryKey540")).sendKeys("1");
		driver.findElement(By.name("methodKey542")).sendKeys("1");
		driver.findElement(By.name("serviceKey544")).sendKeys("0");
		driver.findElement(By.name("outletKey546")).sendKeys("80");
		driver.findElement(By.name("subOutletKey548")).sendKeys("1");
		driver.findElement(By.name("categoryKey550")).sendKeys("9077092");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test37() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getPtotDualKey(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("dualKeyDesc555")).sendKeys("CLOROX|106086320|204216977|204211585|204273526|204363128");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test38() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getModelKey(java.lang.String,java.lang.Integer)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("modelNameTx565")).sendKeys("TILLAMOOK_MARKET_ADVANTAGE");
		driver.findElement(By.name("solutionKey567")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test39() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getDeliveryKey(java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("deliveryNameTx572")).sendKeys("619_1_20_0_53_3");
		driver.findElement(By.name("clientKey574")).sendKeys("619");
		driver.findElement(By.name("solutionKey576")).sendKeys("1");
		driver.findElement(By.name("verionCd578")).sendKeys("20_0");
		driver.findElement(By.name("modelKey580")).sendKeys("53");
		driver.findElement(By.name("phaseNumber582")).sendKeys("3");
		driver.findElement(By.name("ccrText584")).sendKeys("2722");
		driver.findElement(By.name("workOrderId586")).sendKeys("2710");
		driver.findElement(By.name("workOrderName588")).sendKeys("FERRERO_MARKET_ADVANTAGE_60_18_20_0_PHASE_03");
		driver.findElement(By.name("deliveryDate590")).sendKeys("07/03/2016");
		driver.findElement(By.name("remark592")).sendKeys("OMS Work-Order for CCRs: 2722[ChangeList: Measures:No,Time:No,ProjectedVenueGroups:No,CustomVenueGroups:No,RetailerBanner-Hierarchies:No,RetailerBanner-MemberSelections:No,StoreClusters:No,SyndicatedProducts:No,ProductHierarchy-Definition:No,ProductHierarchy-LevelGroups:No,ProductTotals:No,CustomProductAttribute-Definition:Yes,CustomProductAttribute-DimensionHierarchies:No,CustomProductAttribute-StubList:No,CustomSortDefinition:No,CustomVolumeEquivalency:No,UserGroupRestr-ConfiguredLDAPGroups:No,UserGroupRestr-RestrictionPatterns:No,UserGroupRestr-DimensionRestrictions:No]");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test40() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' getItemAttribute(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrName597")).sendKeys("BRAND");
		driver.findElement(By.name("countryCode599")).sendKeys("US");
		driver.findElement(By.name("AttributeNameUS601")).sendKeys("BRAND");
		driver.findElement(By.name("userName603")).sendKeys("MDMADMIN");
		driver.findElement(By.name("keyedFacetValue605")).sendKeys("Y");
		driver.findElement(By.name("dataTypeFacetValue607")).sendKeys("TEXT");
		driver.findElement(By.name("uomFacetValue609")).sendKeys("N");
		driver.findElement(By.name("serviceType611")).sendKeys("R");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
	
}
	@Test(enabled = false)
	public void test41() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getJobStatus(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("jobLogId662")).sendKeys("2530963");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test42() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'lockItemAttributeDefinition(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrDefId678")).sendKeys("32148");
		driver.findElement(By.name("sourceName680")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName682")).sendKeys("ISVDS");
		driver.findElement(By.name("actionType684")).sendKeys("LOCK");
		driver.findElement(By.name("serviceType686")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
	
}
	@Test(enabled = false)
	public void test43() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' lockItemAttributeDefinition(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrDefId678")).sendKeys("32148");
		driver.findElement(By.name("sourceName680")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName682")).sendKeys("ISVDS");
		driver.findElement(By.name("actionType684")).sendKeys("RELS");
		driver.findElement(By.name("serviceType686")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test44() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'lockItemAttributeDefinition(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attrDefId678")).sendKeys("32148");
		driver.findElement(By.name("sourceName680")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName682")).sendKeys("ISVDS");
		driver.findElement(By.name("actionType684")).sendKeys("RELS");
		driver.findElement(By.name("serviceType686")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test45() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' lockItemAttributeGroupForAIMS(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attributeGroupId701")).sendKeys("718320");
		driver.findElement(By.name("sourceName702")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName703")).sendKeys("ISVDS");
		driver.findElement(By.name("queueType706")).sendKeys("NIU");
		driver.findElement(By.name("actionType704")).sendKeys("LOCK");
		driver.findElement(By.name("serviceType705")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test46() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' lockItemAttributeGroupForAIMS(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attributeGroupId701")).sendKeys("718320");
		driver.findElement(By.name("sourceName702")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName703")).sendKeys("ISVDS");
		driver.findElement(By.name("queueType706")).sendKeys("NIU");
		driver.findElement(By.name("actionType704")).sendKeys("RELS");
		driver.findElement(By.name("serviceType705")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test47() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'lockItemAttributeGroupForAIMS(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attributeGroupId701")).sendKeys("124621");
		driver.findElement(By.name("sourceName702")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName703")).sendKeys("ISVDS");
		driver.findElement(By.name("queueType706")).sendKeys("EIU");
		driver.findElement(By.name("actionType704")).sendKeys("LOCK");
		driver.findElement(By.name("serviceType705")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test48() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'lockItemAttributeGroupForAIMS(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("attributeGroupId701")).sendKeys("124621");
		driver.findElement(By.name("sourceName702")).sendKeys("CUSTOM ATTRIBUTE");
		driver.findElement(By.name("userName703")).sendKeys("ISVDS");
		driver.findElement(By.name("queueType706")).sendKeys("EIU");
		driver.findElement(By.name("actionType704")).sendKeys("RELS");
		driver.findElement(By.name("serviceType705")).sendKeys("W");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test49() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAttributeNames(java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId676")).sendKeys("65");
		driver.findElement(By.name("countryCd677")).sendKeys("1");
		driver.findElement(By.name("dimId678")).sendKeys("5");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test50() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getClientAttributeValues(java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId687")).sendKeys("3");
		driver.findElement(By.name("attributeId689")).sendKeys("308");
		driver.findElement(By.name("countryId690")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}

	@Test(enabled = false)
	public void test51() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getAttributeColumKey(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId705")).sendKeys("25");
		driver.findElement(By.name("sourceId706")).sendKeys("9");
		driver.findElement(By.name("hierarchyId707")).sendKeys("0");
		driver.findElement(By.name("attributeId708")).sendKeys("358");
		driver.findElement(By.name("serviceType709")).sendKeys("R");
		driver.findElement(By.name("dimId710")).sendKeys("5");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test52() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),'getClientVGHFSuperFolder(java.lang.String,java.lang.String,java.lang.String, java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("clientId778")).sendKeys("65");
		driver.findElement(By.name("countryId779")).sendKeys("1");
		driver.findElement(By.name("version780")).sendKeys("20.0");
		driver.findElement(By.name("model780")).sendKeys("POS");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
	@Test(enabled = false)
	public void test53() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.106.40.23:9000/MDMKeyService/jsp/client/TestClient.jsp");
		String pattern = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("methods")));
		driver.findElement(By.xpath(
				"//a[contains(text(),' getVGMasterfileNames(java.lang.String)')]"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("inputs")));
		driver.findElement(By.name("countryId780")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Invoke']")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy the  screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("D:\\Selenium\\screenshot1["+simpleDateFormat.format(new Date())+"].jpg"));
		Thread.sleep(1000);

		//driver.quit();
}
}