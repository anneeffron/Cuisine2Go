
# Team 2 Documentation #
## Introduction ##
#### Purpose ####
Our goal is to create a program that will allow a food delivery company to optimize their schedule by sending the closest driver to pick up available orders. There will be a single Scheduler object which will handle all of the Orders and Drivers in the system. It will assign active drivers to fulfill orders by picking up food orders then traveling to their drop-off location, and will update the GUI to show the current status of the system.

#### Field ID Names ####

###### OrderScreen: ######
        * menuDrop
        * qtyField
        * addButton
        * nameField
        * xField
        * yField
        * orderArea
        * totalField
        * clearButton
        * submitButton
###### OrderScreenController: ######
        * clearButtonClick
        * submitButtonClick
###### DriverLogin: ######
        * userField
        * passField
        * inButton
        * outButton
###### DriverLoginController: ######
        * inButtonClick
        * outButtonClick
######  DriverScreen: ######
        * driverNameField
        * newUsernameField
        * newPassField
        * clearButton
        * submitButton
###### DriverScreenController: ######
        * clearButtonClick
        * submitButtonClick
######   SchedulerScreen: ######
        * stepButton
######  ReportScreen: ######
        * grossIncomeLabel
        * totalHrLabel
        * refreshButton
        * homeButton
######  ReportScreenController: ######
        * refreshButtonClick
        * homeButtonClick
######   Home: ######
        * newOrderButton
        * newDriverButton
        * driverLogButton
        * schedulerButton
        * reportButton
######   HomeController: ######
        * orderClick
        * newDriverClick
        * driverLogClick
        * schedulerClick
        * reportClick

#### Project Scope ####
   * User enters information(name,address) on the OrderScrene, this will be stored under customer. The address will connect to
   * SchedulerScreen and compaire the customer address to driver location. Within the order there will be an order class(object) that will be of an array list. This array list will consist of <foodName, qty, price, customer, and a boolean that states weather or not the order has been delivered or not>. Throughout this page we will be using getters and setters to access this info.
   * Once an order is recieved by the SchedulerScreen it will the access a list od available drivers. The driver class will consist of name, hours worked, boolean variable to determine if clocked on or not, and an address that represents where the driver is located.
   * To move drivers on the GUI press the step button and the GUI will update. The address class will be on an x,y plane and represnt where the customers and driver are.

#### Road Map ####  
Start at home:
* __New Order__ takes user to OrderScreen. If __Clear__ is clicked, the screen will be cleared. If __Submit__ is clicked, the screen is cleared and the user will be taken to the SchedulerScreen.
* __New Driver__ takes user to DriverScreen. If __Clear__ is clicked, the screen will be cleared. If __Submit__ is clicked, the screen is cleared and the user will be taken to the Home screen.
* __Driver Login/Logout__ takes the user to the DriverLogin screen. If __Clock-in__ the screen will be cleared and take the user to the Home screen. If __Clock-out__ the screen will be cleared and take the user to the Home screen.
* __Report__ takes user to Report screen. If __Refresh__ the screen will reload with updated values. If __Home__ is clicked the user will be taken to the home page.

## Overall Description ##
* __Customer.java:__ Has a public class Customer that holds and returns the name, id, and address that was given to the OrderScreen.fxml by the customer. 

* __Driver.java:__ The driver class creates an array that includes the drivers name, address, and boolean variables if they are available, and if they have picked up food. This information is retrieved from the information inputed by the driver in the DriverLogin.fxml. This class can also add and store new drivers that are given by the DriverScreen.fxml. At the bottom of this class it returns all of the drivers information. 

* __DriverLoginController.java:__ This is where drivers will login and log out. To do this drivers will enter Their name and id number then either clock-in or out. When the driver clocks in the controller checks with the Driver.java class if this driver ID is the same as what already exists in the system, if it does then that persons boolean value of availability will be switched to true. When the driver clocks out the controller refers to the Driver.java class and changes the boolean value of availability will be switched to false. After either button is clicked the driver will automatically be taken back to the home screen.

* __DriverScreenController:__ This controller also interacts with the Driver.java class. Here useres will be prompted to enter their name and be given an ID. this ID will be used to login when the driver wants to work. If the driver wishes to clear the information the Clear Button will do this. When the new driver is ready to submit they will press the Submit button and the Controller will save the inputed information into an array list. This array list will then be given to Driver.java where the driver will be added with the other drivers. Finally the screen will close and go bact to the Home.fxml page.

* __HomeController.java:__ The HomeController is the page where the user can go to any page they want. Here the user can make an order, sign up to be a new driver, login and out as a driver who currently works there, see the scheduler page where you can see the driver move, and the report page where users can see the total gours worked by employees as well as the gross income.

* __Item.java:__ The Item class communicates with the OrderScreenController, and retrieves the item name, qty and price for each iem ordered. Returns a string that consists of the item name, qty ordered, and price*qty. 

* __Main.java:__ When the application runs the Home.fxml is pulled up and starts our application.

* __Order.java:__ Communicates with OrderController, and passes the items ordered, customers name, address, and the total price of the order. Also adds items into an array list.

* __OrderScreenController.java:__ Places all orders into an array list as well as keeps track of customer id. initialize() populates the menuDrop. Contains clear button, and submit button. When submit button is clicked the items are added into an array list, and info is added to Customer class. 

* __ReportScreenController.java:__ Handles homeButtonClick and refreshButtonClick. Connected to HomeScreen.

* __Scheduler.java:__ Communicates with Customer, Driver, Order, and Address. Intakes the driver location, restaurant location and customer location. When step is pressed the driver moves 10 steps horizontally or vertically. Checks if there is another order, and if there is then it moves on to next customer. 

* __SchedulerScreenController.java:__ Communicates with Scheduler. Activating methods from scheduler when step is pressed.

* __address.java__ connected to order, driver, and customer. Collects address and adds them to an x, y coordinate 

## Unable To Finish ##

We were unable to finish these things due to a lack of time allowed for the first phase. As a team we spent a lot of time outside of class working on the code and utilized out classtime efficiently. 

* Unable to make our app dynamically able to add drivers and orders to scheduler screen
* Unable to log in and out drivers
* Unable to get report to return total hours worked and gross income. 











