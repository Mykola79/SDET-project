package class31;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> exelData= ExcelReader.read();
        Map<String,String>firstRow=exelData.get(1);

        System.out.println(firstRow);
    }
}
