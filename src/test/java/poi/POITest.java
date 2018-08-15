package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class POITest {
	@Test
	public void test1() throws Exception{
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet hssfSheet = workbook.createSheet("myexl");
		HSSFRow hssfRow = hssfSheet.createRow(0);
		HSSFCell hssfCell = hssfRow.createCell(3);
		hssfCell.setCellValue("第一次打印");
		OutputStream out = new FileOutputStream(new File("E:\\a.xls"));
		workbook.write(out);
		out.close();
		
		
	}

}
