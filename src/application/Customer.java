package application;

import application.address;

//stores each customer with a name, id and address taken from OrderScreenController
public class Customer {
	String fullName = "";
	int id = 0;
	address ad = new address();
	OrderScreenController orderController;
	
	public Customer() {
		
	}
	//getting and setting variables 
	public Customer(int Id, String name, address ad, OrderScreenController orderController) {
		this.fullName = name;
		this.id = Id;
		this.ad = ad;
		this.orderController = orderController;
	}
	
	//getting the address
	public address getAddy() {
		return ad;
	}
	
	//returns customer information
	public String toString(){
		return "Customer ID:" + id + "\nCustomer Name: " + fullName + "\nAddress: " + ad;
	}
}
