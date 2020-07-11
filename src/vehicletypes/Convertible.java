package vehicletypes;

public class Convertible extends Car {
	public Convertible() {} //Default Constructor
	public Convertible(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Convertible " + super.toString();
	}
}
