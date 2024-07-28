package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 
	 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	 search.sendKeys("iPhone");
	 
	 WebElement sikon = driver.findElement(By.id("nav-search-submit-button"));
	 sikon.click();
	 
	// driver.close();
	 

}
}
