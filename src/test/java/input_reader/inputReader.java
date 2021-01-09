package input_reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class inputReader {

	public static Object [][] data;
		public static Object[][] collectSingleData(String HomePageTest) throws Exception
		{
			XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(new File (System.getProperty("user.dir")+"//src//test//resources//external_data//inputcontroller.xlsx")));
			XSSFSheet TcSheet=workbook.getSheet(HomePageTest);
			int TcRow=TcSheet.getLastRowNum();
			data=new Object[1][TcRow+1];
			for (int i=1;i<=TcRow;i++)
			{
				Cell Cell=TcSheet.getRow(i).getCell(5);
				TcSheet.getRow(i).getCell(5).setCellType(Cell.CELL_TYPE_STRING);
				data[0][i]=TcSheet.getRow(i).getCell(5).getStringCellValue();
			}
			return data;
		}
}
