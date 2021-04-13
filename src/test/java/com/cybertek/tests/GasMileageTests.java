package com.cybertek.tests;

import com.cybertek.pages.GasMileageCalculator_Page;
import com.cybertek.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GasMileageTests {


    private GasMileageCalculator_Page g1 = new GasMileageCalculator_Page();

    XSSFWorkbook workbook1;
    XSSFSheet sheet1;
    XSSFCell cell1;
    XSSFRow row1;
    FileInputStream fileInput;
    FileOutputStream fileOutput;

    @Test
    public void gasMileageCalculator() throws IOException {
        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html?ctype=standard&uscodreading=12360&uspodreading=12000&usgasputin=15&usgasprice=3&x=60&y=18&mucodreading=18900&mupodreading=18300&mugasputin=50&mugasprice=1");
        g1.currentOdometerInput.clear();

        //Setup Data
        String path = "src/test/resources/test_Data/GasInfo.xlsx";
        fileInput = new FileInputStream(path);
        workbook1 = new XSSFWorkbook(fileInput);
        sheet1 = workbook1.getSheet("GasInfo");

        //============================================================
        double current = 123000;
        g1.currentOdometerInput.clear();
        g1.currentOdometerInput.sendKeys(String.valueOf(current));
        //===========================================================
        //============================================================
        double previous = 122000;
        g1.previousOdometerInput.clear();
        g1.previousOdometerInput.sendKeys(String.valueOf(previous));
        //===========================================================
        //============================================================
        double gasInput = 15;
        g1.gasAddedToTank.clear();
        g1.gasAddedToTank.sendKeys(String.valueOf(gasInput));
        //===========================================================
        //============================================================
        g1.submitButton.click();
        //===========================================================

        System.out.println(g1.resultGasMileage.getText().split(" ")[0]);







        //forLoop
        for (int i = 1; i < sheet1.getPhysicalNumberOfRows(); i++) {
            if(i==1){

            }
            XSSFCell currentORCell = sheet1.getRow(i).getCell(1);
            XSSFCell previousORCell = sheet1.getRow(i).getCell(1);
        }


Driver.getDriver().close();

    }



}
