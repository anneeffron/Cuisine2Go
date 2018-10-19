package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController {
	@FXML
	private Button newOrderButton;
	@FXML
	private Button newDriverButton;
	@FXML
	private Button driverLogButton;
	@FXML
	private Button schedulerButton;
	@FXML
	private Button reportButton;
	
	private HomeController callingController;
	private ReportScreenController callingController2;
	private DriverScreenController callingController3;
	
	
	
	private Stage OrderStage;
	private Stage OrderStage2;
	private OrderScreenController orderController;
	private DriverScreenController driverController;
	private DriverLoginController driverLogController;
	private ReportScreenController reportController;
	private SchedulerScreenController schedulerController;
	
	

	
	@FXML
	public void orderClick(ActionEvent event) {
	if (OrderStage == null) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/OrderScreen.fxml"));
		AnchorPane dialogRoot;
	
		
		try {
			dialogRoot = (AnchorPane) loader.load();
			Scene dialogScene = new Scene(dialogRoot);
			OrderStage = new Stage();
			OrderStage.setScene(dialogScene);
			OrderStage.setTitle("");
			orderController = (OrderScreenController)loader.getController();
			orderController.setCallingControl(this);
			
		} catch(IOException e) {
			e.printStackTrace();		
			
		}
	
		OrderStage.show();
	}
	}
	
	@FXML
	public void newDriverClick(ActionEvent event) {
		
		if (OrderStage == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/DriverScreen.fxml"));
			AnchorPane dialogRoot;
		
			
			try {
				dialogRoot = (AnchorPane) loader.load();
				Scene dialogScene = new Scene(dialogRoot);
				OrderStage = new Stage();
				OrderStage.setScene(dialogScene);
				OrderStage.setTitle("");
				driverController = (DriverScreenController)loader.getController();
				driverController.setCallingControl(this);
				
			} catch(IOException e) {
				e.printStackTrace();		
				
			}
		
			OrderStage.show();
		}
		OrderStage=null;
		
	}
	
	@FXML
	public void driverLogClick(ActionEvent event) {
		address ad1 = new address(10,13); 
		address ad2 = new address(100,78);
		driverController.getDrivers().add(new Driver("Kelly Effron", ad1, false, false, driverController ));
		driverController.getDrivers().add(new Driver("John Smith", ad2, true, false ,driverController));
		String loggedOn = "";
		String loggedOff = "";
		
		for (int i = 0; i < driverController.getDrivers().size(); i++) {
			if (driverController.getDrivers().get(i).avaliable == true) {
				loggedOn += driverController.getDrivers().get(i).getName() + " ";
			}
			else
				loggedOff += driverController.getDrivers().get(i).getName()+ " ";
		}
		
		if (OrderStage == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/DriverLogin.fxml"));
			AnchorPane dialogRoot;
		
			try {
				dialogRoot = (AnchorPane) loader.load();
				Scene dialogScene = new Scene(dialogRoot);
				OrderStage = new Stage();
				OrderStage.setScene(dialogScene);
				OrderStage.setTitle("");
				driverLogController = (DriverLoginController)loader.getController();
				driverLogController.setCallingControl(this);
				
			} catch(IOException e) {
				e.printStackTrace(); }
			driverLogController.setLoggedOn("Logged On: " + loggedOn);
			driverLogController.setLoggedOff("Logged Off: " + loggedOff);
			
			
			OrderStage.show();
		}
		OrderStage=null;
	}
	
	@FXML
	public void schedulerClick(ActionEvent event) {
	
		address ad1 = new address(10,13); 
		address ad2 = new address(100,78);
	
	
		
		driverController.getDrivers().add(new Driver("Kelly Effron", ad1, false, false, driverController ));
		driverController.getDrivers().add(new Driver("John Smith", ad2, true, false ,driverController));
		
	
		if (OrderStage == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/SchedulerScreen.fxml"));
			AnchorPane dialogRoot;
		
			try {
				dialogRoot = (AnchorPane) loader.load();
				Scene dialogScene = new Scene(dialogRoot);
				OrderStage2 = new Stage();
				OrderStage2.setScene(dialogScene);
				OrderStage2.setTitle("");
				schedulerController = (SchedulerScreenController)loader.getController();
				schedulerController.setCallingControl(this);
				
				
				
			} catch(IOException e) {
				e.printStackTrace(); }
			//schedulerController.setLabel1("frog");
			schedulerController.setArrayList(orderController.getOrder());
			schedulerController.setDrivers(driverController.getDrivers());
			
			
			
			
//			if (driverController.getDrivers().size() == 0) {
//				address ad1 = new address(10,13); 
//				address ad2 = new address(100,78);
//				driverController.getDrivers().add(new Driver("Kelly Effron", ad1, false, false));
//				driverController.getDrivers().add(new Driver("John Smith", ad2, true, false));
//				schedulerController.setDrivers(driverController.getDrivers());
//			}
	
			
			OrderStage2.show();
			
		}
		OrderStage2=null;
	}
	
	
	@FXML
	public void reportClick(ActionEvent event) {
		double total = 0.0;
		for (int i = 0; i < orderController.getOrder().size(); i++ ) {
			total += orderController.getOrder().get(i).getTotalprice();
		}
		if (OrderStage == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ReportScreen.fxml"));
			AnchorPane dialogRoot;
		
			try {
				dialogRoot = (AnchorPane) loader.load();
				Scene dialogScene = new Scene(dialogRoot);
				OrderStage2 = new Stage();
				OrderStage2.setScene(dialogScene);
				OrderStage2.setTitle("");
				reportController = (ReportScreenController)loader.getController();
				reportController.setCallingControl(this);
				
				
			} catch(IOException e) {
				e.printStackTrace(); }
			reportController.setLabel(Double.toString(total));
			OrderStage2.show();
			
		}
		OrderStage2=null;
	}
	public void setCallingControl(HomeController c) {
		callingController = c;
}

	public void setCallingController(ReportScreenController c) {
		callingController2 = c;
		// TODO Auto-generated method stub
	}
	public void setCallingController(DriverScreenController c) {
		callingController3 = c;
		// TODO Auto-generated method stub
	}
	
	
	
}