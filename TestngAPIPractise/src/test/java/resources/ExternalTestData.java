package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExternalTestData {

public LinkedList<String> aiddPetToStore(String testCaseName, String sheetName) throws FileNotFoundException {
		
		LinkedList<String> li = new LinkedList<String>();
		
		FileInputStream fis = new FileInputStream("C:\\Geetha_Excel Learning\\AddPet.xlsx");
		
		XSSFWorkbook workbook = null; 
		
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int sheets = workbook.getNumberOfSheets();
		for(int i = 0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetName))
			{
				XSSFSheet s = workbook.getSheetAt(i);
				Iterator<Row> rows = s.iterator();
				Row firstRow = rows.next();
				
				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0,column = 0;
				while(cell.hasNext())
				{
					Cell value = cell.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestName"))
					{
						column = k;
					}
					k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
						Iterator<Cell> c = r.cellIterator();
						while(c.hasNext())
						{
							Cell val = c.next();
							if(val.getCellType()==CellType.STRING)
							{
								li.add(val.getStringCellValue());
							}
							else
							{
								li.add(NumberToTextConverter.toText(val.getNumericCellValue()));
							}							
						}
					}
				}
			}
		}
		System.out.println(li.size());
		return li;
	}

	public LinkedList<String> addPetNewMethd() throws FileNotFoundException
	{
		LinkedList<String> li = new LinkedList<String>();
		
		FileInputStream fis = new FileInputStream("C:\\Geetha_Excel Learning\\AddPet.xlsx");
		XSSFWorkbook workbook = null; 
		
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int sheet = workbook.getNumberOfSheets();
		
		for(int i = 0;i<sheet;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet s= workbook.getSheetAt(i);
				int rowCount = s.getLastRowNum();
				
				for(int j = 1;j<=rowCount;j++)
				{
					Row r = s.getRow(j);
					int cellCount = r.getLastCellNum();
					int col = 0;
					if(r.getCell(0).getStringCellValue().equalsIgnoreCase("Add pet to store"))
					{
						for(int k = 0;k<cellCount;k++)
						{
							if(r.getCell(k).getCellType()==CellType.STRING)
							{
								li.add(r.getCell(k).getStringCellValue());
							}
							else
							{
								li.add(NumberToTextConverter.toText(r.getCell(k).getNumericCellValue()));
							}
							
						}
					}
				}
			}
		}
		return li;
	}
}
