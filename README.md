# AppiumMobileTesting

## Overview
This is a lightweight API and Mobile Test Automation Framework in Java (Cucumber + Appium + RestAssured).
There are two features (tests) so far:
```YAML
# API Testing - Include one negative scenario (failed with assertion failure on user name)
src/test/resources/features/api_add_update_delete_user.feature

# Appium Mobile Testing
src/test/resources/features/appium_add_new_wifi_name.feature
```

## Usage
#### 1. Evironment Setup
Assume that you already have Java (mine is JDK 20), Appium, Android Studio (Android Emulator) installed

#### 2. Update config.properties
Please replace src/test/resources/config.properties file settings as per your own environment:
```YAML
# Please replace deviceName with your Android Emulator's name
deviceName=JaneEmulator

# Mobile APP is ready in project, but please replace the absolute path as per your machine
appPath=//Users//zhangying//IdeaProjects//Appium//src//test//resources//ApiDemos-debug.apk

# Appium JS Absolute Path on your machine
appiumJSPath=//usr//local//lib//node_modules//appium//build//lib//main.js
```

#### 3. Run Automation Testing
Open Terminal / CMD tool, cd to your project directory, run below maven command
```java
mvn clean verify
```

#### 4. Automation Test Reporting
After all tests are finished, please locate Cucumber Report with this path - target/cucumber-report-html/cucumber-html-reports/overview-features.html

![image](https://github.com/bbzying/AppiumMobileTesting/assets/36399262/0659f04c-2303-4b6b-ac88-5077de75bc49)
![image](https://github.com/bbzying/AppiumMobileTesting/assets/36399262/0cc38e1b-5950-4967-bd27-c91d9eba867c)
![image](https://github.com/bbzying/AppiumMobileTesting/assets/36399262/c3f85bab-5240-45f1-a66d-34090fe010f7)

