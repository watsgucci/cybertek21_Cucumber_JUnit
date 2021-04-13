package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {


    @Test
    public void excel_read_test() {
        /*
        In this test we will be reading from excel file
         */
        String path = "SampleData.xlsx";

        try {
            FileInputStream f1 = new FileInputStream(path);


            //workbook > sheet > row > cell
            XSSFWorkbook workbook1 = new XSSFWorkbook(f1);

            //workbook to sheet
            XSSFSheet sheet1 = workbook1.getSheet("Employees");

            //getting a cell. First row and then cell
            System.out.println(sheet1.getRow(1).getCell(0)); // getting the row and cell and getting the String from there


            //print out singer from excel sheet
            System.out.println(sheet1.getRow(3).getCell(2));

            //returns the count of used cells only
            //if there are cells not used they will not be counted
            //starts from 1.
            int usedRows = sheet1.getPhysicalNumberOfRows();
            System.out.println("usedRows = " + usedRows);


            //return the count from top to bottom
            //even counts if there are empty cells
            //this starts counting from 0
            int lastUsedRow = sheet1.getLastRowNum();
            System.out.println("lastUsedRow = " + lastUsedRow);



            //todo: 1- Create a Logic to Print out Neena's name dynamically
            for (int rowNum = 0; rowNum < usedRows; rowNum++) {

                if(sheet1.getRow(rowNum).getCell(0).toString().equals("Neena")){
                    System.out.println("Current Cell = "+sheet1.getRow(rowNum).getCell(0)+" is in Row: "+rowNum) ;
                }

                System.out.println(sheet1.getActiveCell());
            }


            for (int i = 0; i < usedRows; i++) {
                int cellNumber = 1;
                String currentCell = sheet1.getRow(i).getCell(cellNumber).toString();

                if(currentCell.equals("Sandler")){
                    System.out.println("currentCell = " + currentCell+" is in Row: "+i);
                }

            }
            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println("===========================================");

            for (int rowNum = 0; rowNum < usedRows; rowNum++) {



                for (int cellNum = 0 ; cellNum<3; cellNum++) {

                    String currentCell = sheet1.getRow(rowNum).getCell(cellNum).toString();
                    System.out.print(String.format("%-20s",sheet1.getRow(rowNum).getCell(cellNum)+" "));
                    if(currentCell.equals("null")){
                        break;
                    }
                }
                System.out.println();

            }






        }
         catch (IOException e) {
            System.out.println("Path is wrong, go and check it");

        }


    }


}
