package day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadriventestingDemo {

	public static void main(String[] args) throws IOException 
	{

      FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\mydata.xlsx"); // passing the file location dynamically
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheet("Sheet1");
      int noOfrows = sheet.getLastRowNum();
      int noOfcell = sheet.getRow(0).getLastCellNum();
      System.out.println("Total no of row: "+noOfrows);
      System.out.println("Total no of cells in each row: "+noOfcell);
      
      for (int r = 0; r <= noOfrows; r++) 
      {
    	  XSSFRow currentrow = sheet.getRow(r);
    	  
		for (int c = 0; c < noOfcell; c++) 
		{
			 
		   XSSFCell cell = currentrow.getCell(c);
		   System.out.print(cell.toString()+"\t");
		}
	
		System.out.println();
	}

      
      workbook.close();
      file.close();
	}

}
