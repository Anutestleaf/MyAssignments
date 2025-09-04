package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//instantiate the browser driver for Google Chrome
		ChromeDriver driver=new ChromeDriver();
	
		
		//load the URL
		driver.get("https://www.facebook.com/");
		
	     //Enter the Email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	
		
		
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click to login
		//locators cant have numbers or special characterswe can use only with(id/name/classname)
		driver.findElement(By.name("login")).click();
		
		//To enter the forgotten paswd page.
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//Moving to next page in forgotten password
		driver.findElement(By.name("email")).sendKeys("Testleaf@gmail.com");
		
		//takes to another search page
		driver.findElement(By.id("did_submit")).click();
		
		//To get Title
		String title=driver.getTitle();
		System.out.println("The title of the page is: " +title);
		
		//close the current page
		//driver.close();
		
		//To enter into to the next page through an icon
		//driver.findElement(By.partialLinkText("CRM")).click();
		
	
	}

}


