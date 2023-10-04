package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excelsheet01 {
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
        Row row= null; //sheet1.getRow(0);    // to show the firstname located in index(0)

        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            row =sheet1.getRow(i);    // show the entire row titles
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+"   ");
            }
            System.out.println("  ");


        }











    }
}
