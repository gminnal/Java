package org.firstsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		String driverpath=projectpath+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driverobj=new ChromeDriver();
				
		/*driverobj.get("https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		driverobj.manage().window().maximize();
		Thread.sleep(2000);
			
		WebElement name=driverobj.findElement(By.id("ap_customer_name"));
		name.sendKeys("Minnal");
		
		
		WebElement email=driverobj.findElement(By.id("ap_email"));
		email.sendKeys("sme15592@sawoe.com");
		
		WebElement pwd=driverobj.findElement(By.id("ap_password"));
		pwd.sendKeys("Myron_20");
		
		WebElement confirmpwd=driverobj.findElement(By.id("ap_password_check"));
		confirmpwd.sendKeys("Myron_20");
		
		driverobj.findElement(By.id("continue")).click();*/
		
		driverobj.get("https://www.amazon.com");
		driverobj.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search=driverobj.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Purse");
		WebElement searchbtn=driverobj.findElement(By.className("nav-input"));
		searchbtn.click();
		
		Thread.sleep(5000);
			
		WebElement selected=driverobj.findElement(By.xpath("//img[@title='Joy Mangano Tote and Metallic Leather Weekender Combo, Steel Blue']"));
		
		String title=selected.getAttribute("title");
		
		//System.out.println(driverobj.getTitle());
		selected.click();
		
		Thread.sleep(2000);
		Select quantity1=new Select(driverobj.findElement(By.id("quantity")));
		quantity1.selectByVisibleText("2");
		String quancmp = quantity1.getFirstSelectedOption().getText();
		System.out.println(quancmp);
	
		
		Thread.sleep(3000);
		driverobj.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(3000);
		driverobj.findElement(By.id("hlb-ptc-btn-native")).click();
		
		//code for existing user
		WebElement checkemail=driverobj.findElement(By.id("ap_email"));
		checkemail.sendKeys("testamazon57@gmail.com");
		
		driverobj.findElement(By.id("continue")).click();
		
		WebElement pwde=driverobj.findElement(By.id("ap_password"));
		pwde.sendKeys("Myron_20");
		
		driverobj.findElement(By.id("signInSubmit")).click();
				
				
		WebElement fullname=driverobj.findElement(By.name("enterAddressFullName"));
		fullname.sendKeys("Minnal");
		
		WebElement address=driverobj.findElement(By.name("enterAddressAddressLine1"));
		address.sendKeys("P2 Magarpatta city");
		
		WebElement city=driverobj.findElement(By.name("enterAddressCity"));
		city.sendKeys("Pune");
		
		WebElement state=driverobj.findElement(By.name("enterAddressStateOrRegion"));
		state.sendKeys("MH");
		
		WebElement postalcode=driverobj.findElement(By.name("enterAddressPostalCode"));
		postalcode.sendKeys("411006");
		
		Select country=new Select(driverobj.findElement(By.name("enterAddressCountryCode")));
		country.selectByVisibleText("India");
		
		WebElement phoneno=driverobj.findElement(By.name("enterAddressPhoneNumber"));
		phoneno.sendKeys("9763312697");
		
	    driverobj.findElement(By.name("shipToThisAddress")).click();
		
	    
	    WebElement find=driverobj.findElement(By.xpath("//*[text()='Joy Mangano Tote and Metallic Leather Weekender Combo, Steel Blue']"));
	        
	    String find1= find.getText();
	    
	    if(find1.equals(title))
	    {
	    System.out.println("Verified details");
	    System.out.println(find1);
	    			
	}

}
}
