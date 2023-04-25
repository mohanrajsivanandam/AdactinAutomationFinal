Feature: Hotel Booking in Adactin app

Scenario: Login
Given user Launch The Application
When user Enters the UN in UN Field
When user Enters the Pwd in Pwd Field
Then user Clicks Login And Navigates To The Main Page

Scenario: Main Page
When user selects the location
When user selects the hotel
When user selects the room type
When user selects the room numbers
When user enters the from date
When user enters the to date
When user selects adult room
When user selects child room
Then user clicks on the submit button

Scenario: Logout
When user clicks on the logout button as quick as possible