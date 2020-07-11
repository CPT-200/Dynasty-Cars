package vehicletypes;

public class Sedan extends Car {
	public Sedan() {} //Default Constructor
	public Sedan(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Sedan " + super.toString();
	}
}
