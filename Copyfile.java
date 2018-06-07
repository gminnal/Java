package Java_Package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class Copyfile {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();
		//Creating Files.txt 
		for(int i=65;i<=90;i++) {
			
		int randomNum = rand.nextInt((90 - 65) + 1) + 65;
				
		FileOutputStream out = new FileOutputStream("d:/TestSrc/" + (char)(randomNum) + ".txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);    
        Writer w = new BufferedWriter(osw);
        w.write("ABCDEF");
        w.close();
     	}
		
			
		//Fetching the list of files from the source folder
		File folder = new File("d:/TestSrc/");
	    File[] listOfFiles = folder.listFiles();
	    
	    for (File file : listOfFiles) {
	         String Foldername= file.getName();
	         System.out.println(Foldername);
	         //Extracting the first character
	         char a=Foldername.charAt(0);
	         
	         //Creating the folder with the name as the first character
	         File newFolder = new File("D:/Target/" + a );
	         System.out.println(newFolder);
	 		 newFolder.mkdir();
	 		 
	 		Path source=Paths.get("d:/TestSrc/" + a + ".txt");
	        Path destination = Paths.get(newFolder  + "/" + a +  ".txt");
	        System.out.println("Destination" + destination);
	        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	        }
			
	}

}
