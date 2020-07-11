package vehicletypes;

public class Truck extends Car {
	public Truck() {} //Default Constructor
	public Truck(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Truck " + super.toString();
	}
}
