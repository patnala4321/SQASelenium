package excel;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLoop {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Hi\\Documents\\Selenium Class\\EmployeeDetails.xls");
		Workbook w1=Workbook.getWorkbook(f1);
		Sheet s1=w1.getSheet("Sheet1");
		System.out.println(s1.getName());
		
		int rows=s1.getRows();
		
		System.out.println("Rows  "+rows);
		
		
		for(int i=0;i<rows;i++)
		{
			String empID=s1.getCell(0,i).getContents();
			String empName=s1.getCell(1,i).getContents();
			String empSal=s1.getCell(2,i).getContents();
		

		System.out.print(empID);
		System.out.print (empName);
		System.out.print(empSal+"  ");
		System.out.println();
		}
	}

}
