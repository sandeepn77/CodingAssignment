package Codingassign;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment {


	@Test
	public void test() {

		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.imdb.com/title/tt9389998/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6200)","");


		String Releasedate=driver.findElement(By.xpath("//*[text()='December 17, 2021 (United States)']")).getText();
		System.out.println(Releasedate);

		String Countryoforigin=driver.findElement(By.xpath("//*[text()='India']")).getText();
		System.out.println(Countryoforigin);
	}


}

