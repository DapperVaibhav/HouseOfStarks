package g;


import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GL {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav\\Desktop\\Vaihav imp data\\ChromeDriver\\ChromeDriver_31052020\\chromedriver_win32 (1)\\chromedriver.exe");
    
	driver=new ChromeDriver();
	
    driver.get("https://www.makemytrip.com/");
    driver.manage().window().maximize();
    
    Thread.sleep(2500); 
    System.out.println("Done");
    driver.close();
    
	}

}

//