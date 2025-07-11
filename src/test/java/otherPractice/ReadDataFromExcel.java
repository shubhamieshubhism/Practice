package otherPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDataFromExcel {
    public static String[][] readExcelData(String filePath, String sheetname) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetname);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        String data[][] = new String[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString();
            }
        }
        workbook.close();
        fileInputStream.close();
        return data;
    }

    public static List<String> readSinglerow(String filePath, String sheetName, int colIndex) throws IOException {
        List<String> dataList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        for (Row row : sheet) {
            Cell cell = row.getCell(colIndex);
            if (cell != null) {
                switch (cell.getCellType()) {
                    case STRING:
                        dataList.add(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        dataList.add(String.valueOf(cell.getNumericCellValue()));
                        break;
                    case BOOLEAN:
                        dataList.add(String.valueOf(cell.getBooleanCellValue()));
                        break;
                    case FORMULA:
                        dataList.add(String.valueOf(cell.getCellFormula()));
                        break;
                }
            } else {
                dataList.add("");
            }
        }
        return dataList;

    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\PALASH TIRPUDE\\Desktop\\testingReadEcelData.xlsx";
        String sheetName = "Sheet1";
        /*String[][] output = readExcelData(filePath, sheetName);
        for (String[] row : output) {
            System.out.println(Arrays.toString(row));
        }*/
        List<String> rows = readSinglerow(filePath, sheetName, 0);
        for(String row:rows){
            System.out.println(row);
        }

    }
}
