package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import application.Customer;
import application.address;
import application.Item;

public class Order {
	

	
	//datetime time_in
	//datetime time_out
	Customer person = new Customer();
	OrderScreenController orderController;
	ArrayList <Item> items = new ArrayList<>();
	Date dateCreated=  new Date(); 

	
	
	public Order(){
	}
	
	public Order(ArrayList item, Customer person, Date date, OrderScreenController orderController) {
		this.items = item;
		this.person = person;
		this.dateCreated = date;
		this.orderController = orderController;
		
	
	}
	
	public address getCustAddress() {
		return person.getAddy();
		
	}
	
	public String getCustName() {
		return person.fullName;
	}
	
	
	public double getTotalprice() {
		double total = 0.0;
		
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getNewPrice();
		}
		return total;
	}
	
	public String toString() {
		return "The person is " + person + " the items they bought are " + items + "\nDate" + dateCreated;
	}
	
	//returning the arraylist created in the orderscreen controller
//	public ArrayList<Order> getOrders() {
//		return orderController.getOrder();
//		
//		
//	}
////	public void setOrderList(ArrayList<Order> newOrders) {
//		this.orders = newOrders;
//	}
//	
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public Date getDate() {
		return dateCreated;
	}
//	public ArrayList<Order> getOrders2(){
//		return orderController.returnOrderList();
//	}
//	
	
	
	
	

}
