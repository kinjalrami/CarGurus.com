#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature:  Carguru Login Test Feature
Scenario Outline: Carguru Login Scenario
Given user is alredy on Home Page
When title of Home Page is Carguru
Then user clicks on My account button
Then user clicks on Sign in/Ragister button
And user enters "<email address>"
Then user clicks on Next button and enters "<Password>" 
Then user clicks on Sign in button
Then user is signed in
Then user close browser

Examples: 
| email address | Password |
| kohli.sumeet@ymail.com | Test1234 |
   
Scenario Outline: user is able to Research for car
Given user is already Signed in
When user hover over Research
Then user clicks on Research
Then user selects make model and year
Then user clicks search
Then user clicks zip and enters "<zip>"
Then user clicks Find Deals
Then user can see Research results

Examples:
| zip |
| 60133 |

Scenario Outline: user can see his Car Value
Given user is already on Home page
When hover over Car Values
Then user clicks on Car Values
Then user selects make model year and trim
Then user clicks zipcode and enters "<zipcode>"
Then user clicks mileage and enters "<mileage>"
Then user selects transmission and engine
Then user clicks alloy Leather seats and Sunroof/Moonroof
Then user can see Market Value

Examples:
| zip | mileage |
| 60133 | 45000 |

Scenario Outline: user can find Certified Pre-Owned Car
Given user is already on Carguru.com
When user hover over Certified Pre-Owned
Then user Clicks on Certified Pre-Owned
Then user selects make and model
Then user clicks and enters "<zip>"
And user clicks on Search
Then user can see Certified Pre-Owned cars

Examples:
| zip |
| 60133 |


Scenario Outline: Sell My Car Scenario
Given user is already on carguru
When user hover over Sell My car
Then user clicks on Sell My Car button
Then user enters data "<zip>" 
Then user selects maker model year and trim
Then user sees Results Page

Examples:
| zip |
| 60133 |
