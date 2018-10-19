package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;

import javafx.scene.control.ChoiceBox;

public class OrderScreenController {




	//Creates drop down for items on menu

	ObservableList<String> foodList = FXCollections.observableArrayList("cheeseburger-5.00", "hamburger-4.00", "shake-3.00","fries-2.00","chicken tenders-3.50" );

	//array list that holds all the items a customer orders
	ArrayList <Item> itemList = new ArrayList<>();
	
	//an array list that holds all the orders
	ArrayList <Order> order = new ArrayList<>();
	
	Order orders = new Order();


	//keeping track of customer id
	int id = 0;



	@FXML
	private TextField totalField;
	@FXML
	private ChoiceBox menuDrop;
	@FXML
	private TextField qtyField;
	@FXML
	private Button addButton;
	@FXML
	private TextField nameField;
	@FXML
	private TextField xField;
	@FXML
	private TextField yField;
	@FXML
	private Button clearButton;
	@FXML
	private Button submitButton;
	@FXML
	private TextArea orderArea;

	@FXML
	private void initialize () {
		//https://youtu.be/MUw7MHIibBc
		//makes drop down work
		menuDrop.setItems(foodList);
	}
	
	private HomeController callingController;
	
	
	
	
	//names and strings 
	String food, message = "";
	double price, qty = 0.0;
	double finalTotal = 0.0;
	
	
	// Event Listener on Button[#addButton].onAction
	@FXML
	public void addButtonClick(ActionEvent event) {
		//getting the food items the customer selects and splitting them between the food name and the food price
		String item = (String) menuDrop.getValue();
		//assigning the first part of the String to food
		food = item.substring(0, item.indexOf("-"));
		//assigning the first part of the String to price
		price = Double.parseDouble(item.substring(item.indexOf("-") +1 ));

	
		
		//making qty = whatever is in the qtyField field box
		qty = Double.parseDouble(qtyField.getText());
		
		double totalprice = price * qty; 


		//item list contains instances of the item class

		//puts food, qty, and price into the item Array
		
		
		//ArrayList <Item> itemList1 = new ArrayList<>();
		Item item1 = new Item(food, qty, price,this);
		
	//this.getList().add(item1);
		//this.getList().add(item1);
		if (this.getList().size() == 0) {
			this.getList().add(item1);
		}
					
		else {
			this.addItems(item1);}
		
		

		//this.setItemList(this.getList());
		

		//showcust goes through and prints out each item the customer has ordered
		//this makes it so customers can order 1 to infinite items
//		String showcust = "";
//		for (int i = 0; i < itemList.size(); i++) {
//			showcust += itemList.get(i).toString() + "\n";
//			orderArea.setText(showcust);
//		}
		finalTotal += totalprice;
		String total2= String.valueOf(finalTotal);
		
		message += "Item: " + food + "\tPrice: $" + price + "\tQty: "+ qty + "\tThe total price is: $" + totalprice + "\n";
		orderArea.setText(message);
		
		totalField.setText(total2);
		
		
		
	}
	

	
public ArrayList<Item> getList(){
	return this.itemList;
}

public ArrayList<Order> getOrder(){
//	for (int i = 0; i > order.size(); i++) {
//		System.out.println(order.indexOf(i));
//	}
	return this.order;
}

public void setItemList(ArrayList<Item> itemList) {
	this.itemList = itemList;
		
}

void addItems(Item item) {
	this.itemList.add(item);
}

void clearList() {
	this.getList().clear();
}
	

	// Event Listener on Button[#clearButton].onAction
	//clears all fields when button in clicked
	@FXML
	public void clearButtonClick(ActionEvent event) {
		
		nameField.clear();
		xField.clear();
		yField.clear();
		qtyField.clear();
		totalField.clear();
		orderArea.clear();
		message = "";
		this.getList().clear();
		finalTotal = 0; 


		
	}

	// Event Listener on Button[#submitButton].onAction
	@FXML
	public void submitButtonClick(ActionEvent event) {
		Date dateCreated=  new Date(); 
		ArrayList <Item> itemList2 = new ArrayList<>();
		for (int i = 0; i < this.getList().size(); i++) {
			itemList2.add(this.getList().get(i));
			
		}
	
		//adding one to the ID so the ID is unique for everyone
		id++;
		int x = Integer.parseInt(xField.getText());
		int y = Integer.parseInt(yField.getText());

		//creating ad which represents an x,y coordinate
		address ad = new address(x,y);

		Customer person = new  Customer(id, nameField.getText(), ad, this);
		order.add(new Order(itemList2, person, dateCreated, this));

		for (int i = 0; i < this.getOrder().size(); i++) {
			System.out.println(this.getOrder().get(i).toString());	
			
	}
	

}
	

public void setCallingControl(HomeController c) {
		callingController = c;
}


}