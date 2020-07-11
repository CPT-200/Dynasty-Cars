package vehicletypes;

public class Wagon extends Car {
	public Wagon() {} //Default Constructor
	public Wagon(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "Wagon " + super.toString();
	}
}
