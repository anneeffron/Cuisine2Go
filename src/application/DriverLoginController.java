package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;

//import javafx.scene.control.PasswordField;

public class DriverLoginController {
//	@FXML
//	private Button inButton;
//	@FXML
//	private Button outButton;
//	@FXML
//	private TextField userField;
//	@FXML
//	private PasswordField passField;
	
	@FXML
	private Label loggedOn;
	@FXML
	private Label loggedOff;
	
	private HomeController callingController;

	// Event Listener on Button[#inButton].onAction
	
	@FXML
	public void setLoggedOn(String s) {
		loggedOn.setText(s);
	}
	
	@FXML 
	public void setLoggedOff(String s) {
		loggedOff.setText(s);
	}
//	@FXML
//	public void inButtonClick(ActionEvent event) {
//		// TODO if the name and id potentially are the same set available to true
//	}
//	// Event Listener on Button[#outButton].onAction
//	@FXML
//	public void outButtonClick(ActionEvent event) {
//		// TODO Autogenerated
//	}
	public void setCallingControl(HomeController c) {
		callingController = c;
}
}
