package application;
//address is connected to order, driver, and customer

//create x and y coordinates, and set them equal to 0 
public class address {
	int x = 0;
	int y = 0;
	
	public address() {
		
	}
	//set the retrieved x and y to variables x and y 
	public address(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//retrieves x from OrderScreenController
	public  int getX() {
		return x;
	}
	//retrieves y from OrderScreenController
	public int getY() {
		return y; 
	}
	
	
	//returns the address coordinates 
	public String toString(){
		return "(" + x + "," + y + ")";
		
	}

}
