import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String value;
	public static FileInputStream file;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		file=new FileInputStream("D:\\excel.xlsx");
		value=setcelldata(2,2,"Automation");
		System.out.println(value);
		}
	
	public static  String setcelldata(int rownum,int cellnum, String value) throws IOException
	{
		workbook = new XSSFWorkbook(file);
		sheet=workbook.getSheet("Madhu");
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(value);
		return cell.getStringCellValue();
	}
	

}
