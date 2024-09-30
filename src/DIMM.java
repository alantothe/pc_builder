
public class DIMM {
	private String component_type;
	private String manufactuer;
	private int clock_rate;
	private int capacity;
	private double manufactuerPrice;
	
	public DIMM(String manufactuer, int clock_rate, int capacity, double manufactuerPrice){
		this.component_type = "DIMM";
		this.manufactuer = manufactuer;
		this.clock_rate = clock_rate;
		this.capacity = capacity;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public int getclock_rate() {
		return clock_rate;
	}
	
	public int getcapacity() {
		return capacity;
	}
	
	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", clockRate= " + clock_rate  +
						 ", capacity= " + capacity +
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}
