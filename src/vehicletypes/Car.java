package vehicletypes;

public abstract class Car {
	// Data fields
	private String color;
	private String make;
	private String model;
	private String fuelType;
	private String engine;
	private String transmission;
	private int year;
	private int mpg;
	
	public Car() { } // Default Constructor
	
	public Car(String make, String model, int year, String color, String engine, String transmission) {
		/*
		 * Constructor for Car abstract class
		 * 
		 * @param	String	
		 * @param	String	
		 * @param	String	
		 * @param	int		
		 */
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.transmission = transmission;
	}
	
	
	
	// Setters
	public void setColor(String color) { this.color = color; }
	public void setMake(String make) { this.make = make; }
	public void setModel(String model) { this.model = model; }
	public void setFuelType(String fuelType) { this.fuelType = fuelType; }
	public void setMPG(int mpg) { this.mpg = mpg; }
	public void setYear(int year) { this.year = year; }
	public void setEngine(String engine) { this.engine = engine; }
	public void setTransmission(String transmission) { this.transmission = transmission; }
	// Getters
	public String getColor() { return this.color; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getFuelType() { return this.fuelType; }
	public int getMPG() { return this.mpg; }
	public int getYear() { return this.year; }
	public String getEngine() { return this.engine; }
	public String getTransmission() { return this.transmission; }
	
	@Override
	public String toString() {
		return String.format("%s %s %d %s %s %s\n", this.make, this.model, this.year, 
				this.color, this.engine, this.transmission);
	}
}
