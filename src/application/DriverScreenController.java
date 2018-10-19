package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;



public class DriverScreenController {
	@FXML
	private Button clearButton;
	@FXML
	private Button submitButton;
	@FXML
	private TextField driverNameField;
	@FXML
	private TextField newXfield;
	@FXML
	private AnchorPane mainPane;
	@FXML
	private TextField newYfield;
	private HomeController callingController;


	private Stage OrderStage;
	Driver driver = new Driver();
	
	ArrayList <Driver> driverList = new ArrayList<>();
	
	
	// Event Listener on Button[#clearButton].onAction
	@FXML
	public void clearButtonClick(ActionEvent event) {
		driverNameField.clear();
		newXfield.clear();
		newYfield.clear();

	}
	
	
	
	// Event Listener on Button[#submitButton].onAction
	@FXML
	public void submitButtonClick(ActionEvent event) {
		

		String name = driverNameField.getText();
		
		int x = Integer.parseInt(newXfield.getText());
		int y = Integer.parseInt(newYfield.getText());
		
		address ad = new address(x,y);
		
		driverList.add(new Driver(name, ad, true, false,this));


		
		for (int i = 0; i < driverList.size(); i++) {
			System.out.print(driverList.get(i).toString());
		}
		System.out.print(driverList.size());
		
		
		
		
//		if (OrderStage == null) {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Home.fxml"));
//			AnchorPane dialogRoot;
//		
//			try {
//				dialogRoot = (AnchorPane) loader.load();
//				Scene dialogScene = new Scene(dialogRoot);
//				OrderStage = new Stage();
//				OrderStage.setScene(dialogScene);
//				OrderStage.setTitle("");
//				callingController = (HomeController)loader.getController();
//				callingController.setCallingController(this);
//				//mainPane.getScene().getWindow().hide();
//				
//			} catch(IOException e) {
//				e.printStackTrace(); }
//			OrderStage.show();
//			
//		}
//		OrderStage=null;
//		mainPane.getScene().getWindow().hide();
		
	}
	
	
	
	public ArrayList <Driver> getDrivers(){
		return this.driverList;
	}
	
	
	
	
	
	void setDriverList(ArrayList <Driver>newDriver) {
		this.driverList = newDriver;
	}
	
	
	
	
	public void setCallingControl(HomeController c) {
		callingController = c;
}
}