package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static String getExcelData(String SheetName, Integer rowIndex, Integer columnIndex) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/TestDataSheet.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(SheetName);
     String data=   sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
     return data;


    }
}
