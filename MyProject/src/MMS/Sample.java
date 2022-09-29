package MMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class Sample {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Calibraint\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		String baseurl="https://live-mms.subdine.com/";
		driver.get(baseurl);
		//Login
		
		 WebElement email=driver.findElement(By.id("email"));
		 email.sendKeys("user1@testuser.in");
		 WebElement pass=driver.findElement(By.id("password"));
		 pass.sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
		// driver.manage().window().maximize();
		 
		 
		 //sidebar menu-item
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[3]/a")).click();
		 /*
		 //Add category
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[3]/ul/li[1]/a")).click();
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Create New')]")).click();
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Cat w");
		 driver.findElement(By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[1]")).click();
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-category-form/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/button[1]")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 //Edit category
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-category-view/div/div[2]/div/div/div/table/tbody/tr[2]/td[4]/button/span/mat-icon")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Actions act0 = new Actions(driver);
		 List<WebElement> editlist = driver.findElements(By.xpath("//a[contains(text(),'Edit')]"));
		 System.out.println("Number of elements:" +editlist.size());
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 act0.click(editlist.get(0)).perform();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/div/div/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("cat up");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("mat-radio-5")).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		 
		 //Delete category
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-category-view/div/div[2]/div/div/div/table/tbody/tr[2]/td[4]/button/span/mat-icon")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		 Alert catdel=driver.switchTo().alert();
		 String delmsg=driver.switchTo().alert().getText();
		 System.out.println(delmsg);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 catdel.accept();
		 */
		 
		 //Add Dish
		 
		 
		 driver.findElement(By.linkText("Dish")).click();
		 /*
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-dishes-view/div/div[1]/div[2]/a[1]")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Dish 2");
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	 
		 Actions act = new Actions(driver);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-select[contains(@placeholder,'Choose a Category')]")));
         act.click(ele).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Cat 1')]")).click();
		
		 Actions act1 = new Actions(driver);
		 WebDriverWait wait1 = new WebDriverWait(driver, 10);
		 WebElement ele1= wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-select[contains(@placeholder,'Choose a Unit')]")));
		 act1.click(ele1).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Kilogram')]")).click();
		 //driver.findElement(By.id("mat-slide-toggle-4-input")).click();
		 WebElement price=driver.findElement(By.xpath("//*[@id=\"price\"]"));
		 price.sendKeys("100");
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-dishes-form/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/button[1]")).click();
		*/
		//Edit
		 
		 
		 
		// mat-slide-toggle-14-input
		 
		 driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-dishes-view/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/button/span/mat-icon")).click();
		 Actions actestor = new Actions(driver);
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  List<WebElement> editlistsstor = driver.findElements(By.xpath("//a[contains(text(),'Edit')]"));
	  	  System.out.println("Number of edit elements:" +editlistsstor.size());
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  actestor.click(editlistsstor.get(0)).perform();
	  	  Thread.sleep(5000);
	  //	cssSelector("input[formcontrolname=xxxxxxxxxxxxxxxxxxxxxxx	'price']")
	  	  
	  	  
	  	  //togglebutton
	  	 List<WebElement> togneg= driver.findElements(By.cssSelector("mat-slide-toggle[formcontrolname='is_negative']"));
		System.out.println(togneg.size());
		togneg.get(0).click();
		// Actions act = new Actions(driver);
		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// List<WebElement> ele= driver.findElements(By.className("mat-slide-toggle-input"));
		// System.out.println("elements"+ele.size());
        // act.click(ele.get(0)).perform();
		 //Thread.sleep(3000);
		//driver.findElement(By.className("mat-slide-toggle-input")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		 //inventory -Add stock
		 
			/*
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[4]/a")).click();
		driver.findElement(By.linkText("Stocks")).click();
		driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-stock-view/div/div[1]/div[3]/a[2]/span")).click();
		driver.findElement(By.name("dp")).click();
		driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-stock-dish/div[2]/div/div/div/div/form/div/div[1]/div/div/div/adm-date-picker/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[2]/div")).click();
		driver.findElement(By.id("mat-input-0")).click();
		driver.findElement(By.xpath("//span[contains(text(),'item 7')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement qty=driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-stock-dish/div[2]/div/div/div/div/form/div/div[4]/div[1]/table/tbody/tr/td[3]/input"));
		qty.sendKeys("10");
		WebElement tp=driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-stock-dish/div[2]/div/div/div/div/form/div/div[4]/div[1]/table/tbody/tr/td[4]/input"));
		tp.sendKeys("1000");
		driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-stock-dish/div[2]/div/div/div/div/form/div/div[5]/div/div/div/button[1]")).click();
		
		//Add storage
		
		driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-storage-view/div/div[1]/div[2]/a/span")).click();
		WebElement st1=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		st1.sendKeys("storage1");
		driver.findElement(By.xpath("/html/body/adm-root/adm-layout/mat-sidenav-container/mat-sidenav-content/div/adm-storage-form/div[2]/div/div/div/div/form/div/div[2]/div/div/div[2]/button[1]")).click();
	
		//create stock request
		/*
		driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Create Stock Request ')]")).click();
		 Actions act2 = new Actions(driver);
		 WebDriverWait wait2 = new WebDriverWait(driver, 10);
		 WebElement ele2= wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-select-3\"]")));
         act2.click(ele2).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Branch 02')]")).click();
		*/
			
			
			
			
			
		
	}
	
	
}