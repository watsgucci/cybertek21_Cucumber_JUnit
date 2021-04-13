package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();//so we can use it in a static method

    public static WebDriver getDriver() {//using configuration.properties to set the browser here and then use this method to call the driver
        if (driverPool.get() == null) {

            synchronized (Driver.class) {
                String browser = ConfigurationReader.getValue("browser");

                if (browser.equalsIgnoreCase("Chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

                } else if (browser.equalsIgnoreCase("Firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

                } else {
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                }
            }
        }
        return driverPool.get();
    }

TakesScreenshot ts = (TakesScreenshot) driverPool;

    public static WebElement xPath(String xPath){
        return driverPool.get().findElement(By.xpath(xPath));
    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void closeDriver(){
        if(driverPool.get()!=null){
            BrowserUtils.sleep(3);
            driverPool.get().quit();
            driverPool.remove();
        }
    }

}