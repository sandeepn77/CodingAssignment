package Codingassign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment1 {


	@Test
	public void test() {

		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,480)","");

		String Releasedate=driver.findElement(By.xpath("//*[text()='17 December 2021']")).getText();
		System.out.println(Releasedate);

		String Countryoforigin=driver.findElement(By.xpath("//*[text()='India']")).getText();
		System.out.println(Countryoforigin);
	}
}
