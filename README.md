# HOOQ_QA_Engineer_Test
This is just for Testing Hooq web testing page

## Preparation:
1. JDK 1.8.-x version
2. Chrome web driver
3. Selenium
4. TestNG
5. Maven
6. Chrome or Firefox web driver
7. IDE(Intellij IDEA)

### Sign Up Feature
1. User Select Login Button
2. User input email
3. User click cubmit button
4. User fill all textfield 
5. User submit data
expected: User should be redirect to the account new created home page, user profile should be appeared correctly as per submitted

## Test Plan
### Login Feature
* TP-1 : Ensure User cannot Login using Invalid account
* TP-2 : Ensure User can Login Using Valid Account
 
## Test Case
* TP-1. TC - 1 : User try Login using invalid username
* TP-1. TC - 2 : User try Login using invalid password
* TP-1. TC - 3 : User try Login using invalid account
* _expected : User Cannot Login_
  
* TP-2. TC - 1 : User try Login using Valid username
* TP-2. TC - 2 : User try Login using Valid password
* TP-2. TC - 3 : User try Login using Valid account
* _expected : User can Login Successfully_
