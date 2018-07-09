# BDD Framework
BDD Framework Implementations using Cucumber + Selenium in Java

# Cucumber Feature File
```
Describe your tests here in simple english following Gherkin syntax, which can later serve as automation test script as well as user stories document. Cucumber finds the *.feature file with the help of "features" code in Cucumber Options.
```
### Keywords#
* **Feature:** Defines what feature you will be testing in the tests below
* **Given:** Tells the pre-condition of the test
* **And:** Defines additional conditions of the test
* **Then:** States the post condition. You can say that it is expected result of the test.

# Code Structure
### Step Definitions
``` 
Step Definition is a java method which runs against the matched Gherkin step. Usually gets annotated with @Given, @When, @And, @Then. Cucumber finds these methods with the help of "glue" (java package) code in Cucumber Options.
```

### Page Objects
```
Page Objects help to ease the maintainance and always inherits Page Object Design Pattern.
Contains Feature Specific Info.
```

### Placeholders
```
Mock Data is maintained here. *
```
### Hooks
```
Hooks are blocks of code that run before or after each scenario. Supported by @Before and @After annotattions.
for example, @Before can have following use cases.
* Starting a webdriver
* Setting up DB connections
* Setting up test data
* Setting up browser cookies
* Navigating to certain page
* or anything before the test

@After can be closing the above connections as welll as Logging, Printing, Taking Screenshots etc.
```


# Setup
* Install Java
```
Follow Steps
https://java.com/en/download/help/download_options.xml
```
* Intall Gradle
```
Follow Steps
https://gradle.org/install/
```
* Install Git 
```
Follow Steps
https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
```
* Git Clone
```
git clone https://github.com/whyaneel/bdd-framework.git

and 

switch to branch "basics-loginpage"
```
* Run Cucumber
```
gradle cucumber
```

# Understand build.gradle
```
configurations
task  
respositories
dependencies
```







