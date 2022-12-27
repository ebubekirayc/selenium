package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethods {
    public static void main(String[] args) throws IOException {
        //Excel DOSYAMİZİN PATHİNİ ALDIK
        String path = "src\\test\\java\\re\\excelfile\\excelfile.xlsx";
        //dosyamızı actık
        FileInputStream fileInputStream = new FileInputStream(path);
        //actığımız dosyayı excel workbook una cevrdik
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //workbook umuzdan sheetimize gecis yaptık
        Sheet sheet1= workbook.getSheetAt(0);

        Row row1=sheet1.getRow(0);

        Cell cell1= row1.getCell(0);
        System.out.println("Cell 1 ="+ cell1);
    }
}
