package Pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

		public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		
		// Accept user input
		String search;
		Test3 obj=new Test3();
		search=obj.userinput();
        
        //Invoking Browser
		String projectpath = System.getProperty("user.dir");
	  	System.out.println(projectpath);
	  	String driverpath = projectpath + "//Driver//chromedriver.exe";
	  	System.setProperty("webdriver.chrome.driver", driverpath);
	  	WebDriver driver = new ChromeDriver();
	  	driver.navigate().to("http://www.amazon.com");
	  	WebElement searchbtn=driver.findElement(By.id("twotabsearchtextbox"));
	  	searchbtn.sendKeys(search);
        WebElement searchbtn1=driver.findElement(By.className("nav-input"));
        searchbtn1.click();
	  	
        //Sorting of elements from high to low
        Select text=new Select(driver.findElement(By.id("sort")));
        text.selectByVisibleText("Price: High to Low");
        
        //Listing of all elements
        Thread.sleep(2000);
        List <WebElement> searchlist=driver.findElements(By.xpath("//h2[contains(@class,'a-size-medium')]"));
        Thread.sleep(2000);
           
		 		 
              
		 ArrayList<String> obj1 = new ArrayList<String>();
		 //System.out.println("SIZE" + searchlist.size());
		 
		 Thread.sleep(2000);
		  for (WebElement sugg : searchlist) {
        	  obj1.add(sugg.getText());
                }
		  
		  
		  //File src=new File("D:\\First.xlsx");
		  
		  FileInputStream fis=new FileInputStream("D:\\Minnal.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook(fis);
		  XSSFSheet sheet=workbook.getSheetAt(0);
		 
		   //System.out.println(obj1.get(5));
		   
		  /*Row newRow = sheet.createRow(5);
          Cell cell1 = newRow.createCell(0);
          cell1.setCellValue(obj1.get(5));
          Row newRow1 = sheet.createRow(6);
          Cell cell2 = newRow1.createCell(0);
          
          cell2.setCellValue(obj1.get(6));
          workbook.write(fout); 
          fout.close();*/
		  
		  
          int cnt1=obj1.size();
		  
			  System.out.println("COUNT" + cnt1);
			  
			 for(int rowno=0;rowno<cnt1;rowno++)
			 {
				 
				 FileOutputStream fout=new FileOutputStream(new File("D:\\Minnal.xlsx"));
				 System.out.println("rownumber" + rowno);
				 
				  System.out.println(obj1.get(rowno)); 
	               Row newRow = sheet.createRow(rowno);
	               Cell cell1 = newRow.createCell(0);
	               cell1.setCellValue(obj1.get(rowno));
	               workbook.write(fout); 
	               fout.close(); 
		          
		     }
			    
		   }  
          
			  
			 
			  
	      
		    		
			
		
	
	public String userinput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Text");
		String search1 = sc.nextLine();
		System.out.println(search1);
		return(search1);
        
	}
 		
 	
	}


		
	


		 