/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author kohli
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report",
    "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
    "junit:target/cucumber-results.xml"},
        features="C:/Users/kohli/OneDrive/Documents/NetBeansProjects/CarguruLogin/src/main/java/features/",
        dryRun = false
)
public class RunCucumberTest {
    
}
