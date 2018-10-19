package application;

import java.util.ArrayList;

public class Driver {
	//Create array list Driver that stores the drivers name, location, 
	//if they are available(clocked-in), and if food has been picked up
	ArrayList <Driver> driverList = new ArrayList<>();
	String fullName = "";
	address ad = new address();
	boolean avaliable = true;
	boolean foodPickedup = false; 
	DriverScreenController driverController;
	
	public Driver() {
		
	}
	//get and set to variables
	public Driver(String fullName, address ad, boolean avaliable, boolean foodPickedup, DriverScreenController driverController ) {
		this.fullName = fullName;
		this.ad = ad;
		this.avaliable = avaliable;
		this.foodPickedup = foodPickedup;
		this.driverController = driverController;
		
	}
	
	
	public address getAddy() {
		return ad;
	}
	
	//adding now driver to driver array 
	public void addNewdriver(String name, address ad, boolean avaliable, boolean foodPickedup, DriverScreenController driverController ){
		driverList.add(new Driver(name, ad, avaliable, foodPickedup, driverController ));
	}
	
	public ArrayList<Driver> hardCodedrivers() {
		address ad1 = new address(10,13); 
		address ad2 = new address(50,50);
//		driverList.add(new Driver("Anne Effron", ad1, false, false, driverController));
//		driverList.add(new Driver("John Smith", ad2, true, false, this,driverController));
		return driverList;
	}
	
	public ArrayList<Driver> getDrivers() {
//		address ad1 = new address(10,13); 
//		address ad2 = new address(50,50);
//		driverList.add(new Driver("Anne Effron", ad1, false, false));
//		driverList.add(new Driver("John Smith", ad2, true, false));
		return driverList;
	}
	

	//returns info about driver
	public String toString() {
		return "Name: " + fullName + "\nAddress: " + ad + "\nAvaliable: "+ avaliable +"\nFood Picked up: " + foodPickedup + "\n";
	}
	//public move method

	
	
	
//	public address address(int i, int j) {
//		// TODO Auto-generated method stub
//		return ad;
//	}
	
	public int getXaddress() {
		return ad.getX();
	}
	
	public int getYaddress() {
		return ad.getY();
	}
	
	public String getName() {
		return fullName;
	}
	//returns drivers that are set to available 
	public boolean getAval() {
		return avaliable;
	}
	
	void setNewAddress(int x, int y) {
		ad = new address(x,y);
		
	}
	void setAvaliabilty(boolean newAval) {
		avaliable = newAval;
	}
	public void add(String name, address ad2, boolean b, boolean c, DriverScreenController driverScreenController) {
		
		
	}
}