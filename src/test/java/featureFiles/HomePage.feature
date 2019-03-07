Feature: Home Page Menu
As a User
I want to access homepage menus
In order to view different types of clothes

Scenario: Verify menus on homepage
Given user navigates to new look website
Then user should be able to view womens, mens, girls, home and gifts, inspiration menu 

Scenario Outline: Verify submenus under menus
Given user navigates to new look website
When user mouse hover on "<menu>"   
Then "<menu>" submenus should display   

Examples:
|menu|
|Womens|