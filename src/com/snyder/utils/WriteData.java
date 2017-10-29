package com.snyder.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	
public static void toExcel(String filename, String sheetname, int row_index, int cell_index, String data){
		
		try
		{
			File f=new File("./test-data/"+filename+".xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet st=wb.getSheet(sheetname);
			Row r=st.getRow(row_index);
			Cell c=r.getCell(cell_index);
			c.setCellValue(data);
			
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
			
	}


public static void toProperties(String filename, String key, String value, String comment)
{
		
	try
	{
		File f=new File("./test-config/"+filename+".properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		prop.put(key, value);	
		
		FileOutputStream fos=new FileOutputStream(f);
		prop.save(fos, comment);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
