package application;

public class Item {
	String foodname = "";
	double quanity = 0.0;
	double price = 0;
	OrderScreenController orderController;
	
	
	public Item(){
	}
	
	public Item(String fName, double qty, double Price, OrderScreenController orderController) {
		this.foodname = fName;
		this.quanity = qty;
		this.price = Price;
		this.orderController = orderController;
	
	}
	
	public double getPrice() {
		return price;
	}
//	
	public double getqty() {
		return quanity;
	}
//	
//	public String getName() {
//		return foodname;
//	}
//	
	double getNewPrice() {
		return price *quanity;
	}
	

	public String toString() {
		return "Name: " + foodname + "\nQuanity: " + quanity + "\nPrice: " + price*quanity; 
	}
	

}
