
# SauceDemoCucumberTest

A short login Automated Test using Cucumber for https://www.saucedemo.com/


## Authors

- [@RadityoH322](https://github.com/RadityoH322)


## Project Structure


```
  |src/
      |-test/
            |-java/
                  |-helper/
                          |- Utility.java   #Activating Web Driver
                  |-pages/
                          |-Home Page    #Page object for Home Page
                          |-Login Page   #Page object for Login Page 
                  |-runner/
                          |-CucumberTestRunner #cucumber runner config
                  |-stepDefinitions/
                                    |-Hooks #Start WebDriver before test run and Close Webdriver after test finished
                                    |-LoginStepDef  #step Definition for login.features
            |-resources/
                        |-features/
                                    |-login.feature  #Gherkin login scenarios

  
```

    
## Run Test

Click Run'CucumberTestRunner.Java'




## Dependencies

cucumber-java:7.22.1

cucumber-junit:7.22.1

bonigarcia:webdrivermanager:6.1.0

elenium-java:4.32.0
