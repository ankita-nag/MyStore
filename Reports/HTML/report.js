$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Menu",
  "description": "As a User\r\nI want to access homepage menus\r\nIn order to view different types of clothes",
  "id": "home-page-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 25374124622,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify menus on homepage",
  "description": "",
  "id": "home-page-menu;verify-menus-on-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user navigates to new look website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user should be able to view womens, mens, girls, home and gifts, inspiration menu",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_navigates_to_new_look_website()"
});
formatter.result({
  "duration": 29476470823,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.user_should_be_able_to_view_womens_mens_girls_home_and_gifts_inspiration_menu()"
});
formatter.result({
  "duration": 2469386280,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("scenario passed");
formatter.after({
  "duration": 16399736554,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Verify submenus under menus",
  "description": "",
  "id": "home-page-menu;verify-submenus-under-menus",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user navigates to new look website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user mouse hover on \"\u003cmenu\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\"\u003cmenu\u003e\" submenus should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "home-page-menu;verify-submenus-under-menus;",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 16,
      "id": "home-page-menu;verify-submenus-under-menus;;1"
    },
    {
      "cells": [
        "Womens"
      ],
      "line": 17,
      "id": "home-page-menu;verify-submenus-under-menus;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14284903569,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify submenus under menus",
  "description": "",
  "id": "home-page-menu;verify-submenus-under-menus;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user navigates to new look website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user mouse hover on \"Womens\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\"Womens\" submenus should display",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_navigates_to_new_look_website()"
});
formatter.result({
  "duration": 34071880662,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Womens",
      "offset": 21
    }
  ],
  "location": "HomePageTest.user_mouse_hover_on(String)"
});
formatter.result({
  "duration": 1581824764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Womens",
      "offset": 1
    }
  ],
  "location": "HomePageTest.submenus_should_display(String)"
});
formatter.result({
  "duration": 4936454456,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.write("scenario passed");
formatter.after({
  "duration": 17711564670,
  "status": "passed"
});
});