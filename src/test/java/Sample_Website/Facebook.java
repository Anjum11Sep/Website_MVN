package Sample_Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void facebookTest() throws InterruptedException 
  {  
      ChromeOptions opt=new ChromeOptions();
	  
	  opt.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(opt);
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  System.out.println("Opening Facebook website");
	  
 //	  Thread.sleep(1000);
	  driver.close();
  }
}
