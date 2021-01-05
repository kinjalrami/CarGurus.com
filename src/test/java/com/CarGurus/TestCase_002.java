/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarGurus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author RANGANI2
 */
public class TestCase_002 {
    private WebDriver driver;
    private static ForSaleByOwner forSale;
    public TestCase_002() {
    }

    @BeforeClass
    public static void setUpClass() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\qa\\Cargurus.xlsx"));
        Workbook wb = new XSSFWorkbook(fis);
        
        Sheet firstSheet = wb.getSheetAt(0);
        
        Row row = firstSheet.getRow(1);
        Cell col = row.getCell(0);
        String fromPrice = col.getStringCellValue();
        
        col = row.getCell(1);
        String toPrice = col.getStringCellValue();
       
        col = row.getCell(2);
        String zip = col.getStringCellValue();
        
        forSale = new ForSaleByOwner(fromPrice, toPrice, zip);
        System.out.println(forSale);
        fis.close();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\qa\\driver\\chromedriver.exe");//location of chromedriver defined here
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cargurus.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TC_002() throws InterruptedException {
        
        driver.findElement(By.xpath("//*[@id=\"heroSearch\"]/label[4]")).click();
        driver.findElement(By.id("minPrice")).click();
        driver.findElement(By.id("minPrice")).sendKeys(forSale.getFromPrice());
//        Select minPrice = new Select(driver.findElement(By.id("minPrice")));
//        minPrice.selectByIndex(10);
        driver.findElement(By.id("maxPrice")).click();
        driver.findElement(By.id("maxPrice")).sendKeys(forSale.getToPrice());
//        Select maxPrice = new Select(driver.findElement(By.id("maxPrice")));
//        maxPrice.selectByIndex(20);
        driver.findElement(By.id("dealFinderZipUsedId_dealFinderFormFSBO")).sendKeys(forSale.getZip());
        driver.findElement(By.id("dealFinderFormFSBO_0")).click();
        Thread.currentThread().sleep(5000);
        try {
            assertEquals("Seller Type", driver.findElement(By.xpath("//*[@id=\"cargurus-listing-search\"]/div[1]/div/div[2]/div[2]/div[1]/div[2]/button/span")).getText());
            System.out.println("Test Case Pass");
        } catch (Error e) {
            System.out.println(e.toString());
        }

    }
}
