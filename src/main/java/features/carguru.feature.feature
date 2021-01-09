#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature:  Carguru Login Test Feature
Scenario: Carguru Login Scenario
Given user is alredy on Carguru
When title of Home Page is Carguru
Then user clicks on My account dropdown
Then user clicks on Sign in/Ragister button
And user enters email address
Then user clicks on Next button and enters Password
Then user clicks on Sign in button
Then user is signed in
Then user close browser


   


Scenario: user can see his Car Value Scenario
Given user is already on carguru
When hover over Car Values
Then user clicks on Car Values
Then user selects make model year and trim
Then user clicks zipcode and enters zipcode
Then user clicks mileage and enters mileage
Then user selects transmission and engine
Then user can see Market Value



Scenario: user can see Certified Pre-Owned Cars Scenario
Given user is already on Carguru
When user mouses over certified pre owned
Then user Clicks on Certified Pre-Owned
Then user selects make and model
Then user clicks and enters zip
And user clicks on Search
Then user can see Certified Pre-Owned cars



Scenario: user can use SellMyCar Scenario
Given user is on Carguru
When user hovers over SellMyCar
Then user clicks on Sell My Car button
Then user enters data zip 
Then user selects maker model year and trim
Then user sees Results Page


