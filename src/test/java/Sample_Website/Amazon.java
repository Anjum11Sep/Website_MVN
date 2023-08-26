package Sample_Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException
  {	  
	  ChromeOptions opt=new ChromeOptions();
	  
	  opt.addArguments("--remote-allow-origins=*");
	  
	  WebDriver driver=new ChromeDriver(opt);
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  
	  System.out.println("opening Amazon website");
	//  Thread.sleep(1000);
	  
	  driver.close();
	  
  }
}
