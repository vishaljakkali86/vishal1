package seleniumCutPiece.extent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide 
{
	@Test(dataProvider="dataVerify")
	public void BeginDataFlow(String username, String passwrd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:81/orangehrm/symfony/web/index.php/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys(passwrd);
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Orange"),"user is invalid");
		driver.quit();
	}
	
	@DataProvider(name="dataVerify")
	
	public Object[][] Dataprovide()
	{
		Object[][] data=new Object[3][2];
		data[0][0]= "admin";
		data[0][1]= "admin";
		data[1][0]= "user";
		data[1][1]= "admin";
		data[2][0]= "admin";
		data[2][1]= "user";
		return data;
		
	}
}
