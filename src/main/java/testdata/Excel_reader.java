package testdata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_reader {
	private static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\Sethuru\\Desktop\\Frame_input.xlsx";
		
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
		System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		for(Sheet sheet: workbook) 
		{
            System.out.println("=> " + sheet.getSheetName());
		}
		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		
		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet)
        {
            for(Cell cell: row) 
            {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t" + "\t");
            }
            System.out.println();
        }
        workbook.close();
	}
	

}