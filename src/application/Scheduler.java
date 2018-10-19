package application;

import java.util.ArrayList;


public class Scheduler {
	
	public static Driver getClosestDriver(ArrayList<Driver> driverList) {
		
		
		Driver temp = null;
		for(int i=0; i < driverList.size(); i++) {
			temp = driverList.get(0);
		}
		int currDist = Integer.MAX_VALUE;
		for(Driver driver : driverList) {
			System.out.println("Hello" + driver.getName());
			int xdist1 = driver.getXaddress() - 250;
			int ydist1 = driver.getYaddress() - 250;
			int totdist1 = (Math.abs(xdist1) + Math.abs(ydist1));
			System.out.println("totdist1" + totdist1);
			if(currDist > totdist1) {
				temp = driver;
				currDist = totdist1;
			}
		}
		if(temp != null)
			return temp;
		
		return null;
		
//		Driver temp = null;
//		for(int i=0; i < driverList.size(); i++) {
//			temp = driverList.get(0);
//		}
//		int currDist = Integer.MAX_VALUE;
//		for(Driver driver : driverList) {
//			System.out.println("Hello" + driver.getName());
//			int xdist1 = driver.getXaddress() - 250;
//			int ydist1 = driver.getYaddress() - 250;
//			int totdist1 = (Math.abs(xdist1) + Math.abs(ydist1));
//			System.out.println("totdist1" + totdist1);
//			if(currDist > totdist1) {
//				temp = driver;
//				currDist = totdist1;
//			}
//		}
//		if(temp != null)
//			return temp;
//		
//		return null;
	}
	
	public static address getOrderLocation(ArrayList<Order> orderList) {
//		address orderAddress = null;
//		for (int i = 0; i < orderList.size(); i++) {
//			orderAddress = orderList.get(0).getCustAddress();
//		}
//		return orderAddress;
		address orderAddress = null;
		//for (int i = 0; i < orderList.size(); i++) {
			orderAddress = orderList.get(0).getCustAddress();
		//}
		return orderAddress;
//	
	}
	
	
	
	
	public static Driver getNewLocation(Driver driver1) {
		//Driver driver1 = getClosestDriver(driverList);
//		System.out.println(driver1.toString());
//		System.out.println("Yeah");
		System.out.println("Old address" + driver1.getAddy());
		System.out.println(driver1.getName());
		int xdist = driver1.getXaddress();
		int ydist = driver1.getYaddress();
		 if(xdist > 250) {
			  if(xdist > 260)
				 xdist -= 10;
			  else
				 xdist = 250; 
		  }
		  
		  if(xdist < 250) {
			  if(xdist < 240 )
				 xdist += 10;
			  else
				 xdist = 250; 
		  }
		  if(xdist == 250) {
			  if(ydist > 250) {
				  if(ydist > 260)
					 ydist -= 10;
				  else
					 ydist =250; 
			  }
			  if(ydist < 250) {
				  if(ydist < 240)
					 ydist += 10;
				  else
					 ydist = 250; 
			  }
		  }
		
		
		
		  //while(xdist != 50 && ydist != 50){
			  
//			  if(xdist > 250) {
//				  if(xdist > 260)
//					 xdist -= 10;
//				  else
//					 xdist = 250; 
//			  }
//			  
//			  if(ydist > 250) {
//				  if(ydist > 260)
//					 ydist -= 10;
//				  else
//					 ydist =250; 
//			  }
//			  
//			  if(xdist < 250) {
//				  if(xdist < 240 )
//					 xdist += 10;
//				  else
//					 xdist = 250; 
//			  }
//			  
//			  if(ydist < 250) {
//				  if(ydist < 240)
//					 ydist += 10;
//				  else
//					 ydist = 250; 
//			  }
//			  if(xdist == 250) {
//				  if(ydist > 250) {
//					  if(ydist > 260)
//						  ydist -= 10;
//					  else
//						  ydist =250; 
//				  				  }
//				 if(ydist < 250) {
//				  		if(ydist < 240)
//				  			ydist += 10;
//				 		else
//				 			ydist = 250; 
//				  				  }
//				   	}
			  
		  //}
		  
		// can move ten units horizontally per click
//		if((xdist - 10) >10) {
//			xdist = xdist-10;
//			System.out.println(xdist);
//		}
//		// if x value is less than 10 - will arrive next click - x = objective's x
//		if(xdist < 10) {
//			xdist = 0;
//			System.out.println(xdist);
//		}
//		// can move vertically ten units per click
//		if((ydist - 10) >10) {
//			ydist = ydist-10;
//			System.out.println(ydist);
//		} 
//		// if y value is less than 10 - will arrive next click - y = objective's y
//		if(ydist < 10) {
//			ydist = 0;
//			System.out.println(ydist);
//		}
		// passing new values to address in driver class
		
		//address newAd = new address(xdist, ydist);
		driver1.setNewAddress(xdist, ydist);
		if(driver1 != null) {
			System.out.println("New address" + driver1.getAddy());
			return driver1;
		}
		return null;
	}
	
