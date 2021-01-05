/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarGurus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author RANGANI2
 */
public class TC_003PageObject {
    WebDriver driver;
    
    public TC_003PageObject(WebDriver driver){
        this.driver= driver;
    }
    
    @FindBy(id = "bodyTypeGroup")
    private WebElement car_bodyStyle;
    
    @FindBy(id = "zip")
    private WebElement car_zip;
    
    @FindBy(id = "distance")
    private WebElement car_radius;
    
    @FindBy(id = "startYear")
    private WebElement car_fromYear;
    
    @FindBy(id = "endYear")
    private WebElement car_toYear;
    
    @FindBy(id = "minPrice")
    private WebElement car_minPrice;
    
    @FindBy(id = "maxPrice")
    private WebElement car_maxPrice;
    
    @FindBy(id = "maxMileage")
    private WebElement car_mileage;
    
    @FindBy(xpath = "//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")
    private WebElement car_search;
    
    public void findUsedCars(String body, int zip, int r, int fromYear,int toYear, int minPrice, int maxPrice, int mileage){
        try{
            car_bodyStyle.click();
            Select dD1 = new Select(car_bodyStyle);
            dD1.selectByVisibleText(body);
            car_zip.clear();
            car_zip.sendKeys("60172");
            car_radius.click();
            Select dD2 = new Select(car_radius);
            dD2.selectByIndex(r);
            car_fromYear.click();
            //Thread.currentThread().sleep(3000);
            Select dD3 = new Select(car_fromYear);
            dD3.selectByIndex(fromYear);
            car_toYear.click();
            Select dD4 = new Select(car_toYear);
            dD4.selectByIndex(toYear);
            car_minPrice.sendKeys("35,000");
            car_maxPrice.sendKeys("75,000");
            car_mileage.sendKeys("6500");
            car_search.click(); 
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
