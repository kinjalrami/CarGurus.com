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

/**
 *
 * @author kohli
 */
public class AccountLogin {

    private static WebDriver driver;
    private String baseUrl = "https://www.cargurus.com/";

   @Given("^user is alredy on HomePage$")
public void user_is_alredy_on_HomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
driver.manage().window().maximize();
    }

    @When("^title of Home Page is Carguru$")
    public void title_of_Home_Page_is_Carguru() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Used Cars, New Cars, Reviews, Photos and Opinions - CarGurus", driver.getTitle());

    }

  
@Then("^user clicks on My account dropdown$")
public void user_clicks_on_My_account_dropdown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("account-menu-username")).click();

    }

    @Then("^user clicks on Sign in/Ragister button$")
    public void user_clicks_on_Sign_in_Ragister_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("authLink")).click();
    }

 @Then("^user enters email address$")
public void user_enters_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("registerEmail")).sendKeys("kohli.sumeet@ymail.com");

    }

@Then("^user clicks on Next button and enters Password$")
public void user_clicks_on_Next_button_and_enters_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("Test1234");

    }

    @Then("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @Then("^user is signed in$")
    public void user_is_signed_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Welcome to CarGurus! - CarGurus", driver.getTitle());
    }

    @Then("^user close browser$")
    public void user_close_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        driver.close();
    }
}
