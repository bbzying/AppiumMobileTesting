@smoketest
Feature: Appium - Add New WiFi
  Scenario: Setup
    And I setup Appium

  Scenario: Add new wifi
    And I click on menu "Preference"
    And I click on menu "3. Preference dependencies"
    And I populate checkbox "WiFi" with "true"
    And I click on menu "WiFi settings"
    And I populate field "WiFi settings" with "Jane Wifi"
    And I click on button "OK"
    And I verify text "WiFi settings" is present

  Scenario: Tear Down
    And I tear down