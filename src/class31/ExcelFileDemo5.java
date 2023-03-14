package class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet2");

        int noOfRows=sheet2.getPhysicalNumberOfRows();

        for(int i=0;i<noOfRows;i++){
            Row row=sheet2.getRow(i);
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }





        /*for (int i = 0; i < noOfRows; i++) {
            Row row=  sheet2.getRow(i);
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }


    }

        int noOfRows = sheet2.getPhysicalNumberOfRows();
        //System.out.println(noOfRows);

        //List<Map<String,String>>
        for (int i = 0; i < noOfRows; i++) {
                Row row = sheet2.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j=0; j<noOfCells;j++){

                System.out.println(row.getCell(j)+" ");
                    System.out.println();
            }
        }*/
    }}
