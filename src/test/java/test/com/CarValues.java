/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author kohli
 */
public class CarValues {

    private static WebDriver driver;
    private String baseUrl = "https://www.cargurus.com/";

   @Given("^user is already on Cargurus$")
public void user_is_already_on_Cargurus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @When("^hover over Car Values$")
    public void hover_over_Car_Values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a[contains(text(),'Car Values')]"));
    }

    @Then("^user clicks on Car Values$")
    public void user_clicks_on_Car_Values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a[contains(text(),'Car Values')]")).click();
    }

    @Then("^user selects make model year and trim$")
    public void user_selects_make_model_year_and_trim() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement e = driver.findElement(By.id("carPicker_makerSelect"));
        Select make = new Select(e);
        make.selectByVisibleText("Toyota");
        e = driver.findElement(By.id("carPicker_modelSelect"));
        Select model = new Select(e);
        model.selectByVisibleText("Camry");
        e = driver.findElement(By.id("carPicker_year1Select"));
        Select year = new Select(e);
        year.selectByVisibleText("2015");
        Thread.sleep(3000);
        e = driver.findElement(By.id("carPicker_trimSelect"));
        Select trim = new Select(e);
        trim.selectByVisibleText("XLE");
    }

   @Then("^user clicks zipcode and enters zipcode$")
public void user_clicks_zipcode_and_enters_zipcode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("carDescription.postalCode")).sendKeys("60133");
    }

    @Then("^user clicks mileage and enters mileage$")
public void user_clicks_mileage_and_enters_mileage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("mileage")).sendKeys("45000");
    }

    @Then("^user selects transmission and engine$")
    public void user_selects_transmission_and_engine() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement e = driver.findElement(By.name("carDescription.transmission"));
        Select transmission = new Select(e);
        transmission.selectByVisibleText("6-Speed Automatic");
        e = driver.findElement(By.id("carDescription.engineId"));
        Select engineId = new Select(e);
        engineId.selectByVisibleText("2.5L 178 hp I4");
    }


    @Then("^user can see Market Value$")
    public void user_can_see_Market_Value() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("What's My Car Worth? Calculate Your Cars Value on CarGurus", driver.getTitle());
        Thread.sleep(2000);
        driver.close();
    }
}
