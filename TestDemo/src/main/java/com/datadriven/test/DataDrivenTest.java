package com.datadriven.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;


public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File Reader New Changes
		Xls_Reader Reader = new Xls_Reader("\\TestDemoAssignment\\TestDemo\\src\\main\\java\\com\\test\\data\\TestDemoAssignment.xlsx");
		
		String Source = Reader.getCellData("DemoAssignment", "Source", 2);
		String Destination = Reader.getCellData("DemoAssignment", "Destination", 2);
		String PassengerName = Reader.getCellData("DemoAssignment", "PassengerName", 2);
		String PassengerAddress = Reader.getCellData("DemoAssignment", "PassengerAddress", 2);
		String City = Reader.getCellData("DemoAssignment", "City", 2);
		String State = Reader.getCellData("DemoAssignment", "State", 2);
		String ZipCode = Reader.getCellData("DemoAssignment", "ZipCode", 2);
		String CardType = Reader.getCellData("DemoAssignment", "CardType", 2);
		String CardNumber = Reader.getCellData("DemoAssignment", "CardNumber", 2);
		String CardExpiryMonth = Reader.getCellData("DemoAssignment", "CardExpiryMonth", 2);
		String CardExpiryYear = Reader.getCellData("DemoAssignment", "CardExpiryYear", 2);
		String NameOncard = Reader.getCellData("DemoAssignment", "NameOncard", 2);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\daggu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		Select Sourceport= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		 Sourceport.selectByVisibleText(Source);
		 
		 Select Destinationport = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		 Destinationport.selectByVisibleText(Destination);
		 
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Choose This Flight']")).click();
		 driver.findElement(By.id("inputName")).clear();
		 driver.findElement(By.id("inputName")).sendKeys(PassengerName);
		 
		 driver.findElement(By.id("address")).clear();
		 driver.findElement(By.id("address")).sendKeys(PassengerAddress);
		 
		 driver.findElement(By.id("city")).clear();
		 driver.findElement(By.id("city")).sendKeys(City);
		 
		 driver.findElement(By.id("state")).clear();
		 driver.findElement(By.id("state")).sendKeys(State);
		 
		 driver.findElement(By.id("zipCode")).clear();
		 driver.findElement(By.id("zipCode")).sendKeys(String.valueOf(ZipCode));
		 Select Type = new Select (driver.findElement(By.xpath("//select[@id='cardType']")));
		 Type.selectByVisibleText(CardType);
		 
		 driver.findElement(By.id("creditCardNumber")).clear();		 
		 driver.findElement(By.id("creditCardNumber")).sendKeys(String.valueOf(CardNumber));
		 
		 driver.findElement(By.id("creditCardMonth")).clear();
		 driver.findElement(By.id("creditCardMonth")).sendKeys(String.valueOf(CardExpiryMonth));
		 
		 driver.findElement(By.id("creditCardYear")).clear();
		 driver.findElement(By.id("creditCardYear")).sendKeys(String.valueOf(CardExpiryYear)); 
		 
		 driver.findElement(By.id("nameOnCard")).clear();
		 driver.findElement(By.id("nameOnCard")).sendKeys(NameOncard);
		 
		 driver.findElement(By.xpath("//label[@class=\"checkbox\"]")).click(); 
		 
		 driver.findElement(By.xpath("//input[@value=\"Purchase Flight\"]")).click();
	
	}

}
