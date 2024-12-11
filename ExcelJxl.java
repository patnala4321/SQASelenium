package excel;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelJxl {

	public static void main(String[] args) throws BiffException, IOException {
			FileInputStream f1=new FileInputStream("C:\\Users\\Hi\\Documents\\Selenium Class\\EmployeeDetails.xls");
			Workbook w1=Workbook.getWorkbook(f1);
			Sheet s1=w1.getSheet("Sheet1");
			System.out.println(s1.getName());
			int i=2;
			String empID=s1.getCell(0,i).getContents();
			String empName=s1.getCell(1,i).getContents();
			String empSal=s1.getCell(2,i).getContents();
			System.out.println(empID);
			System.out.println(empName);
			System.out.println(empSal);
			
	}

}
