package test_cases;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataprovider.data;

public class testbase extends data {
	public static WebDriver driver;

	@BeforeClass
	public static void launchbrowser() {
 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace\\sampleframework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

}

	@Before
	public void starttime() {
		Date date = new Date();
		System.out.println(date);

	}

	@After
	public void endtime() {
		Date date = new Date();
		System.out.println(date);

	}

}
