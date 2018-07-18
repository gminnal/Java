package Project2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Testsuite extends Suitecmds {
    

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String FilePath="D:\\2018\\iQITA\\Files\\Suite.xlsx";
		readSuiteSheet(FilePath,"Sheet1");
		

	}

}
