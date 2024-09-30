
public class SSD {
	private String component_type;
	private String manufactuer;
	private int capacity;
	private double manufactuerPrice;

	public SSD(String manufactuer, int capacity, double manufactuerPrice) {
		this.component_type = "SSD";
		this.manufactuer = manufactuer;
		this.capacity = capacity;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public int getcapacity() {
		return capacity;
	}
	
	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", capacity= " + capacity + ' ' + 
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}
