package Class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excelsheet {
    public static void main(String[] args) throws IOException {
        //To find the location of the file
       //String path="/Users/habib/IdeaProjects/Javabasics/Files/Employees(1).xlsx";
        String path="/Users/habib/IdeaProjects/Java basics/Files/Employees (1).xlsx";
        // to bring your file from permenent to temporay memory
        FileInputStream fis=new FileInputStream(path);
        // This is the special class or code that handle to access the excel sheet
        XSSFWorkbook workbook =new XSSFWorkbook(fis);
        //accessing the sheet from the excel file
        Sheet sheet1 =workbook.getSheet("Sheet1");
        // gives us the row in index 1
        Row row= sheet1.getRow(1);
        // gives us the cell in index 2
        Cell cell=row.getCell(2);
        System.out.println(cell);









    }
}
