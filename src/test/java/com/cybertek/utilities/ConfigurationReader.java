package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //#1 - Create Properties class object
    private static Properties properties = new Properties(); // we dont want anyone outside this class to reach this object

    static{
        FileInputStream file1 = null;
        try {
            file1 = new FileInputStream("configuration.properties");

            //#3 - Load the opened file into the Properties object
            properties.load(file1);

            //closing the file in JVM memory
            file1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //make it run first and only once
    //#2 - Open the file in JVm memory and pass the path of the file


    public static String getValue(String keyName) {
        return properties.getProperty(keyName);
    }



    public static void chickenBones() {
        System.out.println("chicken bones");
    }

}
