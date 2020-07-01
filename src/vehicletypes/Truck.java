package vehicletypes;

public class Truck extends Car {
	public Truck() {} //Default Constructor
	public Truck(String brand, String model, String color, String fuelType, int mpg) { 
		super(brand, model, color, fuelType, mpg);
	}
}
