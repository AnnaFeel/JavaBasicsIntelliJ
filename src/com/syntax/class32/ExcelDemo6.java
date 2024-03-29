package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path="/Users/annafilippova/Documents/SDET/JAVA/Class 32 Excel/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        //A list of maps to store the data from exel each map will store the data from each row
        List<Map<String,String>> excelData = new ArrayList<>();

        //getting the header from the exel file so that we can use the data from this header row as keys for the maps like firstName lastName etc
        Row headerRow=sheet.getRow(0);

        //we write a loop to get all the rows from this sheet except the first row because it contains the header
        for(int j=0; j<sheet.getPhysicalNumberOfRows(); j++){

            //getting all the rows starting from row no. 2 skipping the first on because it has header
            Row row = sheet.getRow(j);

            //for each row we create a new map so that we don't override the data for all the rows
            LinkedHashMap<String, String> linkedHashMap=new LinkedHashMap<>();

            //once we have got the row we fetch all the data from all the cells with the help of a loop
            for(int i=0; i<row.getPhysicalNumberOfCells(); i++){

                //we use the header row to get the keys and the row to get the values for the data
                linkedHashMap.put(headerRow.getCell(0).toString(),row.getCell(0).toString());
        }
            //once we are done storing all the data from a row inside a map we put that map inside the list that we created
            excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}