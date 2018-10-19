package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

public class SchedulerScreenController {
	@FXML
	private Button stepButton;
	@FXML
	private Label DriverLabel;
	@FXML
	private Label OrderLabel;
	@FXML
	private Label statusLabel;
	@FXML
	private Label orderStatus;
	@FXML 
	private Label driverName;
	
	private HomeController callingController;
	
	private OrderScreenController orderController;
	
	private DriverScreenController driverController;
	
	ArrayList <Order> Schedulerorder = new ArrayList();
	ArrayList <Driver> DriverList= new ArrayList();
	
	boolean foodPickedup = false;
	Driver driver1;
	double xcoord = 0.0;
	double ycoord = 0.0;
	
	double xOcoord = 0.0;
	double yOcoord = 0.0;
	

	
//	void setNewXcoord(double newX) {
//		xcoord = newX;
//	}
//	
//	void setNewYcoord(double newY) {
//		ycoord = newY;
//	}
	
	
	public void setCallingControl(HomeController c) {
		callingController = c;
		

}
	
//	public void setLabel1(String s) {
//		//ArrayList<Order> orderList = (orderController.getOrder());
//		getLabel.setText(s);
//
//	}
	
	public void setArrayList(ArrayList <Order> a) {
		Schedulerorder = a;
		OrderLabel.setLayoutX(getXLocation(a));
		OrderLabel.setLayoutY(getYLocation(a));
		orderStatus.setText(Schedulerorder.get(0).getCustName() + "order");
		statusLabel.setText("Status: Getting Food");
		
		
//		DriverList = d;
//		driver1 = Scheduler.getClosestDriver(DriverList);
//		xcoord = driver1.getXaddress();
//		ycoord=  driver1.getYaddress();
//		DriverLabel.setLayoutX(xcoord);
//		DriverLabel.setLayoutY(ycoord);
//		
		
		
		
	}
	
	public int getXLocation(ArrayList <Order> a) {
		return a.get(0).getCustAddress().getX();
		
		
	}
	
public int getYLocation(ArrayList <Order> a) {
	return a.get(0).getCustAddress().getY();
	}
	
	
	
	public void setDrivers(ArrayList <Driver> d) {
		DriverList = d;
		driver1 = Scheduler.getClosestDriver(DriverList);
		driverName.setText(driver1.getName());
		xcoord = driver1.getXaddress();
		ycoord=  driver1.getYaddress();
		DriverLabel.setLayoutX(xcoord);
		DriverLabel.setLayoutY(ycoord);
		
	}
	
	
	
	
	
//	void setArrayList(ArrayList <Order> newOrderlist) {
////		Schedulerorder = newOrderlist;
////	}
////	
////	public ArrayList <Order> returnOrders(){
////		return this.Schedulerorder;
////	}
	@FXML
	public void StepClick(ActionEvent event) {
		
		
		
		System.out.println("Step clicked");
		if(!this.foodPickedup) {
		System.out.println("First Block");	
		
		//Driver closest = Scheduler.getClosestDriver(DriverList);
//		double xcoord = closest.getXaddress();
//		double ycoord=  closest.getYaddress();
//		DriverLabel.setLayoutX(xcoord);
//		DriverLabel.setLayoutY(ycoord);
		
		
//		System.out.println(closest.getAval());
//		System.out.println(closest.getXaddress());
//		System.out.println(closest.getYaddress());
		//Driver driver1 = Scheduler.getClosestDriver(DriverList);
		driver1 = Scheduler.getNewLocation(driver1);
		System.out.println(driver1.getAddy());
		xcoord = driver1.getXaddress();
		ycoord = driver1.getYaddress();
		DriverLabel.setLayoutX(xcoord);
		DriverLabel.setLayoutY(ycoord);
		if(xcoord == 250 && ycoord ==250) {
			statusLabel.setText("Status: On to Delivery Now.");
			System.out.println("Food Picked Up. On to Delivery Now.");
			this.foodPickedup = true;
			System.out.println(this.foodPickedup);
		}
		}
		if(foodPickedup) {
			System.out.println("Second Block");
			statusLabel.setText("Status: Delivering Food");
			driver1 = Scheduler.delieverFood(Schedulerorder, driver1);
			xcoord = driver1.getXaddress();
			ycoord = driver1.getYaddress();
			System.out.println("X: " + xcoord + " Y: " + ycoord);
			System.out.println("X: " + getXLocation(Schedulerorder) + " Y: " + getYLocation(Schedulerorder));
			DriverLabel.setLayoutX(xcoord);
			DriverLabel.setLayoutY(ycoord);
			if(driver1.getXaddress() == getXLocation(Schedulerorder) && driver1.getYaddress() == getYLocation(Schedulerorder) ) {
				foodPickedup = false;
				orderStatus.setText("Order:");
				statusLabel.setText("Status: On to next order ");
				
				
				System.out.println("On to next order");
				Schedulerorder.remove(0);
				orderStatus.setText(Schedulerorder.get(0).getCustName() + "order");
				statusLabel.setText("Status: Getting Food");
				OrderLabel.setLayoutX(getXLocation(Schedulerorder));
				OrderLabel.setLayoutY(getYLocation(Schedulerorder));
				
			}
		}
		
		
		
		
		
//		System.out.println(Schedulerorder.size());
//		System.out.println(DriverList.size());
//		
		
//			System.out.println(this.returnOrders().get(i).toString());
//		}
//	
		
//		for (int i = 0; i < Schedulerorder.size(); i++) {
//			System.out.println(Schedulerorder.get(i).toString());
//		}
//		
	}
	
	
	
}