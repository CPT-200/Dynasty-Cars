package vehicletypes;

public class SUV extends Car {
	public SUV() {} // Default Constructor
	public SUV(String make, String model, int year, String color, String engine, String transmission) { 
		super(make, model, year, color, engine, transmission);
	}
	
	public String toString() {
		return "SUV " + super.toString();
	}
}
