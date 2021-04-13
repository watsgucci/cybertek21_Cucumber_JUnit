package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {


    XSSFWorkbook workbook1;
    XSSFSheet sheet1;
    XSSFCell cell1;
    XSSFRow row1;

    @Test
    public void excel_write() throws IOException{

        String path = "SampleData.xlsx";
        FileInputStream f1$input = new FileInputStream(path);

        //workbook > sheet > row > cell
        workbook1 = new XSSFWorkbook(f1$input);
        sheet1 = workbook1.getSheet("Employees");

        //king's row
        row1 = sheet1.getRow(1);

        //king's cell
        cell1 = row1.getCell(1);

        //print
        System.out.println(cell1);

        //Changing Adam's cell to say Madam in it
        XSSFCell adamsCell = sheet1.getRow(2).getCell(0);
        System.out.println("adamsCell Before= " + adamsCell);

        adamsCell.setCellValue("Madam");


        System.out.println(adamsCell);
        System.out.println("adamsCell After = " + adamsCell);

        //======================================================================

        //TODO: Change Steven's Name to Tom

        /*
        Static way of the solution
         */
        XSSFCell stevensCell = sheet1.getRow(1).getCell(0);
        stevensCell.setCellValue("Tom");


        //>>>Setting the value in Excel now
        FileOutputStream f1$output = new FileOutputStream("D:\\Users\\User\\Desktop\\Apache Practice MAVEN Cybertek\\ SampleData.xlsx");
        workbook1.write(f1$output);
        //>>>Close and Clean Up
        f1$input.close();
        f1$output.close();
        workbook1.close();

    }
}
