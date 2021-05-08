package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\ChromeDriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      
	// Launch website  
	    //driver.navigate().to("https://www.google.com/");  
	    driver.get("https://www.thesparksfoundationsingapore.org/");
	    System.out.println(driver.getTitle());
	    //First page
	    driver.findElement(By.xpath("//a[text()='About Us']")).click();
	    driver.findElement(By.xpath("//a[text()='Vision, Mission and Values']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h2")).getText());
	   
	    //Using tagname with anchor
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("The number of links is " + links.size());
	     
	     //Policies
	    
	    driver.findElement(By.xpath("//a[text()='Policies and Code']")).click();
	    driver.findElement(By.xpath("//a[text()='Policies']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h2")).getText());
	   
	    //Programs
	    driver.findElement(By.xpath("//a[text()='Programs']")).click();
	    driver.findElement(By.xpath("//a[text()='Student Scholarship Program']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h2")).getText());
	    
	    //Links
	    driver.findElement(By.xpath("//a[text()='LINKS']")).click();
	    driver.findElement(By.xpath("//a[text()='Software & App']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h2")).getText());
	    
	    //Join us
	    driver.findElement(By.xpath("//a[text()='Join Us']")).click();
	    driver.findElement(By.xpath("//a[text()='Why Join Us']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//*[@id='home']/div/div[2]/h2")).getText());
	    
	    driver.close();
	}
	   

	}


