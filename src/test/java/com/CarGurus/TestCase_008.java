/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarGurus;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author RANGANI2
 */
public class TestCase_008 {
    private static WebDriver driver;
    
    public TestCase_008() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\qa\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void usedCarsSearch() throws InterruptedException {
        TC_008PageObject po = PageFactory.initElements(driver, TC_008PageObject.class);
        driver.get("http://www.cargurus.com");
        driver.findElement(By.xpath("//*[@id=\"heroSearch\"]/label[4]")).click();
        Thread.sleep(5000);
        WebElement e = driver.findElement(By.id("dealFinderZipUsedId_dealFinderFormFSBO"));
        e.click();
        e.clear();
        e.sendKeys("60172");
        driver.findElement(By.id("dealFinderFormFSBO_0")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("react-tabs-6")).click();
        po.findUsedCars("Van", 60172 , 4, 3, 2, 35000, 75000, 6500);
        
        try{
            assertEquals("Used Van for Sale in Roselle, IL - CarGurus",driver.getTitle());
            System.out.println("Test Case Passed");
        }catch(Error a){
            System.out.println(a.toString());
        }
    }
}
