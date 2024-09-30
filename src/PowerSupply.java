
public class PowerSupply {
	private String component_type;
	private String manufactuer;
	private String model;
	private int powerRating;
	private double manufactuerPrice;
	
	public PowerSupply(String manufactuer, String model, int powerRating, double manufactuerPrice) {
		this.component_type = "PowerSupply";
		this.manufactuer = manufactuer;
		this.model = model;
		this.powerRating = powerRating;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public String getmodel() {
		return model;
	}
	
	public int getpowerRating() {
		return powerRating;
	}
	
	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", model= " + "'" + model + "'" + ' ' + 
						 ", Power Rating= " + powerRating +
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}
