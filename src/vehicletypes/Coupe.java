package vehicletypes;

public class Coupe extends Car {
	public Coupe() {} //Default Constructor
	public Coupe(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Coupe " + super.toString();
	}
}