	public static Driver delieverFood(ArrayList<Order> orderList, Driver driver) {
		address orderAddress = Scheduler.getOrderLocation(orderList);
		int xOrder = orderAddress.getX();
		int yOrder = orderAddress.getY();
		int xDriver = driver.getXaddress();
		int yDriver = driver.getYaddress();
		if(xDriver > xOrder) {
			  if(xDriver > (xOrder + 10))
				  xDriver -= 10;
			  else
				  xDriver = xOrder; 
		  }
		  
		  if(xDriver < xOrder) {
			  if(xDriver < (xOrder - 10))
				  xDriver += 10;
			  else
				  xDriver = xOrder; 
		  }
		  
		  if (xDriver == xOrder) {
			  if(yDriver > yOrder) {
				  if(yDriver > (yOrder + 10))
					  yDriver -= 10;
				  else
					  yDriver = yOrder; 
			  }
			  
			  if(yDriver < yOrder) {
				  if(yDriver < (yOrder - 10))
					  yDriver += 10;
				  else
					  yDriver = yOrder; 
			  }
		  }
		
//		 
//		if(xDriver > xOrder) {
//			  if(xDriver > (xOrder + 10))
//				  xDriver -= 10;
//			  else
//				  xDriver = xOrder; 
//		  }
//		  
//		  if(yDriver > yOrder) {
//			  if(yDriver > (yOrder + 10))
//				  yDriver -= 10;
//			  else
//				  yDriver = yOrder; 
//		  }
//		  
//		  if(xDriver < xOrder) {
//			  if(xDriver < (xOrder - 10))
//				  xDriver += 10;
//			  else
//				  xDriver = xOrder; 
//		  }
//		  
//		  if(yDriver < yOrder) {
//			  if(yDriver < (yOrder - 10))
//				  yDriver += 10;
//			  else
//				  yDriver = yOrder; 
//		  }
//		  
//		  if(xDriver == xOrder && yDriver == yOrder) {
//			  			  if(yDriver > yOrder) {
//			  				  if(yDriver > (yOrder + 10))
//			  					  yDriver -= 10;
//			  				  else
//			  					  yDriver = yOrder; 
//			 			  }
//			  			  if(yDriver < yOrder) {
//			  				  if(yDriver < (yOrder - 10))
//			  					  yDriver += 10;
//			  				  else
//			  					  yDriver = yOrder; 
//			  			  }
//			  			  
//	
//	}
//			  
		  
		  driver.setNewAddress(xDriver, yDriver);
		  return driver;
	
	}
}
				
				
				  
			 
//			  
//			  if (yDriver == yOrder)
//			  if(yDriver > yOrder) {
//				  if(yDriver > yOrder + 10)
//					 yDriver -= 10;
//				  else
//					 yDriver =yOrder; 
//			  }
//			  if(yDriver < yOrder) {
//				  if(yDriver < yOrder -10 )
//					 yDriver += 10;
//				  else
//					 yDriver = yOrder; 
//			  }
		  
	

		
		
//		if(xDriver > xOrder) {
//			  if(xDriver > (xOrder + 10))
//				  xDriver -= 10;
//			  else
//				  xDriver = xOrder; 
//		  }
//		  
//		  if(yDriver > yOrder) {
//			  if(yDriver > (yOrder + 10))
//				  yDriver -= 10;
//			  else
//				  yDriver = yOrder; 
//		  }
//		  
//		  if(xDriver < xOrder) {
//			  if(xDriver < (xOrder - 10))
//				  xDriver += 10;
//			  else
//				  xDriver = xOrder; 
//		  }
//		  
//		  if(yDriver < yOrder) {
//			  if(yDriver < (yOrder - 10))
//				  yDriver += 10;
//			  else
//				  yDriver = yOrder; 
//		  }
//		  
//		  if(xDriver == xOrder && yDriver == yOrder) {
//			  			  if(yDriver > yOrder) {
//			  				  if(yDriver > (yOrder + 10))
//			  					  yDriver -= 10;
//			  				  else
//			  					  yDriver = yOrder; 
//			 			  }
//			  			  if(yDriver < yOrder) {
//			  				  if(yDriver < (yOrder - 10))
//			  					  yDriver += 10;
//			  				  else
//			  					  yDriver = yOrder; 
//			  			  }
	

		  
		  
		 
		  



	
	
//	public static void main(String[] args) {
//		
//		// create loop for number of orders in order array list to send this through
//		Driver drivers = new Driver();
//		ArrayList<Driver> driverList  = new ArrayList<Driver>(drivers.getDrivers()); 
//		Driver closest = getClosestDriver(driverList);
//		System.out.println(closest.getName());
//		System.out.println(closest.getAval());
//		System.out.println(closest.getXaddress());
//		System.out.println(closest.getYaddress());
//		Driver driver1 = getNewLocation(driverList);
//		System.out.println(driver1.getAddy());
//		
////			// MOVE 10 UNITS PER STEP ---- ***
////			
////			}
//			//driverList.get(i).setFood(true);
//		}
//		// NEXT SECTION OF ORDER PROCESSING THROUGH ALGORITHM:
			// WHILE ORDER HAD HORIZONTAL DISTANCE TO GO :
				// move one unit per click step positive or negative depending on value of xdist1 to the restaurant
				// foodPickedUp = true;
			// WHILE ORDER HAS VERTICAL DISTANCE TO GO:
				// move one unit per click step positive or negative depending on value of ydist1
			// ONCE THE RESTAURANT IS REACHED NEED FIVE CLICKS FOR "PICKING UP FOOD"
				// move one unit per click horizontally towards customer address
				// move one unit per click vertically towards customer address
				// ADD FIVE TO "DELIVER THE FOOD"


		
		// --> ? Should we have them immediately move back to the restaurant when theyre not busy?
		// Will help cut down on time between orders --> 
			// Once driver is back at restaurant 
			// COULD SEND DRIVER IN REVERSE ORDER OF HOW THEY DELIVERED
			// USING OPPOSITE SIGN VALUES OF xdist2, ydsit2
			// NOW DRIVERS ALWAYS WAITING AT STORE FOR PICK UP
	


					
//testing the get address
//			for (int i = 0; i < order.size(); i++) {
//				System.out.println(Order.get(i).getCustAddress());
//			}

//seeing the total of each order
