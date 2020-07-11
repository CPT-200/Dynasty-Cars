package vehicletypes;

public class Hatchback extends Car {
	public Hatchback() {} //Default Constructor
	public Hatchback(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Hatchback " + super.toString();
	}
}
