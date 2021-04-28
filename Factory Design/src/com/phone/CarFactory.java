package com.phone;

public class CarFactory {
	
	public CAR getInstance(String str) {
		
		if(str.equals("engine"))
			return new Engine();
		
		else if (str.equals("body"))
			return new Body();
		
		else if (str.equals("chasis"))
			return new Chassis();
		
		else
			return new TransmissionSystem();
	}

}
