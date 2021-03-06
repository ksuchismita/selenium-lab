package org.suchismita;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class SampleGoogleTest {

	private WebDriver driver;
	private String baseURL = "http://www.google.co.in";

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp started");
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown started");
		if (driver != null) {
			driver.quit();
		}
	}
	
	@Test
	public void test1(){
		System.out.println("test1 started");
		if(driver != null){
			driver.get("http://www.facebook.com");
			Assert.assertEquals(true, true);
		}
	}
	
	@Test
	public void test2(){
		System.out.println("test2 started");
		if(driver != null){
			driver.get("http://www.yahoo.com");
			Assert.assertEquals(true, true);
		}
	}

	@Test
	public void test() {
		System.out.println("test started");
		if(driver != null){
			driver.get(baseURL);
			WebElement searchField = driver.findElement(By.id("lst-ib"));
			String tagName = searchField.getTagName();
			Assert.assertEquals("input", tagName);
			
			//insert search field and hit search
			searchField.sendKeys("selenium");
			WebElement searchButton = driver.findElement(By.name("btnG"));
			searchButton.click();
			
		}
	}
	
	
	

}
