package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSampletest
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.orangehrm.com");

		// Perform actions on HTML elements, entering text and submitting the form
		WebElement contactElement = driver.findElement(
		By.cssSelector("#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "));
		contactElement.click();
		WebElement firstElement = driver.findElement(By.name("firstname"));
		WebElement lastElement = driver.findElement(By.name("lastname"));
		WebElement companyElement = driver.findElement(By.name("company"));
		WebElement employeeElement = driver.findElement(By.name("numemployees"));
		WebElement JobTitle = driver.findElement(By.name("jobtitle"));
		WebElement phoneElement = driver.findElement(By.name("phone"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement Country = driver.findElement(By.name("country"));
		firstElement.sendKeys("Anusha");
		lastElement.sendKeys("Chowdary");
		companyElement.sendKeys("atmecs");
		employeeElement.sendKeys("17");
		JobTitle.sendKeys("Software-Trainee");
		phoneElement.sendKeys("03451430");
		email.sendKeys("saianusha.p7@gmail.com");
		Country.sendKeys("India");
	}
}