package vehicletypes;

public abstract class Car {
	// Data fields
	private String color;
	private String make;
	private String model;
	private String fuelType;
	private int mpg;
	
	public Car() { } // Default Constructor
	
	public Car(String make, String model, String color, String fuelType, int mpg) {
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
		this.fuelType = fuelType;
		this.mpg = mpg;
	}
	
	// Setters
	public void setColor(String color) { this.color = color; }
	public void setMake(String make) { this.make = make; }
	public void setModel(String model) { this.model = model; }
	public void setFuelType(String fuelType) { this.fuelType = fuelType; }
	public void setMPG(int mpg) { this.mpg = mpg; }
	// Getters
	public String getColor() { return this.color; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getFuelType() { return this.fuelType; }
	public int getMPG() { return this.mpg; }
}
