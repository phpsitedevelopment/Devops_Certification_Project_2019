package devops_cert_project.devops_phpwebsite_project_2019;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Websitecheck {
	
	ChromeDriver driver = new ChromeDriver();
	
	 @BeforeClass
	  public void beforeClass() {
		 
		  driver.get("http://192.168.56.101:8010/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
	  }
	 
	
  @Test
  public void f() throws InterruptedException {	  
	  String x =driver.getTitle();
	  assertEquals(x, "Home | Simple PHP Website");
	  System.out.println(x);
	  
	// driver.findElement(By.id("id")).sendKeys("About Us");
	  driver.findElement(By.id("About Us")).click();
	  
	  Thread.sleep(2000);
	  
	//String y=   driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]/text()[2]")).getText();
	  //System.out.println(y);
	//*[@id="PID-ab2-pg"]/text()[2]
	  
	  boolean text= driver.getPageSource().contains("Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. ");
	  System.out.println(text);
	  
	  //String expectedText= "Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry.";
        //System.out.println(expectedText);
        
      
        boolean flag = false;
        if (text)
        	{
        	flag = true;
        	System.out.println("the website is deployed successfully  and it's running fine");
        	}
        
        Assert.assertTrue(flag, "Looks like there is some issue,please check");
        
        	}
    	        	    
	  //WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'callout-success')]"));
	  //String text=msg.getText();
	  //Assert.assertEquals(text,expectedText);
  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
